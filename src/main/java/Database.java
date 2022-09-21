import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    public ArrayList<Superhero> superheroes = new ArrayList();
    public ArrayList<Superhero> sortedArray = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

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
        for (Superhero superhero : superheroes) {
            if (superhero.getHeroName().contains(UserInterface.superheroSearch))
            {
                int i = 1;
                sortedArray.add(superhero);

                for (Superhero sa : superheroes) {
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

    public void editSuperhero()
    {
        int i = 1;

        for (Superhero superhero : superheroes)
        {
            if (superhero.getHeroName().contains(UserInterface.superheroSearch))
            {
                sortedArray.add(superhero);
            }

            else
            {
                System.out.println("Der findes ingen superhelte i databasen med dette navn.");
            }
        }

        for (Superhero sa : sortedArray)
        {
            System.out.println(i++ + ": \n" + sa);
        }

        System.out.println("Skriv nummeret på den superhelt du vil redigere: \n");
        // inkluderer scanner, da metoden ville blive kørt uden at have informationer og dermed give fejl.
        String editNumber = Integer.toString(sc.nextInt());
        Superhero superHeroEdit = sortedArray.get(Integer.parseInt(editNumber) - 1);
        System.out.println("Redigerer følgende superhelt: \n\n" + superHeroEdit);
        System.out.println("Skriv ny information og tryk ENTER. Hvis du ikke vil redigere, tryk ENTER.");
        sc.nextLine();

        boolean tryAgain = true;

        while (tryAgain)
        {
            try
            {
                System.out.print("Nyt superheltenavn: ");
                String newName = sc.nextLine();
                if (!newName.isEmpty())
                {
                    superHeroEdit.setHeroName(newName);
                }

                System.out.print("Det nye rigtige navn på din superhelt: ");
                String newRealName = sc.nextLine();
                if (!newRealName.isEmpty())
                {
                    superHeroEdit.setRealName(newRealName);
                }

                System.out.print("Ny superhelt superkraft: ");
                String newSuperpower = sc.nextLine();
                if (!newSuperpower.isEmpty())
                {
                    superHeroEdit.setSuperpower(newSuperpower);
                }

                System.out.print("Nye alder på superhelt: ");
                String newAge = sc.nextLine();
                if (!newAge.isEmpty())
                {
                    superHeroEdit.setAge(Integer.parseInt(newAge));
                }
                tryAgain = false;
            }
            catch (Exception e)
            {
                System.out.println("Du fik indtastet en forkert variabel. Start venligst forfra.\n");
            }
        }
    }

    public String findSuperhero(String heroname)
    {
        for (Superhero s : superheroes)
        {
            if (s.getHeroName().contains(heroname))
            {
                return heroname;
            }
        }
        return null;
    }

    public String findMultipleSuperheroes(String heroname)
    {
        for (Superhero s : superheroes)
        {
            if (s.getHeroName().contains(heroname))
            {
                if (superheroes.size() > 1)
                {
                    return heroname;
                }
            }
        }
        return null;
    }
}