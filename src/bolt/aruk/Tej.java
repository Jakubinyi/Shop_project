package bolt.aruk;

import java.util.Date;

public abstract class Tej extends Elelmiszer{	
	
	public final int LITER = 10;
	public final int FELLITER = 5;
	public final int POHAR = 2;
	public final double ZSIROS = 3.5;
	public final double FELZSIROS = 2.8;
	
	protected int urtartalom;
	protected double zsirtartalom;
	
	public Tej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom, double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
	}

	public int getUrtartalom() {
		return urtartalom;
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
