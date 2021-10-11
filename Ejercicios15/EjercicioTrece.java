import java.util.Scanner;
public class EjercicioTrece{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoViajeAlumnos(){
    // definir variables
    int cantidad =0;
    String  costo ="";
    //datos de entrada
    System.out.println("Ingrese el monto de dinero que dispone");
    cantidad=sc .nextInt();  
    //proceso
    if (cantidad>100){
      costo="$20";
    }
   else if (cantidad>=50 && cantidad<=100){
      costo="$35";
    }
    else if(cantidad>=20 && cantidad<=49){
      costo="$40";
      }
   else if(cantidad<20){
     costo="$70";
   }
   else{
      costo="Ninguno";
   }
    //datos de salida
    System.out.println("El costo de pasaje de cada uno es de :"+costo);
  }
    public static void main(String[] arg){
    algoritmoViajeAlumnos();
  }
}