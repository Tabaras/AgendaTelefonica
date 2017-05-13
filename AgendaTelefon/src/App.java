

public class App {
	
	void logicaAgenda(){
		
		Agenda agenda = new Agenda();
		
		boolean runningApp = true;
		
		do{
		System.out.println("Meniu agenda.");
		System.out.println("(1)Gaseste contact dupa nume");
		System.out.println("(2)Afiseaza toate contactele din agenda.");
		System.out.println("(3)Adauga contact nou in lista.");
		System.out.println("(4)Sterge contact din lista.");
		System.out.println("(5)EXIT.");
		int opt = Main.s.nextInt();
		
		switch(opt){
		case 1:
			System.out.println("Introduceti numele dorit.");
			String nume = Main.s.next();
			agenda.aflaPersoanaDupaNume(nume);
			break;
		case 2 :
			agenda.afiseazaToateContactele();
			break;
		case 3:
			agenda.introduContactNou();
			break;
		case 4:
			agenda.stergeContact();
			break;
		case 5:
			runningApp = false;
		default:
			System.out.println("Nu exista aceasta optiunea");
			break;
		}
		}while(runningApp);
			
			System.out.println("Programul s-a sfarsit.");
	
	}
	

}
