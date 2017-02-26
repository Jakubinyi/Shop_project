package bolt;

import java.util.Hashtable;
import java.util.Map;

public class Bolt {
	
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Tej, Long> tejpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Tej, Long> tejpult) {
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
		if(tejpult.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public Tej vasarolTej(Long vonalKod) {
		Tej milk = null;
		
		for(Map.Entry<Tej, Long> entry : tejpult.entrySet()){
			if(vonalKod.equals(entry.getValue())){
				milk = (Tej)entry.getKey();
				tejpult.remove(entry.getKey());
				break;
			}
		}
		return milk;
	}
	
	public void feltoltTej(Tej m) {
		tejpult.put(m, m.getVonalKod());
	}
}