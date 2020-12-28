package com.joinit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor
public class Company {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private BigDecimal phoneNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "image_type")
    private String imageType;

    @Lob
    @Column(name = "pic")
    private byte[] pic;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private Set<Posting> postings;
}
