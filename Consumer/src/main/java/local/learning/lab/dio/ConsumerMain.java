package local.learning.lab.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ConsumerMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerMain.class, args);
    }
}