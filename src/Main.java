public class Main {
public static void main(String[] args) {

Pessoa pessoa1 = new Pessoa(1, "Vini", 17);

Pessoa pessoa2 = new Pessoa(2, "Isa", 19);

Pessoa pessoa3 = new Pessoa(3, "Nati", 14);

Endereco endereco1 = new Endereco(157, "Joao Alves", "Palhoca");

Endereco endereco2 = new Endereco(298, "Alberto Weiss", "Sao Jose");

Endereco endereco3 = new Endereco(347, "Machado de Assis", "Sao Jose");



System.out.println("O Id da pessoa1 é " + pessoa1.getId() + ", " + "o nome da pessoa é " + pessoa1.getNome() + ", " + "a idade da pessoa é " + pessoa1.getIdade() + ", " + "o número da casa da pessoa é " + endereco1.getNumero() + ", " + "a rua da pessoa é " + endereco1.getRua() + " e a cidade da pessoa é " + endereco1.getCidade() + ".");

System.out.println("O Id da pessoa2 é " + pessoa2.getId() + ", " + "o nome da pessoa é " + pessoa2.getNome() + ", " + "a idade da pessoa é " + pessoa2.getIdade() + ", " + "o número da casa da pessoa é " + endereco2.getNumero() + ", " + "a rua da pessoa é " + endereco2.getRua() + " e a cidade da pessoa é " + endereco2.getCidade() + ".");

System.out.println("O Id da pessoa3 é " + pessoa3.getId() + ", " + "o nome da pessoa é " + pessoa3.getNome() + ", " + "a idade da pessoa é " + pessoa3.getIdade() + ", " + "o número da casa da pessoa é " + endereco3.getNumero() + ", " + "a rua da pessoa é " + endereco3.getRua() + " e a cidade da pessoa é " + endereco3.getCidade() + ".");
}
}

