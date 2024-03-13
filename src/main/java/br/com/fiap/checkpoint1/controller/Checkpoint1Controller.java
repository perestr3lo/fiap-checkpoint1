package br.com.fiap.checkpoint1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Checkpoint1Controller {

    @GetMapping("/ping")
    public String ping() { return "Pong";}


}
