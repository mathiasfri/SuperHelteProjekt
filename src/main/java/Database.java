import java.util.ArrayList;
import java.util.Scanner;

public class Database
{
    private ArrayList<Superhero> superheroes = new ArrayList();


    public void addSuperhero(String heroName, String realName, String superpower, int age)
    {
        Superhero superheroes = new Superhero(heroName, realName, superpower, age);
    }
}
