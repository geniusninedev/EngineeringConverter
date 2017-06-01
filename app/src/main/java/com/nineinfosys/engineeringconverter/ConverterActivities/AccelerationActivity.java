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
import com.nineinfosys.engineeringconverter.ConverterActivitiesList.ConversionAccelerationListActivity;
import com.nineinfosys.engineeringconverter.Engines.AccelerationConverter;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AccelerationActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


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
    private int basicunit = 5;
    private int allunit = 19;
    DecimalFormat formatter = null;


    AccelerationConverter.ConversionResults item;
   private String strmeterpersquaresecond=null,strdecimeterpersquaresecond=null,strkilometerpersquaresecond=null,strhectometerpersquaresecond=null,strdekameterpersquaresecond=null,strcentimeterpersquaresecond =null,
            strmillimeterpersquaresecond=null,strmicrometerpersquaresecond=null,strnanometerpersquaresecond=null,strpicometerpersquaresecond=null,strfemtometerpersquare=null,strattometerpersquaresecond=null,
            strgal=null,strgalileo=null,strmilepersquaresecond=null,stryardpersquaresecond=null,strfootpersquaresecond=null,strinchpersquaresecond=null,strAccelerationofgravity=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
      /*  android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Acceleration");

        formatsetting();

        MobileAds.initialize(AccelerationActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Meter/square second -m/s^2");
        listtempFirstfrom.add("Decimeter/square second -deci/s^2");
        listtempFirstfrom.add("Kilometer/square second -km/s^2");
        listtempFirstfrom.add("Hectometer/square second -hec/s^2");
        listtempFirstfrom.add("Dekameter/square second -deka/s^2");

        //for first time running spinner
        listFirsttempTo.add("Meter/square second -m/s^2");
        listFirsttempTo.add("Decimeter/square second -deci/s^2");
        listFirsttempTo.add("Kilometer/square second -km/s^2");
        listFirsttempTo.add("Hectometer/square second -hec/s^2");
        listFirsttempTo.add("Dekameter/square second -deka/s^2");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(AccelerationActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(AccelerationActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Meter/square second -m/s^2");
                        listtempfrom.add("Decimeter/square second -deci/s^2");
                        listtempfrom.add("Kilometer/square second -km/s^2");
                        listtempfrom.add("Hectometer/square second -hec/s^2");
                        listtempfrom.add("Dekameter/square second -deka/s^2");


                        //2 spinner
                        listtempTo.add("Meter/square second -m/s^2");
                        listtempTo.add("Decimeter/square second -deci/s^2");
                        listtempTo.add("Kilometer/square second -km/s^2");
                        listtempTo.add("Hectometer/square second -hec/s^2");
                        listtempTo.add("Dekameter/square second -deka/s^2");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Meter/square second -m/s^2");
                        listtempfrom.add("Decimeter/square second -deci/s^2");
                        listtempfrom.add("Kilometer/square second -km/s^2");
                        listtempfrom.add("Hectometer/square second -hec/s^2");
                        listtempfrom.add("Dekameter/square second -deka/s^2");
                        listtempfrom.add("Centimeter/square second -cm/s^2");
                        listtempfrom.add("Millimeter/square second -mm/s^2");
                        listtempfrom.add("Micrometer/square second -μm/s^2");
                        listtempfrom.add("Nanometer/square second -nano/s^2");
                        listtempfrom.add("Picometer/square second -pico/s^2");
                        listtempfrom.add("Femtometer/square second -fem/s^2");
                        listtempfrom.add("Attometer/square second -A/s^2");
                        listtempfrom.add("Gal -Gal");
                        listtempfrom.add("Galileo -Gal");
                        listtempfrom.add("Mile/square second -mi/s^2");
                        listtempfrom.add("Yard/square second -yd/s^2");
                        listtempfrom.add("Foot/square second -ft/s^2");
                        listtempfrom.add("Inch/square second -in/s^2");
                        listtempfrom.add("Acceleration of gravity -g");


                        //second spinner
                        listtempTo.add("Meter/square second -m/s^2");
                        listtempTo.add("Decimeter/square second -deci/s^2");
                        listtempTo.add("Kilometer/square second -km/s^2");
                        listtempTo.add("Hectometer/square second -hec/s^2");
                        listtempTo.add("Dekameter/square second -deka/s^2");
                        listtempTo.add("Centimeter/square second -cm/s^2");
                        listtempTo.add("Millimeter/square second -mm/s^2");
                        listtempTo.add("Micrometer/square second -μm/s^2");
                        listtempTo.add("Nanometer/square second -nano/s^2");
                        listtempTo.add("Picometer/square second -pico/s^2");
                        listtempTo.add("Femtometer/square second -fem/s^2");
                        listtempTo.add("Attometer/square second -A/s^2");
                        listtempTo.add("Gal -Gal");
                        listtempTo.add("Galileo -Gal");
                        listtempTo.add("Mile/square second -mi/s^2");
                        listtempTo.add("Yard/square second -yd/s^2");
                        listtempTo.add("Foot/square second -ft/s^2");
                        listtempTo.add("Inch/square second -in/s^2");
                        listtempTo.add("Acceleration of gravity -g");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(AccelerationActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(AccelerationActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionAccelerationListActivity.class);
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

            AccelerationConverter c = new AccelerationConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<AccelerationConverter.ConversionResults> results = c.calculateAccelerationConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Meter/square second -m/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decimeter/square second -deci/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer/square second -km/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectometer/square second -hec/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekameter/square second -deka/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter/square second -cm/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter/square second -mm/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Micrometer/square second -μm/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanometer/square second -nano/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picometer/square second -pico/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtometer/square second -fem/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attometer/square second -A/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gal -Gal":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Galileo -Gal":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile/square second -mi/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yard/square second -yd/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot/square second -ft/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Inch/square second -in/s^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acceleration of gravity -g":
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
            case "Meter/square second -m/s^2":
                editTextValueTo.setText(strmeterpersquaresecond);
                break;
            case "Decimeter/square second -deci/s^2":
                editTextValueTo.setText(strdecimeterpersquaresecond);
                break;
            case "Kilometer/square second -km/s^2":
                editTextValueTo.setText(strkilometerpersquaresecond);
                break;
            case "Hectometer/square second -hec/s^2":
                editTextValueTo.setText(strhectometerpersquaresecond);
                break;
            case "Dekameter/square second -deka/s^2":
                editTextValueTo.setText(strdekameterpersquaresecond);
                break;
            case "Centimeter/square second -cm/s^2":
                editTextValueTo.setText(strcentimeterpersquaresecond);
                break;
            case "Millimeter/square second -mm/s^2":
                editTextValueTo.setText(strmillimeterpersquaresecond);
                break;
            case "Micrometer/square second -μm/s^2":
                editTextValueTo.setText(strmicrometerpersquaresecond);
                break;
            case "Nanometer/square second -nano/s^2":
                editTextValueTo.setText(strnanometerpersquaresecond);
                break;
            case "Picometer/square second -pico/s^2":
                editTextValueTo.setText(strpicometerpersquaresecond);
                break;
            case "Femtometer/square second -fem/s^2":
                editTextValueTo.setText(strfemtometerpersquare);
                break;
            case "Attometer/square second -A/s^2":
                editTextValueTo.setText(strattometerpersquaresecond);
                break;
            case "Gal -Gal":
                editTextValueTo.setText(strgal);
                break;
            case "Galileo -Gal":
                editTextValueTo.setText(strgalileo);
                break;
            case "Mile/square second -mi/s^2":
                editTextValueTo.setText(strmilepersquaresecond);
                break;
            case "Yard/square second -yd/s^2":
                editTextValueTo.setText(stryardpersquaresecond);
                break;
            case "Foot/square second -ft/s^2":
                editTextValueTo.setText(strfootpersquaresecond);
                break;
            case "Inch/square second -in/s^2":
                editTextValueTo.setText(strinchpersquaresecond);
                break;
            case "Acceleration of gravity -g":
                editTextValueTo.setText(strAccelerationofgravity);
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