
package suresh.command.toothpastecommand;

/**
 * CrestTartar Class
 * @author Suresh
 */
public class CrestTartar {
    //Tooth paste name
    String name;
    
    /*
    Crest tartar constructor
    @param String name
    @return None
    */
    public CrestTartar( String name ){
        this.name = name;
    }
    /*
    Function whiten teeth
    @param None
    @return None
    */
    public void whitenTeeth(){
        System.out.println(name + " whiten teeth");
    }
    /*
    Function to remove bad breath
    @param None
    @return None
    
    */
    public void removeBadBreath(){
        System.out.println( name + " remove bad breath ");
    }
    /*
    Function to control tar
    @param None
    @return None
    */
    public void controlTar(){
        System.out.println( name + " control tar");
    }
}
