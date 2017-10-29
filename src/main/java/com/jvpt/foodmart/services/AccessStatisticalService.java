package com.jvpt.foodmart.services;


import com.jvpt.foodmart.models.AccessModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessStatisticalService {
    private AccessModel accessModel;
    @Autowired
    public void setAccessModel(AccessModel accessModel){
        this.accessModel = accessModel;
    }
    public void upAccess(){
        accessModel.setAccessCount(accessModel.getAccessCount()+1);
    }
    public int getAccessCount(){
        return accessModel.getAccessCount();
    }
}
