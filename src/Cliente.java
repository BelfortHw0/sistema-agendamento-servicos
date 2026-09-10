
class Cliente {

    private String nome;
    private String telefone;
    private String endereço;

    // define um nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // define um telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // define um endereço
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    // retorna o nome definido
    public String getNome() {
        return nome;
    }
    
    // retorna o telefone definido
    public String getTelefone() {
        return telefone;
    }
    
    // retorna o endereço definido
    public String getEndereço() {
        return endereço;
    }
}
