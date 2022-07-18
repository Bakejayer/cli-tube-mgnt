package com.clitubemgnt.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Tube {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private TubeType type;
    @ManyToOne
    private TubeSize size;
    @ManyToOne
    private TubeMaterial material;
    private int tag;
    private String heat;
    @ManyToOne
    private Bin bin;
    private int quantity;
}
