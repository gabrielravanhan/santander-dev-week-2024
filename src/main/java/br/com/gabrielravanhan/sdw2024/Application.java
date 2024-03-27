package br.com.gabrielravanhan.sdw2024;

import br.com.gabrielravanhan.sdw2024.application.ListChampionsUseCase;
import br.com.gabrielravanhan.sdw2024.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Bean
    public ListChampionsUseCase provideListUseCase(ChampionsRepository championsRepository) {
        return new ListChampionsUseCase(championsRepository);
    }
}
