package Threads;

public class MainTester {
	public int maxSleep;
	private int sleepCounter;
	
	void setCounter(int s) { sleepCounter = s; }
	int getCounter() { return sleepCounter; }
	
	public MainTester(int n) {
		Thread t[] = new Thread[n];
		
		for(int i = 0; i < t.length; i++)
			t[i] = new MyThread(1+i, this);
		
		for(Thread i:t)
			i.start();
		
		for(Thread i:t) {
			try {
				i.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Quanti hanno dormito = " + sleepCounter);
		
		if(sleepCounter == n)
			System.out.println("Sembra sia andato tutto bene");
		else System.out.println("Qualcosa non va bene");
		
		System.out.println("Durata massima di Thread.sleep = " + maxSleep);
	}
	
	public synchronized void incCounter(){
		sleepCounter++;
	}
	
	public static void main(String[] args) {
		new MainTester(250);
	}

}
