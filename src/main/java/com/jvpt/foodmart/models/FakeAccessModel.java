package com.jvpt.foodmart.models;

import org.springframework.stereotype.Component;

@Component
public class FakeAccessModel implements AccessModel {
    private int accessCount;
    public FakeAccessModel(){
        accessCount = 0;
    }
    @Override
    public int getAccessCount() {
        return accessCount;
    }

    @Override
    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }
}
