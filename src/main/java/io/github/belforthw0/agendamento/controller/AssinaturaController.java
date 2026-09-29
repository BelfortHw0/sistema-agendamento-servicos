package io.github.belforthw0.agendamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import io.github.belforthw0.agendamento.dto.AssinaturaForm;

@Controller //Avisa ao Spring que a classe gerencia rotas web
public class AssinaturaController {

    @PostMapping("/assinar")
    public String redirecionamento(AssinaturaForm form) {
        var resumo = """
            --- Nova Assinatura Recebida ---
            Nome: %s
            Email: %s
            Plano %s
            """.formatted(form.nome(), form.email(), form.selecaoPlano());
        System.out.println(resumo);
        return "redirect:/";
    }
}
