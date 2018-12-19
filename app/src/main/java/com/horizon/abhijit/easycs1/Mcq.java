package com.horizon.abhijit.easycs1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mcq extends ListActivity {
    String [] names ={
            "Chapter1 : Intereferance",
            "Chapter2 : Diffraction",
            "Chapter3 : Acoustics of Building",
            "Chapter4 : Ultrasonics",
            "Chapter5 : Polarisation",
            "Chapter6 : Lasers",
            "Chapter7 : Solid State Physics",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names));
    }
    public void onListItemClick(ListView Parent, View v, int position,long id){
        if(id==0){
            Intent i=new Intent(Mcq.this,chap1_mcq.class);
            startActivity(i);
        }
        else if(id==1){
            Intent i=new Intent(Mcq.this,chap2_mcq.class);
            startActivity(i);
        }
        else if(id==2){
            Intent i=new Intent(Mcq.this,chap3_mcq.class);
            startActivity(i);
        }
        else if(id==3){
            Intent i=new Intent(Mcq.this,chap4_mcq.class);
            startActivity(i);
        }
        else if(id==4){
            Intent i=new Intent(Mcq.this,chap5_mcq.class);
            startActivity(i);
        }
        else if(id==5){
            Intent i=new Intent(Mcq.this,Chap6_mcq.class);
            startActivity(i);
        }
        else if(id==6){
            Intent i=new Intent(Mcq.this,chap7_mcq.class);
            startActivity(i);
        }

    }
}

