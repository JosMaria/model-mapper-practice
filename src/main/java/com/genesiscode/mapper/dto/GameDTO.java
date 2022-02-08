package com.genesiscode.mapper.dto;

public class GameDTO {

    private Long id;
    private String name;
    private Long creationTime;
    private String creator;
    private int totalPlayers;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Long getCreationTime() {
        return creationTime;
    }
    public String getCreator() {
        return creator;
    }
    public int getTotalPlayers() {
        return totalPlayers;
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
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    @Override
    public String toString() {
        return String.format("GameDTO { id=%s, name='%s', creationTime=%s creator=%s }",
                id, name, creationTime, creator);
    }
}
