package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Rezepte.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Rezepte implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _rezeptList.
     */
    private java.util.Vector<Rezept> _rezeptList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Rezepte() {
        super();
        this._rezeptList = new java.util.Vector<Rezept>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRezept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRezept(
            final Rezept vRezept)
    throws java.lang.IndexOutOfBoundsException {
        this._rezeptList.addElement(vRezept);
    }

    /**
     * 
     * 
     * @param index
     * @param vRezept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRezept(
            final int index,
            final Rezept vRezept)
    throws java.lang.IndexOutOfBoundsException {
        this._rezeptList.add(index, vRezept);
    }

    /**
     * Method enumerateRezept.
     * 
     * @return an Enumeration over all Rezept elements
     */
    public java.util.Enumeration<? extends Rezept> enumerateRezept(
    ) {
        return this._rezeptList.elements();
    }

    /**
     * Method getRezept.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Rezept at the given index
     */
    public Rezept getRezept(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rezeptList.size()) {
            throw new IndexOutOfBoundsException("getRezept: Index value '" + index + "' not in range [0.." + (this._rezeptList.size() - 1) + "]");
        }

        return (Rezept) _rezeptList.get(index);
    }

    /**
     * Method getRezept.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Rezept[] getRezept(
    ) {
        Rezept[] array = new Rezept[0];
        return (Rezept[]) this._rezeptList.toArray(array);
    }

    /**
     * Method getRezeptCount.
     * 
     * @return the size of this collection
     */
    public int getRezeptCount(
    ) {
        return this._rezeptList.size();
    }

    /**
     */
    public void removeAllRezept(
    ) {
        this._rezeptList.clear();
    }

    /**
     * Method removeRezept.
     * 
     * @param vRezept
     * @return true if the object was removed from the collection.
     */
    public boolean removeRezept(
            final Rezept vRezept) {
        boolean removed = _rezeptList.remove(vRezept);
        return removed;
    }

    /**
     * Method removeRezeptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Rezept removeRezeptAt(
            final int index) {
        java.lang.Object obj = this._rezeptList.remove(index);
        return (Rezept) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRezept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRezept(
            final int index,
            final Rezept vRezept)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rezeptList.size()) {
            throw new IndexOutOfBoundsException("setRezept: Index value '" + index + "' not in range [0.." + (this._rezeptList.size() - 1) + "]");
        }

        this._rezeptList.set(index, vRezept);
    }

    /**
     * 
     * 
     * @param vRezeptArray
     */
    public void setRezept(
            final Rezept[] vRezeptArray) {
        //-- copy array
        _rezeptList.clear();

        for (int i = 0; i < vRezeptArray.length; i++) {
                this._rezeptList.add(vRezeptArray[i]);
        }
    }

}
