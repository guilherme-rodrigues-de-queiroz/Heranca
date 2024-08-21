public class ClientePF extends Cliente{
    // Atributo especifico de clientePF
    private String cpf;

    //construtor ClientePF
    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco); // Usar super para herdar os atributos da class pai Cliente
        this.cpf = cpf;
    }

    //get e set
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //para polimorfismo
    public String toString(){
        return  super.toString() + "CPF: " + cpf;
    }
}
