

public class Agenda {

	// ArrayList<Persoana> contacte;

	public Agenda() {
		// contacte = new ArrayList<Persoana>();
		Persoana pers1 = new Persoana("Tabaras", "Tudor", "0757555656", "tudor@gmail.com");
		Persoana pers2 = new Persoana("Cristina", "Rosu", "0722505295", "cristina@gmail.com");
		Persoana pers3 = new Persoana("Andrei", "Oprea", "0755465248", "andrei@yahoo.com");
		Persoana pers4 = new Persoana("Radu", "Vlad", "0722544982", "vlad@gmail.com");
		Main.contacte.add(pers1);
		Main.contacte.add(pers2);
		Main.contacte.add(pers3);
		Main.contacte.add(pers4);

	}

	public void aflaPersoanaDupaNume(String nume) {

		for (Persoana p : Main.contacte) {
			if (nume.equalsIgnoreCase(p.getNume())) {
				System.out.println(p);
				break;
			}

		}

	}

	public void afiseazaToateContactele() {
		for (Persoana p : Main.contacte) {
			System.out.println(p);
		}
	}

	public void introduContactNou() {

		Persoana persNou = new Persoana();
		System.out.println("Introduceti numele: ");
		String nume = Main.s.next();
		persNou.setNume(nume);
		System.out.println("Introduceti prenumele.");
		String prenume = Main.s.next();
		persNou.setPrenume(prenume);
		System.out.println("Introduceti nr de telefon.");
		String nrTel = Main.s.next();
		persNou.setNrTelefon(nrTel);

		System.out.println("Introduceti adresa de email");
		String adresaEmail = Main.s.next();
		persNou.setAdresaEmail(adresaEmail);

		Main.contacte.add(persNou);
		System.out.println("Contact nou creat: " + persNou.getNume() + " " + persNou.getPrenume() + " "
				+ persNou.getNrTelefon() + " " + persNou.getAdresaEmail());
		System.out.println("Size array " + Main.contacte.size());

	}

	public void stergeContact() {
		afiseazaToateContactele();
		System.out.println("Afiseaza ce contact vreti sa stergeti din agenda, dupa nume");
		String sters = Main.s.next();
		iterare(sters);

	}

	public void iterare(String numePersoana) {
		int contor = 0;
		for (Persoana p : Main.contacte) {
			if (numePersoana.equalsIgnoreCase(p.getNume())) {
				contor++;
				break;
			}
		}

		contor--;
		Persoana p = Main.contacte.get(contor);
		System.out.println("Persoana: " + p.getNume() + " " + p.getPrenume() + " a fost stearsa din lista.");
		Main.contacte.remove(contor);

	}
}
