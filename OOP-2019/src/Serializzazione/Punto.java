package Serializzazione;

import java.io.*;

public class Punto implements Serializable{
	/**
	 * Coordinata x del punto
	 */
	private int x;
	/**
	 * Coordinata y del punto
	 */
	private int y;
	
	/*
	 * Costruttore del punto
	 * @param x Coordinata x
	 * @param y Coordinata y
	 */
	public Punto(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Scrittura delle coordinate del punto
	 * @return Scrittura delle coordinate del punto
	 */
	public String toString(){
		return("Il punto ha coordinate " + x + ", " + y);
	}
	
}
