package enemies;

public class Knight extends Enemy {

    private String ability;
    private String[] abilities = {"Rage","Immortality","High Attack Speed"};

    public Knight()
    {

    }
    // liczby od 1 do a odpowaidaja umiejetnosciom w kolejnosci (w tej f-kcji indeksujemy od 1)

    @Override
    public void setAbility(int a)
    {
        if (a<=abilities.length)
        {
            this.ability = abilities[a-1];
        }
        else
            {
                System.out.println("Wrong parameter of ability, please give value from 1 to "+ abilities.length);
            setAbility(a);
            }
    }

    public String getAbility()
    {
        return ability;
    }

}
