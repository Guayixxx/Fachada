package com.mycompany.fachada.modelo.Oracle;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class OracleDelete {
    
    public String Delete(Persona persona) {
         Map<Class<? extends Persona>, String> deleteStatements = new HashMap<>();
        
        deleteStatements.put(Estudiante.class, "Oracle DELETE FROM Estudiante WHERE condición;");
        deleteStatements.put(Profesor.class, "Oracle DELETE FROM Profesor WHERE condición;");
        deleteStatements.put(Decano.class, "Oracle DELETE FROM Decano WHERE condición;");

        String sqlStatement = deleteStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        }

        return "0";
    }
}
