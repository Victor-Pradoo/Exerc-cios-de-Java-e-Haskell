/* Victor Prado Chaves

  32070772*/
class Pessoa {
  Integer ident;
  String nome;
  public Pessoa (Integer ident, String nome){
    this.ident = ident;
    this.nome = nome;
  }
}

class PessoaJuridica extends Pessoa{
  String cnpj;
  public PessoaJuridica(Integer ident, String nome, String cnpj){
    super(ident, nome);
    this.cnpj = cnpj;
  }
}

class PessoaFisica extends Pessoa{
  String cpf, rg;
  public PessoaFisica(Integer ident, String nome, String cpf, String rg){
    super(ident, nome);
    this.cpf = cpf;
    this.rg = rg;
  }
}

class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa(1, "Nome da Pessoa");
    PessoaJuridica p_juridica = new PessoaJuridica(2, "Nome da Pessoa Juridica", "1111111111");
    PessoaFisica p_fisica = new PessoaFisica(3, "Nome da Pessoa Fisica", "222222222", "333333333");
    System.out.printf("Id: %d\n", pessoa1.ident); // 1
    System.out.println("Nome: " + pessoa1.nome); // Nome da Pessoa
    System.out.printf("Id: %d\n", p_juridica.ident); // 2
    System.out.println("Nome: " + p_juridica.nome); // Nome da Pessoa Juridica
    System.out.println("CNPJ: " + p_juridica.cnpj); // 1111111111
    System.out.printf("Id: %d\n", p_fisica.ident); // 3
    System.out.println("Nome: " + p_fisica.nome); // Nome da Pessoa Fisica
    System.out.println("RG: " + p_fisica.rg); // 222222222
    System.out.println("CPF: " + p_fisica.cpf);
  }
}