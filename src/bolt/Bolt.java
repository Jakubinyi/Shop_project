package bolt;

public class Bolt {
	
	private String nev;
	private String cim;
	private String tulajdonos;
	private Tej[] tejpult;
	private int flag;
	
	public Bolt(String nev, String cim, String tulajdonos, Tej[] tejpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}
	
	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}
	
	public String getNev() {
		return nev;
	}
	
	public String getCim() {
		return cim;
	}
	
	public String getTulajdonos() {
		return tulajdonos;
	}
	
	public boolean vanMegTej() {
		if(tejpult.length > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public Tej vasarolTej(Tej m) {
		Tej[] newTejpult = new Tej[tejpult.length -1];
        int counter = 0;
        for(int i = 0; i < tejpult.length; i++) {
            if(tejpult[i] != m) {
                newTejpult[counter] = tejpult[i];
                counter += 1;
            }
        }
        tejpult = newTejpult;
        return m;
	}
	
	public void feltoltTej(Tej m) {
		Tej[] newTejpult = new Tej[tejpult.length+1];
		for(int i = 0; i < tejpult.length; i++) {
			newTejpult[i] = tejpult[i];
		}
		newTejpult[tejpult.length] = m;
		tejpult = newTejpult;
	}
}