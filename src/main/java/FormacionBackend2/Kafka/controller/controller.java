package FormacionBackend2.Kafka.controller;

import FormacionBackend2.Kafka.kafka.ProducerKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private ProducerKafka productorKafka;


    //Con este endpoint mandamos mensaje a send que es topic
    @GetMapping("/message/{message}")
    public String sendMessage(@PathVariable String message){

        String  request = "message received successfully :)";

        try {
            productorKafka.send(message);

        }
        catch (Exception e) {
            request = "ERROR";
        }

        return request;
    }


    //Con este endpoint mandamos mensaje a send2 que es topic2
    @GetMapping("/message2/{message}")
    public String sendMessage2(@PathVariable String message){

        String  request = "message2 received successfully :)";

        try {
            productorKafka.send2(message);

        }
        catch (Exception e) {
            request = "ERROR2";
        }

        return request;
    }
}
