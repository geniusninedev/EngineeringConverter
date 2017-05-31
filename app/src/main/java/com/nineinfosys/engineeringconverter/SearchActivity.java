package com.nineinfosys.engineeringconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.nineinfosys.engineeringconverter.ConverterActivities.AccelerationActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.AccelerationAngularActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.DensityConverterActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.HardnessActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.MetricWeightConverterActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.MetrologyUnitConverterActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.MomentOfInertiaActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.MomentofForceActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.SpecificVolumeActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.TorqueActivity;
import com.nineinfosys.engineeringconverter.ConverterActivities.VelocityAngularActivity;


public class SearchActivity extends AppCompatActivity implements TextWatcher {


    // List view
    private ListView lv;

    private String selectedItem;
    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //customize toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Search Unit");


        // Listview Data
        String listitem[] = {

                //engineering accleration
                "Meter/square second -m/s^2",
                "Decimeter/square second -deci/s^2",
                "Kilometer/square second -km/s^2",
                "Hectometer/square second -hec/s^2",
                "Dekameter/square second -deka/s^2",
                "Centimeter/square second -cm/s^2",
                "Millimeter/square second -mm/s^2",
                "Micrometer/square second -μm/s^2",
                "Nanometer/square second -nano/s^2",
                "Picometer/square second -pico/s^2",
                "Femtometer/square second -fem/s^2",
                "Attometer/square second -A/s^2",
                "Gal -Gal",
                "Galileo -Gal",
                "Mile/square second -mi/s^2",
                "Yard/square second -yd/s^2",
                "Foot/square second -ft/s^2",
                "Inch/square second -in/s^2",
                "Acceleration of gravity -g",

                //velocity
                "Radian/second -rad/s",
                "Radian/day -rad/d",
                "Radian/hour -rad/h",
                "Radian/minute -rad/min",
                "Degree/day -°/d",
                "Degree/hour -°/h",
                "Degree/minute -°/min",
                "Degree/second -°/s",
                "Revolution/day -r/d",
                "Revolution/hour -r/h",
                "Revolution/minute -r/min",
                "Revolution/second -r/s",

                //accelerationangular
                "Radian/square second -rad/s^2",
                "Radian/square minute -rad/min^2",
                "Revolution/square second -r/s^2",
                "Revolution/minute/second -r/min/s",
                "Revolution/square minute -r/min^2",

                //density
                "Kilogram/cubic meter -kg/m^3",
                "Gram/cubic centimeter -g/cm^3,g/cc",
                "Kilogram/cubic centimeter -kg/cm^3",
                "Gram/cubic meter -g/m^3",
                "Gram/cubic millimeter -g/mm^3",
                "Milligram/cubic meter -mg/m^3",
                "Milligram/cubic centimeter -mg/cm^3",
                "Milligram/cubic millimeter -mg/mm^3",
                "Exagram/liter -Eg/L",
                "Petagram/liter -Pg/L",
                "Teragram/liter -Tg/L",
                "Gigagram/liter -Gg/L",
                "Megagram/liter -Mg/L",
                "Kilogram/liter -kg/L",
                "Hectogram/liter -hg/L",
                "Dekagram/liter -dag/L",
                "Gram/liter -g/L",
                "Decigram/liter -dg/L",
                "Centigram/liter -cg/L",
                "Milligram/liter -mg/L",
                "Microgram/liter -μg/L",
                "Nanogram/liter -ng/L",
                "Picogram/liter -pg/L",
                "Femtogram/liter -fg/L",
                "Attogram/liter -ag/L",
                "Pound/cubic inch -lb/in^3",
                "Pound/cubic foot -lb/ft^3",
                "Pound/cubic yard -lb/yd^3",
                "Pound/gallon (US) -lb/gal(US)",
                "Pound/gallon (UK) -lb/gal(UK)",
                "Ounce/cubic inch -oz/in^3",
                "Ounce/cubic foot -oz/ft^3",
                "Ounce/gallon (US) -oz/gal(US)",
                "Ounce/gallon (UK) -oz/gal(UK)",
                "Grain/gallon (US) -gr/gal(US)",
                "Grain/gallon (UK) -gr/gal(UK)",
                "Grain/cubic foot -gr/ft^3",
                "Ton (short)/cubic yard -ton/yd^3",
                "Ton (long)/cubic yard -ton/yd^3",
                "Slug/cubic foot -slug/ft^3",
                "Psi/1000 feet -psi/ft",
                "Earth's density (mean) -earth",

                //specific volume
                "Cubic meter/kilogram -M^3/kg",
                "Cubic centimeter/gram -cm^3/g",
                "Liter/kilogram -L/kg",
                "Liter/gram -L/g",
                "Cubic foot/kilogram -ft^3/kg",
                "Cubic foot/pound -ft^3/lb",
                "Gallon (US)/pound -gal(US)",
                "Gallon (UK)/pound -gal(UK)",

                //moment of inertia
                "Kilogram square meter -kg*M^2",
                "Kilogram square centimeter -kg*cm^2",
                "Kilogram square millimeter -kg*mm^2",
                "Gram square centimeter -g*cm^2",

                //moment of force
                "Newton meter -N*m",
                "Kilonewton meter -kN*m",
                "Millinewton meter -mN*m",
                "Micronewton meter -μN*m",

                //torque
                "Newton meter(torque) -N*m",
                "Newton centimeter -N*cm",
                "Newton millimeter -N*mm",
                "Kilonewton meter(torque) -kN*m",
                "Dyne meter -dyn*m",
                "Dyne centimeter -dyn*cm",
                "Dyne millimeter -dyn*mm",
                "Kilogram-force meter -kgf*m",
                "Kilogram-force centimeter -kgf*cm",
                "Kilogram-force millimeter -kgf*mm",
                "Gram-force meter -gf*m",
                "Gram-force centimeter -gf*cm",
                "Gram-force millimeter -gf*mm",
                "Ounce-force foot -ozf*ft",
                "Ounce-force inch -ozf*in",
                "Pound-force foot -lbf*ft",
                "Pound-force inch -lbf*in",

                //Hardness
                "German Degrees - °g",
                "Parts/million - p/million",
                "American Degrees - °a",
                "Clark Degrees - °c",
                "French Degrees - °f",
                "Millieqv - millieqv",
                "Milli Grams/gallon - mgr/gal",

                //metric weight
                "Microgram - µg",
                "Milligram(metric weight) - mg",
                "Centigram(metric weight) - cg",
                "Decigram(metric weight) - dg",
                "Gram(metric weight) - g",
                "Dekagram(metric weight) - dag",
                "Hectogram(metric weight) - hg",
                "Kilogram(metric weight) - kg",
                "Metricton(metric weight) - metricton",

                //metrology
                "Angstrom - angstrom",
                "Surface Microinch - µin",
                "Surface microns - microns",
                "Light bands - lightbands",
                "Precision tenths - precision tenths",
                "Close tol.thousands - closetolthousands",
                "Metric millimeters - metric mm",
                "U.S.Inches - usInches"



        };

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, listitem);
        lv.setAdapter(adapter);


        inputSearch.addTextChangedListener(this);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterView, View view, int position, long id) {

                //Do some more stuff here and launch new activity
                selectedItem = (String) adapterView.getItemAtPosition(position);
                //  Toast.makeText(SearchActivity.this,"Position"+selectedItem,Toast.LENGTH_LONG).show();
                switch (selectedItem) {


                    //velocity angular
                    case "Meter/square second -m/s^2":
                        accleration();
                        break;
                    case "Decimeter/square second -deci/s^2":
                        accleration();
                        break;
                    case "Kilometer/square second -km/s^2":
                        accleration();
                        break;
                    case "Hectometer/square second -hec/s^2":
                        accleration();
                        break;
                    case "Dekameter/square second -deka/s^2":
                        accleration();
                        break;
                    case "Centimeter/square second -cm/s^2":
                        accleration();
                        break;
                    case "Millimeter/square second -mm/s^2":
                        accleration();
                        break;
                    case "Micrometer/square second -μm/s^2":
                        accleration();
                        break;
                    case "Nanometer/square second -nano/s^2":
                        accleration();
                        break;
                    case "Picometer/square second -pico/s^2":
                        accleration();
                        break;
                    case "Femtometer/square second -fem/s^2":
                        accleration();
                        break;
                    case "Attometer/square second -A/s^2":
                        accleration();
                        break;
                    case "Gal -Gal":
                        accleration();
                        break;
                    case "Galileo -Gal":
                        accleration();
                        break;
                    case "Mile/square second -mi/s^2":
                        accleration();
                        break;
                    case "Yard/square second -yd/s^2":
                        accleration();
                        break;
                    case "Foot/square second -ft/s^2":
                        accleration();
                        break;
                    case "Inch/square second -in/s^2":
                        accleration();
                        break;
                    case "Acceleration of gravity -g":
                        accleration();
                        break;

                    //velocity angular
                    case "Radian/second -rad/s":
                        velocityangular();
                        break;
                    case "Radian/day -rad/d":
                        velocityangular();
                        break;
                    case "Radian/hour -rad/h":
                        velocityangular();
                        break;
                    case "Radian/minute -rad/min":
                        velocityangular();
                        break;
                    case "Degree/day -°/d":
                        velocityangular();
                        break;
                    case "Degree/hour -°/h":
                        velocityangular();
                        break;
                    case "Degree/minute -°/min":
                        velocityangular();
                        break;
                    case "Degree/second -°/s":
                        velocityangular();
                        break;
                    case "Revolution/day -r/d":
                        velocityangular();
                        break;
                    case "Revolution/hour -r/h":
                        velocityangular();
                        break;
                    case "Revolution/minute -r/min":
                        velocityangular();
                        break;
                    case "Revolution/second -r/s":
                        velocityangular();
                        break;

                    //accelerationangular
                    case "Radian/square second -rad/s^2":
                        accelerationangular();
                        break;
                    case "Radian/square minute -rad/min^2":
                        accelerationangular();
                        break;
                    case "Revolution/square second -r/s^2":
                        accelerationangular();
                        break;
                    case "Revolution/minute/second -r/min/s":
                        accelerationangular();
                        break;
                    case "Revolution/square minute -r/min^2":
                        accelerationangular();
                        break;

                    //density
                    case "Kilogram/cubic meter -kg/m^3":
                        density();
                        break;
                    case "Gram/cubic centimeter -g/cm^3,g/cc":
                        density();
                        break;
                    case "Kilogram/cubic centimeter -kg/cm^3":
                        density();
                        break;
                    case "Gram/cubic meter -g/m^3":
                        density();
                        break;
                    case "Gram/cubic millimeter -g/mm^3":
                        density();
                        break;
                    case "Milligram/cubic meter -mg/m^3":
                        density();
                        break;
                    case "Milligram/cubic centimeter -mg/cm^3":
                        density();
                        break;
                    case "Milligram/cubic millimeter -mg/mm^3":
                        density();
                        break;
                    case "Exagram/liter -Eg/L":
                        density();
                        break;
                    case "Petagram/liter -Pg/L":
                        density();
                        break;
                    case "Teragram/liter -Tg/L":
                        density();
                        break;
                    case "Gigagram/liter -Gg/L":
                        density();
                        break;
                    case "Megagram/liter -Mg/L":
                        density();
                        break;
                    case "Kilogram/liter -kg/L":
                        density();
                        break;
                    case "Hectogram/liter -hg/L":
                        density();
                        break;
                    case "Dekagram/liter -dag/L":
                        density();
                        break;
                    case "Gram/liter -g/L":
                        density();
                        break;
                    case "Decigram/liter -dg/L":
                        density();
                        break;
                    case "Centigram/liter -cg/L":
                        density();
                        break;
                    case "Milligram/liter -mg/L":
                        density();
                        break;
                    case "Microgram/liter -μg/L":
                        density();
                        break;
                    case "Nanogram/liter -ng/L":
                        density();
                        break;
                    case "Picogram/liter -pg/L":
                        density();
                        break;
                    case "Femtogram/liter -fg/L":
                        density();
                        break;
                    case "Attogram/liter -ag/L":
                        density();
                        break;
                    case "Pound/cubic inch -lb/in^3":
                        density();
                        break;
                    case "Pound/cubic foot -lb/ft^3":
                        density();
                        break;
                    case "Pound/cubic yard -lb/yd^3":
                        density();
                        break;
                    case "Pound/gallon (US) -lb/gal(US)":
                        density();
                        break;
                    case "Pound/gallon (UK) -lb/gal(UK)":
                        density();
                        break;
                    case "Ounce/cubic inch -oz/in^3":
                        density();
                        break;
                    case "Ounce/cubic foot -oz/ft^3":
                        density();
                        break;
                    case "Ounce/gallon (US) -oz/gal(US)":
                        density();
                        break;
                    case "Ounce/gallon (UK) -oz/gal(UK)":
                        density();
                        break;
                    case "Grain/gallon (US) -gr/gal(US)":
                        density();
                        break;
                    case "Grain/gallon (UK) -gr/gal(UK)":
                        density();
                        break;
                    case "Grain/cubic foot -gr/ft^3":
                        density();
                        break;
                    case "Ton (short)/cubic yard -ton/yd^3":
                        density();
                        break;
                    case "Ton (long)/cubic yard -ton/yd^3":
                        density();
                        break;
                    case "Slug/cubic foot -slug/ft^3":
                        density();
                        break;
                    case "Psi/1000 feet -psi/ft":
                        density();
                        break;
                    case "Earth's density (mean) -earth":
                        density();
                        break;

                    //specific volume
                    case "Cubic meter/kilogram -M^3/kg":
                        specificvolume();
                        break;
                    case "Cubic centimeter/gram -cm^3/g":
                        specificvolume();
                        break;
                    case "Liter/kilogram -L/kg":
                        specificvolume();
                        break;
                    case "Liter/gram -L/g":
                        specificvolume();
                        break;
                    case "Cubic foot/kilogram -ft^3/kg":
                        specificvolume();
                        break;
                    case "Cubic foot/pound -ft^3/lb":
                        specificvolume();
                        break;
                    case "Gallon (US)/pound -gal(US)":
                        specificvolume();
                        break;
                    case "Gallon (UK)/pound -gal(UK)":
                        specificvolume();
                        break;

                    //momentofintertia
                    case "Kilogram square meter -kg*M^2":
                        momentofinertia();
                        break;
                    case "Kilogram square centimeter -kg*cm^2":
                        momentofinertia();
                        break;
                    case "Kilogram square millimeter -kg*mm^2":
                        momentofinertia();
                        break;
                    case "Gram square centimeter -g*cm^2":
                        momentofinertia();
                        break;


                    //moment of force
                    case "Newton meter -N*m":
                        momentofforce();
                        break;
                    case "Kilonewton meter -kN*m":
                        momentofforce();
                        break;
                    case "Millinewton meter -mN*m":
                        momentofforce();
                        break;
                    case "Micronewton meter -μN*m":
                        momentofforce();
                        break;

                    //torque
                    case "Newton meter(torque) -N*m":
                        torque();
                        break;
                    case "Newton centimeter -N*cm":
                        torque();
                        break;
                    case "Newton millimeter -N*mm":
                        torque();
                        break;
                    case "Kilonewton meter(torque) -kN*m":
                        torque();
                        break;
                    case "Dyne meter -dyn*m":
                        torque();
                        break;
                    case "Dyne centimeter -dyn*cm":
                        torque();
                        break;
                    case "Dyne millimeter -dyn*mm":
                        torque();
                        break;
                    case "Kilogram-force meter -kgf*m":
                        torque();
                        break;
                    case "Kilogram-force centimeter -kgf*cm":
                        torque();
                        break;
                    case "Kilogram-force millimeter -kgf*mm":
                        torque();
                        break;
                    case "Gram-force meter -gf*m":
                        torque();
                        break;
                    case "Gram-force centimeter -gf*cm":
                        torque();
                        break;
                    case "Gram-force millimeter -gf*mm":
                        torque();
                        break;
                    case "Ounce-force foot -ozf*ft":
                        torque();
                        break;
                    case "Ounce-force inch -ozf*in":
                        torque();
                        break;
                    case "Pound-force foot -lbf*ft":
                        torque();
                        break;
                    case "Pound-force inch -lbf*in":
                        torque();
                        break;

                    //metric weight
                    case "Microgram - µg":
                        metricweight();
                        break;
                    case "Milligram(metric weight) - mg":
                        metricweight();
                        break;
                    case "Centigram(metric weight) - cg":
                        metricweight();
                        break;
                    case "Decigram(metric weight) - dg":
                        metricweight();
                        break;
                    case "Gram(metric weight) - g":
                        metricweight();
                        break;
                    case "Dekagram(metric weight) - dag":
                        metricweight();
                        break;
                    case "Hectogram(metric weight) - hg":
                        metricweight();
                        break;
                    case "Kilogram(metric weight) - kg":
                        metricweight();
                        break;
                    case "Metricton(metric weight) - metricton":
                        metricweight();
                        break;


                    //metrology
                    case "Angstrom - angstrom":
                        metrology();
                        break;
                    case "Surface Microinch - µin":
                        metrology();
                        break;
                    case "Surface microns - microns":
                        metrology();
                        break;
                    case "Light bands - lightbands":
                        metrology();
                        break;
                    case "Precision tenths - precision tenths":
                        metrology();
                        break;
                    case "Close tol.thousands - closetolthousands":
                        metrology();
                        break;
                    case "Metric millimeters - metric mm":
                        metrology();
                        break;
                    case "U.S.Inches - usInches":
                        metrology();
                        break;



                }
            }
        });
        }
    private void hardness() {
        Intent i7=new Intent(SearchActivity.this,HardnessActivity.class);
        startActivity(i7);
    }

    private void metrology() {
        Intent i7=new Intent(SearchActivity.this,MetrologyUnitConverterActivity.class);
        startActivity(i7);
    }
    private void metricweight() {
        Intent i7=new Intent(SearchActivity.this,MetricWeightConverterActivity.class);
        startActivity(i7);
    }

            private void torque() {
                Intent i7 = new Intent(SearchActivity.this, TorqueActivity.class);
                startActivity(i7);
            }

            private void momentofforce() {
                Intent i7 = new Intent(SearchActivity.this, MomentofForceActivity.class);
                startActivity(i7);
            }

            private void momentofinertia() {
                Intent i7 = new Intent(SearchActivity.this, MomentOfInertiaActivity.class);
                startActivity(i7);
            }

            private void specificvolume() {
                Intent i7 = new Intent(SearchActivity.this, SpecificVolumeActivity.class);
                startActivity(i7);
            }

            private void density() {
                Intent i7 = new Intent(SearchActivity.this, DensityConverterActivity.class);
                startActivity(i7);
            }

            private void accelerationangular() {
                Intent i7 = new Intent(SearchActivity.this, AccelerationAngularActivity.class);
                startActivity(i7);
            }

            private void velocityangular() {
                Intent i7 = new Intent(SearchActivity.this, VelocityAngularActivity.class);
                startActivity(i7);
            }

            private void accleration() {
                Intent i7 = new Intent(SearchActivity.this, AccelerationActivity.class);
                startActivity(i7);

            }




    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        SearchActivity.this.adapter.getFilter().filter(s);

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                this.finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}



