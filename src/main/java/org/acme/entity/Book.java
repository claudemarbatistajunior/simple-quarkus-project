package org.acme.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Book {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String editor;
    private String gender;
    private LocalDateTime register;
    private Integer year;
    private Integer version;
    private BigDecimal price;
}