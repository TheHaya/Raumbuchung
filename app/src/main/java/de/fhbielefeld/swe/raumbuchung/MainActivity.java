package de.fhbielefeld.swe.raumbuchung;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addItem(String s) {
        arrayList.add(s);
    }

    public void deleteItem(int position) {
        arrayList.remove(position);
    }
}
