package endereco;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {
    public int ID;
    public String rua;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
    
    
    public Endereco(){
        
    }
            
}



