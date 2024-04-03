/*
DESAFIO
Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) 
precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la 
(largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos 
com as medidas dadas são necessários para cobrir a parede dada.
*/

package com.mycompany.calculadoradeazulejos;
import java.util.Scanner; //importando biblioteca

 /* @author Jermeson */
public class CalculadoraDeAzulejos {

    public static void main(String[] args) {
        
        //altura da parede = hp
        //largura da parede = lp
        //altura do azulejo = ha
        //largura do azulejo = la
        
        //Variaveis
        double hp, lp, ha,la,ap,aa,soma;
        
        //Instanciando a biblioteca
        Scanner scan = new Scanner(System.in);
        
        //Perguntas e capturas dos dados
        System.out.print("Calculadora de Azulejos \nAltura da parede (metros): ");
        hp = scan.nextDouble();
        
        System.out.print("Largura da parede (metro): ");
        lp = scan.nextDouble();
        
        System.out.print("Altura do azulejo (centimetro): ");
        ha = scan.nextDouble();
        
        System.out.print("Largura do azulejo (centimetro): ");
        la = scan.nextDouble();
        
        
        
        //Calculo
        ap = (hp*lp);
        aa = (ha*la);
        soma = (ap/aa);
        
        System.out.print("Area da parede: " + ap + "\nArea do Azulejo: " + aa + "\n Quantidade de azulejos necessarios: " + soma);
        
        
    }
}
