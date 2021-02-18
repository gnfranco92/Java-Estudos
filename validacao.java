public class validacao {
    public static void main(String[] args) {
        int idade = 15;

        System.out.print("Idade: ");
        System.out.println(idade);

        if ( idade <= 10){
            System.out.println("Crianca");
        } else if(idade <= 17){
            System.out.println("Adolecente");
        }else {
            System.out.println("Adulto");
        }
    }

    
}
