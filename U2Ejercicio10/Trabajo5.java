import java.util.Scanner; 
public class Trabajo5 {
static Scanner sc = new Scanner(System.in);
  static void ahorroEAMQ(){
  
    int n=365;

    for(int i = 1;i <=n;i++){

      double resultado = (double)(Math.pow(3, i)); 
      System.out.println("El ahorro del dia  "+i+"  es:  "+resultado+"  pesos");
    }
    System.out.println("El ahorro de un anho  es:  "+(double)(Math.pow(3, n))+"  pesos");
  }
   public static void main(String[] args) { 
   ahorroEAMQ();
  } 
}

