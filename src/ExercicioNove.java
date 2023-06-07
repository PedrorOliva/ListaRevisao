public class ExercicioNove {
  public static void main(String[] args) {
    int[] numeros = new int[50];

    for(int i = 0; i < numeros.length; i++) {
      numeros[i] = 101 + i;
      System.out.println("Índice: " + i + " valor: " + numeros[i]);
    }
  }
}
