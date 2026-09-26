package io.github.belforthw0.agendamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaAgendamentoServicosApplication {

    public static void main(String[] args) {
        // Liga o servidor embutido (Tomcat) e registra os Controllers
        SpringApplication.run(SistemaAgendamentoServicosApplication.class, args);
    }

}
