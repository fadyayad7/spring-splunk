package dev.fadyayad.springsplunk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringSplunkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSplunkApplication.class, args);
    }

}

@RestController
@RequestMapping("/splunk")
@Slf4j
class Api{
    @GetMapping
    public String get(){
        log.info("splunk triggered by slf4j");
        return "ciao mundo!";
    }
}
