package com.ritchie.formula;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private final String name;
    private final List<String> pokemons;

    public List<String> capturePokemon(String pokemon) {
        this.pokemons.add(pokemon);
        return this.pokemons;
    }

    public Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public void go() {
        System.out.printf("Right %s, now you are a Pokemon trainer!\n", this.name);
        System.out.printf("%s will come along with you! \n", this.pokemons.get(0));
        System.out.printf("Good luck, see u soon!");
    }
}
