package pe.edu.upeu.modulo;
import java.util.Scanner;
public class SubProgramas{
  public String nombre="Abel";
  public String dni= "";
  Scanner sc=new Scanner(System.in);

  public void saludo(){
    System.out.println("Hola"+nombre);
 
  }

  public void otrosaludo(){
    String apellidos="Perez";
    System.out.println("Hola"+nombre+""+apellidos);
  }

}