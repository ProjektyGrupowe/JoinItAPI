package com.joinit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "requirement")
@Getter
@Setter
@NoArgsConstructor
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_required")
    private Boolean isRequired;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private Set<Posting> postings;
}
