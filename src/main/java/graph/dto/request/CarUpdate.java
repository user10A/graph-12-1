package graph.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarUpdate {
    private String name;
    private String email;
    private String model;
    private String color;
    private Integer price;
}
