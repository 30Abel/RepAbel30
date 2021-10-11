import java.util.Scanner;
public class EjercicioQuince{
static Scanner sc = new Scanner(System.in);
static void algoritmoDiasSemanaEAMQ(){
  // definir variables
  int semNum;
  String semLetra="";
  //datos de entrada
  System.out.println(" Ingrese el numero de semana entre 1 - 7");
  semNum=sc.nextInt();
  //proceso
  switch (semNum){
    case 1: semLetra="Domingo"; break;
    case 2: semLetra="Lunes"; break;
    case 3: semLetra="Martes"; break;
    case 4: semLetra="Miercoles"; break;
    case 5: semLetra="Jueves"; break;
    case 6: semLetra="Viernes"; break;
    case 7: semLetra="Sábado"; break;
    default: System.out.println (" Este numero de semana no es existe!");
  }
  //datos de salida
  System.out.println("La semana numero " +semNum+ " es: " +semLetra);
}
public static void main(String[] arg){
  algoritmoDiasSemanaEAMQ();
}
}