import java.awt.Color;

public class Pet
{
    private String species;
    private Color color;
    private int age;
    private int legs;
    private String name;
    private final double weightTons;

    public Pet()
    {
        species = "T-Rex";
        color = Color.RED;
        age = 15;
        legs = 2;
        name = "Robert"
        weightTons = 9.1;
    }
    public Pet(String species, Color color, int age, imy legs, double weightTons)
    {
        this.species = species;
        this.color = color;
        this.age = age;
        this.legs = legs;
        this.weightTons = weightTons;
        this.name = name;
    }
    public void walk(double distance)
}