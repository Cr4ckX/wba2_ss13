package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Brennwert.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Brennwert implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _personen.
     */
    private java.math.BigDecimal _personen = new java.math.BigDecimal("1");

    /**
     * Field _anzahl.
     */
    private java.math.BigDecimal _anzahl;

    /**
     * Field _einheit.
     */
    private java.lang.String _einheit = "kcal";


      //----------------/
     //- Constructors -/
    //----------------/

    public Brennwert() {
        super();
        setPersonen(new java.math.BigDecimal("1"));
        setEinheit("kcal");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'anzahl'.
     * 
     * @return the value of field 'Anzahl'.
     */
    public java.math.BigDecimal getAnzahl(
    ) {
        return this._anzahl;
    }

    /**
     * Returns the value of field 'einheit'.
     * 
     * @return the value of field 'Einheit'.
     */
    public java.lang.String getEinheit(
    ) {
        return this._einheit;
    }

    /**
     * Returns the value of field 'personen'.
     * 
     * @return the value of field 'Personen'.
     */
    public java.math.BigDecimal getPersonen(
    ) {
        return this._personen;
    }

    /**
     * Sets the value of field 'anzahl'.
     * 
     * @param anzahl the value of field 'anzahl'.
     */
    public void setAnzahl(
            final java.math.BigDecimal anzahl) {
        this._anzahl = anzahl;
    }

    /**
     * Sets the value of field 'einheit'.
     * 
     * @param einheit the value of field 'einheit'.
     */
    public void setEinheit(
            final java.lang.String einheit) {
        this._einheit = einheit;
    }

    /**
     * Sets the value of field 'personen'.
     * 
     * @param personen the value of field 'personen'.
     */
    public void setPersonen(
            final java.math.BigDecimal personen) {
        this._personen = personen;
    }

}
