package com.mycompany.fachada.modelo.Oracle;

import modelo.crud;
import modelo.Variables.Persona;

public class OracleFachada implements crud {
    private OracleCreate createStrategy;
    private OracleRead readStrategy;
    private OracleUpdate updateStrategy;
    private OracleDelete deleteStrategy;

    public OracleFachada() {
        this.createStrategy = new OracleCreate();
        this.readStrategy = new OracleRead();
        this.updateStrategy = new OracleUpdate();
        this.deleteStrategy = new OracleDelete();
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
