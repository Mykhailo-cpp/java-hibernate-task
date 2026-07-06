package bootcamp.hibernate_practical.dto;

public record AuthResponse(String token, String type) {

    public AuthResponse(String token) {
        this(token, "Bearer");
    }
}
