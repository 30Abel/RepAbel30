package pe.edu.upeu;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App{

    public static void tiposdatos(){
        byte a=1;
        short b=8;
        int c=87;
        float d=84.5f;
        double f=87.21;

        boolean e=true; 

        char h='+';

        String g=" hola";
        Integer xx;
        Double xxx;
        Date ss;
        
    }

    public static void operadores() {
        int a=7;
        int b=2;
        //operadores aritmeticos
        System.out.println("suma:"+(a+b));
        System.out.println("resta:"+(a-b));
        System.out.println("division:"+(a/b));
        System.out.println("multiplicacion:"+(a*b));
        System.out.println("modulo:"+(a%b));
        System.out.println("potencia:"+(Math.pow(a, b)));
        //operadores logicos
        int ologx=(a>b && a!=b)?1:0;
        System.out.println(ologx);
        int ologxx=(a>b || a==b)?1:0;
        System.out.println(ologxx);
        int ologxxx=!(a>b || a==b)?1:0;
        System.out.println(ologxxx);
        //operaciones relacionadas
        System.out.println((a>b)?"verdadero":"falso");
        System.out.println((a>=b)?"verdadero":"falso");
        System.out.println((a<b)?"verdadero":"falso");
        System.out.println((a<=b)?"verdadero":"falso");
        System.out.println((a==b)?"verdadero":"falso");
        System.out.println((a!=b)?"verdadero":"falso");
        //adicionales
        int x=4;
        System.out.println(--x);//3
        System.out.println(x++);//3  --- 4        
        System.out.println(x--);//4 ---3

        System.out.println(x+=2);//5
        System.out.println(x-=2);//3
        System.out.println(x*=2);//6
        System.out.println(x/=2);//3
        System.out.println(x%=2);//1
    }

    public static void controlStructure() {
        //EC.Secuemciales
        //Calular el area del triangulo
        int b=4, h=2;
        System.out.println((b*h)/2);
        //E.C. condicionales
        if(b>h){ //Condicional simple
            System.out.println("B es Mayor");
        }

        if(b>h){ //Condicional compuesta / bifurcada
            System.out.println("B es Mayor");
        }else{
            System.out.println("H es Mayor");
        }

        if(b>h){ //Condicional compuesta anidada
            System.out.println("B es Mayor");
        }else if(b==h){
            System.out.println("Ambos son Iguales");
        }else{
            System.out.println("B es menor");
        }
        //EC. Condicional Multiple
        int opcion=0;
        switch (opcion) {
            case 1: {
                System.out.println("Uno");
                
            } break;
            case 2: System.out.println("Dos"); break;
            case 3: System.out.println("Tres"); break;
            case 4: System.out.println("Cuatro"); break;        
            default: System.out.println("no existe"); break;
        }
        //E.C Repetitivas
        //while
            while (opcion==0) {
                System.out.println("Realizar operacion");
                opcion++;
            }
        //for
        for (int i = -1; i < opcion; i++) {
            System.out.println("Realizar operacion");
        }
        //do while
        do {
            System.out.println("Realizar operacion");
            opcion++;            
        } while (opcion==0);
    }

    public static void main( String[] args ){
        //System.out.println( "Hello World!" );
        //operadores();
        controlStructure();
    }
    }