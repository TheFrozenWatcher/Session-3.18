package com.ra.baitap3_ss17.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@Setter
@Getter
@NoArgsConstructor
public class Category {
    // Getters and Setters
    private int id;
    private String name;
    private boolean status;

    // Constructor
    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }


}

