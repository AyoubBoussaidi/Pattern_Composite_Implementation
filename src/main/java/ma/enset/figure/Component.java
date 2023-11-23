package ma.enset.figure;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();

    public String getName() {
        return name;
    }
}
