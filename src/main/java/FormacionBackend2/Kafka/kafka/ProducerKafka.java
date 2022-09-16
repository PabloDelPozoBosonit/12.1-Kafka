package FormacionBackend2.Kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.kafka.core.KafkaTemplate;

@Component
public class ProducerKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    private String kafkaTopic = "topic";
    private String kafkaTopic2 = "topic2";

    //Publicamos mensaje a topic
    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }

    //Publicamos mensaje a topic2
    public void send2(String message) {

        kafkaTemplate.send(kafkaTopic2, message);
    }

}
