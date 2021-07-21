package com.certant.dominio;

import java.util.ArrayList;

public class Pokemon {
    private int id;
    private String _nombre;
    private ArrayList<Tipo> _tipos;
    private int _nivel = 1;
    private ArrayList<Habilidad> _habilidades;
    private ArrayList<Evolucion> _evoluciones;
    
    public Pokemon(){
        
    }
    
    public Pokemon(String nombre, ArrayList<Tipo> tipos, ArrayList<Habilidad> habilidades, ArrayList<Evolucion> evoluciones){
        this._nombre = nombre;
        this._tipos = tipos;
        this._habilidades = habilidades;
        this._evoluciones = evoluciones;
    }    	
}
