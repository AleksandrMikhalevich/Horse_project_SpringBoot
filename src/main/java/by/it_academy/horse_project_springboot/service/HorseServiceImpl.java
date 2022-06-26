package by.it_academy.horse_project_springboot.service;

import by.it_academy.horse_project_springboot.entity.Horse;
import by.it_academy.horse_project_springboot.repository.HorseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 26.06.2022 16:28
 **/
@Service
@RequiredArgsConstructor
public class HorseServiceImpl implements HorseService {

    private final HorseRepository horseRepository;

    @Override
    public void addHorse(Horse horse) {
        horseRepository.save(horse);
    }

    @Override
    public void updateHorse(Horse horse) {
        horseRepository.save(horse);
    }

    @Override
    public void deleteHorse(int id) {
        horseRepository.deleteById(id);
    }

    @Override
    public Horse findHorseById(int id) {
        return horseRepository.findById(id).get();
    }

    @Override
    public List<Horse> getAllHorses() {
        return (List<Horse>) horseRepository.findAll();
    }
}
