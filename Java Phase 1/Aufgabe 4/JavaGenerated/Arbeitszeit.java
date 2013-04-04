package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Arbeitszeit.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Arbeitszeit implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _zeit.
     */
    private java.math.BigDecimal _zeit;

    /**
     * Field _einheit.
     */
    private java.lang.String _einheit;


      //----------------/
     //- Constructors -/
    //----------------/

    public Arbeitszeit() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'zeit'.
     * 
     * @return the value of field 'Zeit'.
     */
    public java.math.BigDecimal getZeit(
    ) {
        return this._zeit;
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
     * Sets the value of field 'zeit'.
     * 
     * @param zeit the value of field 'zeit'.
     */
    public void setZeit(
            final java.math.BigDecimal zeit) {
        this._zeit = zeit;
    }

}
