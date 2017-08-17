package com.example.pkinga.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pkinga on 2017/8/17.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getProvinceName() {
        return provinceName;
    }

    private void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private int getProvinceCode() {
        return provinceCode;
    }

    private void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
