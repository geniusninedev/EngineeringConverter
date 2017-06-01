package com.nineinfosys.engineeringconverter.ConverterActivities;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.engineeringconverter.ConverterActivitiesList.ConversionDensityConverterListActivity;
import com.nineinfosys.engineeringconverter.Engines.DensityConverter;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DensityConverterActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private static final int REQUEST_CODE = 100;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 11;
    private int allunit = 42;
    DecimalFormat formatter = null;


    DensityConverter.ConversionResults item;
     private String strkilogrampercubicmeter=null,strgrampercubiccentimeter=null,strkilogrampercubiccentimeter=null,strgrampercubicmeter=null,strgrampercubicmillimeter=null,strmilligrampercubicmeter=null,
            strmilligrampercubiccentimeter =null,strmilligrampercubicmillimeter=null,strexagramperliter=null,strpetagramperliter=null,strteragramperliter=null,strgigagramperliter=null,
            strmegagramperliter=null,strkilogramperliter=null,strhectogramperliter=null,strdekagramperliter =null,strgramperliter=null,strdecigramperliter=null,strcentigramperliter=null,
            strmilligramperliter=null,strmicrogramperliter=null,strnanogramperliter=null,strpicogramperliter=null,strfemtogramperliter =null,strattogramperliter=null,strpoundpercubicinch=null,
            strpoundpercubicfoot=null,strpoundpercubicyard=null,strpoundpergallonUS=null,strpoundpergallonUK=null,strouncepercubicinch=null,strouncecubicfoot =null,strouncepergallonUS=null,
            strouncegallonUK=null,strgrainpergallonUS=null,strgrainpergallonUK=null,strgrainpercubicfoot=null,strtonshortpercubicyard=null,strtonlongpercubicyard=null,strslugpercubicfoot=null,
            strpsiper1000feet=null,strEarthsdensitymean=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1976d2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Density");

        formatsetting();

        MobileAds.initialize(DensityConverterActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        //changing color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#004ba0"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Kilogram/cubic meter -kg/m^3");
        listtempFirstfrom.add("Gram/cubic centimeter -g/cm^3,g/cc");
        listtempFirstfrom.add("Ounce/cubic inch -oz/in^3");
        listtempFirstfrom.add("Ounce/gallon (UK) -oz/gal(UK)");
        listtempFirstfrom.add("Ounce/gallon (US) -oz/gal(US)");
        listtempFirstfrom.add("Pound/cubic foot -lb/ft^3");
        listtempFirstfrom.add("Pound/cubic inch -lb/in^3");
        listtempFirstfrom.add("Pound/cubic yard -lb/yd^3");
        listtempFirstfrom.add("Pound/gallon (UK) -lb/gal(UK)");
        listtempFirstfrom.add("Pound/gallon (US) -lb/gal(US)");
        listtempFirstfrom.add("Ton (short)/cubic yard -ton/yd^3");

        //for first time running spinner
        listFirsttempTo.add("Kilogram/cubic meter -kg/m^3");
        listFirsttempTo.add("Gram/cubic centimeter -g/cm^3,g/cc");
        listFirsttempTo.add("Ounce/cubic inch -oz/in^3");
        listFirsttempTo.add("Ounce/gallon (UK) -oz/gal(UK)");
        listFirsttempTo.add("Ounce/gallon (US) -oz/gal(US)");
        listFirsttempTo.add("Pound/cubic foot -lb/ft^3");
        listFirsttempTo.add("Pound/cubic inch -lb/in^3");
        listFirsttempTo.add("Pound/cubic yard -lb/yd^3");
        listFirsttempTo.add("Pound/gallon (UK) -lb/gal(UK)");
        listFirsttempTo.add("Pound/gallon (US) -lb/gal(US)");
        listFirsttempTo.add("Ton (short)/cubic yard -ton/yd^3");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(DensityConverterActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(DensityConverterActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


        // Drop down layout style - list view with radio button
        Adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        AdapterTempTo.setDropDownViewResource(android.R.layout.simple_list_item_checked);

        // attaching data adapter to spinner
        spinnerConvertFrom.setAdapter(Adapter);
        spinnerConvertTo.setAdapter(AdapterTempTo);

        //switch converttype
        switchChangeType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                listtempfrom = new ArrayList<String>();
                listtempTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Kilogram/cubic meter -kg/m^3");
                        listtempfrom.add("Gram/cubic centimeter -g/cm^3,g/cc");
                        listtempfrom.add("Ounce/cubic inch -oz/in^3");
                        listtempfrom.add("Ounce/gallon (UK) -oz/gal(UK)");
                        listtempfrom.add("Ounce/gallon (US) -oz/gal(US)");
                        listtempfrom.add("Pound/cubic foot -lb/ft^3");
                        listtempfrom.add("Pound/cubic inch -lb/in^3");
                        listtempfrom.add("Pound/cubic yard -lb/yd^3");
                        listtempfrom.add("Pound/gallon (UK) -lb/gal(UK)");
                        listtempfrom.add("Pound/gallon (US) -lb/gal(US)");
                        listtempfrom.add("Ton (short)/cubic yard -ton/yd^3");
                        
                        


                        //2 spinner
                        listtempTo.add("Kilogram/cubic meter -kg/m^3");
                        listtempTo.add("Gram/cubic centimeter -g/cm^3,g/cc");
                        listtempTo.add("Ounce/cubic inch -oz/in^3");
                        listtempTo.add("Ounce/gallon (UK) -oz/gal(UK)");
                        listtempTo.add("Ounce/gallon (US) -oz/gal(US)");
                        listtempTo.add("Pound/cubic foot -lb/ft^3");
                        listtempTo.add("Pound/cubic inch -lb/in^3");
                        listtempTo.add("Pound/cubic yard -lb/yd^3");
                        listtempTo.add("Pound/gallon (UK) -lb/gal(UK)");
                        listtempTo.add("Pound/gallon (US) -lb/gal(US)");
                        listtempTo.add("Ton (short)/cubic yard -ton/yd^3");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Kilogram/cubic meter -kg/m^3");
                        listtempfrom.add("Gram/cubic centimeter -g/cm^3,g/cc");
                        listtempfrom.add("Kilogram/cubic centimeter -kg/cm^3");
                        listtempfrom.add("Gram/cubic meter -g/m^3");
                        listtempfrom.add("Gram/cubic millimeter -g/mm^3");
                        listtempfrom.add("Milligram/cubic meter -mg/m^3");
                        listtempfrom.add("Milligram/cubic centimeter -mg/cm^3");
                        listtempfrom.add("Milligram/cubic millimeter -mg/mm^3");
                        listtempfrom.add("Exagram/liter -Eg/L");
                        listtempfrom.add("Petagram/liter -Pg/L");
                        listtempfrom.add("Teragram/liter -Tg/L");
                        listtempfrom.add("Gigagram/liter -Gg/L");
                        listtempfrom.add("Megagram/liter -Mg/L");
                        listtempfrom.add("Kilogram/liter -kg/L");
                        listtempfrom.add("Hectogram/liter -hg/L");
                        listtempfrom.add("Dekagram/liter -dag/L");
                        listtempfrom.add("Gram/liter -g/L");
                        listtempfrom.add("Decigram/liter -dg/L");
                        listtempfrom.add("Centigram/liter -cg/L");
                        listtempfrom.add("Milligram/liter -mg/L");
                        listtempfrom.add("Microgram/liter -μg/L");
                        listtempfrom.add("Nanogram/liter -ng/L");
                        listtempfrom.add("Picogram/liter -pg/L");
                        listtempfrom.add("Femtogram/liter -fg/L");
                        listtempfrom.add("Attogram/liter -ag/L");
                        listtempfrom.add("Pound/cubic inch -lb/in^3");
                        listtempfrom.add("Pound/cubic foot -lb/ft^3");
                        listtempfrom.add("Pound/cubic yard -lb/yd^3");
                        listtempfrom.add("Pound/gallon (US) -lb/gal(US)");
                        listtempfrom.add("Pound/gallon (UK) -lb/gal(UK)");
                        listtempfrom.add("Ounce/cubic inch -oz/in^3");
                        listtempfrom.add("Ounce/cubic foot -oz/ft^3");
                        listtempfrom.add("Ounce/gallon (US) -oz/gal(US)");
                        listtempfrom.add("Ounce/gallon (UK) -oz/gal(UK)");
                        listtempfrom.add("Grain/gallon (US) -gr/gal(US)");
                        listtempfrom.add("Grain/gallon (UK) -gr/gal(UK)");
                        listtempfrom.add("Grain/cubic foot -gr/ft^3");
                        listtempfrom.add("Ton (short)/cubic yard -ton/yd^3");
                        listtempfrom.add("Ton (long)/cubic yard -ton/yd^3");
                        listtempfrom.add("Slug/cubic foot -slug/ft^3");
                        listtempfrom.add("Psi/1000 feet -psi/ft");
                        listtempfrom.add("Earth's density (mean) -earth");


                        //second spinner
                        listtempTo.add("Kilogram/cubic meter -kg/m^3");
                        listtempTo.add("Gram/cubic centimeter -g/cm^3,g/cc");
                        listtempTo.add("Kilogram/cubic centimeter -kg/cm^3");
                        listtempTo.add("Gram/cubic meter -g/m^3");
                        listtempTo.add("Gram/cubic millimeter -g/mm^3");
                        listtempTo.add("Milligram/cubic meter -mg/m^3");
                        listtempTo.add("Milligram/cubic centimeter -mg/cm^3");
                        listtempTo.add("Milligram/cubic millimeter -mg/mm^3");
                        listtempTo.add("Exagram/liter -Eg/L");
                        listtempTo.add("Petagram/liter -Pg/L");
                        listtempTo.add("Teragram/liter -Tg/L");
                        listtempTo.add("Gigagram/liter -Gg/L");
                        listtempTo.add("Megagram/liter -Mg/L");
                        listtempTo.add("Kilogram/liter -kg/L");
                        listtempTo.add("Hectogram/liter -hg/L");
                        listtempTo.add("Dekagram/liter -dag/L");
                        listtempTo.add("Gram/liter -g/L");
                        listtempTo.add("Decigram/liter -dg/L");
                        listtempTo.add("Centigram/liter -cg/L");
                        listtempTo.add("Milligram/liter -mg/L");
                        listtempTo.add("Microgram/liter -μg/L");
                        listtempTo.add("Nanogram/liter -ng/L");
                        listtempTo.add("Picogram/liter -pg/L");
                        listtempTo.add("Femtogram/liter -fg/L");
                        listtempTo.add("Attogram/liter -ag/L");
                        listtempTo.add("Pound/cubic inch -lb/in^3");
                        listtempTo.add("Pound/cubic foot -lb/ft^3");
                        listtempTo.add("Pound/cubic yard -lb/yd^3");
                        listtempTo.add("Pound/gallon (US) -lb/gal(US)");
                        listtempTo.add("Pound/gallon (UK) -lb/gal(UK)");
                        listtempTo.add("Ounce/cubic inch -oz/in^3");
                        listtempTo.add("Ounce/cubic foot -oz/ft^3");
                        listtempTo.add("Ounce/gallon (US) -oz/gal(US)");
                        listtempTo.add("Ounce/gallon (UK) -oz/gal(UK)");
                        listtempTo.add("Grain/gallon (US) -gr/gal(US)");
                        listtempTo.add("Grain/gallon (UK) -gr/gal(UK)");
                        listtempTo.add("Grain/cubic foot -gr/ft^3");
                        listtempTo.add("Ton (short)/cubic yard -ton/yd^3");
                        listtempTo.add("Ton (long)/cubic yard -ton/yd^3");
                        listtempTo.add("Slug/cubic foot -slug/ft^3");
                        listtempTo.add("Psi/1000 feet -psi/ft");
                        listtempTo.add("Earth's density (mean) -earth");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(DensityConverterActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(DensityConverterActivity.this, android.R.layout.simple_spinner_item, listtempTo);


                // Drop down layout style - list view with radio button
                Adapter2.setDropDownViewResource(android.R.layout.simple_list_item_checked);
                AdapterTempTo2.setDropDownViewResource(android.R.layout.simple_list_item_checked);

                // attaching data adapter to spinner
                spinnerConvertFrom.setAdapter(Adapter2);
                spinnerConvertTo.setAdapter(AdapterTempTo2);

            }
        });

        editTextValue.addTextChangedListener(this);
        buttonList.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonMail.setOnClickListener(this);
        buttonCopy.setOnClickListener(this);
        textViewConvert.setOnClickListener(this);


        spinnerConvertFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerConvertTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences = this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF, "Thousands separator");
        String DecimalplaceString = sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF, "2");
        Settings settings = new Settings(FormattedString, DecimalplaceString);
        formatter = settings.setting();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonUnitConverter:
                //switch spinner value
                int spinner1Index = spinnerConvertFrom.getSelectedItemPosition();
                spinnerConvertFrom.setSelection(spinnerConvertTo.getSelectedItemPosition());
                spinnerConvertTo.setSelection(spinner1Index );
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i = new Intent(this, ConversionDensityConverterListActivity.class);
                i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
                i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
                startActivity(i);
                break;

            case R.id.button_copy:
                String text = editTextValueTo.getText().toString().trim();
                android.content.ClipboardManager clipboardMgr = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied text", text);
                clipboardMgr.setPrimaryClip(clip);
                Snackbar.make(v, "Conversion Value Copied", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                break;

            case R.id.button_list_share:
                String textTo = editTextValueTo.getText().toString().trim();
                String textFrom = editTextValueTo.getText().toString().trim();

                String shareMessage = textFrom + " " + stringSpinnerFrom + ": " + textTo + " " + stringSpinnerTo;

                try {
                    Intent share = new Intent();
                    share.setAction("android.intent.action.SEND");
                    share.setType("text/plain");
                    share.putExtra("android.intent.extra.TEXT", shareMessage);
                    startActivity(Intent.createChooser(share, ""));

                } catch (Exception e) {
                    e.printStackTrace();
                }
             break;

            case R.id.button_list_mail:
                String textmailTo = editTextValueTo.getText().toString().trim();
                String textmailFrom = editTextValueTo.getText().toString().trim();
                String message = textmailTo + " " + stringSpinnerFrom + " :  " + textmailFrom + "  " + stringSpinnerTo;
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
                email.putExtra(Intent.EXTRA_SUBJECT, "Conversion Details");
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Select Email Client"));
                break;

        }

    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        try {

            doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
            stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
            stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();
            calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);

        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }

    public void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {



        try {

            DensityConverter c = new DensityConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<DensityConverter.ConversionResults> results = c.calculateDensityConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Kilogram/cubic meter -kg/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/cubic centimeter -g/cm^3,g/cc":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/cubic centimeter -kg/cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/cubic meter -g/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/cubic millimeter -g/mm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/cubic meter -mg/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/cubic centimeter -mg/cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/cubic millimeter -mg/mm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exagram/liter -Eg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petagram/liter -Pg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teragram/liter -Tg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigagram/liter -Gg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megagram/liter -Mg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/liter -kg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectogram/liter -hg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekagram/liter -dag/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/liter -g/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decigram/liter -dg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centigram/liter -cg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/liter -mg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microgram/liter -μg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanogram/liter -ng/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picogram/liter -pg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtogram/liter -fg/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attogram/liter -ag/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/cubic inch -lb/in^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/cubic foot -lb/ft^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/cubic yard -lb/yd^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/gallon (US) -lb/gal(US)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/gallon (UK) -lb/gal(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/cubic inch -oz/in^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/cubic foot -oz/ft^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/gallon (US) -oz/gal(US)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/gallon (UK) -oz/gal(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Grain/gallon (US) -gr/gal(US)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Grain/gallon (UK) -gr/gal(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Grain/cubic foot -gr/ft^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (short)/cubic yard -ton/yd^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (long)/cubic yard -ton/yd^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Slug/cubic foot -slug/ft^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Psi/1000 feet -psi/ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Earth's density (mean) -earth":
                        conversion(strSpinnerTovalue2);
                        break;
                }
            }


        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    private void conversion(String strSpinnerTovalue2) {

        switch (strSpinnerTovalue2) {
            case "Kilogram/cubic meter -kg/m^3":
                editTextValueTo.setText(strkilogrampercubicmeter);
                break;
            case "Gram/cubic centimeter -g/cm^3,g/cc":
                editTextValueTo.setText(strgrampercubiccentimeter);
                break;
            case "Kilogram/cubic centimeter -kg/cm^3":
                editTextValueTo.setText(strkilogrampercubiccentimeter);
                break;
            case "Gram/cubic meter -g/m^3":
                editTextValueTo.setText(strgrampercubicmeter);
                break;
            case "Gram/cubic millimeter -g/mm^3":
                editTextValueTo.setText(strgrampercubicmillimeter);
                break;
            case "Milligram/cubic meter -mg/m^3":
                editTextValueTo.setText(strmilligrampercubicmeter);
                break;
            case "Milligram/cubic centimeter -mg/cm^3":
                editTextValueTo.setText(strmilligrampercubiccentimeter);
                break;
            case "Milligram/cubic millimeter -mg/mm^3":
                editTextValueTo.setText(strmilligrampercubicmillimeter);
                break;
            case "Exagram/liter -Eg/L":
                editTextValueTo.setText(strexagramperliter);
                break;
            case "Petagram/liter -Pg/L":
                editTextValueTo.setText(strpetagramperliter);
                break;
            case "Teragram/liter -Tg/L":
                editTextValueTo.setText(strteragramperliter);
                break;
            case "Gigagram/liter -Gg/L":
                editTextValueTo.setText(strgigagramperliter);
                break;
            case "Megagram/liter -Mg/L":
                editTextValueTo.setText(strmegagramperliter);
                break;
            case "Kilogram/liter -kg/L":
                editTextValueTo.setText(strkilogramperliter);
                break;
            case "Hectogram/liter -hg/L":
                editTextValueTo.setText(strhectogramperliter);
                break;
            case "Dekagram/liter -dag/L":
                editTextValueTo.setText(strdekagramperliter);
                break;
            case "Gram/liter -g/L":
                editTextValueTo.setText(strgramperliter);
                break;
            case "Decigram/liter -dg/L":
                editTextValueTo.setText(strdecigramperliter);
                break;
            case "Centigram/liter -cg/L":
                editTextValueTo.setText(strcentigramperliter);
                break;
            case "Milligram/liter -mg/L":
                editTextValueTo.setText(strmilligramperliter);
                break;
            case "Microgram/liter -μg/L":
                editTextValueTo.setText(strmicrogramperliter);
                break;
            case "Nanogram/liter -ng/L":
                editTextValueTo.setText(strnanogramperliter);
                break;
            case "Picogram/liter -pg/L":
                editTextValueTo.setText(strpicogramperliter);
                break;
            case "Femtogram/liter -fg/L":
                editTextValueTo.setText(strfemtogramperliter);
                break;
            case "Attogram/liter -ag/L":
                editTextValueTo.setText(strattogramperliter);
                break;
            case "Pound/cubic inch -lb/in^3":
                editTextValueTo.setText(strpoundpercubicinch);
                break;
            case "Pound/cubic foot -lb/ft^3":
                editTextValueTo.setText(strpoundpercubicfoot);
                break;
            case "Pound/cubic yard -lb/yd^3":
                editTextValueTo.setText(strpoundpercubicyard);
                break;
            case "Pound/gallon (US) -lb/gal(US)":
                editTextValueTo.setText(strpoundpergallonUS);
                break;
            case "Pound/gallon (UK) -lb/gal(UK)":
                editTextValueTo.setText(strpoundpergallonUK);
                break;
            case "Ounce/cubic inch -oz/in^3":
                editTextValueTo.setText(strouncepercubicinch);
                break;
            case "Ounce/cubic foot -oz/ft^3":
                editTextValueTo.setText(strouncecubicfoot);
                break;
            case "Ounce/gallon (US) -oz/gal(US)":
                editTextValueTo.setText(strouncepergallonUS);
                break;
            case "Ounce/gallon (UK) -oz/gal(UK)":
                editTextValueTo.setText(strouncegallonUK);
                break;
            case "Grain/gallon (US) -gr/gal(US)":
                editTextValueTo.setText(strgrainpergallonUS);
                break;
            case "Grain/gallon (UK) -gr/gal(UK)":
                editTextValueTo.setText(strgrainpergallonUK);
                break;
            case "Grain/cubic foot -gr/ft^3":
                editTextValueTo.setText(strgrainpercubicfoot);
                break;
            case "Ton (short)/cubic yard -ton/yd^3":
                editTextValueTo.setText(strtonshortpercubicyard);
                break;
            case "Ton (long)/cubic yard -ton/yd^3":
                editTextValueTo.setText(strtonlongpercubicyard);
                break;
            case "Slug/cubic foot -slug/ft^3":
                editTextValueTo.setText(strslugpercubicfoot);
                break;
            case "Psi/1000 feet -psi/ft":
                editTextValueTo.setText(strpsiper1000feet);
                break;
            case "Earth's density (mean) -earth":
                editTextValueTo.setText(strEarthsdensitymean);
                break;
        }


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