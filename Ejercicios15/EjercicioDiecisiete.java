import java.util.Scanner;
public class EjercicioDiecisiete{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoPaqueteEAMQ(){
    // definir variables
    double pago =0;
    String  paquete ="";
    //datos de entrada
    System.out.println("Ingrese el pago que recibió por Diciembre");
    pago=sc .nextDouble();  
    //proceso
    if (pago>=50000){
      paquete="\ntelevisión\nmodular\ntres pares de zapatos\ncinco camisas\ncinco pantalones";
    }
   else if (pago>=20000 && pago<50000){
      paquete="\nuna grabadora\ntres pares de zapatos\ncinco camisas\ncinco pantalones";
    }
    else if(pago>=10000 && pago<20000){
      paquete="\ndos pares de zapatos\ntres camisas\ntres pantalones";
      }
   else if(pago<10000){
     paquete="\nun par de zapatos\ndos camisas\ndos pantalones";
   }
   else{
      paquete="Ninguno";
   }
    //datos de salida
    System.out.println("Usted puede elegir los siguentes paquetes:"+paquete);
  }
    public static void main(String[] arg){
    algoritmoPaqueteEAMQ();
  }
}