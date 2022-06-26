package by.it_academy.horse_project_springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Alex Mikhalevich
 * @created 26.06.2022 16:13
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Horse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String type;

    @Column
    private String age;

    @Column
    private String price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(getId(), horse.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
