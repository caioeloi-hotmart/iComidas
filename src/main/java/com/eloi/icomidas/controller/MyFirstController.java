package com.eloi.icomidas.controller;

import com.eloi.icomidas.model.Client;
import com.eloi.icomidas.service.ClientActivationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

    private ClientActivationService clientActivationService;
    public  MyFirstController(ClientActivationService clientActivationService){
        this.clientActivationService = clientActivationService;
    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Client john = new Client("John", "john@xyz.com", "34215019");
        clientActivationService.activate(john);
        return "hello!";
    }
}
