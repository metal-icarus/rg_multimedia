package com.rgmultimedia.challenge.model;

import javax.persistence.*;

@Entity
@Table(name="media_content")
public class MediaContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String model;

    private String type;

    @Column(name = "total_play_amount")
    private int totalPlayAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalPlayAmount() {
        return totalPlayAmount;
    }

    public void setTotalPlayAmount(int totalPlayAmount) {
        this.totalPlayAmount = totalPlayAmount;
    }
}
