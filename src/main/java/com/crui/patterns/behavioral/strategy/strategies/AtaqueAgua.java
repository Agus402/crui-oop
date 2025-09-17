package com.crui.patterns.behavioral.strategy.strategies;

public class AtaqueAgua implements AtaqueStrategy {
    @Override
    public void ejecutarAtaque(Pokemon atacante, Pokemon objetivo) {
        
        System.out.println(atacante.getNombre() + " lanza un ataque de agua a " + objetivo.getNombre());
        
    }
}
