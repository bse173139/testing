/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import emailtester.Emailtester;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author Ameer
 */
public class emailTest {
    
    public emailTest() {
    }
    
    @Test
    public void Testwrongdomain() {
        Emailtester et=new Emailtester();
        assertEquals(true,et.emailvalid("newemail@gmail.com"));
    }
    @Test
    public void Testdotcomdomain() {
        Emailtester et=new Emailtester();
        assertNotEquals(true,et.emailvalid("newemail@gmail.k"));
    }
    @Test
    public void Testnumberdotcomdomain() {
        Emailtester et=new Emailtester();
        assertFalse(et.emailvalid("newemail@gmail.111"));
    }
    @Test
    public void Testspecialchar() {
        Emailtester et=new Emailtester();
        assertNotNull(et.emailvalid("newemail@gmail.com"));
    }
    @Test
    public void Testnotsame() {
        Emailtester et=new Emailtester();
        assertNotSame(et.emailvalid("newemail@gmail.com"),et.emailvalid("newemail@&$%^^.com"));
    }
    @After
    public void TestTrue() {
        Emailtester et=new Emailtester();
        assertTrue(et.emailvalid("newemail@gmail.com"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
