package ma.enset.figure;

import java.util.ArrayList;
import java.util.List;

public class Figure extends Component {
    List<Component> componentList =new ArrayList<>();
    public Figure(String name) {
        super(name);
    }
    @Override
    public void operation() {
        System.out.println("Operation sur une Figure "+getName());
        for (Component c: componentList) {
            c.operation();
            System.out.println(c.getName());
            if (c.getName().contains("figure")){
                c.operation();
            }
        }
    }
    public void add(Component component){
        componentList.add(component);
    }
    public  void remove(Component component){
        componentList.remove(component);
    }
    public List<Component> getComponantList() {
        return componentList;
    }
}
