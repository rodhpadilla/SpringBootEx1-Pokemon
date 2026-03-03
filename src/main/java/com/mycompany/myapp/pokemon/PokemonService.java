package com.mycompany.myapp.pokemon;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    private List<Pokemon> pokemons = new ArrayList<>();
    private Long nextId = 1L;

    public PokemonService() {
        pokemons.add(new Pokemon(nextId++, "Pikachu", "Electric", 25));
        pokemons.add(new Pokemon(nextId++, "Charizard", "Fire", 36));
        pokemons.add(new Pokemon(nextId++, "Bulbasaur", "Grass", 12));
    }

    public List<Pokemon> findAll() {
        return pokemons;
    }

    public Pokemon findById(Long id) {
        return pokemons.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Pokemon save(Pokemon pokemon){
        pokemon.setId(nextId++);
        pokemons.add(pokemon);
        return pokemon;
    }

    public void deleteById(Long id){
        pokemons.removeIf(p -> p.getId().equals(id));
    }
}
