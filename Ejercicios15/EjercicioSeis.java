import java.util.Scanner;
public class EjercicioSeis{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoDescuentoEAMQ(){
    // definir variables
    double costo =0;
    String  descuento ="";
    //datos de entrada
    System.out.println("Ingrese el costo del articulo");
    costo=sc .nextDouble();  
    //proceso
    if (costo>=1 && costo<=100){
      descuento="10% de descuento";
    }
   else if (costo>100 && costo<200){
      descuento="12% de descuento";
    }
   else if(costo>=200){
     descuento="15% de descuento";
   }
   else{
      descuento="Ninguno";
   }
    //datos de salida
    System.out.println("Por la compra de tal artículo alcanzo el:"+descuento);
  }
    public static void main(String[] arg){
    algoritmoDescuentoEAMQ();
  }
}