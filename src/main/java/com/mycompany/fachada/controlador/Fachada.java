package com.mycompany.fachada.controlador;

import com.mycompany.fachada.modelo.Mysql.MySqlCrud;
import modelo.Oracle.OracleCrud;
import modelo.SqlServer.SqlServerCrud;
import modelo.Variables.Decano;
import modelo.Variables.Estudiante;
import modelo.Variables.Persona;
import modelo.Variables.Profesor;

public class Fachada {

    Persona persona = null;

    public void Persona(String tipoPersona) {
        if ("estudiante".equalsIgnoreCase(tipoPersona)) {
            persona = new Estudiante("NombreEstudiante", "ApellidoEstudiante", 20, 123, "CarreraEstudiante");
        } else if ("profesor".equalsIgnoreCase(tipoPersona)) {
            persona = new Profesor("NombreProfesor", "ApellidoProfesor", 35, 456, "EscuelaProfesor");
        } else if ("decano".equalsIgnoreCase(tipoPersona)) {
            persona = new Decano("NombreDecano", "ApellidoDecano", 45, 789, "FacultadDecano");
        } else {
            System.out.println("Tipo de persona no válido: " + tipoPersona);
        }
    }

    public void Mysql(String tipoPersona) {
        Persona(tipoPersona);
        
        MySqlCrud mySqlCrud = new MySqlCrud();
        mySqlCrud.create(persona);
//        mySqlCrud.read(persona);
//        mySqlCrud.update(persona);
//        mySqlCrud.delete(persona);
        
    }

    public void Oracle(String tipoPersona) {
        Persona(tipoPersona); // modificar en vista puede ser
        OracleCrud oracleCrud = new OracleCrud();
        oracleCrud.create(persona);
        oracleCrud.read(persona);
        oracleCrud.update(persona);
        oracleCrud.delete(persona);
    }

    public void SqlServer(String tipoPersona) {
        Persona(tipoPersona); // modificar en vista puede ser
        SqlServerCrud SqlServerCrud = new SqlServerCrud();
        SqlServerCrud.create(persona);
        SqlServerCrud.read(persona);
        SqlServerCrud.update(persona);
        SqlServerCrud.delete(persona);
    }

}
