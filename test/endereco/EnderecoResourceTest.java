/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endereco;

import java.util.ArrayList;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando.Ignacio
 */
public class EnderecoResourceTest {
    
    public EnderecoResourceTest() {
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

    /**
     * Test of buscaCEP method, of class EnderecoResource.
     */
    @Test
    public void testBuscaCEP() {
        System.out.println("buscaCEP");
        String cep = "";
        EnderecoResource instance = new EnderecoResource();
        Response expResult = null;
        Response result = instance.buscaCEP(cep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaEndereco method, of class EnderecoResource.
     */
    @Test
    public void testGetListaEndereco() {
        System.out.println("getListaEndereco");
        ArrayList<Endereco> expResult = null;
        ArrayList<Endereco> result = EnderecoResource.getListaEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
