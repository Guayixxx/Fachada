package com.mycompany.fachada.modelo.Mysql;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlRead {

    public String Read(Persona persona){

        if (persona instanceof Estudiante) {
            System.out.println("MySql SELECT (Nombre, Apellido ,Edad, ID, Carrera) FROM Estudiante WHERE condición;"); 
        } else if (persona instanceof Profesor){
            System.out.println("MySql SELECT (Nombre, Apellido ,Edad, ID, Escuela) FROM Profesor WHERE condición;"); 
        } else if (persona instanceof Decano){
            System.out.println("MySql SELECT (Nombre, Apellido ,Edad, ID, Facultad) FROM Decano WHERE condición;"); 
        }
        return "0";
    }
}
