package com.horizon.abhijit.easycs1;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Formulae extends ListActivity {
    String[] names={"Chapter 1:Interferance","Chapter 2:Diffraction","Chapter 5:Polarization","Chapter 6:Lasers","Chapter 7:Solid State Physics","Chapter 8:Wave Particle Duality","Chapter 9:Wave Equations"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        if(id==0){
            Intent i=new Intent(Formulae.this,Form1.class);
            startActivity(i);
        }
        else if(id==1){
            Intent i=new Intent(Formulae.this,Form2.class);
            startActivity(i);
        }
        else if(id==2){
            Intent i=new Intent(Formulae.this,form5.class);
            startActivity(i);
        }
        else if(id==3){
            Intent i=new Intent(Formulae.this,Form6.class);
            startActivity(i);
        }
        else if(id==4){
            Intent i=new Intent(Formulae.this,Form7.class);
            startActivity(i);
        }
        else if(id==5){
            Intent i=new Intent(Formulae.this,Form8.class);
            startActivity(i);
        }
        else{
            Intent i=new Intent(Formulae.this,Form9.class);
            startActivity(i);
        }
    }
}
