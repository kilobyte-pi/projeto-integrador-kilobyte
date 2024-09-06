package br.com.kilobyte.crud.repository;

import br.com.kilobyte.crud.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Vinicius
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
