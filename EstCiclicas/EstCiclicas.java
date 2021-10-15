import java.util.Scanner;
import java.util.Random;
import java.io.Console;
public class EstCiclicas{
  static Scanner sc = new Scanner(System.in);

   static final Random generator = new Random();
   public static int random(int min, int max) {
    return min + (generator.nextInt() * (max - min));
 }
 
  static void contarNumMenorCeroMayorCeroWhile(){
    //declaracion de variables
    int numMenCero=0, numMayCero=0, numN, cantNum;
    //datos de entrada
    System.out.println("Ingrese la cantidad de numeros a evaluar");
    cantNum=sc.nextInt();
    //proceso
    while (cantNum>=1){
      numN=random(-1, 2);
      System.out.println(numN);
      if(numN<=0){
        numMenCero++;
      }else{
        numMayCero++;
      }
      cantNum--;
    }

    //datos de salida
    System.out.println("La cantidad de numeros menores o igual a cero son :"+numMenCero+"\nLa cantidad de numeros mayores a cero son :"+numMayCero);

  }


  static void factorial(){
  //definir variables
  int n, resulF=1;
  //datos de entrada 
  System.out.println("Ingrese un numero para calcular factorial");
  n=sc.nextInt();
  //proceso
  if (n>1){
    for(int i=1; i<=n; i++){
    resulF=resulF*i;
    System.out.println("i= "+i+ " resulF= "+resulF);
   }
  }
  //datos de salida
  System.out.println("El factorial de "+n+ " es :" +resulF);
  }


  static void sumaParesRangoAB(){
    //definir variables y datos de entrada
    System.out.println("Introdusca el valor inicial  A");
    int a=sc.nextInt();
    System.out.println("Introdusca el valor final B");
    int b=sc.nextInt();
    int suma=0;
    //proceso
    for (int i=a; i<=b; i++){
      if (i%2==0){
        suma=suma+i;
      }
    }
    //datos de salida
    System.out.println("La suma de numeros pares es :" +suma);
  }

<<<<<<< HEAD


static void menuOpciones(){
=======
<<<<<<< HEAD


static void menuOpciones(){
=======
  static void menuOpciones(){
>>>>>>> 7df1b210621e6558355f21e37580d4495bc272a3
>>>>>>> f1ac37245613dd30bff5705306451d4d1cee8d53
int opcion=0;
String msg="Eliga el algoritmo que desea probar\n 1=ssss\n2=factorial\n3=sumaParesRangoAB";
System.out.println(msg);
opcion=sc.nextInt();

while(opcion!=0){
    switch(opcion){
        case 1: contarNumMenorCeroMayorCeroWhile(); break;
        case 2: factorial(); break;
        case 3: sumaParesRangoAB(); break;
        default: System.out.println("Opcion no existe!");
    }
  System.out.println(msg);
  opcion=sc.nextInt();    
}
}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f1ac37245613dd30bff5705306451d4d1cee8d53
 static void validarContrasenha(){
    //definicion de variables
    String mensaje, password, usuario, msgrespuesta="";
    int contador=1;
    //datos de entrada
    System.out.println("Ingrese su Usuario:");
    usuario=sc.next();
    Console console = System.console();
    //Proceso
    do{
      //System.out.println("Ingrese su Password:");
      //password=sc.next();        
      char[] passwordArray = console.readPassword("Ingrese su Password:");  
      if((String.valueOf(passwordArray)).equals("123456d")){
        msgrespuesta="En hora buena";
        System.out.println(msgrespuesta);  
        //contador=4;
        break;
      }else if(contador<3){
        msgrespuesta="lo siento password equivocado!";
        System.out.println(msgrespuesta);        
        // contador=contador+1;
      }else{
        msgrespuesta="oportunidades Agotadas";    
        System.out.println(msgrespuesta);     
      }
    contador++;
    }while(contador<=3);
     //Datos de salida
    //System.out.println(msgrespuesta);
  }




<<<<<<< HEAD
=======
=======
>>>>>>> 7df1b210621e6558355f21e37580d4495bc272a3
>>>>>>> f1ac37245613dd30bff5705306451d4d1cee8d53
  
  public static void main(String [] arg){
   //contarNumMenorCeroMayorCeroWhile();
   //factorial();
<<<<<<< HEAD
   //menuOpciones();
   validarContrasenha();
=======
<<<<<<< HEAD
   //menuOpciones();
   validarContrasenha();
=======
   menuOpciones();
>>>>>>> 7df1b210621e6558355f21e37580d4495bc272a3
>>>>>>> f1ac37245613dd30bff5705306451d4d1cee8d53
  }
}