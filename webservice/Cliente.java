package webservice;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Cliente {
     
    public static void main(String[] args) {
    
    	if (args.length < 3) {
    		System.out.println("Argumentos invalidos\n");
    		return;
    	}
    	
    	String operation = args[0];
    	String op1 = args[1];
    	String op2 = args[2];
        int a = Integer.parseInt(op1);
        int b = Integer.parseInt(op2);
    
        ClientConfig config = new DefaultClientConfig();
        Client cliente = Client.create(config);
        WebResource servico = cliente.resource("http://localhost:9000/calculadora");
        WebResource servicoSomarInt = servico.path(operation).path(a + "/" + b);
        ClientResponse respostaSomarInt = servicoSomarInt.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        String respostaJsonSomarInt = respostaSomarInt.getEntity(String.class);
        System.out.println("Resposta da adicao: " + respostaJsonSomarInt);
    }
}
