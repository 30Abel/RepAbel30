import java.util.Scanner;
<<<<<<< HEAD
public class EjercicioCinco{
=======
public class EjercicioCincoEAMQ{
>>>>>>> f1ac37245613dd30bff5705306451d4d1cee8d53
  static Scanner sc=new Scanner(System.in);
  static void algoritmoPersonaMenorEAMQ(){
  //declarar variables 
  String nomA, nomB, nomC, nomM="";
  int edadA, edadB, edadC, edadM=0;
  //Datos de Entrada
  System.out.println("Ingrese nombre 1ra Persona:");
  nomA=sc.next();
  System.out.println("Ingrese edad 1ra Persona:");
  edadA=sc.nextInt();  
  System.out.println("Ingrese nombre 2da Persona:");
  nomB=sc.next();
  System.out.println("Ingrese edad 2da Persona:");
  edadB=sc.nextInt();  
  System.out.println("Ingrese nombre 3ra Persona:");
  nomC=sc.next();
  System.out.println("Ingrese edad 3ra Persona:");
  edadC=sc.nextInt();      
    //Proceso
    if(edadA<edadB && edadA<edadC){
        edadM=edadA;
        nomM=nomA;
     }
    
      if(edadB<edadA && edadB<edadC){
      edadM=edadB;
      nomM=nomB;
     }
      if(edadC<edadA && edadC<edadB){
      edadM=edadC;
      nomM=nomC;
     }    
    //Datos de salida
    System.out.println("La persona menor es: "+ nomM +" y su edad es:"+edadM);
    sc.close();
  }
    public static void main(String[] args){
    algoritmoPersonaMenorEAMQ();
  }
}