package com.crui.patterns.behavioral.strategy.strategies;

import com.crui.patterns.behavioral.strategy.entities.Pokemon;

public class AtaqueFuego implements AtaqueStrategy {
    @Override
    public void ejecutarAtaque(Pokemon atacante, Pokemon objetivo) {
        
        System.out.println(atacante.getNombre() + " lanza un ataque de fuego a " + objetivo.getNombre());
        
    }
}
