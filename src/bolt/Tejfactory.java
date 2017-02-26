package bolt;

import java.util.Date;

import tej.TartosTej;
import tej.FeltartosTej;

public abstract class Tejfactory {

	public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}
	
	public Tej ujFeltosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		return new FeltartosTej( vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
	}
}