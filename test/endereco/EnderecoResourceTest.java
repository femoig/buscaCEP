package endereco;

import com.google.gson.Gson;
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
    public void testBuscaCEP_NotFound() {
        System.out.println("buscaCEP");
        String cep = "99999999";
        EnderecoResource instance = new EnderecoResource();
        Response expResult = Response.status(Response.Status.NOT_FOUND).entity("CEP inválido").build();
        Response result = instance.buscaCEP(cep);
        
        assertEquals(expResult.getStatus(),result.getStatus());        
    }
}
