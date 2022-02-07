package com.genesiscode.mapper.domain;

public class Game {

    private final Long id;
    private final String name;

    public Game(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // source must have getters
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
