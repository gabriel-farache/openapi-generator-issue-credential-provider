package org.example;

import io.quarkiverse.openapi.generator.providers.ConfigCredentialsProvider;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Specializes;
import jakarta.ws.rs.client.ClientRequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestScoped
@Alternative
@Specializes
@Priority(10)
public class OpenApiCustomCredentialProvider extends ConfigCredentialsProvider {
  private static final Logger LOGGER = LoggerFactory.getLogger(OpenApiCustomCredentialProvider.class);

  @Override
  public String getApiKey(ClientRequestContext requestContext, String openApiSpecId, String authName) {
    LOGGER.error("========> getApiKey");
    return super.getApiKey(requestContext, openApiSpecId, authName);
  }

  @Override
  public String getBasicUsername(ClientRequestContext requestContext, String openApiSpecId, String authName) {
    LOGGER.error("========> getBasicUsername");
    return super.getBasicUsername(requestContext, openApiSpecId, authName);
  }

  @Override
  public String getBasicPassword(ClientRequestContext requestContext, String openApiSpecId, String authName) {
    LOGGER.error("========> getBasicPassword");
    return super.getBasicPassword(requestContext, openApiSpecId, authName);
  }

  @Override
  public String getBearerToken(ClientRequestContext requestContext, String openApiSpecId, String authName) {
    LOGGER.error("========> getBearerToken");
    return super.getBearerToken(requestContext, openApiSpecId, authName) + "_OVERRIDE";
  }

}