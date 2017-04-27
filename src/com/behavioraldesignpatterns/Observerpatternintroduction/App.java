package com.behavioraldesignpatterns.Observerpatternintroduction;

public class App {

	public static void main(String[] args) {

		WeatherStation ws=new WeatherStation();
		WeatherObserver wo=new WeatherObserver(ws);
		ws.setPressure(100);
		ws.setTemperature(200);
		ws.setHumidity(300);
	}

}
