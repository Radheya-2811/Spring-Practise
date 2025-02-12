package com.ollama.backend.ollama_springBoot.service;

public interface AiService {
    String askAi(String question);
    Flux<String> stringResponse(String question);
}
