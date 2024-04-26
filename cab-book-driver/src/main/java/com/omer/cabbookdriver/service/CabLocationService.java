package com.omer.cabbookdriver.service;

import com.omer.cabbookdriver.config.KafkaConfig;
import com.omer.cabbookdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;
    }

    public String [] getDemoSimulatedlocations() {
        return  new String[] {
                "32.0853 34.7818",
                "32.0833 34.7833",
                "32.0813 34.7853",
                "32.0793 34.7873",
                "32.0773 34.7893",
                "32.0753 34.7913",
                "32.0733 34.7933",
                "32.0713 34.7953",
                "32.0693 34.7973",
                "32.0673 34.7993",
                "32.0653 34.8013",
                "32.0633 34.8033",
                "32.0613 34.8053",
                "32.0593 34.8073",
                "32.0573 34.8093",
                "32.0553 34.8113",
                "32.0533 34.8133",
                "32.0513 34.8153",
                "32.0493 34.8173",
                "32.0473 34.8193",
                "32.0453 34.8213",
                "32.0433 34.8233",
                "32.0413 34.8253",
                "32.0393 34.8273",
                "32.0373 34.8293",
                "32.0353 34.8313",
                "32.0333 34.8333",
                "32.0313 34.8353",
                "32.0293 34.8373",
                "32.0273 34.8393",
                "32.0253 34.8413",
                "32.0233 34.8433",
                "32.0213 34.8453",
                "32.0193 34.8473",
                "32.0173 34.8493",
                "32.0153 34.8513",
                "32.0133 34.8533",
                "32.0113 34.8553",
                "32.0093 34.8573",
                "32.0073 34.8593",
                "32.0053 34.8613",
                "32.0033 34.8633",
                "32.0013 34.8653",
                "31.9993 34.8673",
                "31.9973 34.8693",
                "31.9953 34.8713",
                "31.9933 34.8733",
                "31.9913 34.8753",
                "31.9893 34.8773",
                "31.9873 34.8793",
                "31.9853 34.8813",
                "31.9833 34.8833",
                "31.9813 34.8853",
                "31.9793 34.8873",
                "31.9773 34.8893"
        };
    }
}
