package com.mycompany.fachada.modelo.SqlServer;

import com.mycompany.fachada.modelo.crud;
import modelo.Variables.Persona;


public class SqlServerFachada implements crud {

    private SqlServerCreate createStrategy;
    private SqlServerRead readStrategy;
    private SqlServerUpdate updateStrategy;
    private SqlServerDelete deleteStrategy;

    public SqlServerFachada() {
        this.createStrategy = new SqlServerCreate();
        this.readStrategy = new SqlServerRead();
        this.updateStrategy = new SqlServerUpdate();
        this.deleteStrategy = new SqlServerDelete();
    }

    public void create(Persona persona) {
        createStrategy.Create(persona);
    }

    public void read(Persona persona) {
        readStrategy.Read(persona);
    }

    public void update(Persona persona) {
        updateStrategy.Update(persona);
    }

    public void delete(Persona persona) {
        deleteStrategy.Delete(persona);
    }
}
