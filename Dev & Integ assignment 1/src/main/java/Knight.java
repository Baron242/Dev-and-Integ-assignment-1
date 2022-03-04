public abstract class Knight implements Enemy {
    @Override
    public Weapon weapon() {
        return new Sword();
    }

    @Override
    public abstract float challenge();
}
