import java.util.Scanner;
public class EjercicioSiete{
  static Scanner in = new Scanner(System.in);
      static void algoritmoBonoBecaEAMQ(){  
        double beca, edad, promedio;
        System.out.print("Ingrese la edad: ");
        edad = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el promedio: ");
        promedio = in.nextDouble();
        in.nextLine();
        beca=0;
        
        if(edad>18&&promedio>=9)
            beca=2000;
        if(edad>18&&promedio>=7.5&&promedio<9)
            beca=1000;
        if(edad>18&&promedio>=6&&promedio<7.5)
            beca=500;
        if(edad<=18&&promedio>=9)
            beca=3000;
        if(edad<=18&&promedio>=8&&promedio<9)
            beca=2000;
        if(edad>18&&promedio>=6&&promedio<8)
            beca=100;
        if(promedio<6)
            System.out.println("Usted debe estudiar mas y prepararse para la proxima");
            System.out.println("Valor de beca: " + beca);
            in.close();
    }
    public static void main(String[] args) {
    algoritmoBonoBecaEAMQ();
    }
}