
package suresh.command.toothpastecommand;

/**
 * Rembrandt ToothPaste Class
 * @author Suresh
 */
public class Rembrandt {
    //property name
    String name;
    /*
    Constructor
    @param String name
    @return None
    */
    public Rembrandt( String name ){
        this.name = name;
    }
    /*
    Function to restore enamel
    @param None
    @return None
    */
    public void restoreEnamel(){
        System.out.println( name + " restore enamel");
    }
    /*
    Function to prevent plague
    @param None
    @return None
    */
    public void preventPlague(){
        System.out.println( name + " prevent plague");
    }
    /*
    Functiom to strengthen teeth
    @param None
    @return None
    */
    public void strengthenTeeth(){
        System.out.println( name + " strengthen teeth");
    }
    /*
    Function to prevent cavities
    @param None
    @return None
    */
    public void preventCavities(){
        System.out.println( name + " prevent Cavities");
    }
    
}
