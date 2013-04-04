package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Rezept.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Rezept implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id.
     */
    private long _id;

    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;

    /**
     * Field _rezeptname.
     */
    private java.lang.String _rezeptname;

    /**
     * Field _zutaten.
     */
    private Zutaten _zutaten;

    /**
     * Field _zubereitung.
     */
    private Zubereitung _zubereitung;


      //----------------/
     //- Constructors -/
    //----------------/

    public Rezept() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteId(
    ) {
        this._has_id= false;
    }

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'Id'.
     */
    public long getId(
    ) {
        return this._id;
    }

    /**
     * Returns the value of field 'rezeptname'.
     * 
     * @return the value of field 'Rezeptname'.
     */
    public java.lang.String getRezeptname(
    ) {
        return this._rezeptname;
    }

    /**
     * Returns the value of field 'zubereitung'.
     * 
     * @return the value of field 'Zubereitung'.
     */
    public Zubereitung getZubereitung(
    ) {
        return this._zubereitung;
    }

    /**
     * Returns the value of field 'zutaten'.
     * 
     * @return the value of field 'Zutaten'.
     */
    public Zutaten getZutaten(
    ) {
        return this._zutaten;
    }

    /**
     * Method hasId.
     * 
     * @return true if at least one Id has been added
     */
    public boolean hasId(
    ) {
        return this._has_id;
    }

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(
            final long id) {
        this._id = id;
        this._has_id = true;
    }

    /**
     * Sets the value of field 'rezeptname'.
     * 
     * @param rezeptname the value of field 'rezeptname'.
     */
    public void setRezeptname(
            final java.lang.String rezeptname) {
        this._rezeptname = rezeptname;
    }

    /**
     * Sets the value of field 'zubereitung'.
     * 
     * @param zubereitung the value of field 'zubereitung'.
     */
    public void setZubereitung(
            final Zubereitung zubereitung) {
        this._zubereitung = zubereitung;
    }

    /**
     * Sets the value of field 'zutaten'.
     * 
     * @param zutaten the value of field 'zutaten'.
     */
    public void setZutaten(
            final Zutaten zutaten) {
        this._zutaten = zutaten;
    }

}
