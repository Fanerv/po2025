package animals;

public class Parrot extends Animal {
    public Parrot(){
        legs = 2;
        name = "Parrot";
    }

    @Override
    public String GetDescription() {
        return "Parrot";
    }

    @Override
    public void MakeSound() {
        System.out.println("Dzień dobry jestem papużką, któa mówi :D");
    }
}
