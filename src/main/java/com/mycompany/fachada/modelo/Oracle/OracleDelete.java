package modelo.Oracle;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class OracleDelete {
    public String Delete(){
        return "metodo delete de Oracle DELETE FROM nombre_tabla WHERE condición;";
    }
    public String Delete(Persona persona) {
        if (persona instanceof Estudiante) {
            System.out.println("Oracle DELETE FROM Estudiante WHERE condición;");
        } else if(persona instanceof Profesor){
            System.out.println("Oracle DELETE FROM Profesor WHERE condición;");
        }else if(persona instanceof Decano){
            System.out.println("Oracle DELETE FROM Decano WHERE condición;");
        }
        return "0";
    }
}
