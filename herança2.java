/* Victor Prado Chaves

  32070772*/

class Animal {
  Integer numeroPatas;
  String nome, cor;
  public Animal (String nome, String cor, Integer numeroPatas){
    this.numeroPatas = numeroPatas;
    this.nome = nome;
    this.cor = cor;
  }

  void exibirDados(){
    System.out.println("Nome: " + nome);
    System.out.printf("\nNumero de Patas: %d", numeroPatas);
    System.out.println("\nCor: " + cor);
  }
}

class Cachorro extends Animal{
  String raca;
  public Cachorro(String nome, String cor, Integer numeroPatas, String raca){
    super(nome, cor, numeroPatas);
    this.raca = raca;
  }

  void exibirDados(){
    System.out.println("Nome: " + nome);
    System.out.printf("\nNumero de Patas: %d", numeroPatas);
    System.out.println("\nCor: " + cor);
    System.out.println("\nRaca: " + raca);
  }
}

class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Passarinho", "Azul", 2);
    animal.exibirDados(); // exibe os atributos do animal
    Cachorro dog = new Cachorro("Rex", "Marrom", 4, "Vira lata");
    dog.exibirDados(); // exibe os atributos do cachorro
  }
}