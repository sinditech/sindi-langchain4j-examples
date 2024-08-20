package za.co.sindi.ai.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import za.co.sindi.ai.service.langchain4j.Assistant;

/**
 * @author Buhake Sindi
 * @since 10 August 2024
 */
@Path("/chat")
public class ChatResource {

	@Inject
	private Assistant assistant;
	
	@GET
//	@Path("/count")
	@Operation(
	        summary = "Chat to our friendly assistant."
//	        ,description = "Returns the total numbers of users in the repository."
	        )
	@Produces(MediaType.TEXT_PLAIN)
	public String chat(@QueryParam("message") String message) {
        return assistant.chat(message);
    }
}
