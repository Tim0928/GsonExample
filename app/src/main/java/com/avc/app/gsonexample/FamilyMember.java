package com.avc.app.gsonexample;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int mAge;

    public  FamilyMember(String role,int age){
        mAge=age;
        mRole=role;
    }
}
