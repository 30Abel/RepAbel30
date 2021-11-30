package pe.edu.upeu.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public int leer(int valor, String msg){  
  System.out.print(msg+": ");
  try{
    valor=Integer.parseInt(br.readLine());
  }catch(Exception e){
    valor=leer(valor, msg);
  }
  System.out.println();
  return valor;
}

public long leer(long valor, String msg){  
  System.out.print(msg+": ");
  try{
    valor=Long.parseLong(br.readLine());
  }catch(Exception e){
    valor=leer(valor, msg);
  }
  System.out.println();
  return valor;
}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 16683c65e72840cf275cf7076847b8ef904fd94c
public double leer(double valor, String msg){  
  System.out.print(msg+": ");
  try{
    valor=Double.parseDouble(br.readLine());
  }catch(Exception e){
    valor=leer(valor, msg);
  }
  System.out.println();
  return valor;
}

public char leer(char valor, String msg){ 
  System.out.print(msg+": ");
  try{//David Mamani
    valor=br.readLine().charAt(0);//
  }catch(Exception e){
    valor=leer(valor, msg);
  }
  System.out.println();
  return valor;
}

public String leer(String valor, String msg){  
  System.out.print(msg+": ");
  try{//David Mamani
    valor=br.readLine();//
  }catch(Exception e){
    valor=leer(valor, msg);
  }
  System.out.println();
  return valor;
<<<<<<< HEAD
=======
=======
public char leer(char valor, String msg){  

return ' ';
}
public String leer(String valor, String msg){  

return "";
>>>>>>> b2168dbccb9d283bcb0b071faa20da937f1e2779
>>>>>>> 16683c65e72840cf275cf7076847b8ef904fd94c
}

}