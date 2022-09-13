import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    static Database db = new Database();
    static int menuInput;

    public static void main(String[] args)
    {
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("Velkommen til din SuperHelte database!");
            System.out.println("Menu - Vælg en valgmulighed");
            System.out.println("""
                    1. Opret en Superhelt
                    2. Se liste over superhelte
                    9. Afslut
                    """);

            int menuInput = sc.nextInt();

            if (menuInput == 1) {
                System.out.println("Hvad skal din superhelts heltenavn være?");
                String heroName = sc.next();

                System.out.println("Hvad er din superhelts rigtige navn?");
                String realName = sc.next();
                sc.nextLine();

                System.out.println("Hvad er din superhelts superkraft?");
                String superpower = sc.next();

                System.out.println("Hvad er din superhelts alder?");
                int age = sc.nextInt();

                db.addSuperhero(heroName, realName, superpower, age);
            }

            if (menuInput == 9) {
                System.out.print("Du har nu afsluttet. Farvel");
                System.exit(0);
            }
        }while (menuInput != 9);
    }
}
