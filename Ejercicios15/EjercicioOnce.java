import java.util.Scanner;
public class EjercicioOnce{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoBonoTrabajadorEAMQ(){
    // definir variables
    int antiguedad =0;
    String  bono ="";
    //datos de entrada
    System.out.println("Ingrese los años esta trabajando como empleado");
    antiguedad=sc .nextInt();  
    //proceso
    if (antiguedad>=1 && antiguedad<=1){
      bono="$100";
    }
   else if (antiguedad>=2 && antiguedad<=2){
      bono="$200";
    }
    else if(antiguedad>=3 && antiguedad<=3){
      bono="$300";
      }
   else if(antiguedad>=4 && antiguedad<=4){
      bono="$400";
   }
   else if(antiguedad>=5 && antiguedad<=5){
      bono="$500";
   }
    else if(antiguedad>5){
      bono="$1000";
   }
   else{
      bono="Ninguno";
   }
    //datos de salida
    System.out.println("Por el tiempo de sus servicios usted tiene un bono de :"+bono);
  }
    public static void main(String[] arg){
    algoritmoBonoTrabajadorEAMQ();
  }
}