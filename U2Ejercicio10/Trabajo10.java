import java.util.Scanner; 
public class Ejercicio10 {
static Scanner sc = new Scanner(System.in);
  static void articulosEAMQ(){
    //Definir variables
    int n,precio;
    double t1=0,t2=0,t3=0,d1=0,d2=0,d3=0;
    //Datos de entrada
    System.out.println("Programa que determina el precio a pagar");
    System.out.println("Ingrese la cantidad de articulos");
    n=sc.nextInt();
    for(int i = 1;i <=n;i++){
    System.out.println("\nIngrese el precio de del articulo."+i);
    System.out.print("\t: ");
    precio=sc.nextInt();
    if(precio>=200){
      t1=(precio-(precio*0.15));
      d1=(precio*0.15);
      System.out.print("el precio es; \n"+precio+"   su descuento es : "+d1);
    
    }else if(precio>100&&precio<200){
      t2=(precio-(precio*0.12));
      d2=(precio*0.12);
      System.out.print("el precio es; \n"+precio+"   su descuento es : "+d2);
    }else {
      t3=(precio-(precio*0.1));
       d3=(precio*0.12);
      System.out.print("el precio es; \n"+precio+"   su descuento es : "+d3);
    }
    System.out.print("\nel precio final :"+(t1+t2+t3)+"\nGRASIAS POR SU COMPRA\n");
  }
}
 public static void main(String[] args) {
  articulosEAMQ();
  }
}