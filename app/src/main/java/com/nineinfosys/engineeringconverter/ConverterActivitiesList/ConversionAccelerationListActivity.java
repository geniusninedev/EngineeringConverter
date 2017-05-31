package com.nineinfosys.engineeringconverter.ConverterActivitiesList;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.nineinfosys.engineeringconverter.Engines.AccelerationConverter;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.ItemList;
import com.nineinfosys.engineeringconverter.Supporter.Settings;
import com.nineinfosys.engineeringconverter.adapter.RecyclerViewConversionListAdapter;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConversionAccelerationListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
  private  String strmeterpersquaresecond=null,strdecimeterpersquaresecond=null,strkilometerpersquaresecond=null,strhectometerpersquaresecond=null,strdekameterpersquaresecond=null,strcentimeterpersquaresecond =null,
            strmillimeterpersquaresecond=null,strmicrometerpersquaresecond=null,strnanometerpersquaresecond=null,strpicometerpersquaresecond=null,strfemtometerpersquare=null,strattometerpersquaresecond=null,
            strgal=null,strgalileo=null,strmilepersquaresecond=null,stryardpersquaresecond=null,strfootpersquaresecond=null,strinchpersquaresecond=null,strAccelerationofgravity=null;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }

        //format of decimal pint
        formatsetting();


        edittextConversionListvalue=(EditText)findViewById(R.id.edittextConversionListvalue) ;
        textconversionFrom=(TextView) findViewById(R.id.textViewConversionFrom) ;
        textViewConversionShortform=(TextView) findViewById(R.id.textViewConversionShortform) ;

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue= getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);

        //   Toast.makeText(this,"string1 "+stringSpinnerFrom,Toast.LENGTH_LONG).show();
        rowListItem = getAllunitValue(stringSpinnerFrom,doubleEdittextvalue);

        //Initializing Views
        rView = (RecyclerView) findViewById(R.id.recyclerViewConverterList);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this, 1));


        //Initializing our superheroes list
        rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem);
        rView.setAdapter(rcAdapter);

        edittextConversionListvalue.addTextChangedListener(this);



    }

    private void NamesAndShortform(String stringSpinnerFrom) {
        switch (stringSpinnerFrom) {
            case "Meter/square second -m/s^2":
                textconversionFrom.setText("Meter/square second ");                 textViewConversionShortform.setText("m/s^2");
                break;
            case "Decimeter/square second -deci/s^2":
                textconversionFrom.setText("Decimeter/square second ");                 textViewConversionShortform.setText("deci/s^2");
                break;
            case "Kilometer/square second -km/s^2":
                textconversionFrom.setText("Kilometer/square second ");                 textViewConversionShortform.setText("km/s^2");
                break;
            case "Hectometer/square second -hec/s^2":
                textconversionFrom.setText("Hectometer/square second ");                 textViewConversionShortform.setText("hec/s^2");
                break;
            case "Dekameter/square second -deka/s^2":
                textconversionFrom.setText("Dekameter/square second ");                 textViewConversionShortform.setText("deka/s^2");
                break;
            case "Centimeter/square second -cm/s^2":
                textconversionFrom.setText("Centimeter/square second ");                 textViewConversionShortform.setText("cm/s^2");
                break;
            case "Millimeter/square second -mm/s^2":
                textconversionFrom.setText("Millimeter/square second ");                 textViewConversionShortform.setText("mm/s^2");
                break;
            case "Micrometer/square second -μm/s^2":
                textconversionFrom.setText("Micrometer/square second ");                 textViewConversionShortform.setText("μm/s^2");
                break;
            case "Nanometer/square second -nano/s^2":
                textconversionFrom.setText("Nanometer/square second ");                 textViewConversionShortform.setText("nano/s^2");
                break;
            case "Picometer/square second -pico/s^2":
                textconversionFrom.setText("Picometer/square second ");                 textViewConversionShortform.setText("pico/s^2");
                break;
            case "Femtometer/square second -fem/s^2":
                textconversionFrom.setText("Femtometer/square second ");                 textViewConversionShortform.setText("fem/s^2");
                break;
            case "Attometer/square second -A/s^2":
                textconversionFrom.setText("Attometer/square second ");                 textViewConversionShortform.setText("A/s^2");
                break;
            case "Gal -Gal":
                textconversionFrom.setText("Gal ");                 textViewConversionShortform.setText("Gal");
                break;
            case "Galileo -Gal":
                textconversionFrom.setText("Galileo ");                 textViewConversionShortform.setText("Gal");
                break;
            case "Mile/square second -mi/s^2":
                textconversionFrom.setText("Mile/square second ");                 textViewConversionShortform.setText("mi/s^2");
                break;
            case "Yard/square second -yd/s^2":
                textconversionFrom.setText("Yard/square second ");                 textViewConversionShortform.setText("yd/s^2");
                break;
            case "Foot/square second -ft/s^2":
                textconversionFrom.setText("Foot/square second ");                 textViewConversionShortform.setText("ft/s^2");
                break;
            case "Inch/square second -in/s^2":
                textconversionFrom.setText("Inch/square second ");                 textViewConversionShortform.setText("in/s^2");
                break;
            case "Acceleration of gravity -g":
                textconversionFrom.setText("Acceleration of gravity ");                 textViewConversionShortform.setText("g");
                break;
        }
    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences =this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String  FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF,"Thousands separator");
        String DecimalplaceString= sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF,"2");
        Settings settings=new Settings(FormattedString,DecimalplaceString);
        formatter= settings.setting();
    }

    private List<ItemList> getAllunitValue(String strSpinnerFrom,double doubleEdittextvalue1) {

        AccelerationConverter c = new  AccelerationConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<AccelerationConverter.ConversionResults> results = c.calculateAccelerationConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            AccelerationConverter.ConversionResults item = results.get(i);

            strmeterpersquaresecond=String.valueOf(formatter.format(item.getMeterpersquaresecond()));
            strdecimeterpersquaresecond=String.valueOf(formatter.format(item.getDecimeterpersquaresecond()));
            strkilometerpersquaresecond=String.valueOf(formatter.format(item.getKilometerpersquaresecond()));
            strhectometerpersquaresecond=String.valueOf(formatter.format(item.getHectometerpersquaresecond()));
            strdekameterpersquaresecond=String.valueOf(formatter.format(item.getDekameterpersquaresecond()));
            strcentimeterpersquaresecond=String.valueOf(formatter.format(item.getCentimeterpersquaresecond()));
            strmillimeterpersquaresecond=String.valueOf(formatter.format(item.getMillimeterpersquaresecond()));
            strmicrometerpersquaresecond=String.valueOf(formatter.format(item.getMicrometerpersquaresecond()));
            strnanometerpersquaresecond=String.valueOf(formatter.format(item.getNanometerpersquaresecond()));
            strpicometerpersquaresecond=String.valueOf(formatter.format(item.getPicometerpersquaresecond()));
            strfemtometerpersquare=String.valueOf(formatter.format(item.getFemtometerpersquare()));
            strattometerpersquaresecond=String.valueOf(formatter.format(item.getAttometerpersquaresecond()));
            strgal=String.valueOf(formatter.format(item.getGal()));
            strgalileo=String.valueOf(formatter.format(item.getGalileo()));
            strmilepersquaresecond=String.valueOf(formatter.format(item.getMilepersquaresecond()));
            stryardpersquaresecond=String.valueOf(formatter.format(item.getYardpersquaresecond()));
            strfootpersquaresecond=String.valueOf(formatter.format(item.getFootpersquaresecond()));
            strinchpersquaresecond=String.valueOf(formatter.format(item.getInchpersquaresecond()));
            strAccelerationofgravity=String.valueOf(formatter.format(item.getAccelerationofgravity()));


            list.add(new ItemList("m/s^2","Meter/square second ",strmeterpersquaresecond,"m/s^2"));
            list.add(new ItemList("deci/s^2","Decimeter/square second ",strdecimeterpersquaresecond,"deci/s^2"));
            list.add(new ItemList("km/s^2","Kilometer/square second ",strkilometerpersquaresecond,"km/s^2"));
            list.add(new ItemList("hec/s^2","Hectometer/square second ",strhectometerpersquaresecond,"hec/s^2"));
            list.add(new ItemList("deka/s^2","Dekameter/square second ",strdekameterpersquaresecond,"deka/s^2"));
            list.add(new ItemList("cm/s^2","Centimeter/square second ",strcentimeterpersquaresecond,"cm/s^2"));
            list.add(new ItemList("mm/s^2","Millimeter/square second ",strmillimeterpersquaresecond,"mm/s^2"));
            list.add(new ItemList("μm/s^2","Micrometer/square second ",strmicrometerpersquaresecond,"μm/s^2"));
            list.add(new ItemList("nano/s^2","Nanometer/square second ",strnanometerpersquaresecond,"nano/s^2"));
            list.add(new ItemList("pico/s^2","Picometer/square second ",strpicometerpersquaresecond,"pico/s^2"));
            list.add(new ItemList("fem/s^2","Femtometer/square second ",strfemtometerpersquare,"fem/s^2"));
            list.add(new ItemList("A/s^2","Attometer/square second ",strattometerpersquaresecond,"A/s^2"));
            list.add(new ItemList("Gal","Gal ",strgal,"Gal"));
            list.add(new ItemList("Gal","Galileo ",strgalileo,"Gal"));
            list.add(new ItemList("mi/s^2","Mile/square second ",strmilepersquaresecond,"mi/s^2"));
            list.add(new ItemList("yd/s^2","Yard/square second ",stryardpersquaresecond,"yd/s^2"));
            list.add(new ItemList("ft/s^2","Foot/square second ",strfootpersquaresecond,"ft/s^2"));
            list.add(new ItemList("in/s^2","Inch/square second ",strinchpersquaresecond,"in/s^2"));
            list.add(new ItemList("g","Acceleration of gravity ",strAccelerationofgravity,"g"));



        }
        return list;

    }
   /* @Override
    protected void onRestart() {

        // TODO Auto-generated method stub
        super.onRestart();
        Intent i = new Intent(ConversionTempListActivity.this, ConversionTempListActivity.class);
        i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
        i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
        startActivity(i);
        finish();

    }*/

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


        rowListItem.clear();
        try {

           double value = Double.parseDouble(edittextConversionListvalue.getText().toString().trim());

            rowListItem1 = getAllunitValue(stringSpinnerFrom,value);


            rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem1);
            rView.setAdapter(rcAdapter);

        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
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
