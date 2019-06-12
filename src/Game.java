import enemies.Enemy;
import enemies.Knight;

import java.util.Scanner;

public class Game {
    public static void main (String[] args) throws Exception
    {
        int amount;         //zmiena przetrzymująca ilosc postaci do wygenerowania
        System.out.print("Podaj liczbe przeciwnikow: ");
        Scanner scan = new Scanner(System.in);
        amount = scan.nextInt();
        Enemy[] k= new Knight[amount];             // tablica obiektow postaci
        SaveToTXT save1 = new SaveToTXT();
        save1.makeFile("Knight");           //tworzenie pliku txt

       for (int i=0; i<k.length;i++)
        {
            k[i]=new Knight();
            k[i].setHp(Randomizer.randomizer_fromto(50 ,1000));       //wartosci losowe od:.. do:..
            k[i].setArmor(Randomizer.randomizer_fromto(0,100));
            k[i].setAttack(Randomizer.randomizer_fromto(10 , 300));
            k[i].setAbility(Randomizer.randomizer_fromto(1 ,3));

            save1.saveLane("Knight: " + i);
            save1.saveLane("HP: " + k[i].getHp() + " Armor: " + k[i].getArmor() + " Attack: " + k[i].getAttack() + " Ability: " + k[i].getAbility());

        }
       save1.getFilewriter().close();
    }
}
