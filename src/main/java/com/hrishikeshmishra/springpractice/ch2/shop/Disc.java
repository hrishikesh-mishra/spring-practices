package com.hrishikeshmishra.springpractice.ch2.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by hrishikesh.mishra on 05/09/16.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Disc extends Product {
    private int capacity;

    public Disc(String name, double price) {
        super(name, price);
    }
}
