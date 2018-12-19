package com.horizon.abhijit.easycs1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Paper extends ListActivity {
    String[] paper = {"PU_2012", "PU_2013", "PU_2014", "PU_2015", "PU_2016"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, paper));
    }

    public void onListItemClick(ListView Parent, View v, int position, long id) {
        if (id == 0) {
            Intent i = new Intent(Paper.this, P2012.class);
            startActivity(i);
        } else if (id == 1) {
            Intent i = new Intent(Paper.this, P2013.class);
            startActivity(i);
        } else if (id == 2) {
            Intent i = new Intent(Paper.this, PU2014.class);
            startActivity(i);
        } else if(id == 3){
            Intent i = new Intent(Paper.this, P2015.class);
            startActivity(i);
        }
        else{
            Intent i = new Intent(Paper.this, PU_2016.class);
            startActivity(i);

        }
    }
}