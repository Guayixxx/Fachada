package com.mycompany.fachada.controlador;


public class App {
    public static void main(String[] args) throws Exception {
        Launcher fachada = new Launcher();
        fachada.Oracle("estudiante");
        fachada.SqlServer("profesor");
    }
}
