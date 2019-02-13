package com.example.week3;

import java.util.ArrayList;
import java.util.List;

public class Pokemons_Mock {

    private List<Pokemon> pokemons;

    public Pokemons_Mock()
    {
        pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(R.drawable.bulbasaur, "Bulbasaur"));
        pokemons.add(new Pokemon(R.drawable.dragonite, "Dragonite"));
        pokemons.add(new Pokemon(R.drawable.pikachu, "Pikachu"));
    }

    public List<Pokemon> getPokemons()
    {
        return pokemons;
    }

    public String[] getNames()
    {
        String[] names = new String[3];
        int i = 0;

        for (Pokemon p: pokemons) {

            names[i] = p.getName();
            i++;
        }

        return names;
    }
}
