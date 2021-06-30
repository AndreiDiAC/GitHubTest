package Dog;

public class Dog extends Animal {
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        getAgeInHumanYears();
    }

    @Override
    public void getAgeInHumanYears() {

    }

    @Override
    public String toString() {
        return "string";
    }

    //I added this


    //Andreea added this


    public boolean equals(Dog dog){
        return true;

    }
}
