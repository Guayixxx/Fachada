package com.mycompany.fachada.modelo.Mysql;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlUpdate {
    
    public String Update(Persona persona) {
        Map<Class<? extends Persona>, String> updateStatements = new HashMap<>();
        
        updateStatements.put(Estudiante.class, "MySql UPDATE Estudiante SET columna1 = 'nuevo_valor1', columna2 = 'nuevo_valor2' WHERE condición;");
        updateStatements.put(Profesor.class, "MySql UPDATE Profesor SET columna1 = 'nuevo_valor1', columna2 = 'nuevo_valor2' WHERE condición;");
        updateStatements.put(Decano.class, "MySql UPDATE Decano SET columna1 = 'nuevo_valor1', columna2 = 'nuevo_valor2' WHERE condición;");

        String sqlStatement = updateStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        } 
        
        return "0";
    }
}
