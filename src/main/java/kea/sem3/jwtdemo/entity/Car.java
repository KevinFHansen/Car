package kea.sem3.jwtdemo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EqualsAndHashCode
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    public Car() {}

    public Car(String brand, String model, double pricePrDay,double discount) {
        this.brand = brand;
        this.model = model;
        this.pricePrDay = pricePrDay;
        this.bestDiscount = discount;
    }

    @Enumerated(EnumType.STRING)
    String brand;

    @Column(length = 60)
    String model;

    double pricePrDay;

    //Best discount price (percent fo pricePrDay) an admin can offer
    double bestDiscount;

    @CreationTimestamp
    LocalDateTime created;

    @UpdateTimestamp
    LocalDateTime edited;

}

