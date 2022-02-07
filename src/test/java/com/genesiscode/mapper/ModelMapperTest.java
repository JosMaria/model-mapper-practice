package com.genesiscode.mapper;

import com.genesiscode.mapper.domain.Game;
import com.genesiscode.mapper.dto.GameDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelMapperTest {

    ModelMapper mapper;

    @BeforeEach
    public void setup() {
        mapper = new ModelMapper();
    }

    @Test
    public void whenMapGameWithExactMatch_thenConvertsToDTO() {
        // when similar source object is provided
        Game game = new Game(1L, "Game 1");
        GameDTO gameDTO = mapper.map(game, GameDTO.class);

        assertAll(
                () -> assertEquals(game.getId(), gameDTO.getId()),
                () -> assertEquals(game.getName(), gameDTO.getName())
        );
    }

    @Test
    public void whenMapGameWithBasicPropertyMapping_thenConvertsToDTO() {
        // setup
        TypeMap<Game, GameDTO> propertyMapper = mapper.createTypeMap(Game.class, GameDTO.class);
        propertyMapper.addMapping(Game::getTimestamp, GameDTO::setCreationTime);

        // when field names are different
        Game game = new Game(1L, "Game 1");
        game.setTimestamp(Instant.now().getEpochSecond());
        GameDTO gameDTO = mapper.map(game, GameDTO.class);

        // then it maps via property mapper
        assertAll(
                () -> assertEquals(game.getId(), gameDTO.getId()),
                () -> assertEquals(game.getName(), gameDTO.getName()),
                () -> assertEquals(game.getTimestamp(), gameDTO.getCreationTime())
        );
    }
}
