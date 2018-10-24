package model;

public class Libro {
    private int id;
    private String nombre;
    private String editorial;
    private int anio_lan ;
    private int precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio_lan() {
        return anio_lan;
    }

    public void setAnio_lan(int anio_lan) {
        this.anio_lan = anio_lan;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    private int stock;
}
