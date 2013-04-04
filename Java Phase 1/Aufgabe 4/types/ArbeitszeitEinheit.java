/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package types;

/**
 * Enumeration ArbeitszeitEinheit.
 * 
 * @version $Revision$ $Date$
 */
public enum ArbeitszeitEinheit {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant MIN_
     */
    MIN_("Min."),
    /**
     * Constant STD_
     */
    STD_("Std."),
    /**
     * Constant TAGE
     */
    TAGE("Tag(e)");

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
    private static final java.util.Map<java.lang.String, ArbeitszeitEinheit> enumConstants = new java.util.HashMap<java.lang.String, ArbeitszeitEinheit>();


    static {
        for (ArbeitszeitEinheit c: ArbeitszeitEinheit.values()) {
            ArbeitszeitEinheit.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ArbeitszeitEinheit(final java.lang.String value) {
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
    public static types.ArbeitszeitEinheit fromValue(
            final java.lang.String value) {
        ArbeitszeitEinheit c = ArbeitszeitEinheit.enumConstants.get(value);
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
