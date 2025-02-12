package com.ollama.backend.ollama_springBoot.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiServiceImpel implements AiService{

    private ChatClient client;
    public AiServiceImpel(ChatClient.Builder builder){
        this.client=builder.build();
    }
    @Override
    public String askAi(String question) {
        return client.prompt(question).call().content();
    }

    public Flux<String> stringResponse(String question){
        return this.client.prompt().user(question).stream().content();
    }
}
