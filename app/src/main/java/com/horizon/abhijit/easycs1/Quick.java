package com.horizon.abhijit.easycs1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Quick extends ListActivity {
    String [] names ={
            "Chapter1 : Intereferance",
            "Chapter2 : Diffraction",
            "Chapter3 : Acoustics of Building",
            "Chapter4 : Ultrasonics",
            "Chapter5 : Polarisation",
            "Chapter6 : Lasers",
            "Chapter7 : Solid State Physics",
            "Chapter8 : Wave Particle Duality",
            "Chapter9 : Wave Equation",
            "Chapter10 : Superconductivity",
            "Chapter11 : Physics of Nano Particles"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names));
    }
    public void onListItemClick(ListView Parent, View v, int position,long id){
        if(id==0){
            Intent i=new Intent(Quick.this,Interference.class);
            startActivity(i);
        }
        else if(id==1){
            Intent i=new Intent(Quick.this,Diffraction.class);
            startActivity(i);
        }
        else if(id==2){
            Intent i=new Intent(Quick.this,Acaustics.class);
            startActivity(i);
        }
        else if(id==3){
            Intent i=new Intent(Quick.this,Ultrasonics.class);
            startActivity(i);
        }
        else if(id==4){
            Intent i=new Intent(Quick.this,Polarization.class);
            startActivity(i);
        }
        else if(id==5){
            Intent i=new Intent(Quick.this,Lasers.class);
            startActivity(i);
        }
        else if(id==6){
            Intent i=new Intent(Quick.this,Solid_state.class);
            startActivity(i);
        }
        else if(id==7){
            Intent i=new Intent(Quick.this,Wave_particle.class);
            startActivity(i);
        }
        else if(id==8){
            Intent i=new Intent(Quick.this,Wave_equation.class);
            startActivity(i);
        }
        else if(id==9){
            Intent i=new Intent(Quick.this,Superconductivity.class);
            startActivity(i);
        }
        else{
            Intent i=new Intent(Quick.this,Nano.class);
            startActivity(i);
        }
    }
}

