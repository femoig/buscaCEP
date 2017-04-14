package endereco;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {
    @NotNull
    public int ID;
    
    @NotNull
    public String rua;
    
    public String bairro;
    public String complemento;
    
    @NotNull
    public String cidade;
    
    @NotNull
    public String estado;
    
    @NotNull
    public String cep;
    
    
    public Endereco(){
        
    }
            
}



