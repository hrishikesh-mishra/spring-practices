package com.hrishikeshmishra.springpractice.ch2.shop;

import lombok.*;

/**
 * Created by hrishikesh.mishra on 05/09/16.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private String name;
    private double price;
}
