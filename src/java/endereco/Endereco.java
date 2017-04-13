/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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



