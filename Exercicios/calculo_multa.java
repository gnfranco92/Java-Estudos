package Exercicios;

import java.util.Scanner;

public class calculo_multa {
    public static void main(String[] args) {

        /* Quando registrar peso do peixe maior que 50 quilos pagar multa de R$ 4,00 o quilo excedente. 
        Ter variável excesso e multa, se não tiver multa mostrar 0 nos valores. */ 

                
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso do peixe, em quilos: ");
        Double peso = scan.nextDouble();

        if (peso >= 50){
            Double excesso = peso - 50;
            Double multa = excesso * 4;

            System.out.println(("O valor do excesso"+ excesso +" quilos"));
            System.out.println("O valor da multa R$ "+ multa);         

        }else{

            System.out.println("Não tem multa.");


        }


    }
    

}
