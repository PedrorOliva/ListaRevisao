//  Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.

import java.util.Scanner;

public class ExercicioSete {
  public static void main(String[] args) {
    Scanner inptUsuario = new Scanner(System.in);

    System.out.println("Escreva seu nome: ");
    String nome = inptUsuario.next();
    System.out.println("Informe um número: ");
    int numero = inptUsuario.nextInt();

    for (int i = 1; i <= numero; i++) {
      System.out.println(nome);
    }
  }
}
