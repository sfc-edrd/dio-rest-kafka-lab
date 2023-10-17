package local.learning.lab.dio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class EventRegistryService
{
    @Autowired
    private final KafkaTemplate<Object, Object> template;
    private Logger log;

    public EventRegistryService(KafkaTemplate<Object, Object> template)
    {
        log = Logger.getLogger(this.getClass().getName());
        this.template = template;
    }

    public <T> void addEvent(String topic, T data)
    {
        log.info(String.format("Adding data %s to topic %s", data, topic));
        template.send(topic, data);
    }
}
