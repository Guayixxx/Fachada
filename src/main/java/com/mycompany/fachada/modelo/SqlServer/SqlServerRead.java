package com.mycompany.fachada.modelo.SqlServer;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerRead {

    public String Read(Persona persona){
        Map<Class<? extends Persona>, String> selectStatements = new HashMap<>();

        selectStatements.put(Estudiante.class, "SqlServer SELECT columna1, columna2 FROM Estudiante WHERE condición;");
        selectStatements.put(Profesor.class, "SqlServer SELECT columna1, columna2 FROM Profesor WHERE condición;");
        selectStatements.put(Decano.class, "SqlServer SELECT columna1, columna2 FROM Decano WHERE condición;");
    
        String sqlStatement = selectStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        } 
        
        return "0";
    }
}
