private String name;
    private final double weightPounds;

    public Ostrich()
    {
        species = struthionidae;
        color = Color.BLACK;
        age = 10;
        legs = 2;
        name = "Lil Tecca";
        weightPounds = 220;
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