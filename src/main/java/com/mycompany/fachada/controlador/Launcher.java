package com.mycompany.fachada.controlador;

import com.mycompany.fachada.modelo.Mysql.MySqlFachada;
import com.mycompany.fachada.modelo.Oracle.OracleFachada;
import java.util.HashMap;
import java.util.Map;
import com.mycompany.fachada.modelo.SqlServer.SqlServerFachada;
import modelo.Variables.*;

public class Launcher {

    Persona persona = null;

    public void Persona(String tipoPersona) {
        Map<String, Class<? extends Persona>> personaTypes = new HashMap<>();

        personaTypes.put("estudiante", Estudiante.class);
        personaTypes.put("profesor", Profesor.class);
        personaTypes.put("decano", Decano.class);

        Class<? extends Persona> personaClass = personaTypes.get(tipoPersona.toLowerCase());

        if (personaClass != null) {
            try {
                persona = personaClass.getDeclaredConstructor(String.class, String.class, int.class, int.class, String.class)
                        .newInstance("Nombre" + tipoPersona, "Apellido" + tipoPersona, 30, 123, "Atributo" + tipoPersona);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Tipo de persona no válido: " + tipoPersona);
        }
    }

    public void Mysql(String tipoPersona) {
        Persona(tipoPersona);

        MySqlFachada mySqlCrud = new MySqlFachada();
        mySqlCrud.create(persona);
        mySqlCrud.read(persona);
        mySqlCrud.update(persona);
        mySqlCrud.delete(persona);

    }

    public void Oracle(String tipoPersona) {
        Persona(tipoPersona); // modificar en vista puede ser
        OracleFachada oracleCrud = new OracleFachada();
        oracleCrud.create(persona);
        oracleCrud.read(persona);
        oracleCrud.update(persona);
        oracleCrud.delete(persona);
    }

    public void SqlServer(String tipoPersona) {
        Persona(tipoPersona); // modificar en vista puede ser
        SqlServerFachada SqlServerCrud = new SqlServerFachada();
        SqlServerCrud.create(persona);
        SqlServerCrud.read(persona);
        SqlServerCrud.update(persona);
        SqlServerCrud.delete(persona);
    }

}
