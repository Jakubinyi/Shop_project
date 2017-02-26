package bolt;

import java.util.Date;

public class Tej {
	
	private int urtartalom;
	private String gyarto;
	private Date szavatossagido;
	private double zsirtartalom;
	private long ar;
	
	public Tej(int urtartalom, String gyarto, Date szavatossagido, double zsirtartalom, long ar) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagido = szavatossagido;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
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
		return "Tej: [Űrtartalom =" + urtartalom + 
				", Gyártó =" + gyarto + 
				", Szavatossagidő =" + szavatossagido+ 
				", Zsírtartalom =" + zsirtartalom + 
				", Ár =" + ar + "]";
	}
	
	
	
	
}
