
package suresh.command.toothpastecommand;

/**
 *
 * @author Suresh
 */
public class ToothPasteUserDrive {


    public static void main(String args[]) {
        ToothPasteUser toothPasteUser = new ToothPasteUser();
        
        Colgate colgate = new Colgate("Colgate");
        CrestTartar crestTartar = new CrestTartar("Crest Tartar");
        Rembrandt rembrandt = new Rembrandt("Rembrandt");
        Sensodyne sensodyne = new Sensodyne("Sensodyne");
        TheraBreath theraBreath = new TheraBreath("Thera Breath");
        
        Command brushWithColgate = () -> {
            colgate.controlCalculus();
            colgate.fightBadBreath();
            colgate.fightCavities();
            colgate.preventGingivitis();
            colgate.preventHypersensitivity();
        };
        
        toothPasteUser.setCommand(0, brushWithColgate);
        
        Command brushWithCrestTartar = () -> {
            crestTartar.controlTar();
            crestTartar.removeBadBreath();
            crestTartar.whitenTeeth();
        };
        
        toothPasteUser.setCommand(1, brushWithCrestTartar);
        
        Command brushWithRembrandt = () -> {
            rembrandt.preventCavities();
            rembrandt.preventPlague();
            rembrandt.restoreEnamel();
            rembrandt.strengthenTeeth();
        };
        
        toothPasteUser.setCommand(2, brushWithRembrandt);
        
        Command brushWithSensodyne = () -> {
            sensodyne.preventGingivitis();
            sensodyne.removePlague();
            sensodyne.removeStains();
            sensodyne.restoreGum();
            sensodyne.whitenTeeth();
        };
        
        toothPasteUser.setCommand(3, brushWithSensodyne);
        
        Command brushWithTheraBreath = () -> {
            theraBreath.freshenBreath();
            theraBreath.rebuildEnamel();
            theraBreath.reduceBleeding();
            
        };
        
        toothPasteUser.setCommand(4, brushWithTheraBreath);
        
        
        System.out.println(toothPasteUser);
        
        toothPasteUser.onBrush(0);
        System.out.println("\n");
        toothPasteUser.onBrush(1);
        System.out.println("\n");
        toothPasteUser.onBrush(2);
        System.out.println("\n");
        toothPasteUser.onBrush(3);
        System.out.println("\n");
        toothPasteUser.onBrush(4);
    }
}
