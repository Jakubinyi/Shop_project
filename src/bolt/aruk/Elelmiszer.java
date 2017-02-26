package bolt.aruk;

import java.util.Date;

import bolt.Aru;

public abstract class Elelmiszer extends Aru {
	
	protected Long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;
	
	public Elelmiszer(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}
	
	public Long getVonalKod() {
		return vonalKod;
	}
	
	public boolean joMeg() {
		Date currentDate = new Date();
		if(this.szavatossagiIdo.compareTo(currentDate) > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public String getGyarto() {
		return gyarto;
	}
	
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	@Override
	public String toString() {
		return "Elelmiszer [vonalKod=" + vonalKod + 
				", gyarto=" + gyarto + 
				", szavatossagiIdo=" + szavatossagiIdo + "]";
	}
	
	
}
