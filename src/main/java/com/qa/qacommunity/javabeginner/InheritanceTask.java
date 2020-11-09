package com.qa.qacommunity.javabeginner;

public class InheritanceTask
{
    public static void start()
    {
        System.out.println("Start of Inheritance Task");
        createAnimal();
        createMammal();
        createBird();
        createAmphibian();
        System.out.println("End of Inheritance Task");
    }

    private static void createAnimal()
    {
        System.out.println("--- Animal Parent Class ---");
        Animal animal = new Animal(20, Animal.ClassificationType.MAMMAL, "roar", Animal.MovementType.TERRESTRIAL);
        System.out.println("Age: " + animal.getAge());
        System.out.println("Classification: " + animal.getClassification());
        System.out.println("Movement Type: " + animal.getMovementBase());
        System.out.println("Sound: " + animal.getSound());

        animal.move();
        animal.makeSound();
    }

    private static void createMammal()
    {
        System.out.println("--- Mammal Child Class ---");
        Mammal mammal = new Mammal(16, "Moo", "Cow");
        System.out.println("Age: " + mammal.getAge());
        System.out.println("Classification: " + mammal.getClassification());
        System.out.println("Species: " + mammal.getSpecies());
        System.out.println("Movement Type: " + mammal.getMovementBase());
        System.out.println("Sound: " + mammal.getSound());

        mammal.move();
        mammal.makeSound();
    }

    private static void createBird()
    {
        System.out.println("--- Bird Child Class ---");
        Bird bird = new Bird(57, "Squawk", "Parrot");
        System.out.println("Age: " + bird.getAge());
        System.out.println("Classification: " + bird.getClassification());
        System.out.println("Species: " + bird.getSpecies());
        System.out.println("Movement Type: " + bird.getMovementBase());
        System.out.println("Sound: " + bird.getSound());

        bird.move();
        bird.makeSound();
    }

    private static void createAmphibian()
    {
        System.out.println("--- Amphibian Child Class ---");
        Amphibian amphibian = new Amphibian(3, "Croak", "Toad");
        System.out.println("Age: " + amphibian.getAge());
        System.out.println("Classification: " + amphibian.getClassification());
        System.out.println("Species: " + amphibian.getSpecies());
        System.out.println("Movement Type: " + amphibian.getMovementBase());
        System.out.println("Sound: " + amphibian.getSound());

        amphibian.move();
        amphibian.makeSound();
    }
}

class Animal
{
    private int age;
    private ClassificationType classification;
    private String sound;
    private MovementType movement;

    protected enum MovementType
    {
        TERRESTRIAL, AQUATIC, AERIAL
    }

    protected enum ClassificationType
    {
        MAMMAL, BIRD, AMPHIBIAN
    }

    public Animal(int age, ClassificationType classification, String sound, MovementType movementType)
    {
        this.age = age;
        this.classification = classification;
        this.sound = sound;
        this.movement = movementType;
    }

    public void makeSound()
    {
        System.out.printf("The %s started to %s.\n", classification, sound);
    }

    public void move()
    {
        System.out.printf("The %s began to %s.\n", classification, getMovementType());
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getClassification()
    {
        return classification.toString();
    }

    public String getSound()
    {
        return sound;
    }

    public String getMovementType()
    {
        switch (movement)
        {
            case AERIAL -> {return "Fly";}
            case AQUATIC -> {return "Swim";}
            case TERRESTRIAL -> {return "Walk";}
            default -> {return "Move";}
        }
    }

    public String getMovementBase()
    {
        return movement.toString();
    }
}

class Mammal extends Animal
{
    private String species;

    public Mammal(int age, String sound, String species)
    {
        super(age, ClassificationType.MAMMAL, sound, MovementType.TERRESTRIAL);
        this.species = species;
    }

    @Override
    public void move()
    {
        System.out.printf("The %s began to %s.\n", species, getMovementType());
    }

    @Override
    public void makeSound()
    {
        System.out.printf("The %s started to %s.\n", species, getSound());
    }

    public String getSpecies()
    {
        return species;
    }

}

class Bird extends Animal
{
    private String species;

    public Bird(int age, String sound, String species)
    {
        super(age, ClassificationType.BIRD, sound, MovementType.AERIAL);
        this.species = species;
    }

    @Override
    public void move()
    {
        System.out.printf("The %s began to %s.\n", species, getMovementType());
    }

    @Override
    public void makeSound()
    {
        System.out.printf("The %s started to %s.\n", species, getSound());
    }

    public String getSpecies()
    {
        return species;
    }
}

class Amphibian extends Animal
{
    private String species;

    public Amphibian(int age, String sound, String species)
    {
        super(age, ClassificationType.AMPHIBIAN, sound, MovementType.AQUATIC);
        this.species = species;
    }

    @Override
    public void move()
    {
        System.out.printf("The %s began to %s.\n", species, getMovementType());
    }

    @Override
    public void makeSound()
    {
        System.out.printf("The %s started to %s.\n", species, getSound());
    }

    public String getSpecies()
    {
        return species;
    }
}
