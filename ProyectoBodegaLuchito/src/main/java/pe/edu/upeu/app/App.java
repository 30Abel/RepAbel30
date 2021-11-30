package pe.edu.upeu.app;

import pe.edu.upeu.dao.ProductoDao;

/**
 * Hello world!
 *
 */
public class App {

   static ProductoDao dao;
    
    public static void main( String[] args ){
    
    dao=new ProductoDao();
    dao.ingresarProducto();

        
    }
}
