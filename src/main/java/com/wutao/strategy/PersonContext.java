package com.wutao.strategy;

public class PersonContext {
	private Strategy strategy;
	
	public PersonContext(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void train(){
		strategy.trainStyle();
	}
}
