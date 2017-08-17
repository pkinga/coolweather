package com.example.pkinga.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pkinga on 2017/8/17.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getCountyName() {
        return countyName;
    }

    private void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    private String getWeatherId() {
        return weatherId;
    }

    private void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    private int getCityId() {
        return cityId;
    }

    private void setCityId(int cityId) {
        this.cityId = cityId;
    }


}