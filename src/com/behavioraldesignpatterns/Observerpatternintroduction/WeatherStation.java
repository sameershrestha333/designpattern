package com.behavioraldesignpatterns.Observerpatternintroduction;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	
	private int pressure;
	private int temperature;
	private int humidity;
	private List<Observer> observers;
	
	public  WeatherStation() {
		this.observers=new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {

		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observers.indexOf(observer));
	}

	@Override
	public void notifyAllObservers() {

			for(Observer o:this.observers){
				o.update(pressure, temperature, humidity);
			}
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObservers();
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}
	
	

}
