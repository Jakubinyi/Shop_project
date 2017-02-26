package bolt;

import java.util.Date;

public abstract class Tej {	
	
	public final int LITER = 10;
	public final int FELLITER = 5;
	public final int POHAR = 2;
	public final double ZSIROS = 3.5;
	public final double FELZSIROS = 2.8;
	
	protected Long vonalKod;
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	
	public Tej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagido, double zsirtartalom) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagido;
		this.zsirtartalom = zsirtartalom;
	}

	public Long getVonalKod() {
		return vonalKod;
		
	}
	public boolean joMeg(){
		Date currentDate = new Date();
		if(this.szavatossagiIdo.compareTo(currentDate) > 0){
			return true;
		} else {
			return false;
		}
	}
	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagido() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString() {
		return "Tej: [Vonalkód = " + vonalKod +
				", Űrtartalom =" + urtartalom + 
				", Gyártó =" + gyarto + 
				", Szavatossagidő =" + szavatossagiIdo+ 
				", Zsírtartalom =" + zsirtartalom + "]";
	}
	
	
	
	
}
