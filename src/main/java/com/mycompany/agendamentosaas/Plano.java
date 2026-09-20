package io.github.belforthw0.agendamento;

public class Plano {

    private int idPlano;
    private String nomePlano;
    private double valorMensal;

    public Plano(int idPlano, String nomePlano, double valorMensal) {
        this.idPlano = idPlano;
        this.nomePlano = nomePlano;           //inicializar os atributos do 
        this.valorMensal = valorMensal;       //objeto e garantir que ele 
    }                                           //esteja em um estado válido antes de ser utilizado

    public int getId() {
        return idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}
