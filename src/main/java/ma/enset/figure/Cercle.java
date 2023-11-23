package ma.enset.figure;

public class Cercle extends Component {
    double x,y;
    double r;
    @Override
    public void operation() {
        //System.out.println("Operation sur Une Cercle");
        System.out.println("Im a cercle, My Properties: x="+x+", y="+y+", r="+r);
    }

    public Cercle(String name,double x, double y, double r) {
        super(name);
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
