package com.example.JPA.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {
//    @Id
//    @GeneratedValue
            /*(strategy = GenerationType.TABLE,
    generator = "author_id_table")
//    @SequenceGenerator(name = "author_sequence",
//    sequenceName = "author_sequence",
//    allocationSize = 1)
    @TableGenerator(
            name = "author_id_table",
            table = "author_table_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 2
    )*/
//    @Column(unique = true, nullable = false)
//    private Integer id;
    private String firstName;

    private String lastName;
    @Column(unique = true)
    private String email;
    private int age;

////    @Column(updatable = false,nullable = false)
//    private LocalDateTime createdAt;
//
////    @Column(insertable = false)
//    private LocalDateTime lastModified;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;





}
