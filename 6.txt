/* 6. Faça um programa que receba duas notas de seis alunos, calcule e mostre
(comando for):
• A média aritmética das duas notas de cada aluno;
• A mensagem que está na tabela a seguir:

Média aritmética Mensagem

• O total de alunos aprovados;
• O total de alunos de exame;
• Total de alunos reprovados;
• A média da classe.*/

import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        
        var alunos = 0;
        var i = 0;
        
        var notaUm = 0;
        var notaDois = 0;
        
        var mediaDuasNotas = 0;
        var mediaDaClasse = 0;
        
        var totalAlunosAprovados = 0;
        var totalAlunosExame = 0;
        var totalAlunosReprovados = 0;
        

        for (i=0; i<6; i++){

            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Primeira nota: ");
            notaUm = leitor1.nextInt();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Segunda nota: ");
            notaDois = leitor2.nextInt();
            
            mediaDuasNotas = (notaUm + notaDois) / 2;

            if (mediaDuasNotas < 3){
                System.out.println("Reprovado!");
                totalAlunosReprovados++;

            } else if (mediaDuasNotas >=3 && mediaDuasNotas <7) {
                System.out.println("Exame");
                totalAlunosExame++;

                
            } else if (mediaDuasNotas >= 7){
                System.out.println("Aprovado! ");
                totalAlunosAprovados++;
            }
            mediaDaClasse += mediaDuasNotas / 6; // tirar dúvida!!!!!!


        }
        System.out.println("O total de alunos aprovados foi: " + totalAlunosAprovados);
        System.out.println("O total de alunos para fazer exame é: " + totalAlunosExame);
        System.out.println("O total de alunos reprovados foi: " + totalAlunosReprovados);
        System.out.println("A média da classe foi de: " + mediaDaClasse);
    }

}