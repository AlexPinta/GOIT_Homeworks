package Lessons1.KickStarter.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Alex_Pinta
 * Date: 02.07.15
 * Time: 5:25
 * @version: 1.0
 */
public abstract class ProjectElement extends StructureElement{
//    public HashMap<String, Integer> getLayout() throws InstantiationException;
//    public void setLayout(HashMap<String, Integer> layout);
//    public HashMap<String, Integer> getLayoutPattern();

    @Override
    public List<StructureElement> getChild(){
        return new ArrayList<StructureElement>(0);
    };

}
