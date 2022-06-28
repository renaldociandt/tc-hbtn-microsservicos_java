package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {

        return "Seja Bem Vindo A Minha Aplicação";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            numeros.add(random.nextInt(100));
            Collections.sort(numeros);
        }
        return numeros;
    }
}
