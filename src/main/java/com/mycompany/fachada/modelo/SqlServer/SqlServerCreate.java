package modelo.SqlServer;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerCreate {
    public String Create(){
        return "metodo create de SqlServer: INSERT INTO nombre_tabla (columna1, columna2, columna3) VALUES ('valor1', 'valor2', 'valor3');";
    }

    public String Create(Persona persona){
        if (persona instanceof Estudiante) {
            System.out.println("SqlServer INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Carrera) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        } else if (persona instanceof Profesor){
            System.out.println("SqlServer INSERT INTO Profesor (Nombre, Apellido ,Edad, ID, Escuela) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        } else if (persona instanceof Decano){
            System.out.println("SqlServer INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Facultad) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        }
        return "0";
    }
}
