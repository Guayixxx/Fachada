package com.mycompany.fachada.controlador;

import com.mycompany.fachada.vista.Vista;
import java.util.HashSet;


public class App {
    public static void main(String[] args) throws Exception {
        
        Vista vista = new Vista();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
}
