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
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fromDate")
    private String fromDate;


    @Column(name = "toDate")
    private String toDate;


    @Column(name = "vehicalId")
    private String vehicalId;


    @Column(name = "userId")
    private String userId;


    @Column(name = "status")
    private String status;


    @Column(name = "kmPrice")
    private String kmPrice;


    @Column(name = "book_Date")
    private String bookDate;

    @Column(name = "recieve_date")
    private String recieve_date;


}
