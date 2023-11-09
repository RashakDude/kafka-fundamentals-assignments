package org.miniato.kafka.fundamentals.entity;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class TrackCallBack implements Callback{

    @Override
    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
        System.out.println(recordMetadata.partition());
        System.out.println("Message sent successfully!");
    }
}
