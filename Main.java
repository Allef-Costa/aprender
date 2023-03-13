package inscricao;


public class Main {
    public static void main(String[] args) {
        
        
     Endereco end1 = new Endereco("Rua", "272", "rua", "4110520", "Salvador", "Ba");
     Fisica f1 = new Fisica("8621256321", "12325848", 25, "Allef", 0, Genero.FEMININO, end1);

     
        if (f1.getCpf().equals(f1.getCpf())) {
            System.out.println(end1.toString());
        System.out.println(f1.toString());
            
            
        } else { System.out.println("Cep incorreto");
        }
     
       
             
             
    
        
        
      
                
                
    }
}
