package archandpattern.shedule.dao;

import archandpattern.shedule.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<Client,Long> {
}