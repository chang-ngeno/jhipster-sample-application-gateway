package ke.co.macoz.jhipster.gateway.repository;

import ke.co.macoz.jhipster.gateway.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
