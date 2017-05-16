package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zb on 2017/5/16.
 */

public class Province extends DataSupport {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private String provinceName;
    private  int provinceCode;

}
