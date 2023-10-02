package modelo.Variables;

public class Estudiante extends Persona{

    private String carrera;

    public Estudiante(String nombre, String apellido, int edad, int id, String carrera) {
        super(nombre, apellido, edad, id);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
