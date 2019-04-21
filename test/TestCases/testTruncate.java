package TestCases;

import java.util.Arrays;
import junittuts.JunitTuts;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class testTruncate {
    // input ==> AACD ==> CD , ACD ==> CD, CDEF ==> CDEF , CDAA ==> CDAA
    
    //better use void cuz we don't need a return
    
    //@Test; assertEqual; assertTrue; asserFalse
    //Before => initialization before every testcase
    //@After => does task after every testcase
    
    JunitTuts j = new JunitTuts();
    
    
//    @Before
//    public void setup(){
//        System.out.println("starting connection to database");
//    }
    
//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("open connection ONCE");
//    }
    
    @Test(timeout= 1000)
    public void testSorting(){
        j.generateRandomArray();
        //j.bubbleSort();
        j.selectionSort();
    }
     @Test
     public void testTruncate_AA() {
         assertEquals("CD", j.truncate("AACD"));
         System.out.println("testTruncate_AA");
     }
     @Test
     public void testTruncate_A() {
         assertEquals("CD", j.truncate("ACD"));
         assertEquals("CD", j.truncate("CD"));
         System.out.println("testTruncate_A");
     }
     @Test
     public void testTruncate_noA() {
         assertEquals("CDEF", j.truncate("CDEF"));
         System.out.println("testTruncate_noA");
     }
     @Test
     public void testTruncate_AatTheEnd(){
         assertEquals("CDAA", j.truncate("CDAA"));
         System.out.println("testTruncate_AatTheEnd");
     }
     @Test
     public void testSameFirstSameLast_default(){
         //assertEquals(false,j.sameFirstSameLast("AACD"));
         assertFalse(j.sameFirstSameLast("AACD"));
         System.out.println("testSameFirstSameLast_default");
     }
     @Test
     public void testSameFirstSameLast_Second(){
         assertTrue(j.sameFirstSameLast("AABCAA"));
         System.out.println("testSameFirstSameLast_Second");
     }
     @Test(expected = NullPointerException.class)
     public void testArraySort(){
         int [] actual = null;//{22,18,14,25,13,8,17,3};
         //int[] expected= {3,8,14,13,17,18,22,25};
         Arrays.sort(actual);
         //assertArrayEquals(expected,actual);
     }
//     @After
//     public void tearDown(){
//         System.out.println("Ending connection to database");
//     }
//     @AfterClass
//     public static void afterClass(){
//         System.out.println("End connection to database ONCE");
//     }
}
