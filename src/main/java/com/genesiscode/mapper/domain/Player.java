package com.genesiscode.mapper.domain;

public class Player {

    private Long id;
    private String name;

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // source must have getters than you want mapping
    public String getName() {
        return name;
    }
}
