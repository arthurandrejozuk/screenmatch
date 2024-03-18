package br.com.arthur.screenmatchnew;

import br.com.arthur.screenmatchnew.models.DadosSerie;
import br.com.arthur.screenmatchnew.utils.ConsumoAPI;
import br.com.arthur.screenmatchnew.utils.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchnewApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchnewApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obtemDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=a9a94487");

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
