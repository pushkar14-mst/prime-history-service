package edu.iu.pupatil.historyservice.rabbitmq;

import com.google.gson.Gson;
import edu.iu.pupatil.historyservice.model.PrimesRecord;
import edu.iu.pupatil.historyservice.repository.IPrimesHistoryRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MQReceiver {
    private final IPrimesHistoryRepository PrimesHistoryRepository;

    public MQReceiver(IPrimesHistoryRepository PrimesHistoryRepository){
        this.PrimesHistoryRepository = PrimesHistoryRepository;
    }

    @RabbitListener(queues = {"primes"})
    public void receiveMessage(@Payload String message) {
        System.out.println(message);
        Gson gson = new Gson();
        PrimesRecord primesRecord = gson
                .fromJson(message, PrimesRecord.class);
        PrimesHistoryRepository.save(primesRecord);
    }
}