import java.util.Scanner;
public class Ejercicio2{
  static void impuestosEAMQ(){
    Scanner in = new Scanner(System.in);
     double descuento, monto_de_pago, monto_del_descuento, precio_del_producto;
     String nombre_del_producto;
     String tecla_repetir;
     do {
       System.out.print("Introdusca la categoria del vehiculo: ");
        nombre_del_producto = in.nextLine();
        System.out.print("Introdusca la cantidad de impuesto: ");
        descuento = in.nextDouble();
        in.nextLine();
        System.out.print("Introdusca el valor del vehiculo: ");
          precio_del_producto = in.nextDouble();
          in.nextLine();
          monto_del_descuento=descuento*precio_del_producto/100;
          monto_de_pago=precio_del_producto-monto_del_descuento;
          System.out.println("categoria del vehiculo: " + nombre_del_producto);
          System.out.println("Valor de monto de pago: " + monto_de_pago);
          System.out.println("Valor de monto del descuento: " + monto_del_descuento);
          System.out.println();
          do {
            System.out.print("\u00BFDeseas repetir el proceso? (S/N): ");
             tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }
    public static void main(String[] args) {
       impuestosEAMQ();
       }
}