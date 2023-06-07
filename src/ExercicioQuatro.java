import java.util.Scanner;

// Leia a idade de 20 pessoas e exiba a média das idades.
public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int pessoas = 20;
    int idades = 0;
    double media = 0;
    int somaIdade = 0;

    for (int i = 1; i <= pessoas; i++){
      System.out.println("Informe a sua idade: ");
      idades = inputUsuario.nextInt();
      somaIdade += idades;
    }
    media = somaIdade / pessoas;

    System.out.println("A média das idades é: " + media);
  }
}
