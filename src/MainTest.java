import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Beer beer;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        beer = new Beer();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    @DisplayName("Testing drinking voll Glass...")
    void allesTrinken() {

        beer.trinken(40);
        beer.nachFuellen(500);
        assertEquals (250, beer.mengeImGlas);
        beer.neuesBier();
        assertEquals (250, beer.mengeImGlas);
    }



}