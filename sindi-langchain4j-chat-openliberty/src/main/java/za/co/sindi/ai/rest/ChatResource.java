package za.co.sindi.ai.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import za.co.sindi.ai.service.langchain4j.Assistant;
import za.co.sindi.ai.service.langchain4j.FraudAiService;
import za.co.sindi.ai.service.langchain4j.FraudResponse;

/**
 * @author Buhake Sindi
 * @since 10 August 2024
 */
@Path("/chat")
public class ChatResource {

	@Inject
//	private Instance<Assistant> assistant;
	private Assistant assistant;
	
	@Inject
//	private Instance<Assistant> assistant;
	private FraudAiService fraudService;
	
	@GET
	@Operation(
	        summary = "Chat to our friendly assistant."
//	        ,description = "Returns the total numbers of users in the repository."
	        )
	@Produces(MediaType.TEXT_PLAIN)
	public String chat(@QueryParam("message") String message) {
//        return assistant.get().chat(message);
        return assistant.chat(message);
    }
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/fraud")
    public FraudResponse detectFraudForCustomer(@QueryParam("name") String name, @QueryParam("surname") String surname) {
        return fraudService.detectFraudForCustomer(name, surname);
    }
}
