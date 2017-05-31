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


import com.nineinfosys.engineeringconverter.Engines.MomentofForceConverter;
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

public class ConversionMomentofForceListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
   private String strnewtonmeter=null,strkilonewtonmeter=null,strmillinewtonmeter=null,strmicronewtonmeter=null,strtonforceshortmeter=null,strtonforcelongmeter=null,strtonforcemetricmeter=null,
            strkilogramforcemeter =null,strgramforcecentimeter=null,strpoundforcefoot=null,strpoundalfoot=null,strpoundalinch=null;

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
            case "Newton meter -N*m":
                textconversionFrom.setText("Newton meter ");                 textViewConversionShortform.setText("N*m");
                break;
            case "Kilonewton meter -kN*m":
                textconversionFrom.setText("Kilonewton meter");                 textViewConversionShortform.setText("kN*m");
                break;
            case "Millinewton meter -mN*m":
                textconversionFrom.setText("Millinewton meter ");                 textViewConversionShortform.setText("mN*m");
                break;
            case "Micronewton meter -μN*m":
                textconversionFrom.setText("Micronewton meter ");                 textViewConversionShortform.setText("μN*m");
                break;
            case "Ton-force (short) meter -ton*m":
                textconversionFrom.setText("Ton-force (short) meter ");                 textViewConversionShortform.setText("ton*m");
                break;
            case "Ton-force (long) meter -ton*m":
                textconversionFrom.setText("Ton-force (long) meter ");                 textViewConversionShortform.setText("ton*m");
                break;
            case "Ton-force (metric) meter -ton*m":
                textconversionFrom.setText("Ton-force (metric) meter ");                 textViewConversionShortform.setText("ton*m");
                break;
            case "Kilogram-force meter -kgf*m":
                textconversionFrom.setText("Kilogram-force meter ");                 textViewConversionShortform.setText("kgf*m");
                break;
            case "Gram-force centimeter -gf*cm":
                textconversionFrom.setText("Gram-force centimeter ");                 textViewConversionShortform.setText("gf*cm");
                break;
            case "Pound-force foot -lbf*ft":
                textconversionFrom.setText("Pound-force foot ");                 textViewConversionShortform.setText("lbf*ft");
                break;
            case "Poundal foot -pdl*ft":
                textconversionFrom.setText("Poundal foot ");                 textViewConversionShortform.setText("pdl*ft");
                break;
            case "Poundal inch -pdl*in":
                textconversionFrom.setText("Poundal inch ");                 textViewConversionShortform.setText("pdl*in");
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

        MomentofForceConverter c = new  MomentofForceConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<MomentofForceConverter.ConversionResults> results = c.calculateMomentofForceConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            MomentofForceConverter.ConversionResults item = results.get(i);


            strnewtonmeter=String.valueOf(formatter.format(item.getNewtonmeter()));
            strkilonewtonmeter=String.valueOf(formatter.format(item.getKilonewtonmeter()));
            strmillinewtonmeter=String.valueOf(formatter.format(item.getMillinewtonmeter()));
            strmicronewtonmeter=String.valueOf(formatter.format(item.getMicronewtonmeter()));
            strtonforceshortmeter=String.valueOf(formatter.format(item.getTonforceshortmeter()));
            strtonforcelongmeter=String.valueOf(formatter.format(item.getTonforcelongmeter()));
            strtonforcemetricmeter=String.valueOf(formatter.format(item.getTonforcemetricmeter()));
            strkilogramforcemeter=String.valueOf(formatter.format(item.getKilogramforcemeter()));
            strgramforcecentimeter=String.valueOf(formatter.format(item.getGramforcecentimeter()));
            strpoundforcefoot=String.valueOf(formatter.format(item.getPoundforcefoot()));
            strpoundalfoot=String.valueOf(formatter.format(item.getPoundalfoot()));
            strpoundalinch=String.valueOf(formatter.format(item.getPoundalinch()));
            list.add(new ItemList("N*m","Newton meter ",strnewtonmeter,"N*m"));
            list.add(new ItemList("kN*m","Kilonewton meter ",strkilonewtonmeter,"kN*m"));
            list.add(new ItemList("mN*m","Millinewton meter ",strmillinewtonmeter,"mN*m"));
            list.add(new ItemList("μN*m","Micronewton meter ",strmicronewtonmeter,"μN*m"));
            list.add(new ItemList("ton*m","Ton-force (short) meter ",strtonforceshortmeter,"ton*m"));
            list.add(new ItemList("ton*m","Ton-force (long) meter ",strtonforcelongmeter,"ton*m"));
            list.add(new ItemList("ton*m","Ton-force (metric) meter ",strtonforcemetricmeter,"ton*m"));
            list.add(new ItemList("kgf*m","Kilogram-force meter ",strkilogramforcemeter,"kgf*m"));
            list.add(new ItemList("gf*cm","Gram-force centimeter ",strgramforcecentimeter,"gf*cm"));
            list.add(new ItemList("lbf*ft","Pound-force foot ",strpoundforcefoot,"lbf*ft"));
            list.add(new ItemList("pdl*ft","Poundal foot ",strpoundalfoot,"pdl*ft"));
            list.add(new ItemList("pdl*in","Poundal inch ",strpoundalinch,"pdl*in"));



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
