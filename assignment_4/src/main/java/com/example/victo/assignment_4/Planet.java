package com.example.victo.assignment_4;

/**
 * Created by Victo on 2015-04-22.
 */
import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Planet implements Serializable {
    String name;
    Drawable image;
    String description;

    public Planet(String name, Drawable image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    //bildrelaterat
    public Drawable getImage() {
        return image;
    }
    public void setImage(Drawable image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSummary() {
        return description;
    }

}
