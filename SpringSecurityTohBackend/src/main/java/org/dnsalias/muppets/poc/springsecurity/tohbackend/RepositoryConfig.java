package org.dnsalias.muppets.poc.springsecurity.tohbackend;

import org.dnsalias.muppets.poc.springsecurity.tohbackend.model.Hero;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
 
@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Hero.class);
    }
}
