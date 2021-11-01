package Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        KickBehavior lightningKick = new LightningKick();
        AbstractFighter Rayman = new Rayman();
        AbstractFighter Rocky = new Rocky(new TornadoKick(), new ShortJump());

        Rayman.kick();
        Rayman.jump();
        Rocky.kick();
        Rocky.jump();
        Rocky.setKickBehavior(lightningKick);
        Rocky.kick();
    }
}
