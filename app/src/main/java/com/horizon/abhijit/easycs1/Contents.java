package com.horizon.abhijit.easycs1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contents extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);
        
        ImageButton qview = (ImageButton) findViewById(R.id.imageButton38);
        ImageButton mcq = (ImageButton) findViewById(R.id.imageButton39);
        ImageButton paper =(ImageButton)findViewById(R.id.imageButton40);
        ImageButton formula = (ImageButton) findViewById(R.id.imageButton41);
        ImageButton faq = (ImageButton) findViewById(R.id.imageButton42);
        ImageButton info = (ImageButton)findViewById(R.id.imageButton37);

        qview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contents.this, Quick.class);
                startActivity(i);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contents.this, Importants.class);
                startActivity(i);
            }
        });

        formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Formulae.class);
                startActivity(i);
            }
        });

        mcq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contents.this, Mcq.class);
                startActivity(i);
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contents.this, Paper.class);
                startActivity(i);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Contents.this,Info.class);
                startActivity(i);
            }
        });


    }
}
