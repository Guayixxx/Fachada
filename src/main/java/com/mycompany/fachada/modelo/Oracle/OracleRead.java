package modelo.Oracle;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class OracleRead {

    public String Read(Persona persona){
        if (persona instanceof Estudiante) {
            System.out.println("Oracle SELECT columna1, columna2 FROM Estudiante WHERE condición;");
        } else if (persona instanceof Profesor){
            System.out.println("Oracle SELECT columna1, columna2 FROM Profesor WHERE condición;");
        } else if (persona instanceof Decano){
            System.out.println("Oracle SELECT columna1, columna2 FROM Decano WHERE condición;");
        }
        return "0";
    }
}
