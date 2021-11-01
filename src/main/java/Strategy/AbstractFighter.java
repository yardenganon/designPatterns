package Strategy;

public abstract class AbstractFighter {
    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    public AbstractFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpBehavior;
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public void punch() {
        System.out.println("Default punch");
    }

    public void roll() {
        System.out.println("Default roll");
    }

    public void kick() {
        this.kickBehavior.kick();
    }

    public void jump() {
        this.jumpBehavior.jump();
    }

    public abstract void display();
}
