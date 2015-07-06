package Lessons1.KickStarter;

import Lessons1.KickStarter.model.LoaderData;
import Lessons1.KickStarter.model.Node;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 03.07.15
 * Time: 11:58
 * @version: 1.0
 */
public class BootStrap {
    public static void main(String args[]){
        Console mainConsole = new Console(System.in);
        Node mainNode = new LoaderData().loadDataWebSite();
        String requirementPosition = "";
        while (true) {
            mainConsole.write("Success doesn't come to you…you go to it.");
            mainConsole.createStringSeparator(150, "-");
            mainConsole.drawTable(mainNode);
            mainConsole.write("Input interested position (1.2 and etc.): ");
            requirementPosition = mainConsole.read();
            mainConsole.clear();
        }


    }
}
