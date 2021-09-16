
package suresh.command.toothpastecommand;

/**
 * Thera Breath ToothPaste Class
 * @author Suresh
 */
public class TheraBreath {
    //property name
    String name;
    
    /*
    Constructor
    @param String name
    @return None
    */
    public TheraBreath( String name ){
        this.name = name;
    }
    /*
    Function to freshen breath
    @param None
    @return None
    */
    public void freshenBreath(){
        System.out.println(name + " freshen Breath");
    }
    /*
    Fucntion to reduce bleeding
    @params None
    @return None
    */
    public void reduceBleeding(){
        System.out.println( name + " reduce bleeding");
    }
    /*
    Function to rebuild enamel
    @param None
    @return None
    */
    public void rebuildEnamel(){
        System.out.println( name + " rebuild enamel");
    }
}
