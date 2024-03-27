package br.com.gabrielravanhan.sdw2024.domain.ports;

import br.com.gabrielravanhan.sdw2024.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champion> findAll();

    Optional<Champion> findOne(Long id);
}
