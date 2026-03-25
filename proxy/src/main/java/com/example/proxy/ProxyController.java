package com.example.proxy;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProxyController {

    HttpConnection http = new HttpConnection();
    @GetMapping("/proxy")
    public String proxy (@RequestParam("value") String value) throws IOException{

        String principalUrl = "" + value;
        String secondaryUrl = "" + value;

        try{
            return http.call(principalUrl);
        } catch ( Exception e){
            return http.call(secondaryUrl);
        }
    }
}
