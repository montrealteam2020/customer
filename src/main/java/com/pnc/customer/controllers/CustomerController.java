package com.pnc.customer.controllers;

import com.pnc.customer.models.Transactions;
import com.pnc.customer.models.TransactionsList;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("custom")
public class CustomerController {

    @GetMapping("/trans")
    public String getTransactions(){
        RestTemplate restTemplate = new RestTemplate();
        String transString=  restTemplate.getForObject("http://localhost:8080/pnc/v1/trans/abcd",String.class);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return transString;
    }
}
