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

        String principalUrl = "http://ec2-100-24-20-223.compute-1.amazonaws.com:8081/catalan?value=" + value;
        String secondaryUrl = "http://ec2-54-175-168-53.compute-1.amazonaws.com:8082/catalan?value=" + value;

        try{
            return http.call(principalUrl);
        } catch ( Exception e){
            return http.call(secondaryUrl);
        }
    }
}
