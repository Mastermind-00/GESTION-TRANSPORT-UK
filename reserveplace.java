package gestiontransport;
import java.util.Scanner;
import java.util.ArrayList;
public class ReservePlace {
	public static void reserverPlace(ArrayList<Passager> listPassagers) {
		// les variables
	String nom, prenom, numeroTelephone;
	int idTrajet, idPassager = 1, idReservation = 1;
	
	// Saisi des information du passager
	Scanner clavier = new Scanner(System.in);
	System.out.println("Veuillez saisir votre nom ");
	 nom = clavier.nextLine();
	System.out.println("Veuillez saisir votre prenom");
	 prenom = clavier.nextLine();
	System.out.println("veuillez saisir votre numero de telephone");
	 numeroTelephone = clavier.nextLine();
	System.out.println("veuillez saisir votre identifiant de trajet");
	 idTrajet = clavier.nextInt();
	 
	 //creation des objets (passager et Reservation)
	 Passager monPassager = new Passager(idPassager, nom, prenom, numeroTelephone);
	 listPassagers.add(monPassager);
	 Reservation maResevation = new Reservation(idReservation, idTrajet, idPassager);
	 System.out.println("Resevation effectue avec succes !");
	 
    

	}

}
