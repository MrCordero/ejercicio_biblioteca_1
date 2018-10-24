package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

public class Data {

    private Conexion con;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("bdSoftwareBiblioteca");
    }

    public Usuario existeUsuario(String run) throws SQLException {
        String query = "SELECT * FROM usuario WHERE run = '" + run + "'";

        Usuario us = null;

        ResultSet rs = con.ejecutar(query);

        if (rs.next()) {
            us = new Usuario();

            us.setId(rs.getInt("id"));
            us.setRun(rs.getString("run"));
            us.setNombre(rs.getString("nombre"));
            us.setEdad(rs.getInt("edad"));
        }

        con.close();

        return us;
    }

    public String getNombreUsuario(String run) {
        return null;
    }

    public void crearLibro(Libro l) throws SQLException {
        String insert = "INSERT INTO libro VALUES("
                + "NULL,"
                + "'" + l.getNombre() + "',"
                + "'" + l.getEditorial() + "',"
                + "'" + l.getAnio_lan() + "',"
                + "'" + l.getPrecio() + "',"
                + "'" + l.getStock() + "')";

        con.ejecutar(insert);
    }

    public void eliminarLibro(int id) throws SQLException {
        String delete = "DELETE FROM "
                + "libro "
                + "WHERE "
                + "id ='" + id + "';";

        con.ejecutar(delete);
    }

    public void setLibro(Libro l) {
        String update = "UPDATE libro SET "
                + "nombre = '" + l.getNombre() + "',"
                + "editorial ='" + l.getEditorial() + "', "
                + "anio_lan ='" + l.getAnio_lan() + "', "
                + "precio = '" + l.getPrecio() + "', "
                + "stock = '" + l.getStock() + "' "
                + "WHERE id = '" + l.getId() + "'";
    }

    public void crearUsuario(Usuario u) throws SQLException {
        String insert = "INSERT INTO usuario VALUES("
                + "NULL,"
                + "'" + u.getNombre() + "',"
                + "'" + u.getRun() + "',"
                + "'" + u.getEdad() + "',";
        con.ejecutar(insert);
    }

    public void setUsuario(Usuario u) {
        String update = "UPDATE usuario SET "
                + "nombre = '" + u.getNombre() + "',"
                + "edad ='" + u.getEdad() + "',";
    }

    public void eliminarUsuario(int id) throws SQLException {
        String delete = "DELETE FROM "
                + "usuario "
                + "WHERE "
                + "id ='" + id + "';";

        con.ejecutar(delete);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
