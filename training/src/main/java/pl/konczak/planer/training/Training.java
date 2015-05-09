package pl.konczak.planer.training;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Training
        implements Serializable {

    private static final long serialVersionUID = -646512401885431601L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String createdAt;

    protected Training() {
    }

    public Training(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now().toString();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

}
