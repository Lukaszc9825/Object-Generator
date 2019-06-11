import java.util.Random;

public class Randomizer {


    public Randomizer()
    {
    }
    // Losuje liczbe z przedzialu 0 do i
    public static int randomizer_fromto (int f, int t)
    {
        Random generator = new Random();
        return generator.nextInt(t-f+1)+f;
    }

}
