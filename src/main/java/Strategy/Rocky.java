package Strategy;

public class Rocky extends AbstractFighter{
    public Rocky(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Rocky");
    }
}
