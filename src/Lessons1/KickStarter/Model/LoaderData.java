package Lessons1.KickStarter.Model;

import Lessons1.KickStarter.Model.ProjectElements.ProjectDescription;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 7:36
 * @version: 1.0
 */
public class LoaderData {

    public void loadDataWebSite(){
        Node mainNode = new Node("List of category",    Node.NodesType.MAIN);
        mainNode.addElement(new Node("Education",       Node.NodesType.CATEGORY));
        mainNode.addElement(new Node("Games",           Node.NodesType.CATEGORY));
        mainNode.addElement(new Node("Software",        Node.NodesType.CATEGORY));

        Project locProject;
        ProjectElement locProjectElement;
        locProject = new Project("Project math for school");
        locProjectElement = new ProjectDescription("Project for pupils 9-10 class", 100, 80, 31);
        locProject.loadDataProjectElement();
        ((Node)mainNode.getChild().get(0)).addElement(locProject);

        locProject = new Project("Project english for school");
        ((Node)mainNode.getChild().get(0)).addElement(locProject);

        locProject = new Project("Project chemistry for school");
        ((Node)mainNode.getChild().get(0)).addElement(locProject);

        locProject = new Project("Worms");
        ((Node)mainNode.getChild().get(1)).addElement(locProject);

        locProject = new Project("Balda");
        ((Node)mainNode.getChild().get(1)).addElement(locProject);

        locProject = new Project("Puzzles");
        ((Node)mainNode.getChild().get(1)).addElement(locProject);

    }
}
