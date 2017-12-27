package org.dnsalias.muppets.poc.springsecurity.tohbackend.security.repository;

import org.dnsalias.muppets.poc.springsecurity.tohbackend.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
