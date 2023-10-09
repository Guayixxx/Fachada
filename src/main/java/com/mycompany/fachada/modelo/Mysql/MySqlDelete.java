package com.mycompany.fachada.modelo.Mysql;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlDelete {
    
    public String Delete(Persona persona) {
        Map<Class<? extends Persona>, String> deleteStatements = new HashMap<>();

        deleteStatements.put(Estudiante.class, "MySql DELETE FROM Estudiante WHERE condición;");
        deleteStatements.put(Profesor.class, "MySql DELETE FROM Profesor WHERE condición;");
        deleteStatements.put(Decano.class, "MySql DELETE FROM Decano WHERE condición;");

        String sqlStatement = deleteStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        }

        return "0";
    }
}

