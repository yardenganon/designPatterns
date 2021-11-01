package Strategy;

public class Rayman extends AbstractFighter{
    public Rayman() {
        super(new LightningKick(), new LongJump());
    }

    @Override
    public void display() {
        System.out.println("Rayman");
    }
}
