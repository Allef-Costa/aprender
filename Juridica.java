package inscricao;


public class Juridica extends Pessoa{
    private String cnpj;
    private  String inscricaoEstadual;

    public Juridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

   

    

    

   
    
}
