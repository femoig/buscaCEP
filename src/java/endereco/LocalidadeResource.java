/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endereco;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Param;

/**
 * REST Web Service
 *
 * @author Fernando.Ignacio
 */
@Path("endereco")
public class LocalidadeResource {

    @Context
    private UriInfo context;
    private ArrayList<Endereco> listaEnderecos;
    /**
     * Creates a new instance of LocalidadeResource
     */
    public LocalidadeResource() {
        listaEnderecos = getListaEndereco();
    }

    /**
     * Retrieves representation of an instance of Localidade.LocalidadeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("applcation/json")
    @Path("endereco")
    public String getJson() {
       
        Gson gson = new Gson();        
        return gson.toJson(listaEnderecos);
    }
    
    @GET
    @Produces("applcation/json")
    @Path("endereco/buscaCEP/{cep}")
    public String buscaCEP(@PathParam("cep") String cep){
        
        for (Endereco endereco : listaEnderecos) {
            if (endereco.cep.equals(cep)) {
                Gson gson = new Gson();        
                return gson.toJson(endereco);
            }
        }
        
        
        return "";
        
        
        
    }
    

    /**
     * PUT method for updating or creating an instance of LocalidadeResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
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
