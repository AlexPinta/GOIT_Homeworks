package Lessons1.KickStarter.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:42
 * @version: 1.0
 */

public class Node extends StructureElement {
//    public enum NodesType{
//        MAIN, CATEGORY;
//    }
//    private NodesType nodeType;
    private List<StructureElement> nodeArrayList = new ArrayList<StructureElement>();

    public Node(String pName) {
        name = pName;
    }

    @Override
    public List<StructureElement> getChild() {
        return nodeArrayList;
    }

    public String getName() {
        return name;
    }
}
