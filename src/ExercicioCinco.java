// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

import java.util.Scanner;

public class ExercicioCinco {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int numeros = 0;
    int contador = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.println("Digite um número: ");
      numeros = inputUsuario.nextInt();

      if(numeros > 0 && numeros < 100) {
        contador += 1;
      }
    }
    System.out.println("Existem " + contador + " números entre 0 e 100");
  }
}
