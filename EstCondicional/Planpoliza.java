import java.util.Scanner;
public class Planpoliza{
  static Scanner sc = new Scanner(System.in);
  static void algoritopoliza(){
    // definir variables
    double monto =0;
    String plan, alcohol, lentes, enfermedad;
    int edad;
    double costoPago, recargos=0;
    //datos de entrada
    System.out.println("Ingrese el plan (A/B): ");
    plan=sc .next();  
    System.out.println("Ingrese el alcohol (S/N): ");
    alcohol=sc .next(); 
    System.out.println("Usa lentes (S/N): ");
    lentes=sc .next(); 
    System.out.println("Tiene alguna enfermedad (S/N): ");
    enfermedad=sc .next(); 
    System.out.println("Ingrese su edad?: ");
    edad=sc.nextInt(); 
    //proceso
    if(alcohol.equals("S")){recargos+=0.10;}
    if(lentes.equals("S")){recargos+=0.05;}
    if(enfermedad.equals("S")){recargos+=0.10;}
    if(edad>40){recargos+=0.20;}else{recargos+=0.10;}
    if(plan.equals("A")){ costoPago=1200+1200*recargos;} else {costoPago=950+950*recargos;}
    //datos de salida
    System.out.println("Usted debe de pagar el monto de: $ "+costoPago );
  }
  public static void main(String[] arg){
  algoritopoliza();
}
}