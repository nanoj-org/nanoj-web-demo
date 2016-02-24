package org.demo.services.impl;

import javax.inject.Singleton;

import org.demo.services.CalculatorService;

@Singleton
public class CalculatorServiceImpl implements CalculatorService {

	public CalculatorServiceImpl() {
		super();
		System.out.println("CalculatorServiceImpl : constructor");
	}
	
	@Override
	public double add(double p1, double p2) {
		
		return p1 + p2;
	}

	@Override
	public double sub(double p1, double p2) {
		return p1 - p2;
	}

	@Override
	public double div(double p1, double p2) {
		return p1 / p2;
	}

	@Override
	public double mult(double p1, double p2) {
		return p1 * p2;
	}

}
