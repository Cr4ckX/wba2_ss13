package aufgabe4_src;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 * @author CrackX Liest festgelegte XML-Datei ein und gibt die beinhalteten
 *         Informationen angepasst an dem XML-Schema aus Aufgabe 3 aus.
 * 
 */
public class main {

	public static void main(String[] args) throws Exception {

		XmlVerarbeiten verarbeiten = new XmlVerarbeiten();
		Scanner sc = new Scanner(System.in);
		int anzahlRezepte = verarbeiten.getAnzahlRezepte();
		int auswahl;
		String kommentar;
		String nutzername;
		BigDecimal auswahl2;

		System.out.println("Die ausgelesene Datei enthält " + anzahlRezepte
				+ " Rezept(e)." + " Wie möchten Sie vorgehen?" + "\r\n");

		System.out.println("1. Rezept(e) anschauen.");
		System.out.println("2. Rezept mit Kommentar versehen.");
		System.out.print("\r\n");
		System.out
				.print("Wählen Sie 1 oder 2 aus, indem sie die Zahl eingeben: ");
		auswahl = sc.nextInt();

		System.out
				.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -"
						+ "\r\n");
		switch (auswahl) {

		case 1:
			verarbeiten.xmlausgabe();
			break;

		case 2:
			System.out
					.println("Welches Rezept soll mit einem Kommentar versehen werden?"
							+ "\r\n");
			for (int i = 0; i < anzahlRezepte; i++) {
				System.out.println(verarbeiten.getRezeptName(i) + "\r\n");
			}
			System.out.print("Bitte wählen: ");
//			auswahl = sc.nextInt();
			auswahl2 = sc.nextBigDecimal();
//			sc.nextLine(); //EOL wird 'entfernt'

			System.out.print("Bitte geben Sie ihren Nutzernamen an: ");
			nutzername = sc.next();
			
			System.out.println("Bitte Kommentar für Rezept hier hinzufügen:");
			kommentar = sc.nextLine();
			sc.nextLine(); //EOL wird 'entfernt'
		
			verarbeiten.addKommentar(auswahl2, nutzername, kommentar);
			break;
			
			
		}

	}
}
