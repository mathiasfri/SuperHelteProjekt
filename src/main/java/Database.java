import java.util.Scanner;

public class Database
{
    Scanner sc = new Scanner(System.in);

    private Superhero[] superheroes = new Superhero[5];

    public Database()
    {
        System.out.println("Velkommen til din SuperHelte database!");
        System.out.println("Menu - Vælg en valgmulighed");
        System.out.println("1. Opret en Superhelt\n9. Afslut");

        if (sc.nextInt() == 1)
        {
            // lav superhelt
        }
        if (sc.nextInt() == 9)
        {
            System.out.print("Du har nu afsluttet. Farvel");
        }
    }
}
