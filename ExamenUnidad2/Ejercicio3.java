import java.util.Scanner;
public class Ejercicio3{
    static void tableDeMultipicarEAMQ(){
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;
        System.out.print("Ingresa la tabla de cuanto deseas multiplicar: ");
        numero = obtenerNumero.nextInt();
        for(i = 1; i<=numero; i++)
        {
            for(j = 1; j <= 20; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       tableDeMultipicarEAMQ();
    }
}