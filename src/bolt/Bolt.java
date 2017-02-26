package bolt;

import java.util.Hashtable;

public class Bolt {
	
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, BoltBejegyzes> elelmiszerpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, BoltBejegyzes> elelmiszerpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
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
	
	public boolean vanMegAdottAru(Class c) {
		for(BoltBejegyzes note : elelmiszerpult.values()) {
			if(note.getElelmiszer().getClass().equals(c)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean vanMegTej() {
		if(vanMegAdottAru(Tej.class)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean vanMegSajt() {
		if(vanMegAdottAru(Sajt.class)) {
			return true;
		} else {
			return false;
		}
	}
		
	public void feltoltElelmiszerrel(long vonalKod, long mennyiseg) {
		for(long code : elelmiszerpult.keySet()) {
			if(vonalKod == code) {
				elelmiszerpult.get(code).adMennyiseg(mennyiseg);
			}
		}
	}
	
	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		BoltBejegyzes ujElelmiszer = new BoltBejegyzes(e, mennyiseg, ar);
		elelmiszerpult.put(e.getVonalKod(), ujElelmiszer);
	}
	
	public void torolElelmiszert(Long vonalKod) {
		elelmiszerpult.remove(vonalKod);
	}
	
	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) {
		for(Long code : elelmiszerpult.keySet()) {
			if(vonalKod == code) {
				elelmiszerpult.get(code).levonMennyiseg(mennyiseg);
			}
		}
	}
	
	class BoltBejegyzes{
		
		private Elelmiszer e;
		private long mennyiseg;
		private long ar;
		
		public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar) {
			this.e = e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}
		
		public Elelmiszer getElelmiszer() {
			return e;
		}
		
		public void setElelmiszer(Elelmiszer e) {
			this.e = e;
		}
		
		public long getMennyiseg() {
			return mennyiseg;
		}
		
		public void setMennyiseg(long mennyiseg) {
			this.mennyiseg = mennyiseg;
		}
		
		public void adMennyiseg(long mennyiseg) {
			this.mennyiseg += mennyiseg;
		}
		
		public void levonMennyiseg(long mennyiseg) {
			this.mennyiseg -= mennyiseg;
		}
		
		public long getAr() {
			return ar;
		}
		
		public void setAr(long ar) {
			this.ar = ar;
		}
	}
}