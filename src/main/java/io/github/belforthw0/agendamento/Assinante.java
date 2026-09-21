package io.github.belforthw0.agendamento;

public class Assinante {

    //atributos privados
    private int idAssinante;
    private String nomeAssinante;
    private String email;
    private String status;
    private Plano plano;

    //construtor. define o status inicial como "ATIVO"
    public Assinante(int idAssinante, String nomeAssinante, String email, Plano plano) {
        this.idAssinante = idAssinante;
        this.nomeAssinante = nomeAssinante;
        this.email = email;
        this.status = "ATIVO";
        this.plano = plano;
    }

    //métodos expressivos
    public void ativar() {
        this.status = "ATIVO";
    }

    public void desativar() {
        this.status = "INATIVO";
    }

    //getters
    public int getIdAssinante() {
        return idAssinante;
    }

    public String getStatus() {
        return status;
    }

    public String getNomeAssinante() {
        return nomeAssinante;
    }

    public String getEmail() {
        return email;
    }

    public Plano getPlano() {
        return plano;
    }

    //setters
    public void setNomeAssinante(String nomeAssinante) {
        this.nomeAssinante = nomeAssinante;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
