import org.junit.jupiter.api.BeforeEach;

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
}