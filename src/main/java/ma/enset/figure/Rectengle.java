package ma.enset.figure;

public class Rectengle extends Component {
    double x,y;

    public Rectengle(String name) {
       super(name);
    }

    @Override
    public void operation() {
        //System.out.println("Operation sur un rectangle");
        System.out.println("I'm a rectangle starts form : x->"+x+", y->"+y);
    }
}
