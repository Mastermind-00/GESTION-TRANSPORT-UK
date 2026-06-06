package gestiontransport;
import java.util.ArrayList;
public class listPassagers {
	public static void afficherPassagers(ArrayList<Passager> listePassagers) {
	// Affichage de liste
	for(Passager p : listePassagers) {
		System.out.println("ID: " + p.idPassager);
		System.out.println("NOM: " + p.nom);
		System.out.println("PRENOM: " +p.prenom);
		System.out.println("Numero de telephone: " +p.numeroTelephone);
		System.out.println("-----------------------------");
	}
	
}
}
