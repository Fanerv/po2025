package animals;

public class Dog extends Animal{

    @Override
    public String GetDescription() {
        return "Dog";
    }

    @Override
    public void MakeSound() {
        System.out.println("woof woof");
    }

    public Dog(){
        legs =4;
        name = "Dog";
    }
}
