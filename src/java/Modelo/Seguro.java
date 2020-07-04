package Modelo;

public class Seguro {

    private int id;
    private int id_curso;
    private String descripcion;
    private int precio;
    private String accidente;

    public Seguro() {
    }

    public Seguro(int id, int id_curso, String descripcion, int precio) {
        this.id = id;
        this.id_curso = id_curso;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Seguro(int id_curso, String descripcion, int precio, String accidente) {
        this.id_curso = id_curso;
        this.descripcion = descripcion;
        this.precio = precio;
        this.accidente = accidente;
    }

    Seguro(int aInt, int aInt0, String string, int aInt1, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAccidente() {
        return accidente;
    }

    public void setAccidente(String accidente) {
        this.accidente = accidente;
    }



}
