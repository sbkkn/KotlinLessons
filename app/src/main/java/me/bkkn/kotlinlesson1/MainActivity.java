package me.bkkn.kotlinlesson1;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

class MainActivity :AppCompatActivity(){

        override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
}
