package model;

public class Usuario {

    private int id;

    private String nombre;
    private String run;
    private int edad;



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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

        public Usuario(String nombre, String run, int edad) {
        this.nombre = nombre;
        this.run = run;
        this.edad = edad;
    }

    public Usuario() {
    }
    
}
