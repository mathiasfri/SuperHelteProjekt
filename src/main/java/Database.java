import java.util.ArrayList;
import java.util.Scanner;

public class Database
{
    private ArrayList<Superhero> superheroes = new ArrayList();

    public void addSuperhero(String heroName, String realName, String superpower, int age)
    {
        Superhero s1 = new Superhero(heroName, realName, superpower, age);
        superheroes.add(s1);
    }

    public void listSuperHeroes()
    {
        for (Superhero superhero : superheroes)
        {
            System.out.println(superhero);
        }

    }
}
