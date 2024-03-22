package com.example.esercizioappsalutare.controller;

import com.example.esercizioappsalutare.entity.Saluto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class SalutoController {
    @GetMapping("/saluto")
    public String saluto(@RequestParam String saluto) {
        return saluto;
    }

    @GetMapping("/ciao")
    public String ciao(@RequestParam String name) {
        return "Ciao " + name;
    }

    @GetMapping("/name/{name}")
    public String name(@PathVariable String name) {
        return "Ciao: " + name;
    }

    @GetMapping("/salve")
    public Saluto salutare(){
        return new Saluto("Ciao a tutti");
    }
}
