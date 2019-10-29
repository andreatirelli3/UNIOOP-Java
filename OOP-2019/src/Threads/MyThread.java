package Threads;

import java.util.Random;

public class MyThread extends Thread{
	private int id;
	private MainTester mt; // Riferimento alla classe main che ha fatto eseguire in thread
	private Random rnd;
	
	public MyThread(int id, MainTester mt) {
		this.id = id;
		this.mt = mt;
		rnd = new Random(id);
	}
	
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
