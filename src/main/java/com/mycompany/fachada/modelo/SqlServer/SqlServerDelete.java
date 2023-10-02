package modelo.SqlServer;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerDelete {
    
    public String Delete(Persona persona) {
        if (persona instanceof Estudiante) {
            System.out.println("SqlServer DELETE FROM Estudiante WHERE condición;");
        } else if(persona instanceof Profesor){
            System.out.println("SqlServer DELETE FROM Profesor WHERE condición;");
        }else if(persona instanceof Decano){
            System.out.println("SqlServer DELETE FROM Decano WHERE condición;");
        }
        return "0";
    }
}
