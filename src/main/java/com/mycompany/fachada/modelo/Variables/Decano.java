package modelo.Variables;

public class Decano extends Persona{

    private String Facultad;

    public Decano(String nombre, String apellido, int edad, int id, String facultad) {
        super(nombre, apellido, edad, id);
        Facultad = facultad;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String facultad) {
        Facultad = facultad;
    }

}
