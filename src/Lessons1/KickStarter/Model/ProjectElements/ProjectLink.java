package Lessons1.KickStarter.model.projectElements;

import Lessons1.KickStarter.model.ProjectElement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:57
 * @version: 1.0
 */
public class ProjectLink extends ProjectElement {
    private ArrayList<DataElement> dataArrayList = new ArrayList<DataElement>();

    public ProjectLink(String pDescription, String pLink) {
        dataArrayList.add(new DataElement(pDescription, pLink));
    }

    public class DataElement {
        public String description;
        public String link;

        DataElement(String pDescription, String pLink) {
            description = pDescription;
            link = pLink;
        }
    }
}