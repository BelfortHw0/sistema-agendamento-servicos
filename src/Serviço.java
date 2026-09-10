
class Serviço {

    private String descrição;
    private double preço;

    public Serviço() {
        status = StatusServiço.PENDENTE;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getPreço() {
        return preço;
    }

    public enum StatusServiço {
        PENDENTE,
        CONCLUIDO
    }

    private StatusServiço status;

    public StatusServiço getStatus() {
        return status;
    }

    public void setStatus(StatusServiço status) {
        this.status = status;
    }

    public void concluir() {
        status = StatusServiço.CONCLUIDO;
    }
}
