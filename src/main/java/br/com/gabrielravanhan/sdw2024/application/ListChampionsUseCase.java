package br.com.gabrielravanhan.sdw2024.application;

import br.com.gabrielravanhan.sdw2024.domain.model.Champion;
import br.com.gabrielravanhan.sdw2024.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository championsRepository) {

    public List<Champion> findAll() {
        return championsRepository.findAll();
    }
}
