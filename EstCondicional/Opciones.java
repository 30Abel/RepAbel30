import java.util.Scanner;
public class Meses{
static Scanner sc = new Scanner(System.in);
static void menuOpciones(){

 int opcion=0;
 String msg="Eliga el algoritmo que desea probar\n 1=ssss\n2=zzzz";
 System.out.println(msg);
 opcion=sc.nextInt();

 while(opcion!=0){
    switch(opcion){
        case 1: algoritmoRegalos(); break;
        case 2:  pagoPolizas(); break;
        case 3:  mesdelAnho(); break;
        default: System.out.println("Opcion no existe!");
    }
  System.out.println(msg);
  opcion=sc.nextInt();    
}
}

public static void main(String[] arg){
//algoritmoRegalos();
  //pagoPolizas();
  //mesdelAnho();
  menuOpciones();