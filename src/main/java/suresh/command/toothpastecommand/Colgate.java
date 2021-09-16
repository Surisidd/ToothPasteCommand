
package suresh.command.toothpastecommand;

/**
 * Colgate Class
 * @author Suresh
 */
public class Colgate {
    //property name
    String name;
    /*
    Constructor
    @param String name
    @return None
    */
    public Colgate( String name ){
        this.name = name;
    }
    /*
    Fucntion to fight cavities
    @param None
    @return None
    */
   
    public void fightCavities(){
        System.out.println( name + " fight cavities");
    }
    /*
    Function to prevent Gingivitis
    @param None
    @return None
    */
    public void preventGingivitis(){
        System.out.println( name + " prevent gingivitis");
    }
    /*
    Function to control calculus
    @param None
    @return None
    */    
    public void controlCalculus(){
        System.out.println( name + " control calculus");
        
    }
    /*
    Function to fight bad breath
    @param None
    @return None
    */    
    public void fightBadBreath(){
        System.out.println( name + " fight bad breath ");
    }
    /*
    Function to prevent hyper sensitivity
    @param None
    @return None
    */    
    public void preventHypersensitivity(){
        System.out.println( name + " prevent Hyper Sensitivity");
    }
}
