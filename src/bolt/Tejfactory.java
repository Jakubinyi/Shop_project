package bolt;

import java.util.Date;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

public abstract class Tejfactory {

	public Tej ujTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom, double zsirtartalom) {
		return new TartosTej(vonalKod,  gyarto, szavatossagiIdo, urtartalom, zsirtartalom);
	}
	
	public Tej ujFeltosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom, double zsirtartalom) {
		return new FeltartosTej(vonalKod, gyarto, szavatossagiIdo, urtartalom, zsirtartalom);
	}
}