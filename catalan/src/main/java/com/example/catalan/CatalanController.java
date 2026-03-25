package com.example.catalan;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CatalanController {

    CatalanLogic logica = new CatalanLogic();
    @GetMapping("/catalan")
    public String getCatalan(@RequestParam("value") int value) {
        String result  = logica.catalanSequence(value);
        return "La secuencia para el valor " + value + "es:" + result;
    }

}
