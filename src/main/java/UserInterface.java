import java.util.Scanner;

public class UserInterface
{
    static Scanner sc = new Scanner(System.in);
    static Database db = new Database();
    int menuInput;
    static String superheroSearch;
    static int removeNumber;

    public void startProgram()
    {
        while(menuInput != 9)
        {
            System.out.println("---------------------------------------------------");
            System.out.println("Velkommen til din SuperHelte database!");
            System.out.println("Menu - Vælg en valgmulighed");
            System.out.println("""
                    1. Opret en Superhelt
                    2. Se liste over superhelte
                    3. Søg efter superhelt
                    4. Redigér superhelt
                    5. Fjern superhelt fra database
                    9. Afslut
                    """);

            try {
                menuInput = Integer.parseInt(sc.nextLine());

                switch (menuInput) {
                    case 1:
                        boolean tryAgain = true;
                        while (tryAgain) {
                            try {
                                System.out.println("Hvad skal din superhelts heltenavn være?");
                                String heroName = sc.nextLine();

                                System.out.println("Hvad er din superhelts rigtige navn?");
                                String realName = sc.nextLine();

                                System.out.println("Hvad er din superhelts superkraft?");
                                String superpower = sc.nextLine();

                                System.out.println("Hvad er din superhelts alder?");
                                int age = Integer.parseInt(sc.nextLine());

                                db.addSuperhero(heroName, realName, superpower, age);
                                tryAgain = false;
                            } catch (Exception e) {
                                System.out.println("Du fik indtastet en forkert variabel. Start venligst forfra.\n");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Liste over dine superhelte:\n");
                        db.listSuperHeroes();
                        break;

                    case 3:
                        System.out.println("Skriv dit søgekriterie for din superhelt: ");
                        superheroSearch = sc.nextLine();
                        db.searchSuperHeroes();
                        break;

                    case 4:
                        System.out.println("Skriv superheltenavnet for den superhelt, som du vil redigere: ");
                        superheroSearch = sc.nextLine();
                        db.editSuperhero();
                        System.out.println("Redigering gennemført.\n");
                        break;

                    case 5:
                        System.out.println("Fjern en superhelt fra din database: \n");
                        db.listSuperHeroes();
                        System.out.print("Skriv nummeret på den superhelt, som du gerne vil fjerne fra databasen: ");
                        removeNumber = Integer.parseInt(sc.nextLine());
                        db.removeSuperhero();
                        break;

                    case 9:
                        System.out.print("Du har nu afsluttet. Farvel");
                        System.exit(0);
                }
            }
            catch(Exception e)
            {
                System.out.println("Du har fået indtastet en forkert variabel. Prøv venligst igen.");
            }
        }
    }
}
