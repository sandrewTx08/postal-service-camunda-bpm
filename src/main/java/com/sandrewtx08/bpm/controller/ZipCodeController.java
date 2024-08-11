package com.sandrewtx08.bpm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("zipcode")
public class ZipCodeController {
    @GetMapping("/{zipCode}")
    public Object getZipCode(@PathVariable Integer zipCode) {
        return new RestTemplate()
                .getForObject("http://api.zippopotam.us/us/" + zipCode, Object.class);
    }
}
