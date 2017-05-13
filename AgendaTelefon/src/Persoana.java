
public class Persoana {

	private String nume;
	private String prenume;
	private String nrTelefon;
	private String adresaEmail;
	public Persoana(){
		
	}
	public Persoana(String nume, String prenume, String nrTelefon, String adresaEmail) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}
	
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
	public void setAdresaEmail(String adresaEmail) {
		this.adresaEmail = adresaEmail;
	}
	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public String getAdresaEmail() {
		return adresaEmail;
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", prenume=" + prenume + ", nrTelefon=" + nrTelefon + ", adresaEmail="
				+ adresaEmail + "]";
	}
	
	
	
	
}
