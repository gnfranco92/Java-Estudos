package Exercicios;

import java.util.Scanner;

public class calcula_area_retorna_dobro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        Double lado = scan.nextDouble();
        Double area = Math.pow(lado,2);

        System.out.println("Área calculada é: "+ area);
        System.out.println("O dobro da área calculada é: "+ (area*2));        
        
    }
    
}
