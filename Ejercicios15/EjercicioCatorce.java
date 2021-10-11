import java.util.Scanner;
public class EjercicioCatorce{
static Scanner sc = new Scanner(System.in);
static void algoritmoCalificacion(){
  // definir variables
  int num;
  String letra="";
  //datos de entrada
  System.out.println(" Ingrese el numero de calificación entre 1 - 10");
  num=sc.nextInt();
  //proceso
  switch (num){
    case 1: letra="F"; break;
    case 2: letra="F"; break;
    case 3: letra="F"; break;
    case 4: letra="F"; break;
    case 5: letra="F"; break;
    case 6: letra="D"; break;
    case 7: letra="D"; break;
    case 8: letra="C"; break;
    case 9: letra="B"; break;
    case 10: letra="A"; break;
    
    default: System.out.println (" No se reconoce su calificación!");
  }
  //datos de salida
  System.out.println("Su calificacion de numero " +num+ " es: " +letra);

}
public static void main(String[] arg){
 algoritmoCalificacion();
}
}