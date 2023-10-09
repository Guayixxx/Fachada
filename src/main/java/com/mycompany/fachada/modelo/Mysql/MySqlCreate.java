package com.mycompany.fachada.modelo.Mysql;

import java.util.HashMap;
import java.util.Map;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlCreate {
    
    public String Create(Persona persona) {
        Map<Class<? extends Persona>, String> sqlStatements = new HashMap<>();

        sqlStatements.put(Estudiante.class, "MySql INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Carrera) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        sqlStatements.put(Profesor.class, "MySql INSERT INTO Profesor (Nombre, Apellido ,Edad, ID, Escuela) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        sqlStatements.put(Decano.class, "MySql INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Facultad) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");

        String sqlStatement = sqlStatements.get(persona.getClass());

        if (sqlStatement != null) {
            System.out.println(sqlStatement);
        }

        return "0";
    }
}
