    package com.example.thespinalcoders85;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

    public class InfoActivity extends AppCompatActivity {

        Spinner country;
        Button submitbtn;
        EditText nameedt, ageedt, genderedt, emailedt, phoneedt;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //for omitting country question *
        country =(Spinner)findViewById(R.id.countryspn);//setting default value of spinner

        Locale[] locales=Locale.getAvailableLocales();
        ArrayList<String> countries = new ArrayList<String>();
        for(Locale locale:locales)
        {
            String country = locale.getDisplayCountry();
            if(country.trim().length()>0&&!countries.contains(country))
            {
                countries.add(country);
            }
        }
            Collections.sort(countries);
       /* int c=0;
        for (String country:countries) {
           c++;
           if (country.equalsIgnoreCase("India"))
            System.out.println(c+ " "+country);
        }*/

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,countries);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            country.setAdapter(dataAdapter);
            country.setSelection(101);
            //* needs to be removed (and countryname in onclick

            submitbtn = (Button) findViewById(R.id.submitbtn);
            nameedt = (EditText) findViewById(R.id.nameedt);
            ageedt = (EditText) findViewById(R.id.ageedt);
            genderedt = (EditText) findViewById(R.id.genderedt);
            emailedt = (EditText) findViewById(R.id.emailedt);
            phoneedt = (EditText) findViewById(R.id.phoneedt);

            submitbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    String countryname = String.valueOf(country.getSelectedItem());
                    String name = nameedt.getText().toString();
                    String age = ageedt.getText().toString();
                    String gender = genderedt.getText().toString();
                    String email = emailedt.getText().toString();
                    String phone = phoneedt.getText().toString();

                    //data can be added to database from here
                    //database logic here
                }
            });





        }
}
