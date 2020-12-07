package one.digitallinnovation.apipessoa.repository;

import one.digitallinnovation.apipessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
