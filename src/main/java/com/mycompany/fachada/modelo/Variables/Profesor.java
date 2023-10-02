package modelo.Variables;

public class Profesor extends Persona {
    
    private String Escuela;

    public Profesor(String nombre, String apellido, int edad, int id, String escuela) {
        super(nombre, apellido, edad, id);
        Escuela = escuela;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String escuela) {
        Escuela = escuela;
    }

}
