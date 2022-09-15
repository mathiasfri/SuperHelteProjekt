import java.util.ArrayList;
import java.util.Scanner;

public class Database
{
    private ArrayList<Superhero> superheroes = new ArrayList();

    public void addSuperhero(String heroName, String realName, String superpower, int age)
    {
        superheroes.add(new Superhero(heroName, realName, superpower, age));
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
            if (superhero.getHeroName().contains(UserInterface.superheroSearch))
            {
                ArrayList<Superhero> sortedArray = new ArrayList<>();
                int i = 1;

                if (superhero.getHeroName().contains(UserInterface.superheroSearch))
                {
                    sortedArray.add(superhero);
                }
                for (Superhero sa : superheroes)
                {
                    System.out.println(i++ + ": \n" + sa);
                }
                found = true;
            }
            else if (superhero.getRealName().contains(UserInterface.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af rigtige navn: \n" + superhero + "\n");
                found = true;
            }
            else if (superhero.getSuperpower().contains(UserInterface.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af superkraft: \n" + superhero + "\n");
                found = true;
            }
            else if (Integer.toString(superhero.getAge()).contains(UserInterface.superheroSearch))
            {
                System.out.println("Superhelt fundet ved hjælp af alder: \n" + superhero + "\n");
                found = true;
            }
            else if (!found)
            {
                System.out.println("Superhelt ikke fundet ved søgekriterie: " + UserInterface.superheroSearch + "\n");
            }
        }
    }
}
