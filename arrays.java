import java.util.ArrayList;

public class arrays {    
       public static void main(String[] args) {
           
        // Criando ArrayList
        
        ArrayList lista_nome = new ArrayList<>();

        lista_nome.add("Guilherme");
        lista_nome.add("Sabina");

        while(!lista_nome.isEmpty()){
            System.out.print(lista_nome.remove(0) +" - ");
        }       
        }   
}
