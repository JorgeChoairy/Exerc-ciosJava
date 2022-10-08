/* 4. Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o
seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários
para abastecer o veículo e informe o valor total da conta desse cliente, sabendo-se
que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50.
(Estrutura Sequencial).*/

import javax.swing.*;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    
	    double capacidade = 0;
	    double nivel = 0;
	    
	    System.out.println("O preço da gasolina está a R$ 2,50 reais o Litro, o refrigerante está a R$ 6,00 reais.");
	    
	    Scanner tanque = new Scanner(System.in);
	        System.out.println("Informe a capacidade do tanque do carro em Litros: ");
	        capacidade = tanque.nextDouble();
	        
	        System.out.println("Informe o nivel de combustivel do tanque em Litros: ");
	        nivel = tanque.nextDouble();
	        
	   double diferenca = capacidade - nivel;
	        
	        System.out.println("Para completar o tanque faltam " + diferenca + " Litros");
            
	        double gasolinaLitro = 2.50;
            double abastecer = diferenca * gasolinaLitro;
            int refrigerantes = 6;
            double total = abastecer + refrigerantes;

	            System.out.println("O valor da gasolina para encher o tanque é de R$: " + abastecer);
	            System.out.println("O valor total da sua compra com os dois refrigerantes é de R$: " + total);
	}
	
}