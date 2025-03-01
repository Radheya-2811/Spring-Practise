package com.ollama.backend.ollama_springBoot.Controller;


import com.ollama.backend.ollama_springBoot.service.AiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ai")
public class AiController {
    private AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping
    public ResponseEntity<String> askAi(
            @RequestParam(value = "query", required = false,defaultValue = "How can you help me?") String query
    ){
        String respnse= aiService.askAi(query);
        return new ResponseEntity<>(respnse, HttpStatus.OK);
    }

    @GetMapping
    public Flux<String> streamAi(
            @RequestParam(value = "query", required = false,defaultValue = "How can you help me?") String query
    ){
        return  aiService.stringResponse(query);
    }
}
