/* 1. Faça um programa que receba o valor dos créditos galácticos de um Star trooper e
o percentual de aumento, calcule e mostre os créditos galácticos com o novo
aumento.*/

import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {


        Scanner caixa = new Scanner(System.in);
        System.out.println("Digite o valor de seus créditos galáticos: ");

        float creditos = caixa.nextFloat();

        System.out.println("Informe o % de aumento: ");

        float percentual = caixa.nextFloat();
        percentual = (percentual/100);

        float valorAumento = creditos * percentual;
        float novovalor = creditos + valorAumento;

        System.out.println("Créditos: " + creditos);
        System.out.println("Aumento: " + valorAumento);
        System.out.println("O valor total de créditos galáticos é iagual a: " + novovalor);

    }

}