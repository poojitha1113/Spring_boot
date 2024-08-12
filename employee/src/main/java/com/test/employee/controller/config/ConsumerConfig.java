package com.test.employee.controller.config;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class ConsumerConfig {

    @Bean
public ConsumerFactory<String,String> consumerFactory(){
    Map<String,Object> map=new HashMap<>();
    map.put(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.1.22:9092");
    map.put(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG,"id");
    map.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    map.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);

    return new DefaultKafkaConsumerFactory<String,String>(map);
}
@Bean
public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListener()
{
    ConcurrentKafkaListenerContainerFactory<String,String> obj=new ConcurrentKafkaListenerContainerFactory<String,String>();
    obj.setConsumerFactory(consumerFactory());
    return obj;
}
}
