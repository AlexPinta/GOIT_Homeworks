package Lessons1.KickStarter;

import Lessons1.KickStarter.model.Node;
import Lessons1.KickStarter.model.projectElements.ProjectDescription;
import Lessons1.KickStarter.model.projectElements.ProjectHistory;
import Lessons1.KickStarter.model.projectElements.ProjectLink;
import Lessons1.KickStarter.model.projectElements.ProjectQuestionAnswer;
import Lessons1.KickStarter.model.StructureElement;
import Lessons1.KickStarter.view.ProjectElementFormatter;

import java.io.InputStream;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 4:45
 * @version: 1.0
 */
public class Console {
    private Scanner locScanner;
    ProjectElementFormatter formatterElement = new ProjectElementFormatter();
    private Map<String, Integer> stdLayoutProjectDescription    = formatterElement.getLayoutPattern(new ProjectDescription("", 0 ,0 ,0));
    private Map<String, Integer> stdLayoutProjectHistory        = formatterElement.getLayoutPattern(new ProjectHistory("", "", Date.valueOf("1900-01-01")));
    private Map<String, Integer> stdLayoutProjectLink           = formatterElement.getLayoutPattern(new ProjectLink("", ""));
    private Map<String, Integer> stdLayoutProjectQuestionAnswer = formatterElement.getLayoutPattern(new ProjectQuestionAnswer("", "", Date.valueOf("1900-01-01")));
    String stringSeparator = "";

     public Console(InputStream pInputStream) {
        locScanner = new Scanner(pInputStream);
    }

    public String read(){
        String inputType = "";
        while (inputType.equals("")) {
            inputType = locScanner.nextLine();
        }
        return inputType;
    }

    public void write(String prompt){
        System.out.println(prompt);
    }

    public void drawTable(StructureElement mainNode){
        int counter = 0;
        System.out.println(getStringSeparator());
        drawStructureElement(mainNode, counter, "0");
        System.out.println(getStringSeparator());
    }

    public void createStringSeparator(int width, String character){
        for (int i = 0; i < width; i++) {
            stringSeparator += character;
        }
    }

  /*  public String get(int width, String character){
        for (int i = 0; i < width; i++) {
            stringSeparator += character;
        }
    } */

    public String getStringSeparator(){
        return stringSeparator;
    }

    private String getTabIndent(int counter){
        String temp = "";
        for (int i = 0; i < counter; i++) {
            temp += "  ";
        }
        return temp;
    }

    public void clear(){
        System.out.flush();
    }
    private void drawStructureElement(StructureElement pNode, int pCounter, String structureCounter){
        int workPlaceOutputString;
        //if (pNode.getClass() == Node.class) {
            workPlaceOutputString = getStringSeparator().length() - 2;
            System.out.println("|" + String.format(" %1$-" + workPlaceOutputString + "s",getTabIndent(pCounter) + "*" + ((structureCounter == "0") ? "" : structureCounter + " ") + pNode.name) + "|");
            int locCounter = 0;
            ++pCounter;
            for (StructureElement lElem : pNode.getChild()){
                ++locCounter;
                System.out.println(getStringSeparator());
                drawStructureElement(lElem, pCounter, ((structureCounter == "0") ? "" : structureCounter + ".") + String.valueOf(locCounter));
            }
        //}  else {

        //}
    }

}
