package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ArrayList<String> calcul = new ArrayList<String>();
    ArrayAdapter matching;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView liste = (ListView)findViewById(R.id.listecalcul);
        matching = new ArrayAdapter(this,android.R.layout.simple_list_item_2,calcul);
        liste.set Adapter(matching);
        liste.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View view) {
        public void butun{ setcacul(1); }
        public void butdeux{setcacul(2); }
        public void buttrois{ setcacul(3); }
        public void butquatre{ setcacul(4); }
        public void butcinq{setcacul(5); }
        public void butsix{ setcacul(6); }
        public void butsept{ setcacul(7); }
        public void buthuit{setcacul(8); }
        public void butneuf{ setcacul(9); }
        public void butplus{ setcacul(+); }
        public void butmoins{setcacul(-); }
        public void butmulti{ setcacul(*); }
    }

    private void setcacul(int i) {
    }
    /*
    private void Save throws IOException {
        try {
            FileOutputStream fout = openFileOutput("mescalculs.txt", Context.MODE_PRIVATE);
            OutputStreamWriter out = new OutputStreamWriter(fout);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
}