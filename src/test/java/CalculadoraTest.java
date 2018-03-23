/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.EmptyStackException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kbig
 */
public class CalculadoraTest {
    Calculadora calc;
    public CalculadoraTest() {
        calc = new Calculadora();
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

    @Test(expected = NullPointerException.class)
    public void medianaTestNulo() {
        assertEquals(0.0, calc.calcMediana(null), 0.01);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void medianaVaziaTest() {
        double[] vetor = {};
        assertEquals(0.0, calc.calcMediana(vetor), 0.01);
    }

}
