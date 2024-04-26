package com.omer.cabbookdriver.config;

import com.omer.cabbookdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstant.CAB_LOCATION).build();
    }
}
