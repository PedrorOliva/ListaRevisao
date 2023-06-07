// Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
// Encerre a execução quando um número negativo for digitado.

import java.util.Scanner;

public class ExercicioSeis {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int qtdNumeros = 0;
    int numero = 0;
    int soma = 0;

    System.out.println("Quantos números deseja adicionar? ");
    qtdNumeros = inputUsuario.nextInt();

    for(int i = 1; i <= qtdNumeros; i++){
      System.out.println("Informe um número: ");
      numero = inputUsuario.nextInt();
      soma += numero;
    }
    System.out.println("A soma de todos os valores é: " + soma);
  }
}
