package com.example.treejung.model;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="treejung")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Treejung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String location;
    private String status;
    private LocalDateTime plantedDate;


    @PrePersist
    protected void onplantAt(){
        plantedDate = LocalDateTime.now();
    }
}
