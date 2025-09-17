package com.crui.patterns.behavioral.strategy.strategies;

import com.crui.patterns.behavioral.strategy.entities.Pokemon;

public interface AtaqueStrategy {
    void ejecutarAtaque(Pokemon atacante, Pokemon objetivo);
}
