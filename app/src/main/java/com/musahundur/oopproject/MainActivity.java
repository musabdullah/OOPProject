package com.musahundur.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Musa", "Police");
        System.out.println(myUser.name);

        //Encapsulation
        Musician james = new Musician("James", "Guitar", 50);

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism
          //Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(4,7));
        System.out.println(mathematics.sum(5,7,3));
    }
}