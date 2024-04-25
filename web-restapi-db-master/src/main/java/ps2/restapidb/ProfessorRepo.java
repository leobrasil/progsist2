package ps2.restapidb;

import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepo extends CrudRepository<Professor, Long> {
	Iterable<Professor> findByFaculdadeId(Long faculdadeId);
}