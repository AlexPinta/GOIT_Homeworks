package Lessons1.KickStarter.model.projectElements;

import Lessons1.KickStarter.model.ProjectElement;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:57
 * @version: 1.0
 */
public class ProjectDescription extends ProjectElement {
    public String description;
    public double requirementAmount;
    public double balancedAmount;
    public int daysLeft;

    public ProjectDescription(String pDescription, double pRequirementAmount, double pBalancedAmount, int pDaysLeft) {
        description = pDescription;
        requirementAmount = pRequirementAmount;
        balancedAmount = pBalancedAmount;
        daysLeft = pDaysLeft;
    }


}
