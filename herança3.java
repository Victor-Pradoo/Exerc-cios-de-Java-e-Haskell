/* Victor Prado Chaves

  32070772*/

class Imovel {
  Double preco;
  String endereco;
  public Imovel (String endereco ,Double preco){
    this.preco = preco;
    this.endereco = endereco;
  }
}

class ImovelNovo extends Imovel{
  Double adicional;
  public ImovelNovo(String endereco ,Double preco, Double adicional){
    super(endereco, preco);
    this.adicional = adicional;
  }

  Double calcular_preco() {
    preco = preco + adicional;
    return preco;
  }
}

class ImovelVelho extends Imovel{
  Double desconto;
  public ImovelVelho(String endereco ,Double preco, Double desconto){
    super(endereco, preco);
    this.desconto = desconto;
  }

  Double calcular_preco() {
    preco = preco - desconto;
    return preco;
  }
}

class Main {
  public static void main(String[] args) {
    Imovel imovel = new Imovel("Rua Silva, 123", 300000.0);
    ImovelNovo imovel_novo = new ImovelNovo("\nRua Joaquim, 999", 250000.0, 20000.0);
    ImovelVelho imovel_velho = new ImovelVelho("\nAv. Brasil, 777", 500000.0, 35000.0);
    System.out.println(imovel.endereco); // Rua Silva, 123
    System.out.printf("\nPreço: %f", imovel.preco); // 300000.0
    System.out.println(imovel_novo.endereco); // Rua Joaquim, 999
    System.out.printf("\nPreço: %f", imovel_novo.preco); // 250000.0
    System.out.printf("\nPreço atual: %f", imovel_novo.calcular_preco()); // 270000.0
    System.out.println(imovel_velho.endereco); // Av. Brasil, 777
    System.out.printf("\nPreço: %f", imovel_velho.preco); // 500000.0
    System.out.printf("\nPreço atual: %f", imovel_velho.calcular_preco()); // 465000.0
  }
}