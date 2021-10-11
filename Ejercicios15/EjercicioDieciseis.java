import java.util.Scanner;
public class TrabajoDieciseis{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoBonoEAMQ(){
    // definir variables
    double puntos =0;
    String  bono ="";
    //datos de entrada
    System.out.println("Ingrese el puntaje que alcanzo");
    puntos=sc .nextDouble();  
    //proceso
    if (puntos>0 && puntos<=100){
      bono="1 salario";
    }
   else if (puntos>=101 && puntos<=150){
      bono="2 salarios mínimos";
    }
   else if(puntos>150){
     bono="3 salarios mínimos";
   }
   else{
      bono="No alcanzo bono";
   }
    //datos de salida
    System.out.println("Usted a ganado el siguiente bono :"+bono);
  }
    public static void main(String[] arg){
    algoritmoBonoEAMQ();
  }
}