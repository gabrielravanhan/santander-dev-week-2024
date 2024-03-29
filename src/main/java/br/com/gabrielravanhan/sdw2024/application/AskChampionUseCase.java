package br.com.gabrielravanhan.sdw2024.application;

import br.com.gabrielravanhan.sdw2024.domain.exception.ChampionNotFoundException;
import br.com.gabrielravanhan.sdw2024.domain.model.Champion;
import br.com.gabrielravanhan.sdw2024.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository championsRepository) {

    public String askChampion(Long championId, String question) {
        Champion champion = championsRepository.findOne(championId).orElseThrow(() -> new ChampionNotFoundException(championId));
        return champion.generateContextByQuestion(question);
    }
}
