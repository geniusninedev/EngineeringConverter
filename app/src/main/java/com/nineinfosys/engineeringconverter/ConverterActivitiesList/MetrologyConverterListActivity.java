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


import com.nineinfosys.engineeringconverter.Engines.MetrologyConverter;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.ItemList;
import com.nineinfosys.engineeringconverter.Supporter.Settings;
import com.nineinfosys.engineeringconverter.adapter.RecyclerViewConversionListAdapter;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MetrologyConverterListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    private String strangstrom = null;
    private String strsurfaceMicroinch = null;
    private String strsurfacemicrons = null;
    private String strlightbands = null;
    private  String strprecisiontenths = null;
    private String strclosetolthousands = null;
    private String strmilimeters = null;
    private String strusInches = null;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#277aa3")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#004e74"));
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
            case "Angstrom - angstrom":
                textconversionFrom.setText("Angstrom");
                textViewConversionShortform.setText("angstrom");
                break;
            case "Surface Microinch - µin":
                textconversionFrom.setText("Surface Microinch");
                textViewConversionShortform.setText("µin");
                break;
            case "Surface microns - microns":
                textconversionFrom.setText("Surface microns");
                textViewConversionShortform.setText("microns");
                break;
            case "Light bands - lightbands":
                textconversionFrom.setText("Light bands");
                textViewConversionShortform.setText("lightbands");
                break;


            case "Precision tenths - precision tenths":
                textconversionFrom.setText("Precision tenths");
                textViewConversionShortform.setText("precision tenths");
                break;

            case "Close tol.thousands - closetolthousands":
                textconversionFrom.setText("Close tol.thousands");
                textViewConversionShortform.setText("closetolthousands");
                break;

            case "Metric millimeters - metric mm":
                textconversionFrom.setText("Metric millimeters");
                textViewConversionShortform.setText("metric mm");
                break;
            case "U.S.Inches - usInches":
                textconversionFrom.setText("U.S.Inches");
                textViewConversionShortform.setText("usInches");
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
        MetrologyConverter c = new MetrologyConverter(strSpinnerFrom, (int) doubleEdittextvalue1);
        ArrayList<MetrologyConverter.ConversionResults> results = c.calculatemetrologyConversions();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            MetrologyConverter.ConversionResults item = results.get(i);

            strangstrom = String.valueOf(formatter.format(item.getAngstrom()));
            strsurfaceMicroinch =String.valueOf(formatter.format(item.getSurfaceMicroinch()));
            strsurfacemicrons =String.valueOf(formatter.format(item.getMicrons()));
            strlightbands =String.valueOf(formatter.format(item.getLightbands()));
            strprecisiontenths = String.valueOf(formatter.format(item.getPrecisiontenths()));
            strclosetolthousands =String.valueOf(formatter.format(item.getClosetolthousands()));
            strmilimeters = String.valueOf(formatter.format(item.getMilimeters()));
            strusInches =String.valueOf(formatter.format(item.getUsInches()));




            list.add(new ItemList("angstrom","Angstrom",strangstrom,"angstrom"));
            list.add(new ItemList("µin","Milligram",strsurfaceMicroinch,"µin"));
            list.add(new ItemList("microns","Surface microns",strsurfacemicrons,"microns"));
            list.add(new ItemList("lightbands","Light bands",strlightbands,"lightbands"));
            list.add(new ItemList("precision tenths","Precision tenths",strprecisiontenths,"precision tenths"));
            list.add(new ItemList("closetolthousands","Close tol.thousands",strclosetolthousands,"closetolthousands"));
            list.add(new ItemList("metric mm","Metric millimeters",strmilimeters,"metric mm"));
            list.add(new ItemList("usInches","U.S.Inches",strusInches,"usInches"));


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
