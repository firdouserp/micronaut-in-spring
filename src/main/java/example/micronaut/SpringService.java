package example.micronaut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringService {

    @Autowired 
    private MicronautService micronautservice;
    
    public SpringService(){
        
    }
    
    
    public String greet() {
         return micronautservice.greet();
    }
}
