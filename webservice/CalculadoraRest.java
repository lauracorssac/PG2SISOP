package webservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("calculadora")
public class CalculadoraRest {   

    @Path("/somarInt/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Calculadora somarInt(@PathParam("a") int a, @PathParam("b") int b) {
        Calculadora calculator = new Calculadora(a, b, "+");
        return calculator;
    }
    
    @Path("/multiplicarInt/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Calculadora multiplicarInt(@PathParam("a") int a, @PathParam("b") int b) {
        Calculadora calculator = new Calculadora(a, b, "*");
        return calculator;
    }
}
