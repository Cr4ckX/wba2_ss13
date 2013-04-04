package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Zubereitung.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Zubereitung implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _arbeitszeit.
     */
    private Arbeitszeit _arbeitszeit;

    /**
     * Field _schwierigkeitsgrad.
     */
    private types.Schwierigkeit _schwierigkeitsgrad = types.Schwierigkeit.fromValue("normal");

    /**
     * Field _brennwert.
     */
    private Brennwert _brennwert;

    /**
     * Field _beschreibung.
     */
    private java.lang.String _beschreibung;


      //----------------/
     //- Constructors -/
    //----------------/

    public Zubereitung() {
        super();
        setSchwierigkeitsgrad(types.Schwierigkeit.fromValue("normal"));
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'arbeitszeit'.
     * 
     * @return the value of field 'Arbeitszeit'.
     */
    public Arbeitszeit getArbeitszeit(
    ) {
        return this._arbeitszeit;
    }

    /**
     * Returns the value of field 'beschreibung'.
     * 
     * @return the value of field 'Beschreibung'.
     */
    public java.lang.String getBeschreibung(
    ) {
        return this._beschreibung;
    }

    /**
     * Returns the value of field 'brennwert'.
     * 
     * @return the value of field 'Brennwert'.
     */
    public Brennwert getBrennwert(
    ) {
        return this._brennwert;
    }

    /**
     * Returns the value of field 'schwierigkeitsgrad'.
     * 
     * @return the value of field 'Schwierigkeitsgrad'.
     */
    public types.Schwierigkeit getSchwierigkeitsgrad(
    ) {
        return this._schwierigkeitsgrad;
    }

    /**
     * Sets the value of field 'arbeitszeit'.
     * 
     * @param arbeitszeit the value of field 'arbeitszeit'.
     */
    public void setArbeitszeit(
            final Arbeitszeit arbeitszeit) {
        this._arbeitszeit = arbeitszeit;
    }

    /**
     * Sets the value of field 'beschreibung'.
     * 
     * @param beschreibung the value of field 'beschreibung'.
     */
    public void setBeschreibung(
            final java.lang.String beschreibung) {
        this._beschreibung = beschreibung;
    }

    /**
     * Sets the value of field 'brennwert'.
     * 
     * @param brennwert the value of field 'brennwert'.
     */
    public void setBrennwert(
            final Brennwert brennwert) {
        this._brennwert = brennwert;
    }

    /**
     * Sets the value of field 'schwierigkeitsgrad'.
     * 
     * @param schwierigkeitsgrad the value of field
     * 'schwierigkeitsgrad'.
     */
    public void setSchwierigkeitsgrad(
            final types.Schwierigkeit schwierigkeitsgrad) {
        this._schwierigkeitsgrad = schwierigkeitsgrad;
    }

}
