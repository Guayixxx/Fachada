package com.mycompany.fachada.modelo.Mysql;

import com.mycompany.fachada.modelo.crud;
import modelo.Variables.Persona;

public class MySqlFachada implements crud {

    private MySqlCreate createStrategy;
    private MySqlRead readStrategy;
    private MySqlUpdate updateStrategy;
    private MySqlDelete deleteStrategy;

    public MySqlFachada() {
        this.createStrategy = new MySqlCreate();
        this.readStrategy = new MySqlRead();
        this.updateStrategy = new MySqlUpdate();
        this.deleteStrategy = new MySqlDelete();
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
