import java.util.Scanner;
public class TrabajoUno{
  static Scanner sc = new Scanner(System.in);
  static void calcularpromedioEAMQ(){
  Scanner in = new Scanner(System.in);
  double primer_examen, promedio, segundo_examen, tercer_examen;
  System.out.print("Ingresa el valor de primer examen: ");
  primer_examen = in.nextDouble();
  in.nextLine();
  System.out.print("Ingresa el valor de segundo examen: ");
  segundo_examen = in.nextDouble();
  in.nextLine();
  System.out.print("Ingresa el valor de tercer examen: ");
  tercer_examen = in.nextDouble();
  in.nextLine();
  promedio=primer_examen*0.25+segundo_examen*0.25+tercer_examen*0.5;
  System.out.println("Valor de promedio: " + promedio);
    }

     public static void main(String[] arg){
    calcularpromedioEAMQ();
  }
}