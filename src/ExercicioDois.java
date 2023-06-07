// Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
// imprimir o resultado desta operação.

import java.util.Scanner;

public class ExercicioDois {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int numero = inputUsuario.nextInt();

    if(numero % 2 == 0) {
      int resultado =  numero + 5;
      System.out.println("Resultado da operação: " + resultado);
    } else if (numero % 2 != 0){
      int resultado = numero +8;
      System.out.println("Resultado da operação: " + resultado);
    }
  }
}
