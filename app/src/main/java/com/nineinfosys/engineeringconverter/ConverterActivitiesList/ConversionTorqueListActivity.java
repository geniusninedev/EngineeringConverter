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
import com.nineinfosys.engineeringconverter.Engines.TorqueConverter;
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

public class ConversionTorqueListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

  private  String strnewtonmeter=null,strnewtoncentimeter=null,strnewtonmillimeter=null,strkilonewtonmeter=null,strdynemeter=null,strdynecentimeter=null,strdynemillimeter=null,strkilogramforcemeter=null,
            strkilogramforcecentimeter=null,strkilogramforcemillimeter=null,strgramforcemeter=null,strgramforcecentimeter=null,strgramforcemillimeter=null,strounceforcefoot=null,
            strounceforceinch=null,strpoundforcefoot=null,strpoundforceinch=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#59db59")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0aa828"));
        }
        MobileAds.initialize(ConversionTorqueListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
            case "Newton centimeter -N*cm":
                textconversionFrom.setText("Newton centimeter ");                 textViewConversionShortform.setText("N*cm");
                break;
            case "Newton millimeter -N*mm":
                textconversionFrom.setText("Newton millimeter ");                 textViewConversionShortform.setText("N*mm");
                break;
            case "Kilonewton meter -kN*m":
                textconversionFrom.setText("Kilonewton meter ");                 textViewConversionShortform.setText("kN*m");
                break;
            case "Dyne meter -dyn*m":
                textconversionFrom.setText("Dyne meter ");                 textViewConversionShortform.setText("dyn*m");
                break;
            case "Dyne centimeter -dyn*cm":
                textconversionFrom.setText("Dyne centimeter ");                 textViewConversionShortform.setText("dyn*cm");
                break;
            case "Dyne millimeter -dyn*mm":
                textconversionFrom.setText("Dyne millimeter ");                 textViewConversionShortform.setText("dyn*mm");
                break;
            case "Kilogram-force meter -kgf*m":
                textconversionFrom.setText("Kilogram-force meter ");                 textViewConversionShortform.setText("kgf*m");
                break;
            case "Kilogram-force centimeter -kgf*cm":
                textconversionFrom.setText("Kilogram-force centimeter ");                 textViewConversionShortform.setText("kgf*cm");
                break;
            case "Kilogram-force millimeter -kgf*mm":
                textconversionFrom.setText("Kilogram-force millimeter ");                 textViewConversionShortform.setText("kgf*mm");
                break;
            case "Gram-force meter -gf*m":
                textconversionFrom.setText("Gram-force meter ");                 textViewConversionShortform.setText("gf*m");
                break;
            case "Gram-force centimeter -gf*cm":
                textconversionFrom.setText("Gram-force centimeter ");                 textViewConversionShortform.setText("gf*cm");
                break;
            case "Gram-force millimeter -gf*mm":
                textconversionFrom.setText("Gram-force millimeter ");                 textViewConversionShortform.setText("gf*mm");
                break;
            case "Ounce-force foot -ozf*ft":
                textconversionFrom.setText("Ounce-force foot ");                 textViewConversionShortform.setText("ozf*ft");
                break;
            case "Ounce-force inch -ozf*in":
                textconversionFrom.setText("Ounce-force inch ");                 textViewConversionShortform.setText("ozf*in");
                break;
            case "Pound-force foot -lbf*ft":
                textconversionFrom.setText("Pound-force foot ");                 textViewConversionShortform.setText("lbf*ft");
                break;
            case "Pound-force inch -lbf*in":
                textconversionFrom.setText("Pound-force inch ");                 textViewConversionShortform.setText("lbf*in");
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

        TorqueConverter c = new  TorqueConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<TorqueConverter.ConversionResults> results = c.calculateTorqueConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            TorqueConverter.ConversionResults item = results.get(i);


            strnewtonmeter=String.valueOf(formatter.format(item.getNewtonmeter()));
            strnewtoncentimeter=String.valueOf(formatter.format(item.getNewtoncentimeter()));
            strnewtonmillimeter=String.valueOf(formatter.format(item.getNewtonmillimeter()));
            strkilonewtonmeter=String.valueOf(formatter.format(item.getKilonewtonmeter()));
            strdynemeter=String.valueOf(formatter.format(item.getDynemeter()));
            strdynecentimeter=String.valueOf(formatter.format(item.getDynecentimeter()));
            strdynemillimeter=String.valueOf(formatter.format(item.getDynemillimeter()));
            strkilogramforcemeter=String.valueOf(formatter.format(item.getKilogramforcemeter()));
            strkilogramforcecentimeter=String.valueOf(formatter.format(item.getKilogramforcecentimeter()));
            strkilogramforcemillimeter=String.valueOf(formatter.format(item.getKilogramforcemillimeter()));
            strgramforcemeter=String.valueOf(formatter.format(item.getGramforcemeter()));
            strgramforcecentimeter=String.valueOf(formatter.format(item.getGramforcecentimeter()));
            strgramforcemillimeter=String.valueOf(formatter.format(item.getGramforcemillimeter()));
            strounceforcefoot=String.valueOf(formatter.format(item.getOunceforcefoot()));
            strounceforceinch=String.valueOf(formatter.format(item.getOunceforceinch()));
            strpoundforcefoot=String.valueOf(formatter.format(item.getPoundforcefoot()));
            strpoundforceinch=String.valueOf(formatter.format(item.getPoundforceinch()));


            list.add(new ItemList("N*m","Newton meter ",strnewtonmeter,"N*m"));
            list.add(new ItemList("N*cm","Newton centimeter ",strnewtoncentimeter,"N*cm"));
            list.add(new ItemList("N*mm","Newton millimeter ",strnewtonmillimeter,"N*mm"));
            list.add(new ItemList("kN*m","Kilonewton meter ",strkilonewtonmeter,"kN*m"));
            list.add(new ItemList("dyn*m","Dyne meter ",strdynemeter,"dyn*m"));
            list.add(new ItemList("dyn*cm","Dyne centimeter ",strdynecentimeter,"dyn*cm"));
            list.add(new ItemList("dyn*mm","Dyne millimeter ",strdynemillimeter,"dyn*mm"));
            list.add(new ItemList("kgf*m","Kilogram-force meter ",strkilogramforcemeter,"kgf*m"));
            list.add(new ItemList("kgf*cm","Kilogram-force centimeter ",strkilogramforcecentimeter,"kgf*cm"));
            list.add(new ItemList("kgf*mm","Kilogram-force millimeter ",strkilogramforcemillimeter,"kgf*mm"));
            list.add(new ItemList("gf*m","Gram-force meter ",strgramforcemeter,"gf*m"));
            list.add(new ItemList("gf*cm","Gram-force centimeter ",strgramforcecentimeter,"gf*cm"));
            list.add(new ItemList("gf*mm","Gram-force millimeter ",strgramforcemillimeter,"gf*mm"));
            list.add(new ItemList("ozf*ft","Ounce-force foot ",strounceforcefoot,"ozf*ft"));
            list.add(new ItemList("ozf*in","Ounce-force inch ",strounceforceinch,"ozf*in"));
            list.add(new ItemList("lbf*ft","Pound-force foot ",strpoundforcefoot,"lbf*ft"));
            list.add(new ItemList("lbf*in","Pound-force inch ",strpoundforceinch,"lbf*in"));



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
