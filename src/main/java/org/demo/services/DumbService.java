package org.demo.services;

public class DumbService {

	public int chooseValue() {
		double v = Math.random() ;
		return (int)(1000 * v) ;
	}
}
