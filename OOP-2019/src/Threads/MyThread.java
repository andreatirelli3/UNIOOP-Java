package Threads;

import java.util.Random;

/**
 * Classe Thread per definire un Thread della classe MainTester
 * 
 * @author Andrea Tirelli
 *
 */
public class MyThread extends Thread{
	/**
	 * Attributo che contiene l'id numerico del Thread
	 */
	private int id;
	
	/**
	 * Attributo che contine un riferimento alla classe MainTester
	 */
	private MainTester mt; // Bisogna avere un riferimento alla classe che contiene il metodo synchronized
	
	/**
	 * Attributo che definisce il Random per gli int
	 */
	private Random rnd;
	
	/**
	 * Costruttore con parametri del Thread
	 * @param id
	 * @param mt
	 */
	public MyThread(int id, MainTester mt) {
		this.id = id;
		this.mt = mt;
		rnd = new Random(id);
	}
	
	/**
	 * Metodo run che deriva dalla classe Thread; esso sarà il metodo eseguito dal thread al suo avvio
	 */
	@Override
	public void run() {
		int ran = 100 + rnd.nextInt(51);
		
		System.out.println("Thread con id " + id + " dorme per " + ran + " ms");
		
		try {
			sleep(ran);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mt.incCounter();
		
		synchronized(mt){
			if(mt.maxSleep<ran)
				mt.maxSleep = ran;
		}
	}
}
