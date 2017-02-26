package bolt;

import java.util.Date;

public class Sajt {
	
	protected double suly;
	protected double zsirtartalom;
	protected Long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;
	
	public Sajt(double suly, double zsirtartalom, Long vonalKod, String gyarto, Date szavatossagiIdo) {
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}
	
	public double getSuly() {
		return suly;
	}
	
	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString() {
		return "Sajt [suly=" + suly + 
				", zsirtartalom=" + zsirtartalom + 
				", vonalKod=" + vonalKod + 
				", gyarto=" + gyarto
				+ ", szavatossagiIdo=" + szavatossagiIdo + "]";
	}
	
	public boolean joMeg(){
		Date currentDate = new Date();
		if(this.szavatossagiIdo.compareTo(currentDate) > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
	
	public Long getVonalKod() {
		return vonalKod;
	}
	
	public String getGyarto() {
		return gyarto;
	}
}
