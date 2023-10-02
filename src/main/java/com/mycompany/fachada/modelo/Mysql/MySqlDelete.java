package com.mycompany.fachada.modelo.Mysql;

import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class MySqlDelete {

    public String Delete(Persona persona){
        if (persona instanceof Estudiante) {
            System.out.println("MySql DELETE FROM Estudiante WHERE condición;");
        } else if(persona instanceof Profesor){
            System.out.println("MySql DELETE FROM Profesor WHERE condición;");
        } else if(persona instanceof Decano){
            System.out.println("MySql DELETE FROM Decano WHERE condición;");
        }
        return "0";
    }
}

