package Strategy;

public class TornadoKick implements KickBehavior{
    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
}
