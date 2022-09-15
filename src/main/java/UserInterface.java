import java.util.Scanner;

public class UserInterface
{
    static Scanner sc = new Scanner(System.in);
    static Database db = new Database();
    static int menuInput;
    static String superheroSearch;

    public void startProgram()
    {
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("Velkommen til din SuperHelte database!");
            System.out.println("Menu - Vælg en valgmulighed");
            System.out.println("""
                    1. Opret en Superhelt
                    2. Se liste over superhelte
                    3. Søg efter superhelt
                    9. Afslut
                    """);

            int menuInput = Integer.parseInt(sc.nextLine());

            if (menuInput == 1)
            {
                System.out.println("Hvad skal din superhelts heltenavn være?");
                String heroName = sc.nextLine();

                System.out.println("Hvad er din superhelts rigtige navn?");
                String realName = sc.nextLine();

                System.out.println("Hvad er din superhelts superkraft?");
                String superpower = sc.nextLine();

                System.out.println("Hvad er din superhelts alder?");
                int age = Integer.parseInt(sc.nextLine());

                db.addSuperhero(heroName, realName, superpower, age);
            }

            else if (menuInput == 2)
            {
                System.out.println("Liste over dine superhelte:\n");
                db.listSuperHeroes();
            }
            else if (menuInput == 3)
            {
                System.out.println("Skriv dit søgekriterie for din superhelt: ");
                superheroSearch = sc.nextLine();
                db.searchSuperHeroes();
            }
            else if (menuInput == 9)
            {
                System.out.print("Du har nu afsluttet. Farvel");
                System.exit(0);
            }
        } while (menuInput != 9);
    }
}
