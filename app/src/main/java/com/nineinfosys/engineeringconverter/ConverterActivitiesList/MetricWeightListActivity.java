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
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.engineeringconverter.Engines.MetricWeightConverter;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.ItemList;
import com.nineinfosys.engineeringconverter.Supporter.Settings;
import com.nineinfosys.engineeringconverter.adapter.RecyclerViewConversionListAdapter;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MetricWeightListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;

    private String strMicrogram = null;
    private String strMilligram = null;
    private String strCentigram = null;
    private String strDecigram = null;
    private  String strGram = null;
    private String strDekagram = null;
    private String strHectogram = null;
    private String strKilogram = null;
    private String strMetricton = null;

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

        MobileAds.initialize(MetricWeightListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff6d00")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#c43c00"));
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
            case "Microgram - µg":
                textconversionFrom.setText("Microgram");
                textViewConversionShortform.setText("µg");
                break;
            case "Milligram - mg":
                textconversionFrom.setText("Milligram");
                textViewConversionShortform.setText("mg");
                break;
            case "Centigram - cg":
                textconversionFrom.setText("Centigram");
                textViewConversionShortform.setText("cg");
                break;
            case "Decigram - dg":
                textconversionFrom.setText("Decigram");
                textViewConversionShortform.setText("dg");
                break;


            case "Gram - g":
                textconversionFrom.setText("Gram");
                textViewConversionShortform.setText("g");
                break;

            case "Dekagram - dag":
                textconversionFrom.setText("Dekagram");
                textViewConversionShortform.setText("dag");
                break;
            case "Hectogram - hg":
                textconversionFrom.setText("Hectogram");
                textViewConversionShortform.setText("hg");
                break;
            case "Kilogram - kg":
                textconversionFrom.setText("Kilogram");
                textViewConversionShortform.setText("kg");
                break;
            case "Metricton - metricton":
                textconversionFrom.setText("Metricton");
                textViewConversionShortform.setText("metricton");
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
        MetricWeightConverter c = new MetricWeightConverter(strSpinnerFrom, (int) doubleEdittextvalue1);
        ArrayList<MetricWeightConverter.ConversionResults> results = c.calculatemetricWeightConversions();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            MetricWeightConverter.ConversionResults item = results.get(i);

            strMicrogram = String.valueOf(formatter.format(item.getMicrogram()));
            strMilligram =String.valueOf(formatter.format(item.getMilligram()));
            strCentigram =String.valueOf(formatter.format(item.getCentigram()));
            strDecigram =String.valueOf(formatter.format(item.getDecigram()));
            strGram = String.valueOf(formatter.format(item.getGram()));
            strDekagram =String.valueOf(formatter.format(item.getDekagram()));
            strHectogram = String.valueOf(formatter.format(item.getHectogram()));
            strKilogram =String.valueOf(formatter.format(item.getKilogram()));
            strMetricton =String.valueOf(formatter.format(item.getMetricton()));



            list.add(new ItemList("µg","Microgram",strMicrogram,"µg"));
            list.add(new ItemList("mg","Milligram",strMilligram,"mg"));
            list.add(new ItemList("cg","Centigram",strCentigram,"cg"));
            list.add(new ItemList("dg","Decigram",strDecigram,"dg"));
            list.add(new ItemList("g","Gram",strGram,"g"));
            list.add(new ItemList("dag","Dekagram",strDekagram,"dag"));
            list.add(new ItemList("hg","Hectogram",strHectogram,"hg"));

            list.add(new ItemList("kg","Kilogram",strKilogram,"kg"));
            list.add(new ItemList("metricton","Metricton",strMetricton,"metricton"));


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

