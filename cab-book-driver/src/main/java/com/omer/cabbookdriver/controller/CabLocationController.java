package com.omer.cabbookdriver.controller;

import com.omer.cabbookdriver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;


    @PutMapping("/live")
    public ResponseEntity updateLocation(@RequestParam boolean isDemo) {
        if(isDemo){
            String[] coordinates = this.cabLocationService.getDemoSimulatedlocations();
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                cabLocationService.updateLocation(coordinates[i]);
            }
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
    }
}
