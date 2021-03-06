package bolt.aruk;

import java.util.Date;

public class Sajt extends Elelmiszer{
	
	protected double suly;
	protected double zsirtartalom;
	
	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo, double suly, double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
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
}
