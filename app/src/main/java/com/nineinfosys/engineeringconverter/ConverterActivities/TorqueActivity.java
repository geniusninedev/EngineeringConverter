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

import com.nineinfosys.engineeringconverter.ConverterActivitiesList.ConversionTorqueListActivity;
import com.nineinfosys.engineeringconverter.Engines.TorqueConverter;
import com.nineinfosys.engineeringconverter.R;
import com.nineinfosys.engineeringconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TorqueActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


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
    private int basicunit = 4;
    private int allunit = 17;
    DecimalFormat formatter = null;


    TorqueConverter.ConversionResults item;
    String strnewtonmeter=null,strnewtoncentimeter=null,strnewtonmillimeter=null,strkilonewtonmeter=null,strdynemeter=null,strdynecentimeter=null,strdynemillimeter=null,strkilogramforcemeter=null,
            strkilogramforcecentimeter=null,strkilogramforcemillimeter=null,strgramforcemeter=null,strgramforcecentimeter=null,strgramforcemillimeter=null,strounceforcefoot=null,
            strounceforceinch=null,strpoundforcefoot=null,strpoundforceinch=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
      /*  android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#59db59")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Torque ");

        formatsetting();




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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0aa828"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Newton meter -N*m");
        listtempFirstfrom.add("Newton centimeter -N*cm");
        listtempFirstfrom.add("Newton millimeter -N*mm");
        listtempFirstfrom.add("Kilonewton meter -kN*m");

        //for first time running spinner
        listFirsttempTo.add("Newton meter -N*m");
        listFirsttempTo.add("Newton centimeter -N*cm");
        listFirsttempTo.add("Newton millimeter -N*mm");
        listFirsttempTo.add("Kilonewton meter -kN*m");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(TorqueActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(TorqueActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Newton meter -N*m");
                        listtempfrom.add("Newton centimeter -N*cm");
                        listtempfrom.add("Newton millimeter -N*mm");
                        listtempfrom.add("Kilonewton meter -kN*m");


                        //2 spinner
                        listtempTo.add("Newton meter -N*m");
                        listtempTo.add("Newton centimeter -N*cm");
                        listtempTo.add("Newton millimeter -N*mm");
                        listtempTo.add("Kilonewton meter -kN*m");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Newton meter -N*m");
                        listtempfrom.add("Newton centimeter -N*cm");
                        listtempfrom.add("Newton millimeter -N*mm");
                        listtempfrom.add("Kilonewton meter -kN*m");
                        listtempfrom.add("Dyne meter -dyn*m");
                        listtempfrom.add("Dyne centimeter -dyn*cm");
                        listtempfrom.add("Dyne millimeter -dyn*mm");
                        listtempfrom.add("Kilogram-force meter -kgf*m");
                        listtempfrom.add("Kilogram-force centimeter -kgf*cm");
                        listtempfrom.add("Kilogram-force millimeter -kgf*mm");
                        listtempfrom.add("Gram-force meter -gf*m");
                        listtempfrom.add("Gram-force centimeter -gf*cm");
                        listtempfrom.add("Gram-force millimeter -gf*mm");
                        listtempfrom.add("Ounce-force foot -ozf*ft");
                        listtempfrom.add("Ounce-force inch -ozf*in");
                        listtempfrom.add("Pound-force foot -lbf*ft");
                        listtempfrom.add("Pound-force inch -lbf*in");


                        //second spinner
                        listtempTo.add("Newton meter -N*m");
                        listtempTo.add("Newton centimeter -N*cm");
                        listtempTo.add("Newton millimeter -N*mm");
                        listtempTo.add("Kilonewton meter -kN*m");
                        listtempTo.add("Dyne meter -dyn*m");
                        listtempTo.add("Dyne centimeter -dyn*cm");
                        listtempTo.add("Dyne millimeter -dyn*mm");
                        listtempTo.add("Kilogram-force meter -kgf*m");
                        listtempTo.add("Kilogram-force centimeter -kgf*cm");
                        listtempTo.add("Kilogram-force millimeter -kgf*mm");
                        listtempTo.add("Gram-force meter -gf*m");
                        listtempTo.add("Gram-force centimeter -gf*cm");
                        listtempTo.add("Gram-force millimeter -gf*mm");
                        listtempTo.add("Ounce-force foot -ozf*ft");
                        listtempTo.add("Ounce-force inch -ozf*in");
                        listtempTo.add("Pound-force foot -lbf*ft");
                        listtempTo.add("Pound-force inch -lbf*in");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(TorqueActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(TorqueActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionTorqueListActivity.class);
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

            TorqueConverter c = new TorqueConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<TorqueConverter.ConversionResults> results = c.calculateTorqueConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Newton meter -N*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton centimeter -N*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton millimeter -N*mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilonewton meter -kN*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne meter -dyn*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne centimeter -dyn*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne millimeter -dyn*mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force meter -kgf*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force centimeter -kgf*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force millimeter -kgf*mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram-force meter -gf*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram-force centimeter -gf*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram-force millimeter -gf*mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce-force foot -ozf*ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce-force inch -ozf*in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force foot -lbf*ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force inch -lbf*in":
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
            case "Newton meter -N*m":
                editTextValueTo.setText(strnewtonmeter);
                break;
            case "Newton centimeter -N*cm":
                editTextValueTo.setText(strnewtoncentimeter);
                break;
            case "Newton millimeter -N*mm":
                editTextValueTo.setText(strnewtonmillimeter);
                break;
            case "Kilonewton meter -kN*m":
                editTextValueTo.setText(strkilonewtonmeter);
                break;
            case "Dyne meter -dyn*m":
                editTextValueTo.setText(strdynemeter);
                break;
            case "Dyne centimeter -dyn*cm":
                editTextValueTo.setText(strdynecentimeter);
                break;
            case "Dyne millimeter -dyn*mm":
                editTextValueTo.setText(strdynemillimeter);
                break;
            case "Kilogram-force meter -kgf*m":
                editTextValueTo.setText(strkilogramforcemeter);
                break;
            case "Kilogram-force centimeter -kgf*cm":
                editTextValueTo.setText(strkilogramforcecentimeter);
                break;
            case "Kilogram-force millimeter -kgf*mm":
                editTextValueTo.setText(strkilogramforcemillimeter);
                break;
            case "Gram-force meter -gf*m":
                editTextValueTo.setText(strgramforcemeter);
                break;
            case "Gram-force centimeter -gf*cm":
                editTextValueTo.setText(strgramforcecentimeter);
                break;
            case "Gram-force millimeter -gf*mm":
                editTextValueTo.setText(strgramforcemillimeter);
                break;
            case "Ounce-force foot -ozf*ft":
                editTextValueTo.setText(strounceforcefoot);
                break;
            case "Ounce-force inch -ozf*in":
                editTextValueTo.setText(strounceforceinch);
                break;
            case "Pound-force foot -lbf*ft":
                editTextValueTo.setText(strpoundforcefoot);
                break;
            case "Pound-force inch -lbf*in":
                editTextValueTo.setText(strpoundforceinch);
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