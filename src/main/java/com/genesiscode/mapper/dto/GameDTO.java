package com.genesiscode.mapper.dto;

public class GameDTO {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    // destination must have setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("GameDTO { id=%s, name='%s' }", id, name);
    }
}
