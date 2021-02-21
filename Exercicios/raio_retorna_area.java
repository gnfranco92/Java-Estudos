package Exercicios;

import java.util.Scanner;

public class raio_retorna_area {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        Double raio = scan.nextDouble();

        //Classe Math - fornece ferramentas para realizar cálculos trigonométricos.
        //Math.PI = Valor de PI; Math.poew(valor, potência)
        double area = Math.PI * Math.pow(raio,2);

        System.out.println("Area calculada é: "+ area);
    }    
}
