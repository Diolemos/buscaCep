package com.pedrodiogenes.buscaCep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/cep")
@CrossOrigin(origins = "*") // Allow frontend to call this API
public class CepController {

    private static final String VIA_CEP_URL = "https://viacep.com.br/ws/";

    @GetMapping("/{cep}")
    public ResponseEntity<String> getCepInfo(@PathVariable String cep) {
        String apiUrl = VIA_CEP_URL + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }
}