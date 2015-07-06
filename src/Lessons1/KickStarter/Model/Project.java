package Lessons1.KickStarter.model;

import Lessons1.KickStarter.model.projectElements.ProjectDescription;
import Lessons1.KickStarter.model.projectElements.ProjectHistory;
import Lessons1.KickStarter.model.projectElements.ProjectLink;
import Lessons1.KickStarter.model.projectElements.ProjectQuestionAnswer;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:18
 * @version: 1.0
 */
public class Project extends StructureElement {
    public List<ProjectElement> projectElement = new ArrayList<ProjectElement>();
//    private HashMap<Class, TypeProjectElements> internalMapping = new HashMap<Class, TypeProjectElements>();

    public Project(String pName) {
        name = pName;
//        for (TypeProjectElements locElements : TypeProjectElements.values()){
//            projectElementEnumMap.put(locElements, null);
//        }
    }

    @Override
    public List<StructureElement> getChild() {
        ArrayList<StructureElement> resultArray = new ArrayList<StructureElement>();
        resultArray.addAll(projectElement);
        return resultArray;
    }
}
