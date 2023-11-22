package smwindow.smart.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "smartwindow")

public class MainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private float humi;

    @Column
    private float temp;

    @Column
    private int raindrops_status;
}
