package com.genesiscode.mapper.dto;

public class GameDTO {

    private Long id;
    private String name;
    private Long creationTime;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Long getCreationTime() {
        return creationTime;
    }

    // destination must have setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return String.format("GameDTO { id=%s, name='%s', creationTime=%s }", id, name, creationTime);
    }
}
