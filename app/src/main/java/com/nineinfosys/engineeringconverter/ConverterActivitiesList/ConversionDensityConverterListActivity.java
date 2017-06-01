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


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.engineeringconverter.Engines.DensityConverter;
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

public class ConversionDensityConverterListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;

  private   String strkilogrampercubicmeter=null,strgrampercubiccentimeter=null,strkilogrampercubiccentimeter=null,strgrampercubicmeter=null,strgrampercubicmillimeter=null,strmilligrampercubicmeter=null,
            strmilligrampercubiccentimeter =null,strmilligrampercubicmillimeter=null,strexagramperliter=null,strpetagramperliter=null,strteragramperliter=null,strgigagramperliter=null,
            strmegagramperliter=null,strkilogramperliter=null,strhectogramperliter=null,strdekagramperliter =null,strgramperliter=null,strdecigramperliter=null,strcentigramperliter=null,
            strmilligramperliter=null,strmicrogramperliter=null,strnanogramperliter=null,strpicogramperliter=null,strfemtogramperliter =null,strattogramperliter=null,strpoundpercubicinch=null,
            strpoundpercubicfoot=null,strpoundpercubicyard=null,strpoundpergallonUS=null,strpoundpergallonUK=null,strouncepercubicinch=null,strouncecubicfoot =null,strouncepergallonUS=null,
            strouncegallonUK=null,strgrainpergallonUS=null,strgrainpergallonUK=null,strgrainpercubicfoot=null,strtonshortpercubicyard=null,strtonlongpercubicyard=null,strslugpercubicfoot=null,
            strpsiper1000feet=null,strEarthsdensitymean=null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        MobileAds.initialize(ConversionDensityConverterListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1976d2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#004ba0"));
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
            case "Kilogram/cubic meter -kg/m^3":
                textconversionFrom.setText("Kilogram/cubic meter ");                 textViewConversionShortform.setText("kg/m^3");
                break;
            case "Gram/cubic centimeter -g/cm^3,g/cc":
                textconversionFrom.setText("Gram/cubic centimeter ");                 textViewConversionShortform.setText("g/cm^3,g/cc");
                break;
            case "Kilogram/cubic centimeter -kg/cm^3":
                textconversionFrom.setText("Kilogram/cubic centimeter ");                 textViewConversionShortform.setText("kg/cm^3");
                break;
            case "Gram/cubic meter -g/m^3":
                textconversionFrom.setText("Gram/cubic meter ");                 textViewConversionShortform.setText("g/m^3");
                break;
            case "Gram/cubic millimeter -g/mm^3":
                textconversionFrom.setText("Gram/cubic millimeter ");                 textViewConversionShortform.setText("g/mm^3");
                break;
            case "Milligram/cubic meter -mg/m^3":
                textconversionFrom.setText("Milligram/cubic meter ");                 textViewConversionShortform.setText("mg/m^3");
                break;
            case "Milligram/cubic centimeter -mg/cm^3":
                textconversionFrom.setText("Milligram/cubic centimeter ");                 textViewConversionShortform.setText("mg/cm^3");
                break;
            case "Milligram/cubic millimeter -mg/mm^3":
                textconversionFrom.setText("Milligram/cubic millimeter ");                 textViewConversionShortform.setText("mg/mm^3");
                break;
            case "Exagram/liter -Eg/L":
                textconversionFrom.setText("Exagram/liter ");                 textViewConversionShortform.setText("Eg/L");
                break;
            case "Petagram/liter -Pg/L":
                textconversionFrom.setText("Petagram/liter ");                 textViewConversionShortform.setText("Pg/L");
                break;
            case "Teragram/liter -Tg/L":
                textconversionFrom.setText("Teragram/liter ");                 textViewConversionShortform.setText("Tg/L");
                break;
            case "Gigagram/liter -Gg/L":
                textconversionFrom.setText("Gigagram/liter ");                 textViewConversionShortform.setText("Gg/L");
                break;
            case "Megagram/liter -Mg/L":
                textconversionFrom.setText("Megagram/liter ");                 textViewConversionShortform.setText("Mg/L");
                break;
            case "Kilogram/liter -kg/L":
                textconversionFrom.setText("Kilogram/liter ");                 textViewConversionShortform.setText("kg/L");
                break;
            case "Hectogram/liter -hg/L":
                textconversionFrom.setText("Hectogram/liter ");                 textViewConversionShortform.setText("hg/L");
                break;
            case "Dekagram/liter -dag/L":
                textconversionFrom.setText("Dekagram/liter ");                 textViewConversionShortform.setText("dag/L");
                break;
            case "Gram/liter -g/L":
                textconversionFrom.setText("Gram/liter ");                 textViewConversionShortform.setText("g/L");
                break;
            case "Decigram/liter -dg/L":
                textconversionFrom.setText("Decigram/liter ");                 textViewConversionShortform.setText("dg/L");
                break;
            case "Centigram/liter -cg/L":
                textconversionFrom.setText("Centigram/liter ");                 textViewConversionShortform.setText("cg/L");
                break;
            case "Milligram/liter -mg/L":
                textconversionFrom.setText("Milligram/liter ");                 textViewConversionShortform.setText("mg/L");
                break;
            case "Microgram/liter -μg/L":
                textconversionFrom.setText("Microgram/liter ");                 textViewConversionShortform.setText("μg/L");
                break;
            case "Nanogram/liter -ng/L":
                textconversionFrom.setText("Nanogram/liter ");                 textViewConversionShortform.setText("ng/L");
                break;
            case "Picogram/liter -pg/L":
                textconversionFrom.setText("Picogram/liter ");                 textViewConversionShortform.setText("pg/L");
                break;
            case "Femtogram/liter -fg/L":
                textconversionFrom.setText("Femtogram/liter ");                 textViewConversionShortform.setText("fg/L");
                break;
            case "Attogram/liter -ag/L":
                textconversionFrom.setText("Attogram/liter ");                 textViewConversionShortform.setText("ag/L");
                break;
            case "Pound/cubic inch -lb/in^3":
                textconversionFrom.setText("Pound/cubic inch ");                 textViewConversionShortform.setText("lb/in^3");
                break;
            case "Pound/cubic foot -lb/ft^3":
                textconversionFrom.setText("Pound/cubic foot ");                 textViewConversionShortform.setText("lb/ft^3");
                break;
            case "Pound/cubic yard -lb/yd^3":
                textconversionFrom.setText("Pound/cubic yard ");                 textViewConversionShortform.setText("lb/yd^3");
                break;
            case "Pound/gallon (US) -lb/gal(US)":
                textconversionFrom.setText("Pound/gallon (US) ");                 textViewConversionShortform.setText("lb/gal(US)");
                break;
            case "Pound/gallon (UK) -lb/gal(UK)":
                textconversionFrom.setText("Pound/gallon (UK) ");                 textViewConversionShortform.setText("lb/gal(UK)");
                break;
            case "Ounce/cubic inch -oz/in^3":
                textconversionFrom.setText("Ounce/cubic inch ");                 textViewConversionShortform.setText("oz/in^3");
                break;
            case "Ounce/cubic foot -oz/ft^3":
                textconversionFrom.setText("Ounce/cubic foot ");                 textViewConversionShortform.setText("oz/ft^3");
                break;
            case "Ounce/gallon (US) -oz/gal(US)":
                textconversionFrom.setText("Ounce/gallon (US) ");                 textViewConversionShortform.setText("oz/gal(US)");
                break;
            case "Ounce/gallon (UK) -oz/gal(UK)":
                textconversionFrom.setText("Ounce/gallon (UK) ");                 textViewConversionShortform.setText("oz/gal(UK)");
                break;
            case "Grain/gallon (US) -gr/gal(US)":
                textconversionFrom.setText("Grain/gallon (US) ");                 textViewConversionShortform.setText("gr/gal(US)");
                break;
            case "Grain/gallon (UK) -gr/gal(UK)":
                textconversionFrom.setText("Grain/gallon (UK) ");                 textViewConversionShortform.setText("gr/gal(UK)");
                break;
            case "Grain/cubic foot -gr/ft^3":
                textconversionFrom.setText("Grain/cubic foot ");                 textViewConversionShortform.setText("gr/ft^3");
                break;
            case "Ton (short)/cubic yard -ton/yd^3":
                textconversionFrom.setText("Ton (short)/cubic yard ");                 textViewConversionShortform.setText("ton/yd^3");
                break;
            case "Ton (long)/cubic yard -ton/yd^3":
                textconversionFrom.setText("Ton (long)/cubic yard ");                 textViewConversionShortform.setText("ton/yd^3");
                break;
            case "Slug/cubic foot -slug/ft^3":
                textconversionFrom.setText("Slug/cubic foot ");                 textViewConversionShortform.setText("slug/ft^3");
                break;
            case "Psi/1000 feet -psi/ft":
                textconversionFrom.setText("Psi/1000 feet ");                 textViewConversionShortform.setText("psi/ft");
                break;
            case "Earth's density (mean) -earth":
                textconversionFrom.setText("Earth's density (mean) ");                 textViewConversionShortform.setText("earth");
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

        DensityConverter c = new  DensityConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<DensityConverter.ConversionResults> results = c.calculateDensityConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            DensityConverter.ConversionResults item = results.get(i);



            strkilogrampercubicmeter=String.valueOf(formatter.format(item.getKilogrampercubicmeter()));
            strgrampercubiccentimeter=String.valueOf(formatter.format(item.getGrampercubiccentimeter()));
            strkilogrampercubiccentimeter=String.valueOf(formatter.format(item.getKilogrampercubiccentimeter()));
            strgrampercubicmeter=String.valueOf(formatter.format(item.getGrampercubicmeter()));
            strgrampercubicmillimeter=String.valueOf(formatter.format(item.getGrampercubicmillimeter()));
            strmilligrampercubicmeter=String.valueOf(formatter.format(item.getMilligrampercubicmeter()));
            strmilligrampercubiccentimeter=String.valueOf(formatter.format(item.getMilligrampercubiccentimeter()));
            strmilligrampercubicmillimeter=String.valueOf(formatter.format(item.getMilligrampercubicmillimeter()));
            strexagramperliter=String.valueOf(formatter.format(item.getExagramperliter()));
            strpetagramperliter=String.valueOf(formatter.format(item.getPetagramperliter()));
            strteragramperliter=String.valueOf(formatter.format(item.getTeragramperliter()));
            strgigagramperliter=String.valueOf(formatter.format(item.getGigagramperliter()));
            strmegagramperliter=String.valueOf(formatter.format(item.getMegagramperliter()));
            strkilogramperliter=String.valueOf(formatter.format(item.getKilogramperliter()));
            strhectogramperliter=String.valueOf(formatter.format(item.getHectogramperliter()));
            strdekagramperliter=String.valueOf(formatter.format(item.getDekagramperliter()));
            strgramperliter=String.valueOf(formatter.format(item.getGramperliter()));
            strdecigramperliter=String.valueOf(formatter.format(item.getDecigramperliter()));
            strcentigramperliter=String.valueOf(formatter.format(item.getCentigramperliter()));
            strmilligramperliter=String.valueOf(formatter.format(item.getMilligramperliter()));
            strmicrogramperliter=String.valueOf(formatter.format(item.getMicrogramperliter()));
            strnanogramperliter=String.valueOf(formatter.format(item.getNanogramperliter()));
            strpicogramperliter=String.valueOf(formatter.format(item.getPicogramperliter()));
            strfemtogramperliter=String.valueOf(formatter.format(item.getFemtogramperliter()));
            strattogramperliter=String.valueOf(formatter.format(item.getAttogramperliter()));
            strpoundpercubicinch=String.valueOf(formatter.format(item.getPoundpercubicinch()));
            strpoundpercubicfoot=String.valueOf(formatter.format(item.getPoundpercubicfoot()));
            strpoundpercubicyard=String.valueOf(formatter.format(item.getPoundpercubicyard()));
            strpoundpergallonUS=String.valueOf(formatter.format(item.getPoundpergallonUS()));
            strpoundpergallonUK=String.valueOf(formatter.format(item.getPoundpergallonUK()));
            strouncepercubicinch=String.valueOf(formatter.format(item.getOuncepercubicinch()));
            strouncecubicfoot=String.valueOf(formatter.format(item.getOuncecubicfoot()));
            strouncepergallonUS=String.valueOf(formatter.format(item.getOuncepergallonUS()));
            strouncegallonUK=String.valueOf(formatter.format(item.getOuncegallonUK()));
            strgrainpergallonUS=String.valueOf(formatter.format(item.getGrainpergallonUS()));
            strgrainpergallonUK=String.valueOf(formatter.format(item.getGrainpergallonUK()));
            strgrainpercubicfoot=String.valueOf(formatter.format(item.getGrainpercubicfoot()));
            strtonshortpercubicyard=String.valueOf(formatter.format(item.getTonshortpercubicyard()));
            strtonlongpercubicyard=String.valueOf(formatter.format(item.getTonlongpercubicyard()));
            strslugpercubicfoot=String.valueOf(formatter.format(item.getSlugpercubicfoot()));
            strpsiper1000feet=String.valueOf(formatter.format(item.getPsiper1000feet()));
            strEarthsdensitymean=String.valueOf(formatter.format(item.getEarthsdensitymean()));

            list.add(new ItemList("kg/m^3","Kilogram/cubic meter ",strkilogrampercubicmeter,"kg/m^3"));
            list.add(new ItemList("g/cm^3,g/cc","Gram/cubic centimeter ",strgrampercubiccentimeter,"g/cm^3,g/cc"));
            list.add(new ItemList("kg/cm^3","Kilogram/cubic centimeter ",strkilogrampercubiccentimeter,"kg/cm^3"));
            list.add(new ItemList("g/m^3","Gram/cubic meter ",strgrampercubicmeter,"g/m^3"));
            list.add(new ItemList("g/mm^3","Gram/cubic millimeter ",strgrampercubicmillimeter,"g/mm^3"));
            list.add(new ItemList("mg/m^3","Milligram/cubic meter ",strmilligrampercubicmeter,"mg/m^3"));
            list.add(new ItemList("mg/cm^3","Milligram/cubic centimeter ",strmilligrampercubiccentimeter,"mg/cm^3"));
            list.add(new ItemList("mg/mm^3","Milligram/cubic millimeter ",strmilligrampercubicmillimeter,"mg/mm^3"));
            list.add(new ItemList("Eg/L","Exagram/liter ",strexagramperliter,"Eg/L"));
            list.add(new ItemList("Pg/L","Petagram/liter ",strpetagramperliter,"Pg/L"));
            list.add(new ItemList("Tg/L","Teragram/liter ",strteragramperliter,"Tg/L"));
            list.add(new ItemList("Gg/L","Gigagram/liter ",strgigagramperliter,"Gg/L"));
            list.add(new ItemList("Mg/L","Megagram/liter ",strmegagramperliter,"Mg/L"));
            list.add(new ItemList("kg/L","Kilogram/liter ",strkilogramperliter,"kg/L"));
            list.add(new ItemList("hg/L","Hectogram/liter ",strhectogramperliter,"hg/L"));
            list.add(new ItemList("dag/L","Dekagram/liter ",strdekagramperliter,"dag/L"));
            list.add(new ItemList("g/L","Gram/liter ",strgramperliter,"g/L"));
            list.add(new ItemList("dg/L","Decigram/liter ",strdecigramperliter,"dg/L"));
            list.add(new ItemList("cg/L","Centigram/liter ",strcentigramperliter,"cg/L"));
            list.add(new ItemList("mg/L","Milligram/liter ",strmilligramperliter,"mg/L"));
            list.add(new ItemList("μg/L","Microgram/liter ",strmicrogramperliter,"μg/L"));
            list.add(new ItemList("ng/L","Nanogram/liter ",strnanogramperliter,"ng/L"));
            list.add(new ItemList("pg/L","Picogram/liter ",strpicogramperliter,"pg/L"));
            list.add(new ItemList("fg/L","Femtogram/liter ",strfemtogramperliter,"fg/L"));
            list.add(new ItemList("ag/L","Attogram/liter ",strattogramperliter,"ag/L"));
            list.add(new ItemList("lb/in^3","Pound/cubic inch ",strpoundpercubicinch,"lb/in^3"));
            list.add(new ItemList("lb/ft^3","Pound/cubic foot ",strpoundpercubicfoot,"lb/ft^3"));
            list.add(new ItemList("lb/yd^3","Pound/cubic yard ",strpoundpercubicyard,"lb/yd^3"));
            list.add(new ItemList("lb/gal(US)","Pound/gallon (US) ",strpoundpergallonUS,"lb/gal(US)"));
            list.add(new ItemList("lb/gal(UK)","Pound/gallon (UK) ",strpoundpergallonUK,"lb/gal(UK)"));
            list.add(new ItemList("oz/in^3","Ounce/cubic inch ",strouncepercubicinch,"oz/in^3"));
            list.add(new ItemList("oz/ft^3","Ounce/cubic foot ",strouncecubicfoot,"oz/ft^3"));
            list.add(new ItemList("oz/gal(US)","Ounce/gallon (US) ",strouncepergallonUS,"oz/gal(US)"));
            list.add(new ItemList("oz/gal(UK)","Ounce/gallon (UK) ",strouncegallonUK,"oz/gal(UK)"));
            list.add(new ItemList("gr/gal(US)","Grain/gallon (US) ",strgrainpergallonUS,"gr/gal(US)"));
            list.add(new ItemList("gr/gal(UK)","Grain/gallon (UK) ",strgrainpergallonUK,"gr/gal(UK)"));
            list.add(new ItemList("gr/ft^3","Grain/cubic foot ",strgrainpercubicfoot,"gr/ft^3"));
            list.add(new ItemList("ton/yd^3","Ton (short)/cubic yard ",strtonshortpercubicyard,"ton/yd^3"));
            list.add(new ItemList("ton/yd^3","Ton (long)/cubic yard ",strtonlongpercubicyard,"ton/yd^3"));
            list.add(new ItemList("slug/ft^3","Slug/cubic foot ",strslugpercubicfoot,"slug/ft^3"));
            list.add(new ItemList("psi/ft","Psi/1000 feet ",strpsiper1000feet,"psi/ft"));
            list.add(new ItemList("earth","Earth's density (mean) ",strEarthsdensitymean,"earth"));



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

