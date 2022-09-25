package io.abdul;

import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAll(){
         System.out.println("Running before all.!!");
     }

    @BeforeEach
    void init(){
        System.out.println("Creating instance.!!");
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanUp(){
        System.out.println("cleaning up...!!");
    }

    @Test
    @DisplayName("Testing Add method")
    void addTest(){
        int expected=4;
        int actual = mathUtils.add(2,2);
        Assertions.assertEquals(expected,actual,"Add method is used to add 2 numbers");
    }

    @Test
    @DisplayName("Testing Susbtract Name")
    void substractTest(){
        int expected = 4;
        int actual = mathUtils.substract(6,2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing Multiply method")
    void multiplyTest(){
        int[] expected = {2,3,6};
        int[] actual ={};
        actual = mathUtils.multiply(2,3);
        Assertions.assertArrayEquals(expected,actual,"This is compare 2 arrays");
    }


    @Test
    @DisplayName("Testing ComputeCircleArea method")
    void computeCircleAreaTest(){
        double expected = 314.1592653589793;
        double actual;
        actual =mathUtils.computeCircleArea(10);
        Assertions.assertEquals(expected,actual,"It is compute circle area");

    }

    @Test
    @DisplayName("Testing Devide method")
    void devideTest(){
        Assertions.assertThrows(ArithmeticException.class, () ->mathUtils.devide(1,0),"Devide by 0 throws");
    }

    @Test
    @DisplayName("TDD-Disabled")
    @Disabled
    void disabledTest(){
        Assertions.fail("Executing failing disabledTest method");
    }

}
