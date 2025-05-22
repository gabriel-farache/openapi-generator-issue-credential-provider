package org.example;

import io.quarkiverse.openapi.generator.providers.ConfigCredentialsProvider;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Specializes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestScoped
@Alternative
@Specializes
@Priority(10)
public class OpenApiCustomCredentialProvider extends ConfigCredentialsProvider {
  private static final Logger LOGGER = LoggerFactory.getLogger(OpenApiCustomCredentialProvider.class);

  @Override
  public String getApiKey(CredentialsContext input) {
    LOGGER.error("========> getApiKey");
    return super.getApiKey(input);
  }

  @Override
  public String getBasicUsername(CredentialsContext input) {
    LOGGER.error("========> getBasicUsername");
    return super.getBasicUsername(input);
  }

  @Override
  public String getBasicPassword(CredentialsContext input) {
    LOGGER.error("========> getBasicPassword");
    return super.getBasicPassword(input);
  }

  @Override
  public String getBearerToken(CredentialsContext input) {
    LOGGER.error("========> getBearerToken");
    return super.getBearerToken(input);
  }

  @Override
  public String getOauth2BearerToken(CredentialsContext input) {
    LOGGER.error("========> getOauth2BearerToken");
    return "OVERRIDER";
  }
}