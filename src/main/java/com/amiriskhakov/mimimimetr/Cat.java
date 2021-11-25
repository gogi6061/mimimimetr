package com.amiriskhakov.mimimimetr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Data
@Entity(name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column(name = "img_path")
    String path;

    @Column
    Integer likes;

    public Cat(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
