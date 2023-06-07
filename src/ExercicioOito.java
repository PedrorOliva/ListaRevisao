// Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
// Após toda a entrada ter sido realizada, leia o valor de um reajuste.
// Em seguida exiba todos os salários já reajustados.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioOito {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    List<Double> salarios = new ArrayList<>();
    List<Double> salarioAjustado = new ArrayList<>();
    double salario = 0;
    double reajuste = 0;
    double porcentoAumento = 0;
    double aumento = 0;
    double novoSalario = 0;

    while(salario != -1) {
      System.out.println("Informe o salário: ");
      salario = inputUsuario.nextDouble();
      salarios.add(salario);
      if(salario == -1){
        salarios.remove(salario);
      }
    }

    System.out.println("Informe o valor do reajuste: ");
    reajuste = inputUsuario.nextDouble();
    porcentoAumento = reajuste / 100;
    System.out.println(porcentoAumento);


    for(int i = 0; i < salarios.size(); i++){
      aumento = porcentoAumento * salarios.get(i);
      novoSalario = aumento + salarios.get(i);
      salarioAjustado.add(novoSalario);
    }
    System.out.println("Salarios reajustados: ");
    System.out.println(salarioAjustado);

  }
}

//    for(int i = 0; i <= salarios.size(); i++){
//      double novoSalario = salarios.get(i);
//      novoSalario += novoSalario * (reajuste / 100);
//      salarioAjustado.add(novoSalario);
//    }
