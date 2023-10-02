package modelo.SqlServer;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerRead {

    public String Read(Persona persona){
        if (persona instanceof Estudiante) {
            System.out.println("SqlServer SELECT columna1, columna2 FROM Estudiante WHERE condición;");
        } else if (persona instanceof Profesor){
            System.out.println("SqlServer SELECT columna1, columna2 FROM Profesor WHERE condición;");
        } else if (persona instanceof Decano){
            System.out.println("SqlServer SELECT columna1, columna2 FROM Decano WHERE condición;");
        }
        return "0";
    }
}
