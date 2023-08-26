package com.ead.authuser.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class SwaggerConfiguration {
    private String devUrl = "http://localhost:8080/";

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("URL do Server de desenvolvimento");

        Contact contact = new Contact();
        contact.setEmail("");
        contact.setName("");
        contact.setUrl("");


        Info info = new Info()
                .title("")
                .version("1.0")
                .contact(contact)
                .description("").termsOfService("")
                .license(null);

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer));
    }
}