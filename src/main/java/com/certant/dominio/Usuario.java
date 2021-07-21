package com.certant.dominio;

import java.util.ArrayList;

public class Usuario {
    private String _nombre;
    private String _clave;
    private ArrayList<Pokemon> pokemones;
    
    public Usuario(){
        
    }
    
    public Usuario(String nombre, String clave){
        this._nombre = nombre;
        this._clave = clave;    
        this.pokemones = new ArrayList<>();
    }
}
