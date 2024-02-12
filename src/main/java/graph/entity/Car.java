package graph.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String model;
    private String color;
    private Integer price;

    public Car(String name, String email, String model, String color, Integer price) {
        this.name = name;
        this.email = email;
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
