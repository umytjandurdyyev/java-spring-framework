import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("AfterAll is executed");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("BeforeEach is executed");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("AfterEach is executed");
    }

    @Test
    void testCase1(){
        System.out.println("Test Case 1");
        //1. step put fail
//        fail("Not implemented yet");
    }
    @Test
    void testCase2(){
        System.out.println("Test Case 2");
        assertEquals("add", Calculator.operator);
//        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase3(){
        System.out.println("Test Case 3");
        boolean result1 = Calculator.add(2,2) == 4;
        assertTrue(result1);
        boolean result2 = Calculator.add(2,2) == 5;
        assertFalse(result2);
    }

    @Test
    void testCase4(){
        System.out.println("Test Case 4");
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
        // fail
//        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2});
    }

    @Test
    void testCase5(){
        System.out.println("Test Case 5");
        String nullString = null;
        String notNullString = "Cydeo";

        assertNull(nullString);
        assertNotNull(notNullString);

        //fail
//        assertNull(notNullString);
//        assertNotNull(nullString);
    }

    @Test
    void testCase6(){
        System.out.println("Test Case 6");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1,c2);
        assertNotSame(c1,c3);
    }

    @Test
    void add(){
        System.out.println("Test Case add");
        int actual = Calculator.add(2,3);
        assertEquals(5,actual,"It is not matching with expected value");
    }

    @Test
    void add2(){
        System.out.println("Test Case add2");
        assertThrows(IllegalArgumentException.class, ()-> Calculator.add2(5,2));

        //fail
//        assertThrows(AccessDeniedException.class, ()-> Calculator.add2(5,2));
    }


}