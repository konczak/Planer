package pl.konczak.planer.training;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrainingRepository
        extends JpaRepository<Training, Long> {
}
