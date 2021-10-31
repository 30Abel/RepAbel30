import java.util.Scanner; 
public class Trabajo1 {
static Scanner sc = new Scanner(System.in);
  static void salarioEAMQ(){
    //Definir variables
    float salario;
    //Datos de entrada
    System.out.println("Ingrese el salario inicial");
    salario=sc.nextInt();
    //Proceso
    if (salario>=1500){
        for(int i = 1;i <= 6;i++){
         salario+=(salario*0.10);
          //Datos de salida
          System.out.println("  el salario en " +i+  " anho es  : "+salario);
        }
        System.out.println("  el salario al cabo de 6 anhos es "+salario);
      }
    else{
      System.out.println("el numero ingresado no es correcto");
    }
  } 
  public static void main(String[] args) {
  salarioEAMQ();
  }
}