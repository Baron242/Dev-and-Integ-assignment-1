//implements Enemy
public abstract class Dragon implements Enemy {
    @Override
    public Weapon weapon() {
        return new FireBreath();
    }

    @Override
    public abstract float challenge();
}
