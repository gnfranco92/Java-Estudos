package Exercicios;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
      
    //----Calculadora ----
      
    System.out.println("Escola a opção: - Somar: 1 ; Subtrair: 2");
    int opcao = scan.nextInt();
      
    if(opcao == 1){
        System.out.println("Para somar, digite os dois valores: ");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        double soma = s1 + s2;
          
        System.out.println("Resultado da soma: "+ soma);
          
    } else if(opcao == 2){
        System.out.println("Para subtrair, digite os dois valores: ");
        double sub1 = scan.nextDouble();
        double sub2 = scan.nextDouble();
        double subtracao = sub1 - sub2;
          
        System.out.println("Resultado da subtração: "+ subtracao);
    } else{
        System.out.println("Escolha a opção correta.");
          
      }



        
    }
    
}
