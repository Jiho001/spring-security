package login.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;

@Entity @Setter
@Table
public class Practice {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
