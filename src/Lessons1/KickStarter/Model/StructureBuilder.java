package Lessons1.KickStarter.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 05.07.15
 * Time: 23:56
 * @version: 1.0
 */
public class StructureBuilder {
    public boolean loadDataInProject(Project pProject, ProjectElement pProjectElement){
        if (pProject == null) {
            return false;
        }
        pProject.getChild().add(pProjectElement);
        return true;
    }

    public boolean addStructureElementChild(Node parent, StructureElement pStructureElement){
        if (parent == null) {
            return false;
        }
        parent.getChild().add(pStructureElement);
        return true;
    }

}
