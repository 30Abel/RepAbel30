import java.util.Scanner;
public class Ejercicio4{
    static void numerosPerfectosEAMQ(){
        int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere averiguar: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {  
          // i son los divisores. Se divide desde 1 hasta n-1                            
            if (n % i == 0) {
                suma = suma + i;   
                // si es divisor se suma
            }
        }
        if (suma == n) {          
           // si el numero es igual a la suma de sus divisores es perfecto        
            System.out.println("Perfecto");
        } else {
          System.out.println("No es perfecto");
        }
    }
    public static void main(String[] args) {
       numerosPerfectosEAMQ();
       }
}