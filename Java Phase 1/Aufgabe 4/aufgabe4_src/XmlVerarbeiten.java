package aufgabe4_src;

import generated_classes.Rezepte;
import generated_classes.Rezepte.Rezept;

import java.io.File;


import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
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
		jc = JAXBContext.newInstance("generated_classes");
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
	        System.out.println("Schwierigkeitsgrad: " + re.getZubereitung().schwierigkeitsgrad.toString().toLowerCase());
	        System.out.println("Beschreibung: " + re.getZubereitung().beschreibung + "\r\n" + "\r\n"
	        		+ "------------------------------------------------------" + "\r\n");

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
/*	
	public void addKommentar(int rezeptid, String kommentar) throws Exception{
		
//		JAXBContext context = JAXBContext.newInstance(Rezepte.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<!-- " + kommentar + " -->");
//	//	JAXBElement doc = (JAXBElement) unmarshaller.unmarshal(new File("Aufgabe 4/aufgabe4_src/Aufgabe3d.xml"));
//		marshaller.marshal(rezeptid, System.out);
		
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder builder = factory.newDocumentBuilder();
		final Document doc = builder.getDOMImplementation().createDocument(null, null, null);


		final Binder<Node> binder = jc.createBinder();
		binder.marshal(r, doc);
		final Comment comment = doc.createComment(kommentar);
		doc.appendChild(comment);

		final DOMSource domSource = new DOMSource(doc);
		
		// use System.out for testing
		final StreamResult streamResult = new StreamResult(System.out);
		final TransformerFactory tf = TransformerFactory.newInstance();
		final Transformer serializer = tf.newTransformer();
		serializer.transform(domSource, streamResult);
	}
	
	*/
}
