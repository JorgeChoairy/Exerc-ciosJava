/* 2. Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).*/

import javax.swing.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        int numero = 0;
        int par = 0;
        int impar = 0;

        Scanner leitor = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Informe um número: ");
            numero = leitor.nextInt();

            if ((numero % 2) == 0){
                System.out.println(numero + " é par!");
            }
            else {
                System.out.println(numero + " é impar!");
            }

        }

    }

}