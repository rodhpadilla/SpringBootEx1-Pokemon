package com.mycompany.myapp.pokemon;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return service.save(pokemon);
    }

    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable Long id) {
        service.deleteById(id);
    }
}
