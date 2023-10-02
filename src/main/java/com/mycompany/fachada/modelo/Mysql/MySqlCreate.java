package com.mycompany.fachada.modelo.Mysql;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlCreate {
    
    public String CreateQuery;

    public String getCreateQuery() {
        return CreateQuery;
    }

    public void setCreateQuery(String CreateQuery) {
        this.CreateQuery = CreateQuery;
    }
    
    public String Create(Persona persona) {
        
        if (persona instanceof Estudiante) {
            setCreateQuery("MySql INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Carrera) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        } else if (persona instanceof Profesor) {
            setCreateQuery("MySql INSERT INTO Profesor (Nombre, Apellido ,Edad, ID, Escuela) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        } else if(persona instanceof Decano){
            setCreateQuery("MySql INSERT INTO Estudiante (Nombre, Apellido ,Edad, ID, Facultad) VALUES ('valor1', 'valor2', 'valor3', 'valor4', 'valor5');");
        }
        return "0";
    }
}