package local.learning.lab.dio.services;

import local.learning.lab.dio.data.OrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class EventRetrieveService
{
    @Autowired
    private final KafkaTemplate<Object, Object> template;
    private Logger log;

    public EventRetrieveService(KafkaTemplate<Object, Object> template)
    {
        log = Logger.getLogger(this.getClass().getName());
        this.template = template;
    }

    @KafkaListener(topics = "save-order", groupId = "kafka-services-test01")
    public void getEvent(OrderData orderData)
    {
        log.info("Getting Order");
        log.info(orderData.toString());
    }
}
