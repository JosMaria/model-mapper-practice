package com.genesiscode.mapper.domain;

public class Game {

    private final Long id;
    private final String name;
    private Long timestamp;

    public Game(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    // source must have getters
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Long getTimestamp() {
        return timestamp;
    }
}
