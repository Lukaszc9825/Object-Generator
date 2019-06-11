public class Enemy {

    private int hp, armor,attack;
    private String name;

    public Enemy()
    {

    }
    // HP
    protected void setHp(int hp)
    {
        this.hp=hp;
    }

    protected int getHp()
    {
        return hp;
    }
    // ARMOR
    protected void setArmor(int armor)
    {
        this.armor=armor;
    }

    protected int getArmor()
    {
        return armor;
    }
    // ATTACK
    protected void setAttack(int attack)
    {
        this.attack=attack;
    }

    protected int getAttack()
    {
        return attack;
    }
}
