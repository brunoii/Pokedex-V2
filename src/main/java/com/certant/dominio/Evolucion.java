package com.certant.dominio;

import java.util.ArrayList;

public class Evolucion {
	private int id;
    private String _nombre;
    private int _nivelEvolucion;
    private ArrayList<Tipo> _tipos;
    private ArrayList<Habilidad> _habilidades;
    
    
    public Evolucion(){
        
    }
    
    public Evolucion(String nombre, int nivelEvolucion, ArrayList<Tipo> tipos, ArrayList<Habilidad> habilidades){
        this._nombre = nombre;
        this._nivelEvolucion = nivelEvolucion;
        this._tipos = tipos;
        this._habilidades = habilidades;
        
    }    
}
