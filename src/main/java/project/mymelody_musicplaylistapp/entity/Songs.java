package project.mymelody_musicplaylistapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "song")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String artist;

    @Column(nullable = false)
private String album;

    @Column(nullable = false)
private String genre;

    @Column(nullable = false)
private Integer duration;


}
