
class Agendamento {

    private Cliente cliente;
    private Serviço serviço;
    private int horas;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Serviço getServiço() {
        return serviço;
    }

    public void setServiço(Serviço serviço) {
        this.serviço = serviço;
    }

    public int getHoras() {
        return horas;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double calcularValorTotal() {
        return serviço.getPreço() * horas;
    }
}
