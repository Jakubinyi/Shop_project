package bolt.aruk;

import java.util.Date;

import bolt.Aru;

public class Szappan extends Aru {
	
	protected Long vonalKod;
	protected String gyarto;
	protected char mosohatas;

	public Szappan(Long vonalKod, String gyarto, char mosohatas) {
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.mosohatas = mosohatas;
	}
}
