package com.horizon.abhijit.easycs1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Importants extends ListActivity {
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
            "Chapter10 : Wave_equation",
            "Chapter11 : Physics of Nano Particles"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names));

    }
    public void onListItemClick(ListView Parent, View v, int position,long id){
        if(id==0){
            Intent i=new Intent(Importants.this,Impo1.class);
            startActivity(i);
        }
        else if(id==1){
            Intent i=new Intent(Importants.this,Impo2.class);
            startActivity(i);
        }
        else if(id==2){
            Intent i=new Intent(Importants.this,Impo3.class);
            startActivity(i);
        }
        else if(id==3){
            Intent i=new Intent(Importants.this,Impo4.class);
            startActivity(i);
        }
        else if(id==4){
            Intent i=new Intent(Importants.this,Impo5.class);
            startActivity(i);
        }
        else if(id==5){
            Intent i=new Intent(Importants.this,Impo6.class);
            startActivity(i);
        }
        else if(id==6){
            Intent i=new Intent(Importants.this,Impo7.class);
            startActivity(i);
        }
        else if(id==7){
            Intent i=new Intent(Importants.this,Impo8.class);
            startActivity(i);
        }
        else if(id==8){
            Intent i=new Intent(Importants.this,Impo9.class);
            startActivity(i);
        }
        else if(id==9){
            Intent i=new Intent(Importants.this,Impo10.class);
            startActivity(i);
        }
        else{
            Intent i=new Intent(Importants.this,Impo11.class);
            startActivity(i);
        }
    }
}

