package com.example.healthconnect;

public class DoctorList {

    final int image;
    final String name,specialisation;

    public DoctorList(int image, String name, String specialisation) {
        this.image = image;
        this.name = name;
        this.specialisation = specialisation;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getSpecialisation() {
        return specialisation;
    }
    

}
