package com.crui.patterns.behavioral.strategy;

import com.crui.patterns.behavioral.strategy.entities.Pokemon;
import com.crui.patterns.behavioral.strategy.strategies.AtaqueAgua;
import com.crui.patterns.behavioral.strategy.strategies.AtaqueFuego;

public class Main {
    public static void main(String[] args) {

        
        AtaqueFuego ataqueFuego = new AtaqueFuego();
        AtaqueAgua ataqueAgua = new AtaqueAgua();

        
        Pokemon charmander = new Pokemon("Charmander", ataqueFuego);
        Pokemon squirtle = new Pokemon("Squirtle", ataqueAgua);

        System.out.println("¡Comienza la batalla!");
        
        
        System.out.println("\n--- Primer asalto ---");
        charmander.atacar(squirtle);
        squirtle.atacar(charmander); 

        
        System.out.println("\n--- ¡Charmander aprende un nuevo movimiento! ---");
        
        charmander.setAtaque(ataqueAgua); 

        System.out.println("\n--- Segundo asalto ---");
        charmander.atacar(squirtle);
        squirtle.atacar(charmander); 
    }
}
