package com.ccathala.matchamateplayerapi.dao;

import java.util.Optional;

import com.ccathala.matchamateplayerapi.models.Player;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "players", path = "players")
public interface PlayerDao extends MongoRepository<Player, String>{  
    Optional<Player> findByEmail(@Param("email") String email);
    Player deleteByEmail(@Param("email") String email);
}