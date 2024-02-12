package graph.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarResponse {
    private String name;
    private String email;
    private String model;
    private String color;
    private Integer price;
}
