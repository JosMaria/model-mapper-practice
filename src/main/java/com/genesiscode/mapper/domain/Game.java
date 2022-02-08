package com.genesiscode.mapper.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Long id;
    private String name;
    private Long timestamp;
    private Player creator;
    private final List<Player> players = new ArrayList<>();

    public Game() {

    }
    public Game(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public void setCreator(Player creator) {
        this.creator = creator;
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
    public Player getCreator() {
        return creator;
    }
    public List<Player> getPlayers() {
        return players;
    }
}
