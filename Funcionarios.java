package funcionarios;

public class Funcionarios {

  
    public static void main(String[] args) {
        Carac func1 = new Carac("Allef", 23,EnumSexo.FEMININO);
        Carac func2 = new Carac("Amanda", 20,EnumSexo.FEMININO);
        
        System.out.println("O funcionário: " + func1.getNome()+ ", " + func1.getIdade()+ ", " + func1.getGenero());
        System.out.println("O funcionário: " + func2.getNome()+ ", " + func2.getIdade()+","+ func2.getGenero());
    }
    
}
