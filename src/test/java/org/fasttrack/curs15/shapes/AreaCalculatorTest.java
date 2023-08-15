package org.fasttrack.curs15.shapes;

import org.junit.jupiter.api.*;

import java.awt.geom.Area;
import java.io.FileNotFoundException;

//specific ca ma folosesc de Order ca sa rulez testul
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AreaCalculatorTest {
    private static AreaCalculator areaCalculator;

    @BeforeAll
    public static void setup() {
        areaCalculator = new AreaCalculator();
    }

//    @BeforeEach
//    public void beforeEachSetup() {
//        areaCalculator = new AreaCalculator();
//    }

    @Test
    @Order(-7)
    public void testAreaCircle() {
        double myRadius = 2;
        double area = areaCalculator.areaOfCircle(myRadius);
        Assertions.assertEquals(12.56, area);
    }

    @Test
    @Order(-22222)
    public void testAreaCon() {
        double myRadius = 2;
        double area = areaCalculator.areaCon(myRadius);
        Assertions.assertEquals(25.12, area);
    }

    @Test
    @Order(Integer.MAX_VALUE)
    public void testNull() {
        areaCalculator = null;
        Assertions.assertThrows(
                NullPointerException.class, () -> {areaCalculator.areaOfCircle(3);}
        );
    }

}
