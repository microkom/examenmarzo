/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmarzofallido;

import static examenmarzofallido.Empresa.writeFile;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion login = new Conexion();
        Connection con = null;
        File fichero = new File ("productos.txt");
        PreparedStatement stmt = null;
        //Producto pro = null;
        
        try{
            con = login.conectar();
            
            stmt = con.prepareStatement("SELECT p.IdProducto, p.NomProducto,"
                    + "p.Proveedor, p.Categoria, p.Precio, p.Existencias, c.NomCategoria,"
                    + "pr.Nombre as NomProveedor FROM productos p INNER JOIN categorias c "
                    + "ON p.Categoria = c.IdCategoria INNER JOIN proveedores pr ON "
                    + "p.Proveedor = pr.IdProveedor WHERE p.IdProducto = ?");
            
            
            writeFile(fichero,"hola");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            login.desconectar(con);
        }
        
        
    }
    
}
