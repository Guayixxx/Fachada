package com.mycompany.fachada.modelo;

import modelo.Variables.Persona;

public interface crud {
    public void create(Persona persona);
    public void read(Persona persona);
    public void update(Persona persona);
    public void delete(Persona persona);
}
