public class Main {
public static void main(String[] args) {

Pessoa pessoa1 = new Pessoa(1, "Vini", 17);

Pessoa pessoa2 = new Pessoa(2, "Isa", 19);

Pessoa pessoa3 = new Pessoa(3, "Nati", 14);

Endereco endereco1 = new Endereco(157, "Joao Alves", "Palhoca");

Endereco endereco2 = new Endereco(298, "Alberto Weiss", "Sao Jose");

Endereco endereco3 = new Endereco(347, "Machado de Assis", "Sao Jose");



System.out.println("O Id da pessoa1 � " + pessoa1.getId() + ", " + "o nome da pessoa � " + pessoa1.getNome() + ", " + "a idade da pessoa � " + pessoa1.getIdade() + ", " + "o n�mero da casa da pessoa � " + endereco1.getNumero() + ", " + "a rua da pessoa � " + endereco1.getRua() + " e a cidade da pessoa � " + endereco1.getCidade() + ".");

System.out.println("O Id da pessoa2 � " + pessoa2.getId() + ", " + "o nome da pessoa � " + pessoa2.getNome() + ", " + "a idade da pessoa � " + pessoa2.getIdade() + ", " + "o n�mero da casa da pessoa � " + endereco2.getNumero() + ", " + "a rua da pessoa � " + endereco2.getRua() + " e a cidade da pessoa � " + endereco2.getCidade() + ".");

System.out.println("O Id da pessoa3 � " + pessoa3.getId() + ", " + "o nome da pessoa � " + pessoa3.getNome() + ", " + "a idade da pessoa � " + pessoa3.getIdade() + ", " + "o n�mero da casa da pessoa � " + endereco3.getNumero() + ", " + "a rua da pessoa � " + endereco3.getRua() + " e a cidade da pessoa � " + endereco3.getCidade() + ".");
}
}

