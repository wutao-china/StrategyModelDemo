package com.wutao.stratery.test;

import com.wutao.strategy.BusStrateryImpl;
import com.wutao.strategy.PersonContext;
import com.wutao.strategy.Strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy strategy = new BusStrateryImpl();
		
		PersonContext context = new PersonContext(strategy);
		
		context.train();
	}

}
