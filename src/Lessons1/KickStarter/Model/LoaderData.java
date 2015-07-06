package Lessons1.KickStarter.model;

import Lessons1.KickStarter.model.projectElements.ProjectDescription;
import Lessons1.KickStarter.model.projectElements.ProjectHistory;
import Lessons1.KickStarter.model.projectElements.ProjectLink;
import Lessons1.KickStarter.model.projectElements.ProjectQuestionAnswer;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 7:36
 * @version: 1.0
 */
public class LoaderData {

    public Node loadDataWebSite(){
        StructureBuilder treeCreator = new StructureBuilder();
        int structureCounter = 0;
        Node mainNode = new Node("List of category");
        treeCreator.addStructureElementChild(mainNode, new Node("Education"));
        treeCreator.addStructureElementChild(mainNode, new Node("Games"));
        treeCreator.addStructureElementChild(mainNode, new Node("Software"));

        ProjectElement projectComponent;
        Project projectContainer = new Project("Project math for school");
        projectComponent = new ProjectDescription("Project for pupils 9-10 class", 100, 80, 31);
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectHistory("We create new feature - online check your test", "Developer", Date.valueOf("2014-05-10"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectLink("Demo version", "http://");
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectQuestionAnswer("How long are u going to develop this project?", "Ivanov", Date.valueOf("2014-01-15"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectQuestionAnswer("During 3 month", "Moderator", Date.valueOf("2014-01-16"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        treeCreator.addStructureElementChild((Node)mainNode.getChild().get(structureCounter), projectContainer);

        projectContainer = new Project("Project english for school");
        projectComponent = new ProjectDescription("Do you speak english? Let's study together!!!", 1000, 756, 45);
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectHistory("We finish case test! We start production as soon as possible", "Developer", Date.valueOf("2014-05-10"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectLink("Demo version", "http://");
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectQuestionAnswer("Oh buddy it's good idea. I'm looking for similar project for pupils 2-3 class. Is it interesting for you?"
                                                      ,"Teacher", Date.valueOf("2014-03-22"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectQuestionAnswer("Yes, send me your contact on offer@kickstarter.com", "Moderator", Date.valueOf("2014-01-16"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        treeCreator.addStructureElementChild((Node)mainNode.getChild().get(structureCounter), projectContainer);

        projectContainer = new Project("Project chemistry for school");
        treeCreator.addStructureElementChild((Node)mainNode.getChild().get(structureCounter), projectContainer);

        ++structureCounter;

        projectContainer = new Project("Worms");
        projectComponent = new ProjectDescription("WORMS!!! WORMS!!! WORMS!!! Challenge everybody.", 5505, 5505, 1);
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectHistory("We decided to realized worms in 3D", "Developer", Date.valueOf("2014-05-10"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectLink("Demo version", "http://");
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectQuestionAnswer("Will be there opportunity of multi and single player?", "Gamer Vasya", Date.valueOf("2014-07-25"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        projectComponent = new ProjectQuestionAnswer("Yeah, either we are going to start championship!!! And it will be soon.", "Moderator", Date.valueOf("2014-01-07"));
        treeCreator.loadDataInProject(projectContainer, projectComponent);
        treeCreator.addStructureElementChild((Node)mainNode.getChild().get(structureCounter), projectContainer);

        projectContainer = new Project("Balda");
        treeCreator.addStructureElementChild((Node)mainNode.getChild().get(structureCounter), projectContainer);

        projectContainer = new Project("Puzzles");
        treeCreator.addStructureElementChild((Node)mainNode.getChild().get(structureCounter), projectContainer);

        return mainNode;
    }
}
