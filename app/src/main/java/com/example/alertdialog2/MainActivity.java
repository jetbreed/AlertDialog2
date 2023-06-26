package com.example.alertdialog2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button dialog1,dialog2,dialog3,dialog4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog1=findViewById(R.id.dialog1);
        dialog2=findViewById(R.id.dialog2);
        dialog3=findViewById(R.id.dialog3);
        dialog4=findViewById(R.id.dialog4);
        dialog1.setOnClickListener(this);
        dialog2.setOnClickListener(this);
        dialog3.setOnClickListener(this);
        dialog4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.dialog1){

        AlertDialog.Builder builder =
                new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Online Shopping")
                    .setMessage("Don't have time for physical shopping? " +
                            "Then visit our website for online shopping " +
                            "with discounted prices.")
                    .setPositiveButton(R.string.start,
                            (dialog, id) -> Toast.makeText(MainActivity.this,
                                    "Ok",Toast.LENGTH_SHORT).show())
                    .setNegativeButton(R.string.cancel,
                            (dialog, id) -> Toast.makeText(MainActivity.this,
                                    "Cancel",Toast.LENGTH_SHORT).show());
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }else if(view.getId() == R.id.dialog2){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Getting Late")
                    .setMessage("Are you having problem with time." +
                            "Don't know estimated time to reach." +
                            "Visit our application,It will help you " +
                            "to get estimate time with distance.")
                    .setPositiveButton(R.string.start,
                            new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(MainActivity.this,
                                    "Ok",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton(R.string.cancel,
                            new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {              Toast.makeText(MainActivity.this,"Cancel",Toast.LENGTH_SHORT).show();
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }else if(view.getId() == R.id.dialog3){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Tour Planning")
                    .setMessage("Are you planning to go for tour.No need to waste time,Visit our online tour booking website.")
                    .setPositiveButton(R.string.start, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(MainActivity.this,"Cancel",Toast.LENGTH_SHORT).show();
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }else if(view.getId() == R.id.dialog4){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Dialog without Gif Supports")
                    .setMessage("You can use TT Fancy Dialog without gif also.")
                    .setIcon(R.drawable.gif1)
                    .setPositiveButton(R.string.start, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_SHORT).show();
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }
}