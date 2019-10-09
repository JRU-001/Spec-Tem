package com.example.forma;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE3 = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE4 = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinEdad);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.OpEdad, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Result.class);
        EditText editText = (EditText) findViewById(R.id.nombre);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText editText2 = (EditText) findViewById(R.id.correoT);
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);

        Spinner Spin = (Spinner) findViewById(R.id.spinEdad);
        String message3 = Spin.getSelectedItem().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);

        CalendarView Carl = (CalendarView) findViewById(R.id.calendarView);
        String message4 = Spin.getSelectedItem().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);

        startActivity(intent);

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
