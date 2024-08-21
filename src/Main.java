public class Main {
    public static void main(String[] args) {
        ClientePF clientePF1 = new ClientePF("Luiz - ", " Rua raposo - ", " 123456789-01");

        System.out.println("Cliente PF dados: " + clientePF1.getNome() + " Endereço: " + clientePF1.getEndereco() + " CPF: " + clientePF1.getCpf());

        ClientePJ clientePJ1 = new ClientePJ("Matheus - ", " Rua Jacaranda - ", " 900927880001-04");
        System.out.println("Cliente PJ dados: " + clientePJ1.getNome() + " Endereço: " + clientePJ1.getEndereco() + " CNPJ: " + clientePJ1.getCnpj());

        System.out.println("");
        // polimorfismo - a chamada do método é igual, o que mudou foi o objeto que o chamou
        System.out.println(clientePF1.toString()); //método toString nos retorna todos atributos
        System.out.println("");
        System.out.println(clientePJ1.toString()); //toString serve para exibir os dados
    }
}
