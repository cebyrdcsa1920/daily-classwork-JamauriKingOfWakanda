private String name;
    private final double weightPounds

    public Dog()
    {
        species = canine;
        color = Color.WHITE;
        age = 15;
        legs = 4;
        name = "Kai";
        weightPounds = 145;
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