package com.avc.app.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final String TAG="gsonexample";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson= new Gson();
        Address address=new Address("Taiwan","Taipei");
        List<FamilyMember> family=new ArrayList<>();
        family.add(new FamilyMember("Wife",30));
        family.add(new FamilyMember("Daught",6));
        Employee employee=new Employee("John",30,"John@gmail.com",address,family);
        String json=gson.toJson(employee);
        Log.i(TAG,json);

/*        String json="{\"address\":{\"city\":\"Taipei\",\"country\":\"Taiwan\"},\"age\":30,\"frist_name\":\"John\",\"mail\":\"John@gmail.com\"}";

        Employee employee=gson.fromJson(json,Employee.class);*/
    }
}
