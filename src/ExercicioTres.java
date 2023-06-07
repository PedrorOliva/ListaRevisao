/*
* Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações e a
* média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento, usando a
* fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
* A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas,
* a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado'
* se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E

* */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioTres {
  public static void main(String[] args) {
    DecimalFormat fomatter = new DecimalFormat();
    fomatter.applyPattern("##0.00");
    Scanner inputUsuario = new Scanner(System.in);
    int identAluno;
    double nota1;
    double nota2;
    double nota3;
    double mediaExercicios;
    double mediaAproveitamento;

    System.out.println("Informe o número de identificação do aluno: ");
    identAluno = inputUsuario.nextInt();
    System.out.println("Informe as 3 notas obtidas pelo aluno: ");
    nota1 = inputUsuario.nextDouble();
    nota2 = inputUsuario.nextDouble();
    nota3 = inputUsuario.nextDouble();
    //System.out.println("Informe a media dos exercícios: ");
    //mediaExercicios = inputUsuario.nextInt();
    mediaExercicios = (nota1 + nota2 + nota3) / 3;
    mediaAproveitamento = ((nota1 + nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;

    System.out.println("Indentificação do aluno: " + identAluno);
    if(mediaAproveitamento >= 9.0) {
      System.out.println("A média de aproveitamento: " + fomatter.format(mediaAproveitamento) + " A - Aprovado");
    } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
      System.out.println("A média de aproveitamento: " + fomatter.format(mediaAproveitamento) + " B - Aprovado");
    } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
      System.out.println("A média de aproveitamento: " + fomatter.format(mediaAproveitamento) + " C - Aprovado");
    } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
      System.out.println("A média de aproveitamento: " + fomatter.format(mediaAproveitamento) + " D - Reprovado");
    } else if (mediaAproveitamento < 4.0) {
      System.out.println("A média de aproveitamento: " + fomatter.format(mediaAproveitamento) + " E - Reprovado");
    }

    System.out.println("Notas obtidas pelo aluno: Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3);
    System.out.println("Média dos exercícios: " + fomatter.format(mediaAproveitamento));
  }
}
