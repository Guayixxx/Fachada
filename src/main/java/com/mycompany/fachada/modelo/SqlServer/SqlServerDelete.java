package com.mycompany.fachada.modelo.SqlServer;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerDelete {
    
    public String Delete(Persona persona) {
        Map<Class<? extends Persona>, String> deleteStatements = new HashMap<>();
        
        deleteStatements.put(Estudiante.class, "SqlServer DELETE FROM Estudiante WHERE condición;");
        deleteStatements.put(Profesor.class, "SqlServer DELETE FROM Profesor WHERE condición;");
        deleteStatements.put(Decano.class, "SqlServer DELETE FROM Decano WHERE condición;");

        String sqlStatement = deleteStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        }

        return "0";
    }
}
