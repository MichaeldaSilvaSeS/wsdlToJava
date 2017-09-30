package br;

import br.com.service.GlobalWeather;

public class Principal {
	
	public static void main(String[] args) {
		GlobalWeather gw = new GlobalWeather();
		String a = gw.getGlobalWeatherSoap().getCitiesByCountry("Brazil");
		System.out.println(a);
	}

}
