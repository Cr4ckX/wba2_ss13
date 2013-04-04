package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Zutat.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Zutat implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _menge.
     */
    private java.math.BigDecimal _menge;

    /**
     * Field _einheit.
     */
    private java.lang.String _einheit;


      //----------------/
     //- Constructors -/
    //----------------/

    public Zutat() {
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
     * Returns the value of field 'menge'.
     * 
     * @return the value of field 'Menge'.
     */
    public java.math.BigDecimal getMenge(
    ) {
        return this._menge;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
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
     * Sets the value of field 'menge'.
     * 
     * @param menge the value of field 'menge'.
     */
    public void setMenge(
            final java.math.BigDecimal menge) {
        this._menge = menge;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

}
