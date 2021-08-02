package dogTest;

public class dog {
	private String bark="";
	private String prance= "";
	
	public dog(String bark) {
		this.bark= bark;
		prance= "happy feet";
		
	}
	public String getBark() {
		return this.bark;
	}
	public String getPrance() {
		return this.prance;
	}
	public void setBark(String bork) {
		this.bark = bork; 
	}
	public void setPrance(String limp) {
		this.prance = limp;
	}
}
