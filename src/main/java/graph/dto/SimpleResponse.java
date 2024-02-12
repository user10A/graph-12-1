package graph.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SimpleResponse {
    private String message;

    public SimpleResponse() {
    }

    public SimpleResponse(String message) {
        this.message = message;
    }
}
