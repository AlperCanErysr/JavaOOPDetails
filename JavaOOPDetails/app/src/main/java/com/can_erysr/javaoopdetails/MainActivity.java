package com.can_erysr.javaoopdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kedi kedi1 = new Kedi("Minnoş","Kahverengi","Sarı");
        Kedi kedi2 = new Kedi();
        kedi2.isim="Mırnav";
        System.out.println(kedi2.isim);

        //System.out.println(turIsmi);
        System.out.println(Kedi.turIsmi);

        Kedi.konusKediStatic();
        kedi1.konusKedi();

        Kopek kopek1 = new Kopek();
        Kopek kopek2 = new Kopek("Barley","Sarı","Sarı");
        System.out.println(kopek2.tuyRengi);


    }
}