public class Knight extends Enemy{

    private String ability;
    private String[] abilities = {"Rage","Immortality","High Attack Speed"};

    public Knight()
    {

    }
    // liczby od 1 do a odpowaidaja umiejetnosciom w kolejnosci (w tej f-kcji indeksujemy od 1)
    public void setAbility(int a)
    {
        if (a<=abilities.length)
        {
            this.ability = abilities[a-1];
        }
        else
            {
            this.ability = null;
            }
    }

    public String getAbility()
    {
        return ability;
    }

}
