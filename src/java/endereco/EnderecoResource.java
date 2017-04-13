package endereco;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.logging.Param;

@Path("endereco")
public class EnderecoResource {

    @Context
    private UriInfo context;
    private ArrayList<Endereco> listaEnderecos;
    /**
     * Creates a new instance of LocalidadeResource
     */
    public EnderecoResource() {
        listaEnderecos = getListaEndereco();
    }
    
    @GET
    @Produces("applcation/json")
    @Consumes("applcation/json")
    @Path("buscaCEP/{cep:\\d+}") //Aceita somente números como CEP
    public Response buscaCEP(@PathParam("cep") String cep){
        
        int replaceIndex = 7;
        
        //Regex Validation
        // ^\d{5}-\d{3}$
        
        do{
            for (Endereco endereco : listaEnderecos) {
                if (endereco.cep.equals(cep)) {
                    Gson gson = new Gson();                            
                    return Response.ok(gson.toJson(endereco), MediaType.APPLICATION_JSON).build();
                }
            } 
                        
            StringBuilder builder = new StringBuilder(cep);
            builder.setCharAt(replaceIndex, '0');
            cep = builder.toString();
            
            replaceIndex--;
            
        }
        while(replaceIndex > 0);
    
        
        return Response.status(Response.Status.NOT_FOUND).entity("CEP inválido").build();        
    }
    
    
    public static ArrayList<Endereco> getListaEndereco(){
        Endereco e1 = new Endereco();
        e1.ID = 1;
        e1.rua = "Rua do Paraiso";
        e1.bairro = "Paraiso";
        e1.cidade = "São Paulo";
        e1.estado = "SP";
        e1.cep = "04103000";  
                
        
        Endereco e2 = new Endereco();
        e2.ID = 2;
        e2.rua = "Rua Joaquim Silva";
        e2.bairro = "Penha";
        e2.cidade = "São Paulo";
        e2.estado = "SP";
        e2.cep = "04103999"; 
        
        ArrayList<Endereco> lista = new ArrayList<Endereco>();
        lista.add(e1);
        lista.add(e2);
        
        return lista;
    }
}
