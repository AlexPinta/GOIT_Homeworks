package Lessons1.KickStarter.view;

import Lessons1.KickStarter.model.ProjectElement;
import Lessons1.KickStarter.model.projectElements.ProjectDescription;
import Lessons1.KickStarter.model.projectElements.ProjectHistory;
import Lessons1.KickStarter.model.projectElements.ProjectLink;
import Lessons1.KickStarter.model.projectElements.ProjectQuestionAnswer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 06.07.15
 * Time: 0:14
 * @version: 1.0
 */
public class ProjectElementFormatter {
    private Map<String, Integer> elementLayout;

    public void setLayout(Map<String, Integer> layout) {
        this.elementLayout = layout;
    }

     //description
     public Map<String, Integer> getLayoutPattern(ProjectDescription formatterElement) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("description",         20);
        temp.put("requirementAmount",   8);
        temp.put("balancedAmount",      8);
        temp.put("daysLeft",            3);

        return temp;
    }

    //history
    public Map<String, Integer> getLayoutPattern(ProjectHistory formatterElement) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("description",     25);
        temp.put("user",            20);
        temp.put("dateAdded",       8);

        return temp;
    }

    //link
    public Map<String, Integer> getLayoutPattern(ProjectLink formatterElement) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("description",     25);
        temp.put("link",            30);

        return temp;
    }

    //question answer
    public Map<String, Integer> getLayoutPattern(ProjectQuestionAnswer formatterElement) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("description",     25);
        temp.put("user",            20);
        temp.put("dateAdded",       8);

        return temp;
    }

}
