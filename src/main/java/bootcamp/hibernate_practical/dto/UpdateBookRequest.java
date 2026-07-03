package bootcamp.hibernate_practical.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UpdateBookRequest {

    @NotBlank(message = "Title must not be empty")
    @Size(min = 1, max = 255, message = "Title must be between 1 and 255 characters")
    private String title;

    @NotBlank(message = "Author must not be empty")
    @Size(min = 2, max = 100, message = "Author name must be between 2 and 100 characters")
    private String author;

    @NotBlank(message = "Genre must not be empty")
    @Size(min = 3, max = 50, message = "Genre must be between 3 and 50 characters")
    private String genre;

    @NotNull(message = "Publication year is required")
    @Min(value = 1000, message = "Publication year must be no earlier than 1000")
    @Max(value = 2026, message = "Publication year cannot be in the future")
    private int publicationYear;

    @NotNull(message = "Availability status is required")
    private boolean available;
}