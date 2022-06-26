package by.it_academy.horse_project_springboot.repository;

import by.it_academy.horse_project_springboot.entity.Horse;
import org.springframework.data.repository.CrudRepository;

public interface HorseRepository extends CrudRepository<Horse, Integer> {
}