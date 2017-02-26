package bolt;

import java.util.Date;

import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

public abstract class BoltFactory {

	public Tej ujTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom, double zsirtartalom) {
		return new TartosTej(vonalKod,  gyarto, szavatossagiIdo, urtartalom, zsirtartalom);
	}
	
	public Tej ujFeltartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom, double zsirtartalom) {
		return new FeltartosTej(vonalKod, gyarto, szavatossagiIdo, urtartalom, zsirtartalom);
	}
	
	public Tej ujFelzsirosTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom) {
		return new TartosTej(vonalKod, gyarto, szavatossagiIdo, urtartalom, Tej.FELZSIROS);
	}
	
	public Tej ujZsirosTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom) {
		return new TartosTej(vonalKod, gyarto, szavatossagiIdo, urtartalom, Tej.ZSIROS);
	}
	
	public Tej ujFelzsirosFeltartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom) {
		return new FeltartosTej(vonalKod, gyarto, szavatossagiIdo, urtartalom, Tej.FELZSIROS);
	}
	
	public Tej ujZsirosFeltartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo, int urtartalom) {
		return new FeltartosTej(vonalKod, gyarto, szavatossagiIdo, urtartalom, Tej.ZSIROS);
	}
	
	public Tej ujFelzsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		return new TartosTej(vonalKod, gyarto, szavatossagiIdo, Tej.LITER, Tej.FELZSIROS);
	}
	
	public Tej ujZsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		return new TartosTej(vonalKod, gyarto, szavatossagiIdo, Tej.LITER, Tej.ZSIROS);
	}
	
	public Tej ujFelzsirosLiteresFeltartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		return new FeltartosTej(vonalKod, gyarto, szavatossagiIdo, Tej.LITER, Tej.FELZSIROS);
	}
	
	public Tej ujZsirosLiteresFeltartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		return new FeltartosTej(vonalKod, gyarto, szavatossagiIdo, Tej.LITER, Tej.ZSIROS);
	}
		
	public Sajt ujSajt(Long vonalKod, String gyarto, Date szavatossagiIdo, double suly, double zsirtartalom) {
		return new Sajt(vonalKod, gyarto, szavatossagiIdo, suly, zsirtartalom);
	}
	
	public Szappan ujSzappan(Long vonalKod, String gyarto, char mosohatas) {
		return new Szappan(vonalKod, gyarto, mosohatas);
	}
	
	public Szappan ujAMosohatasuSzappan(Long vonalKod, String gyarto) {
		return new Szappan(vonalKod, gyarto, 'A');
	}
}