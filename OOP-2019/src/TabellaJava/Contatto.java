package TabellaJava;


public class Contatto {
	private String name;
	private String surname;
	private String gps;
	private String phone;
	
	public Contatto(String name, String surname, String loc, String phone) {
		this.name = name;
		this.surname = surname;
		this.gps = loc;
		this.phone = phone;
	}
	
	public String getName() { return name; }
	public String getSurname() { return surname; }
	public String getLoc() { return gps; }
	public String getPhone() { return phone; }
	
	@Override
	public String toString() {
		return "\nNome: "+name+"\nCognome: "+surname+"\nAbitazione: "+gps+"Telefono: "+phone;
	}
}
