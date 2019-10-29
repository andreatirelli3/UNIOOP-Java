package Serializzazione;

public class MainTester {

	public static void main(String[] args) {
		Serializza s = new Serializza();
		s.serializza(args[0]);
		s.deserializza(args[0]);
	}

}
