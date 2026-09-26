package io.github.belforthw0.agendamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import io.github.belforthw0.agendamento.dto.AssinaturaForm;

@Controller //Avisa ao Spring que a classe gerencia rotas web
public class AssinaturaController {

    @PostMapping("/assinar")
    public String redirecionamento(AssinaturaForm form) {
        System.out.println("--- Nova Assinatura Recebida ---");
        System.out.println("Nome: " + form.getNome());
        System.out.println("Email: " + form.getEmail());
        System.out.println("Plano: " + form.getSelecaoPlano());
        return "redirect:/";
    }
}
