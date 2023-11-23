package ma.enset;

import ma.enset.figure.Cercle;
import ma.enset.figure.Figure;
import ma.enset.figure.Rectengle;

public class Main {
    public static void main(String[] args) {
        Figure figure1=new Figure("figure1");
        figure1.add(new Cercle("cercle",1,2,4));
        figure1.add(new Rectengle("Rectangle1"));
        Figure figure2 =new Figure("figure2");
        figure2.add(new Cercle("cercle2",1,3,5));
        figure2.add(new Rectengle("Rectangle2"));
        Figure figure3=new Figure("Figure3");
        figure3.add(new Rectengle("Rectangle3"));
        figure2.add(figure3);
        figure1.add(figure2);
        figure1.operation();
    }
}