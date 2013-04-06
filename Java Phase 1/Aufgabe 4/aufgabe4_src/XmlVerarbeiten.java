package aufgabe4_src;

import new_generated_classes.Rezepte;
import new_generated_classes.Rezepte.Rezept;
import new_generated_classes.Rezepte.Rezept.Kommentare.Kommentar;
import new_generated_classes.Rezepte.Rezept.Kommentare.Kommentar.Datum;
import new_generated_classes.Rezepte.Rezept.Kommentare.Kommentar.Uhrzeit;

import java.io.File;
import java.math.BigDecimal;


import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;


public class XmlVerarbeiten {
	

	JAXBContext jc;
	Marshaller marshaller;
	Unmarshaller unmarshaller;
	Rezepte r;
	
	
	
	public XmlVerarbeiten() throws Exception{
		jc = JAXBContext.newInstance("new_generated_classes");
	    unmarshaller = jc.createUnmarshaller();
	    r = (Rezepte) unmarshaller.unmarshal(new File("Aufgabe 4/aufgabe4_src/Aufgabe3d.xml"));

		
	}
	

	public void xmlausgabe() throws Exception{


	    for (int i = 0; i < r.getRezept().size(); i++) {
	    	
	      if (r.getRezept().get(i) instanceof Rezept){
	        Rezept re = (Rezept) r.getRezept().get(i);
	        System.out.println("Rezept Nummer: " + re.getId()); 
	        System.out.println("Rezeptname: " + re.getRezeptname() + "\r\n");
	        
	        System.out.println("Zutaten:");
	        for (int j = 0; j < re.getZutaten().zutat.size(); j++){
	        	System.out.println(re.getZutaten().zutat.get(j).menge + re.getZutaten().zutat.get(j).einheit.replace("default", "")
	        			+ " " + re.getZutaten().zutat.get(j).name);
	        }
	        System.out.println("\r\n" + "Zubereitung: ");
	        System.out.println("Arbeitszeit: " + re.getZubereitung().arbeitszeit.zeit + " " +
	        		re.getZubereitung().arbeitszeit.einheit);
	        System.out.println("Brennwert: " + re.getZubereitung().getBrennwert().anzahl + 
	        		" " + re.getZubereitung().getBrennwert().einheit + " fŸr " + re.getZubereitung()
	        		.getBrennwert().personen + " Person(en)");
	        		
	        System.out.println("Schwierigkeitsgrad: " + re.getZubereitung().schwierigkeitsgrad.toString().toLowerCase());
	        System.out.println("Beschreibung: " + re.getZubereitung().beschreibung + "\r\n");
	        
	        System.out.println("Kommentare:");
	        for (int k = 0; k < re.getKommentare().kommentar.size(); k++){
	        	Kommentar ko = (Kommentar) re.getKommentare().getKommentar().get(k);
	        	System.out.println(ko.nutzer + " schrieb am " + ko.datum.getTag() + "." +
	        			ko.datum.getMonat() + "." + ko.datum.getJahr() + ": " +
	        			ko.inhalt + "\r\n");		
	        }
	        System.out.println("------------------------------------------------------" + "\r\n");
	           

	      }
	    }
	}

	
	public int getAnzahlRezepte(){
		return r.getRezept().size();
	}
	
	public String getRezeptName(int rezeptnummer){
	
	    	
		      if (r.getRezept().get(rezeptnummer) instanceof Rezept){
		        Rezept re = (Rezept) r.getRezept().get(rezeptnummer);
		        return (re.getId().toString()+ " " + re.getRezeptname());
		      }
		      
		return "Fehler aufgetreten. Bitte Programm beenden.";
		
	}

	public void addKommentar(int rezeptid, String Nutzername, String kommentar) throws Exception{

			//array beginnt bei 0!
	      if (r.getRezept().get(rezeptid-1) instanceof Rezept){
		        Rezept re = (Rezept) r.getRezept().get(rezeptid-1);
		        Kommentar k = new Kommentar();
		        
		        Uhrzeit u = new Uhrzeit();
		        u.setMinute(null);
		        u.setStunde(null);
		        
		        Datum d = new Datum();
		        d.setJahr(null);
		        d.setMonat(null);
		        d.setTag(null);
		        
		        k.setId(null);
		        k.setNutzer(Nutzername);
		        k.setDatum(d);
		        k.setUhrzeit(u);
		     //   k.setInhalt(Nutzername);
		        k.setInhalt(kommentar);
		        
		        re.getKommentare().getKommentar().add(k); 

		        //Jetzt wieder Marshallen!!
		        Marshaller marshaller = jc.createMarshaller();
		        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		        marshaller.marshal(r, System.out);
		        
		        System.out.println("Kommentar: " + re.getKommentare().getKommentar().get(
		        		re.getKommentare().kommentar.size()-1).inhalt);
		      
	      
		 }        
	}	
}
