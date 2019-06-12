package enemies;

abstract public class Enemy {

    private int hp, armor,attack;
    private String name;

    abstract public String getAbility();

    abstract public void setAbility(int a);

    // HP
    public void setHp(int hp)
    {
        this.hp=hp;
    }

    public int getHp()
    {
        return hp;
    }
    // ARMOR
    public void setArmor(int armor)
    {
        this.armor=armor;
    }

    public int getArmor()
    {
        return armor;
    }
    // ATTACK
    public void setAttack(int attack)
    {
        this.attack=attack;
    }

    public int getAttack()
    {
        return attack;
    }
}
