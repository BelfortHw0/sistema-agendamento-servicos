
public class Main {

    public static void main(String[] args) {

        // Criando um cliente
        Cliente cliente = new Cliente();

        cliente.setNome("Pedro");
        cliente.setTelefone("99999-9999");
        cliente.setEndereço("Rua das Flores");

        // Criando um serviço
        Serviço serviço = new Serviço();

        serviço.setDescrição("Manutenção de computador");
        serviço.setPreço(50.0);

        // Criando um agendamento
        Agendamento agendamento = new Agendamento();

        agendamento.setCliente(cliente);
        agendamento.setServiço(serviço);
        agendamento.setHoras(3);

        // Exibindo os dados
        System.out.println("=== AGENDAMENTO ===");

        System.out.println("Cliente: "
                + agendamento.getCliente().getNome());

        System.out.println("Telefone: "
                + agendamento.getCliente().getTelefone());

        System.out.println("Serviço: "
                + agendamento.getServiço().getDescrição());

        System.out.println("Preço por hora: R$ "
                + agendamento.getServiço().getPreço());

        System.out.println("Horas: "
                + agendamento.getHoras());

        System.out.println("Status: "
                + agendamento.getServiço().getStatus());

        System.out.println("Valor total: R$ "
                + agendamento.calcularValorTotal());

        // Alterando o preço
        serviço.setPreço(60.0);

        System.out.println("\nNovo preço: R$ "
                + serviço.getPreço());

        System.out.println("Novo valor total: R$ "
                + agendamento.calcularValorTotal());

        // Concluindo o serviço
        serviço.concluir();

        System.out.println("\nStatus após conclusão: "
                + serviço.getStatus());
    }
}
