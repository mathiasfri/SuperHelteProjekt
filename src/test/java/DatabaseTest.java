import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest
{
    Database d;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        d = new Database();
    }

    @org.junit.jupiter.api.Test
    void addSuperhero()
    {
        // Arrange
        d.addSuperhero("Superman", "Klark Kent", "strong, fly, laser-eyes", 25);

        // Act
        int expectedDatabaseSize = 1;
        int actualDatabaseSize = d.superheroes.size();

        // Assert
        assertEquals(expectedDatabaseSize, actualDatabaseSize);
    }

    @org.junit.jupiter.api.Test
    void addMultipleSuperheroes()
    {
        // Arrange
        d.addSuperhero("Superman", "Klark Kent", "strong, fly, laser-eyes", 25);
        d.addSuperhero("Spiderman", "Peter Parker", "Spider powers", 16);

        // Act
        int expectedDatabaseSize = 2;
        int actualDatabaseSize = d.superheroes.size();

        // Assert
        assertEquals(expectedDatabaseSize, actualDatabaseSize);
    }

    @org.junit.jupiter.api.Test
    void searchSuperHeroes()
    {
        // Arrange
        d.addSuperhero("Superman", "Klark Kent", "strong, fly, laser-eyes", 25);

        // Act
        String expectedDatabaseName = "Superman";
        String actualDatabaseName = d.findSuperhero("Superman");

        // Assert
        assertEquals(expectedDatabaseName, actualDatabaseName);
    }

    @org.junit.jupiter.api.Test
    void searchZeroSuperHeroes()
    {
        // Arrange

        // Act
        String actualDatabaseName = d.findSuperhero("Superman");

        // Assert
        assertEquals(null, actualDatabaseName);
    }

    @org.junit.jupiter.api.Test
    void searchMultipleSuperHeroes()
    {
        // Arrange
        d.addSuperhero("Superman", "Klark Kent", "strong, fly, laser-eyes", 25);
        d.addSuperhero("Spiderman", "Peter Parker", "Spider powers", 16);

        // Act
        String expectedDatabaseName = "Superman";
        String actualDatabaseName = d.findMultipleSuperheroes("Superman");

        // Assert
        assertEquals(expectedDatabaseName, actualDatabaseName);
    }
}