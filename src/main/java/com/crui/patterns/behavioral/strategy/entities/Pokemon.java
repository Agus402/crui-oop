package com.crui.patterns.behavioral.strategy.entities;

import com.crui.patterns.behavioral.strategy.strategies.AtaqueStrategy;

public class Pokemon {
    private String nombre;
    private AtaqueStrategy ataque;

    public Pokemon(String nombre, AtaqueStrategy ataqueInicial) {
        this.nombre = nombre;
        this.ataque = ataqueInicial;
    }

    
    public void setAtaque(AtaqueStrategy nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    public void atacar(Pokemon objetivo) {
        this.ataque.ejecutarAtaque(this, objetivo);
    }

    public String getNombre() {
        return nombre;
    }
}