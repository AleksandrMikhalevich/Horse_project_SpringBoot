package by.it_academy.horse_project_springboot.service;

import by.it_academy.horse_project_springboot.entity.Horse;

import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 26.06.2022 16:22
 **/
public interface HorseService {

    void addHorse(Horse horse);

    void updateHorse(Horse horse);

    void deleteHorse(int id);

    Horse findHorseById(int id);

    List<Horse> getAllHorses();




}
