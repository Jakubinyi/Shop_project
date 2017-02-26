package bolt;

import java.util.Date;

public class Tej {
	
	private final int LITER = 10;
	private final int FELLITER = 5;
	private final int POHAR = 2;
	private final double ZSIROS = 3.5;
	private final double FELZSIROS = 2.8;
	
	private long vonalKod;
	private int urtartalom;
	private String gyarto;
	private Date szavatossagido;
	private double zsirtartalom;
	private long ar;
	
	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagido, double zsirtartalom, long ar) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagido = szavatossagido;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public long getVonalKod() {
		return vonalKod;
		
	}
	public boolean joMeg(){
		Date currentDate = new Date();
		if(this.szavatossagido.compareTo(currentDate) > 0){
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
		return szavatossagido;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public long getAr() {
		return ar;
	}

	@Override
	public String toString() {
		return "Tej: [Vonalkód = " + vonalKod +
				", Űrtartalom =" + urtartalom + 
				", Gyártó =" + gyarto + 
				", Szavatossagidő =" + szavatossagido+ 
				", Zsírtartalom =" + zsirtartalom + 
				", Ár =" + ar + "]";
	}
	
	
	
	
}
