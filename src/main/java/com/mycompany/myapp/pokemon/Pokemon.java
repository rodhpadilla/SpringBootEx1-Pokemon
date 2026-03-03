package com.mycompany.myapp.pokemon;

// Model
public class Pokemon {
    private Long id;
    private String name;
    private String type;
    private int level;

    public Pokemon(){
    }

    public Pokemon(Long id, String name, String type, int level) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

}
