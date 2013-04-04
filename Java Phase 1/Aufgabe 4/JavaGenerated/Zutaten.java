package JavaGenerated;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Zutaten.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Zutaten implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _zutatList.
     */
    private java.util.Vector<Zutat> _zutatList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Zutaten() {
        super();
        this._zutatList = new java.util.Vector<Zutat>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vZutat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addZutat(
            final Zutat vZutat)
    throws java.lang.IndexOutOfBoundsException {
        this._zutatList.addElement(vZutat);
    }

    /**
     * 
     * 
     * @param index
     * @param vZutat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addZutat(
            final int index,
            final Zutat vZutat)
    throws java.lang.IndexOutOfBoundsException {
        this._zutatList.add(index, vZutat);
    }

    /**
     * Method enumerateZutat.
     * 
     * @return an Enumeration over all Zutat elements
     */
    public java.util.Enumeration<? extends Zutat> enumerateZutat(
    ) {
        return this._zutatList.elements();
    }

    /**
     * Method getZutat.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Zutat at the given index
     */
    public Zutat getZutat(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._zutatList.size()) {
            throw new IndexOutOfBoundsException("getZutat: Index value '" + index + "' not in range [0.." + (this._zutatList.size() - 1) + "]");
        }

        return (Zutat) _zutatList.get(index);
    }

    /**
     * Method getZutat.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Zutat[] getZutat(
    ) {
        Zutat[] array = new Zutat[0];
        return (Zutat[]) this._zutatList.toArray(array);
    }

    /**
     * Method getZutatCount.
     * 
     * @return the size of this collection
     */
    public int getZutatCount(
    ) {
        return this._zutatList.size();
    }

    /**
     */
    public void removeAllZutat(
    ) {
        this._zutatList.clear();
    }

    /**
     * Method removeZutat.
     * 
     * @param vZutat
     * @return true if the object was removed from the collection.
     */
    public boolean removeZutat(
            final Zutat vZutat) {
        boolean removed = _zutatList.remove(vZutat);
        return removed;
    }

    /**
     * Method removeZutatAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Zutat removeZutatAt(
            final int index) {
        java.lang.Object obj = this._zutatList.remove(index);
        return (Zutat) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vZutat
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setZutat(
            final int index,
            final Zutat vZutat)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._zutatList.size()) {
            throw new IndexOutOfBoundsException("setZutat: Index value '" + index + "' not in range [0.." + (this._zutatList.size() - 1) + "]");
        }

        this._zutatList.set(index, vZutat);
    }

    /**
     * 
     * 
     * @param vZutatArray
     */
    public void setZutat(
            final Zutat[] vZutatArray) {
        //-- copy array
        _zutatList.clear();

        for (int i = 0; i < vZutatArray.length; i++) {
                this._zutatList.add(vZutatArray[i]);
        }
    }

}
