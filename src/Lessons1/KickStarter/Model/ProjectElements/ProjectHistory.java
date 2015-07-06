package Lessons1.KickStarter.model.projectElements;

import Lessons1.KickStarter.model.ProjectElement;

import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:57
 * @version: 1.0
 */
public class ProjectHistory extends ProjectElement {
    private List<DataElement> dataArrayList = new ArrayList<DataElement>();

    public ProjectHistory(String pDescription, String pUser, Date pDateAdded) {
        dataArrayList.add(new DataElement(pDescription, pUser, pDateAdded));
    }


    class DataElement {
        String description;
        String user;
        Date dateAdded;

        DataElement(String pDescription, String pUser, Date pDateAdded) {
            description = pDescription;
            user = pUser;
            dateAdded = pDateAdded;
        }
    }
}