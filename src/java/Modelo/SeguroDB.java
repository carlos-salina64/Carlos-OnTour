package Modelo;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

public class SeguroDB {

    /*
    Metodo para almacenar pseguros en la Base de datos. Primero le damos la variable para traer la conexion, luego
    ejecutamos la consulta la cual se hace mediante un procedimiento almacenado registrado en la bd, el requiere
    3 parametros asociados a las columnas de la tabla. Se da entender luego, indicado el lugar que le corresponde en
    el procedimiento, cuales son estos atributos. Una vez hecho, se ejecuta la consulta y se almacena en la variable i
    la cua, mediant de si es 1 o 0, nos arrojara si seguro se guardo o no en la BD.
     */
    public static boolean insertarSeguro(Seguro seg) throws SQLException {
        boolean rpta = false;
        try {
            Connection cn = Conexion.obtenerConexion();
            CallableStatement cl = cn.prepareCall("{call sp_insertarSeguro(?,?,?,?)}");
            cl.setInt(1, seg.getId_curso());
            cl.setString(2, seg.getDescripcion());
            cl.setInt(3, seg.getPrecio());
            cl.setString(4, seg.getAccidente());
            int i = cl.executeUpdate();
            if (i == 1) {
                rpta = true;
            } else {
                rpta = false;
            }
        } catch (Exception e) {
            System.out.println("Error al agregar: " + e.getMessage());
        } finally {
            Conexion.obtenerConexion().close();
        }
        return rpta;

    }

    public static ArrayList<Seguro> obtenerSeguro() throws SQLException {

        ArrayList<Seguro> lista = new ArrayList<Seguro>();

        try {
            String sql="SELECT * FROM seguro";
            CallableStatement cl = Conexion.obtenerConexion().prepareCall(sql);

            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Seguro v = new Seguro(rs.getInt("id_seguro"), rs.getInt("id_curso"), rs.getString("descripcion"),rs.getInt("precio"),rs.getString("accidente"));
                lista.add(v);
            }
        } catch (Exception e) {
            System.out.println("Error al Listar: " + e.getMessage());
        } finally {
            Conexion.obtenerConexion().close();
        }

        //Y retornamos la lista, variable que tiene todos los productos dentro.
        return lista;
    }

}
