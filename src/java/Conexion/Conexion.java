package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    /*
    1. Definimos variables para la Conexion. Connection es la variable que almacenara la conexion,
       user 
     */
    private static Connection cn = null;
    private static String user = "carlossalina";
    private static String pass = "carlos123";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

    /*
    2. Creamos el metodo para obtener la conexion. Este metodo será usado en los DAO, vistas y controlador
    */
    public static Connection obtenerConexion(){

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            cn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Satisfactoria");

        } catch (Exception e) {
            System.out.println("Conexion invalida: "+e.getMessage());

        }
        return cn;
    }

  /*
    4. Creamos el metodo de la Conexion en un main class, para probarla. Si deseas probarla dale click derecho
    a esta pagina, luego presionas la opcion run file. Si por consola te muestra el mensaje
    Conexion satisfactoria, es por que hiciste las cosas bien
    */  
    public static void main(String[] args) {
        Conexion.obtenerConexion(); 

    }

}
