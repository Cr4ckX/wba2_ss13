/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package types;

/**
 * Enumeration Schwierigkeit.
 * 
 * @version $Revision$ $Date$
 */
public enum Schwierigkeit {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant LEICHT
     */
    LEICHT("leicht"),
    /**
     * Constant NORMAL
     */
    NORMAL("normal"),
    /**
     * Constant SCHWER
     */
    SCHWER("schwer");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, Schwierigkeit> enumConstants = new java.util.HashMap<java.lang.String, Schwierigkeit>();


    static {
        for (Schwierigkeit c: Schwierigkeit.values()) {
            Schwierigkeit.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private Schwierigkeit(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static types.Schwierigkeit fromValue(
            final java.lang.String value) {
        Schwierigkeit c = Schwierigkeit.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
