package com.jhojytech.ec.smuggling.repository;

import com.jhojytech.ec.smuggling.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
