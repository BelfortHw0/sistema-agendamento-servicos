package com.mycompany.agendamentosaas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pedro
 */
public class AssinanteTest {

    @Test
    public void testCriacaoEEstadoInicialAssinante() {
        // 1\. Arrange (Preparação do Cenário
        Plano planoPro = new Plano(1, "Pro", 49.90);
        Assinante assinante = new Assinante(1, "Pedro", "pedro@email.com", planoPro);

        // 2\. Assert (Verificações)
        assertEquals("ATIVO", assinante.getStatus());
        assertEquals("pedro@email.com", assinante.getEmail());
        assertEquals("Pro", assinante.getPlano().getNomePlano());
    }

    /**
     * Test of ativar method, of class Assinante.
     */
    @Test
    public void testAtivar() {
        Plano planoGratuito = new Plano(1, "Gratuito", 0.0);
        Assinante assinante = new Assinante(1, "Pedro", "pedro@email.com", planoGratuito);
        assinante.desativar();
        assinante.ativar();
        assertEquals("ATIVO", assinante.getStatus());
    }

    /**
     * Test of desativar method, of class Assinante.
     */
    @Test
    public void testDesativar() {
        Plano planoGratuito = new Plano(1, "Gratuito", 0.0);
        Assinante assinante = new Assinante(1, "Pedro", "pedro@email.com", planoGratuito);
        assinante.desativar();
        assertEquals("INATIVO", assinante.getStatus());
    }

    /**
     * Test of setPlano method, of class Assinante.
     */
    @Test
    public void testSetPlano() {
        // Arrange: cria os planos e o assinante inicial
        Plano planoGratuito = new Plano(1, "Gratuito", 0.0);
        Plano planoPro = new Plano(2, "Pro", 49.90);
        Assinante assinante = new Assinante(1, "Pedro", "pedro@email.com", planoGratuito);

        // 2\. Act: faz o upgrade de plano
        assinante.setPlano(planoPro);

        // 3\. Assert: verifica se o plano atual do assinante é o "Pro"
        assertEquals("Pro", assinante.getPlano().getNomePlano());
    }

}
