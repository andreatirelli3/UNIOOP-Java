package OminoFrame;

public class ThreadAnimation extends Thread{
	private Omino o;
	
	public ThreadAnimation(Omino o) {
		this.o = o;
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(o) {
				
			}
		}
	}
}
