package com.nineinfosys.engineeringconverter.ConverterActivitiesList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;


import com.nineinfosys.engineeringconverter.Engines.Hardness;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.ItemList;
import com.nineinfosys.engineeringconverter.Supporter.Settings;
import com.nineinfosys.engineeringconverter.adapter.RecyclerViewConversionListAdapter;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionHardnessListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;


    private Hardness.ConversionResults item;
    private String strgermandegrees=null,strpartspermillion=null,stramericandegrees=null,strclarkdegrees=null,strfrenchdegrees=null,strmillieqv =null,strmilligramspergallon=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a05445")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#6e291d"));
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

            case "German Degrees - °g":
               textconversionFrom.setText("German Degrees");
                textViewConversionShortform.setText("°g");
                break;
            case "Parts/million - p/million":
               textconversionFrom.setText("Parts/million");
                textViewConversionShortform.setText("p/million");
                break;

            case "American Degrees - °a":
               textconversionFrom.setText("American Degrees");
                textViewConversionShortform.setText("°a");
                break;
            case "Clark Degrees - °c":
               textconversionFrom.setText("Clark Degrees");
                textViewConversionShortform.setText("°c");
                break;
            case "French Degrees - °f":
               textconversionFrom.setText("French Degrees");
                textViewConversionShortform.setText("°f");
                break;
            case "Millieqv - millieqv":
               textconversionFrom.setText("Millieqv");
                textViewConversionShortform.setText("millieqv");
                break;
            case "Milli Grams/gallon - mgr/gal":
               textconversionFrom.setText("Milli Grams/gallon");
                textViewConversionShortform.setText("mgr/gal");
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
        Hardness c = new Hardness(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<Hardness.ConversionResults> results = c.calculateHardnessConversions();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strgermandegrees= String.valueOf(formatter.format(item.getGermandegrees()));
            strpartspermillion= String.valueOf(formatter.format(item.getPartspermillion()));
            stramericandegrees= String.valueOf(formatter.format(item.getAmericandegrees()));
            strclarkdegrees= String.valueOf(formatter.format(item.getClarkdegrees()));
            strfrenchdegrees= String.valueOf(formatter.format(item.getFrenchdegrees()));
            strmillieqv = String.valueOf(formatter.format(item.getMillieqv()));
            strmilligramspergallon=String.valueOf(formatter.format(item.getMilligramspergallon()));


            list.add(new ItemList("°g","German Degrees",strgermandegrees,"°g"));
            list.add(new ItemList("p/million","Parts/million",strpartspermillion,"p/million"));
            list.add(new ItemList("°a","American Degrees",stramericandegrees,"°a"));
            list.add(new ItemList("°c","Clark Degrees",strclarkdegrees,"°c"));
            list.add(new ItemList("°f","French Degrees",strfrenchdegrees,"°f"));
            list.add(new ItemList("millieqv","Millieqv",strmillieqv,"millieqv"));
            list.add(new ItemList("mgr/gal","Milli Grams/gallon",strmilligramspergallon,"mgr/gal"));




        }
        return list;

    }

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
