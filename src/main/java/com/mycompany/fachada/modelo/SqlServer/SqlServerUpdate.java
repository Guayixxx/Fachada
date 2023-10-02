package modelo.SqlServer;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerUpdate {
    
    public String Update(Persona persona){
        if (persona instanceof Estudiante) {
            System.out.println("SqlServer UPDATE Estudiante SET columna1 = 'nuevo_valor1', columna2 = 'nuevo_valor2' WHERE condición;");
        } else if (persona instanceof Profesor){
            System.out.println("SqlServer UPDATE Profesor SET columna1 = 'nuevo_valor1', columna2 = 'nuevo_valor2' WHERE condición;");
        }else if (persona instanceof Decano){
            System.out.println("SqlServer UPDATE Decano SET columna1 = 'nuevo_valor1', columna2 = 'nuevo_valor2' WHERE condición;");
        }
        return "0";
    }
}
