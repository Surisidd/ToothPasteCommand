
package suresh.command.toothpastecommand;

/**
 * Sensodyne ToothPaste Class
 * @author Suresh
 */
public class Sensodyne {
    String name;
    /*
    * Constructor
    */
    public Sensodyne( String name){
        this.name = name;
    }
    /*
    * Function to whiten Teeth
    * @param None
    * @return Void
    */
    public void whitenTeeth(){
        System.out.println( name + " whiten teeth");
    }
    /*
    * Function to restore Gum
    * @param None
    * @return void
    */
    public void restoreGum(){
        System.out.println( name + " restore Gum" );
        
    }
    /*
    * Function to remove Stains
    * @param None
    * @return void
    */
    public void removeStains(){
        System.out.println( name + " remove stains");
    }
    /*
    * Function to remove plague
    * @param None
    * @return void
    */
    public void removePlague(){
        System.out.println( name + " remove plague");
    }
    /*
    * Function to prevent gingivitis
    * @param None
    * @return void
    */
    public void preventGingivitis(){
        System.out.println( name + " prevent Gingivitis");
    }
    /*
    * Function to remove tar
    * @param None
    * @return void
    */
    public void removeTar(){
        System.out.println( name + " remove tar");
    }
}
