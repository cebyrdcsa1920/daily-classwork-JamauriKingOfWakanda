private String name;
    private final double weightPounds;

    public Monkey()
    {
        species = primate;
        color = Color.GREY;
        age = 8;
        legs = 2;
        name = "Buddy";
        weightPounds = 80;
    }
    public Pet(String species, Color color, int age, int legs, double weightPounds)
    {
        this.species = species;
        this.color = color;
        this.age = age;
        this.legs = legs;
        this.weightPounds = weightPounds;
        this.name = name;
    }
    public void walk(double distance)
}