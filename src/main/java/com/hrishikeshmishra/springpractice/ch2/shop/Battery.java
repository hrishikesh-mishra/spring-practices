package com.hrishikeshmishra.springpractice.ch2.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by hrishikesh.mishra on 05/09/16.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Battery extends Product {

    private boolean rechargeable;

    public Battery(String name, double price) {
        super(name, price);
    }
}
