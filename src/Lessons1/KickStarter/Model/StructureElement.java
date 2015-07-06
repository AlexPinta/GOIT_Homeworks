package Lessons1.KickStarter.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:16
 * @version: 1.0
 */
public abstract class StructureElement {
    public String name;
    public abstract List<StructureElement> getChild();
}
