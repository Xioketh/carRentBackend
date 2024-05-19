package com.project.kaviya.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "vehical")
public class Vehical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "image")
    private String image;

    @Column(name = "type")
    private String type;

    @Column(name = "color")
    private String color;

    @Column(name = "reg_No")
    private String reg_No;

    @Column(name = "status")
    private int status;

    @Column(name = "price_value")
    private int price_value;

}
