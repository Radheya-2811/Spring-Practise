package com.example.JPA.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Section extends BaseEntity {
//    @Id
//    @GeneratedValue
//    private Integer id;
    private String name;
    private int SectioOrder;

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course courses;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
