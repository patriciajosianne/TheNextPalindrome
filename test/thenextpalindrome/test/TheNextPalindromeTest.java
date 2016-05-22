package thenextpalindrome.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import thenextpalindrome.TheNextPalindrome;

/**
 *
 * @author Patricia
 */
public class TheNextPalindromeTest {
    
    public TheNextPalindromeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testTheNextPalidrome() {
        assertEquals("1221", new String(TheNextPalindrome.calcTheNextPalindrome("1220")));
        assertEquals("818", new String(TheNextPalindrome.calcTheNextPalindrome("808")));
        assertEquals("2222", new String(TheNextPalindrome.calcTheNextPalindrome("2133")));
        assertEquals("22122", new String(TheNextPalindrome.calcTheNextPalindrome("22121")));
        assertEquals("2002", new String(TheNextPalindrome.calcTheNextPalindrome("1998")));
        assertEquals("1441", new String(TheNextPalindrome.calcTheNextPalindrome("1356")));
        assertEquals("13231", new String(TheNextPalindrome.calcTheNextPalindrome("13156")));
        assertEquals("1996991", new String(TheNextPalindrome.calcTheNextPalindrome("1995998")));
    }
}
