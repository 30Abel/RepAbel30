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

    }

    public static void controlStructure() {
        
    }

    public static void main( String[] args ){

        //System.out.println( "Hello World!" );
        operadores();
    }
}