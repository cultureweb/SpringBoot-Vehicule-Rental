package com.vehiclerental.restservice.RestApp.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class VehicleForm {

    @NotNull
    @Size(min=1, max=30)
    private String brand;

    @NotNull
    @Size(min=1, max=30)
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
