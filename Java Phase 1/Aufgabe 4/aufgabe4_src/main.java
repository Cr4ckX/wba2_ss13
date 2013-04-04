package aufgabe4_src;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import JavaGenerated.*;
import aufgabe4_src.Rezepte.Rezept;

public class main {

  public static void main(String[] args) throws Exception {
    JAXBContext jc = JAXBContext.newInstance("aufgabe4_src");
    Unmarshaller unmarshaller = jc.createUnmarshaller();

    Rezepte r = (Rezepte) unmarshaller.unmarshal(new File("Aufgabe 4/aufgabe4_src/Aufgabe3d.xml"));

    for (int i = 0; i < r.getRezept().size(); i++) {
    	
      if (r.getRezept().get(i) instanceof Rezept){
        Rezept re = (Rezept) r.getRezept().get(i);
        System.out.println("Rezeptname: " + re.getRezeptname());//.getZubereitung());//.getRezeptname());
        
        System.out.println("Zutaten:");
        for (int j = 0; j < re.getZutaten().zutat.size(); j++){
        	System.out.println(re.getZutaten().zutat.get(j).menge + re.getZutaten().zutat.get(j).einheit
        			+ " " + re.getZutaten().zutat.get(j).name);
        }
        
        System.out.println("Beschreibung: " + re.getZubereitung().beschreibung);
      }
    }
    
  }
}
