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

    public void searchSuperHeroes()
    {
        boolean found = false;
        for (Superhero superhero : superheroes)
        {
            if (superhero.getHeroName().equals(Main.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af heltenavn: \n" + superhero);
                found = true;
            }
            else if (superhero.getRealName().equals(Main.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af rigtige navn: \n" + superhero);
                found = true;
            }
            else if (superhero.getSuperpower().equals(Main.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af superkraft: \n" + superhero);
                found = true;
            }
            else if (Integer.toString(superhero.getAge()).equals(Main.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af alder: \n" + superhero);
                found = true;
            }
            else if (!found)
            {
                System.out.println("Superhelt ikke fundet ved søgekriterie: " + Main.superheroSearch);
            }
        }
    }
}
