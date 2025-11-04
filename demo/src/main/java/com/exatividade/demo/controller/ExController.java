package com.exatividade.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/")
public class ExController {

    @GetMapping("/api")
    public String home(){
        return "ola, aplicação Spring";
    }
    
   
    @GetMapping("/api/teste/soma/{numUm}/{numDois}")
    public int teste(@PathVariable int numUm,@PathVariable int numDois){
        int soma = numUm + numDois;
        return soma;
    }
    @GetMapping("/api/teste/subtracao/{numUm}/{numDois}")
    public int subtracao(@PathVariable int numUm,@PathVariable int numDois){
        int subtracao = numUm + numDois;
        return subtracao;
    }
    @GetMapping("/api/teste/{numPar}")
    public String par(@PathVariable int numPar) {
        int soma = numPar%2;
        if(soma == 0){
        return numPar+" é par";
        }else {
            return numPar + " é impar";
        }
    }
    

}
