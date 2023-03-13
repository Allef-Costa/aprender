package inscricao;


public class Fisica extends Pessoa{
    private String cpf;
    private String rg;

    @Override
    public String toString() {
        return "\n cpf: " + cpf + "\n rg: " + rg;
    }
    
    

    public Fisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Fisica(String cpf, String rg, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

  

  


    
}
