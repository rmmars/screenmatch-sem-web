package br.com.alura.screenmatch.service;

public interface IConverteDados {
	
	// no momento da chamada do metodo sera preciso informar o tipo da classe a ser retornada
	// pois podemos retornar DadosSerie, DadosAtor, DadosDiretor ou qualquer outro tipo
	public <T> T obterDados(String json, Class<T> classe);

}
