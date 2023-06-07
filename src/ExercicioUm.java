// Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
// caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir
// o resultado para uma variável C e mostrar seu conteúdo na tela

import java.util.Scanner;

public class ExercicioUm {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe um número inteiro: ");
    int a = inputUsuario.nextInt();
    System.out.println("Informe outro número inteiro: ");
    int b = inputUsuario.nextInt();

    if(a == b){
      int c = a + b;
      System.out.println("A soma dos números é: " + c);
    } else if (a != b) {
      int c = a * b;
      System.out.println("A multiplicação dos números é: " + c);
    }
  }
}
