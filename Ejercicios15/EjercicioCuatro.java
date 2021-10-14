import java.util.Scanner;
public class EjercicioCuatro{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoUsoDeEstacionamientoEAMQ(){
    // definir variables
    double hora =0;
    String  costo ="";
    //datos de entrada
    System.out.println("Ingrese las horas usadas en el estacionamiento");
    hora=sc .nextDouble();  
    //proceso
    if (hora>=1 && hora<=2){
      costo="$5.00 cada uno";
    }
   else if (hora>=3 && hora<=5){
      costo="$4.00 cada uno";
    }
    else if(hora>=6 && hora<=10){
      costo="$3.00 cada uno";
      }
   else if(hora>10){
     costo="$2.00 cada uno";
   }
   else{
      costo="No paga nada";
   }
   //datos de salida
    System.out.println("Ustedes tienen que pagar el monto de  :"+costo);
   }
    
   public static void main(String[] arg){
   algoritmoUsoDeEstacionamientoEAMQ();
   }
}