package io.github.belforthw0.agendamento.dto;

public class AssinaturaForm {

    private String nome;
    private String email;
    private String selecaoPlano;

    //Construtor padrão obrigatório para o SpringBoot
    public AssinaturaForm() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSelecaoPlano() {
        return selecaoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSelecaoPlano(String selecaoPlano) {
        this.selecaoPlano = selecaoPlano;
    }
}
