package za.co.sindi.ai.service.langchain4j;

import java.time.Duration;

import dev.langchain4j.model.huggingface.HuggingFaceModelName;
import jakarta.enterprise.context.ApplicationScoped;
import za.co.sindi.langchain4j.service.huggingface.HuggingFaceChatLanguageConfig;
import za.co.sindi.langchain4j.service.huggingface.HuggingFaceEmbeddingConfig;

/**
 * @author Buhake Sindi
 * @since 10 August 2024
 */
@ApplicationScoped
public class DefaultHuggingFaceConfig implements HuggingFaceChatLanguageConfig, HuggingFaceEmbeddingConfig {

	/* (non-Javadoc)
	 * @see za.co.sindi.langchain4j.service.huggingface.HuggingFaceConfig#getAccessToken()
	 */
	@Override
	public String getAccessToken() {
		// TODO Auto-generated method stub
		return "<ENTER YOUR ACCESS TOKEN HERE, OR INJECT YOUR MICROPROFILE CONFIG HERE>";
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.langchain4j.service.huggingface.HuggingFaceConfig#getModelId()
	 */
	@Override
	public String getModelId() {
		// TODO Auto-generated method stub
		return HuggingFaceModelName.TII_UAE_FALCON_7B_INSTRUCT;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.langchain4j.service.huggingface.HuggingFaceConfig#getTimeout()
	 */
	@Override
	public Duration getTimeout() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.langchain4j.service.huggingface.HuggingFaceConfig#getWaitForModel()
	 */
	@Override
	public Boolean getWaitForModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
