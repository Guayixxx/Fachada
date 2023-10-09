package com.mycompany.fachada.modelo.Mysql;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlRead {
    
    public String Read(Persona persona) {
        Map<Class<? extends Persona>, String> selectStatements = new HashMap<>();
        
        selectStatements.put(Estudiante.class, "MySql SELECT (Nombre, Apellido ,Edad, ID, Carrera) FROM Estudiante WHERE condición;");
        selectStatements.put(Profesor.class, "MySql SELECT (Nombre, Apellido ,Edad, ID, Escuela) FROM Profesor WHERE condición;");
        selectStatements.put(Decano.class, "MySql SELECT (Nombre, Apellido ,Edad, ID, Facultad) FROM Decano WHERE condición;");

        String sqlStatement = selectStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        } 

        return "0";
    }
}
