
package suresh.command.toothpastecommand;

/**
 * This is the invoker Class
 * @author Suresh
 */
public class ToothPasteUser {
    Command[] onCommands;
    /*
    Constructor
    */
    public ToothPasteUser(){
        onCommands = new Command[7];
        
        for( int i = 0; i < 7; i++){
            onCommands[i] = () -> {};
        }
        
    }
    /*
    Set the commands to execute
    @param int slot index in command array
    @param Command onCommand Command to execute
    @return None
    */
    public void setCommand(int slot, Command onCommand){
        onCommands[slot] = onCommand;
    }
    /*
    Execute tooth paste action on brush
    @param int slot the slot to execute 
    @return none
    */
    public void onBrush( int slot ){
        onCommands[slot].execute();
    }
    /*
    Function to print object to string
    @param none
    @return String stringBuffer
    */
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------User Clean Teeth----------\n");
        for ( int i = 0; i < onCommands.length; i++ ) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "    \n" );
        }
        return stringBuffer.toString();
    }
    
}
