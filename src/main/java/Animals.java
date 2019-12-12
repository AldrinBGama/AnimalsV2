
public class Animals {

    private String name;

    public  Animals() {
        // This a default constructor.
    }

    public void setName (String name) {
        this.name = name;
    }



    public String sounds () {
        return ("Sounds...");
    }

    public String eats () {
        return (name +" "+"eats "+"Food");
    }
}
