package com.mycompany.fachada.modelo.SqlServer;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class SqlServerCreate {
    
    public String Create(Persona persona){
        Map<Class<? extends Persona>, String> createStatements = new HashMap<>();
        
        createStatements.put(Estudiante.class, "SqlServer INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Carrera) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        createStatements.put(Profesor.class, "SqlServer INSERT INTO Profesor (Nombre, Apellido ,Edad, ID, Escuela) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        createStatements.put(Decano.class, "SqlServer INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Facultad) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
    
        String sqlStatement = createStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        } 

        return "0";
    }
}
