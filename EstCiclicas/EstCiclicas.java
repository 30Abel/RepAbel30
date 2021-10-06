import java.util.Scanner;
import java.util.Random;
public class EstCiclicas{
  static Scanner sc = new Scanner(System.in);

   static final Random generator = new Random();
   public static int random(int min, int max) {
    return min + (generator.nextInt() * (max - min));
 }
 
  static void contarNumMenorCeroMayorCeroWhile(){
    //declaracion de variables
    int numMenCero=0, numMayCero=0, numN, cantNum;
    //datos de entrada
    System.out.println("Ingrese la cantidad de numeros a evaluar");
    cantNum=sc.nextInt();
    //proceso
    while (cantNum>=1){
      numN=random(-1, 2);
      System.out.println(numN);
      if(numN<=0){
        numMenCero++;
      }else{
        numMayCero++;
      }
      cantNum--;
    }

    //datos de salida
    System.out.println("La cantidad de numeros menores o igual a cero son :"+numMenCero+"\nLa cantidad de numeros mayores a cero son :"+numMayCero);

  }
  
  public static void main(String [] arg){
   contarNumMenorCeroMayorCeroWhile();
  
  }
}