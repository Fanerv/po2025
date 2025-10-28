package animals;

public class Snake extends Animal {
    @Override
    public String GetDescription() {
        return "SSSnake";
    }

    @Override
    public void MakeSound() {
        System.out.println("sssssssssssssssssssysysy");
    }

    public Snake() {
        name = "Snake";
        legs = 0;
    }
}
