package com.example.RestApi.Spring;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("Hello")
    public String sayHello() {
        return "Hello from get method";
    }
    @GetMapping("Hello2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello2() {
        return "Hello 2 from get method";
    }

    @PostMapping("post")
    public String sayPost(@RequestBody String body) {
        return "Hello post method : "+body;
    }

    @PostMapping("postOrder")
    public String sayPost(@RequestBody Order order){
        return "Requedted order is : "+order;
    }

    @PostMapping("postOrderRecord")
    public String postOrder(@RequestBody OrderRecord order){
         return "Requedted order is : "+order.toString();
    }


    @GetMapping("hello/{Name}")
    public String pathVar(@PathVariable("Name") String Name){
        return "Hello "+Name;
    }

    @GetMapping("reqPara")
    public String paramVar(@RequestParam("UserName") String UserName,
                           @RequestParam("Password") String Password){
        return "Hello "+UserName+" "+Password;
    }

}
