package com.jvpt.foodmart.models;


public class DbAccessModel implements AccessModel {
    private int accessCount;
    @Override
    public int getAccessCount(){
        /* Kết nối cơ sở dữ liệu và lấy số lượng access (truy cập) */
        return -1;
    }
    @Override
    public void setAccessCount(int accessCount) {
        return;
    }
}
