package Test;

import Code.*;


import org.junit.Test;
import static org.junit.Assert.*;


public class Test_001 {

Calcluation calcluation;
@Test
    public void addition()
    {
        calcluation=new Calcluation();
        assertNotSame(4,calcluation.addition());
    }
    @Test
    public void substraction()
    {
        calcluation=new Calcluation();
        assertTrue(calcluation.substraction()==calcluation.substraction());
    }
@Test
    public void multilication()
    {
        calcluation=new Calcluation();
        assertTrue(calcluation.multiplication()==calcluation.multiplication());
    }




}
