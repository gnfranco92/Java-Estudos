public class loops {
    public static void main(String[] args) {
        // Utilizando o while        
        System.out.println("------ While ------");

        int contador =  0;
        while(contador <= 5){

            System.out.print("Contando: ");
            System.out.println(contador);
            contador += 1;  // Dica, posição do contador influência na contagem. 
        }

        // Utilizando for
        System.out.println("------ For ------");
        
        for(int cont = 0; cont <=5; cont ++){
            System.out.print("Contando: ");
            System.out.println(cont);
            contador += 1;
        }
    }
    
}
