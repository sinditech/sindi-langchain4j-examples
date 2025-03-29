package za.co.sindi.ai.service.langchain4j;

import dev.langchain4j.service.SystemMessage;
import za.co.sindi.langchain4j.spi.cdi.AiService;

/**
 * @author Buhake Sindi
 * @since 10 August 2024
 */
@AiService
public interface Assistant {

	@SystemMessage("You are a polite assistant")
    public String chat(String userMessage);
}
