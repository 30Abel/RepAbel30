package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud{

  public LeerArchivo la;

  public LeerTeclado lt=new LeerTeclado();
  public UtilsX util=new UtilsX();
  public ProductoTO proTO;




    public void ingresarProducto() {
      la=new LeerArchivo("Producto.txt");

      proTO=new ProductoTO();
      proTO.setIdProducto(generarId(la, 0, "P", 1));
      proTO.setNomnbre(lt.leer("", "Ingrese el nombre producto"));
      proTO.setIdCate(lt.leer("", "Ingrese el Id Categ..."));

      la=new LeerArchivo("Producto.txt");
      agregarContenido(la, proTO);



       
    }

    
}
