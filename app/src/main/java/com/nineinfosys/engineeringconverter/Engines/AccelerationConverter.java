package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;


public class AccelerationConverter {
	private double meterpersquaresecond,decimeterpersquaresecond,kilometerpersquaresecond,hectometerpersquaresecond,dekameterpersquaresecond,centimeterpersquaresecond
	,millimeterpersquaresecond,micrometerpersquaresecond,nanometerpersquaresecond,picometerpersquaresecond,femtometerpersquare,attometerpersquaresecond,
	gal,galileo,milepersquaresecond,yardpersquaresecond,footpersquaresecond,inchpersquaresecond,Accelerationofgravity;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public AccelerationConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateAccelerationConversion()
    {
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Meter/square second -m/s^2":
			 meterpersquaresecond=(edtValue)*1;
			 decimeterpersquaresecond=(edtValue)*10;
			 kilometerpersquaresecond=(edtValue)*0.001;
			 hectometerpersquaresecond=(edtValue)*0.01;
			 dekameterpersquaresecond=(edtValue)*0.1;
			 centimeterpersquaresecond=(edtValue)*100;
			 millimeterpersquaresecond=(edtValue)*1000;
			 micrometerpersquaresecond=(edtValue)*1000000;
			 nanometerpersquaresecond=(edtValue)*1000000000;
			 picometerpersquaresecond=(edtValue)*1000000000000.0;
			 femtometerpersquare=(edtValue)*1000000000000000.0;
			 attometerpersquaresecond=(edtValue)*1000000000000000000.0;
			 gal=(edtValue)*100;
			 galileo=(edtValue)*100;
			 milepersquaresecond=(edtValue)*0.0006213712;
			 yardpersquaresecond=(edtValue)*1.0936132983;
			 footpersquaresecond=(edtValue)*3.280839895;
			 inchpersquaresecond=(edtValue)*39.37007874;
			 Accelerationofgravity=(edtValue)*0.1019716213;
			break;
		case "Decimeter/square second -deci/s^2":
			 meterpersquaresecond=(edtValue)*0.1;
			 decimeterpersquaresecond=(edtValue)*1;
			 kilometerpersquaresecond=(edtValue)*0.0001;
			 hectometerpersquaresecond=(edtValue)*0.001;
			 dekameterpersquaresecond=(edtValue)*0.01;
			 centimeterpersquaresecond=(edtValue)*10;
			 millimeterpersquaresecond=(edtValue)*100;
			 micrometerpersquaresecond=(edtValue)*100000;
			 nanometerpersquaresecond=(edtValue)*100000000;
			 picometerpersquaresecond=(edtValue)*100000000000.0;
			 femtometerpersquare=(edtValue)*100000000000000.0;
			 attometerpersquaresecond=(edtValue)*100000000000000000.0;
			 gal=(edtValue)*10;
			 galileo=(edtValue)*10;
			 milepersquaresecond=(edtValue)*0.0000621371;
			 yardpersquaresecond=(edtValue)*0.1093613298;
			 footpersquaresecond=(edtValue)*0.3280839895;
			 inchpersquaresecond=(edtValue)*3.937007874;
			 Accelerationofgravity=(edtValue)*0.0101971621;
			break;
		case "Kilometer/square second -km/s^2":
			 meterpersquaresecond=(edtValue)*1000;
			 decimeterpersquaresecond=(edtValue)*10000;
			 kilometerpersquaresecond=(edtValue)*1;
			 hectometerpersquaresecond=(edtValue)*10;
			 dekameterpersquaresecond=(edtValue)*100;
			 centimeterpersquaresecond=(edtValue)*100000;
			 millimeterpersquaresecond=(edtValue)*1000000;
			 micrometerpersquaresecond=(edtValue)*1000000000;
			 nanometerpersquaresecond=(edtValue)*1000000000000.0;
			 picometerpersquaresecond=(edtValue)*1000000000000000.0;
			 femtometerpersquare=(edtValue)*1000000000000000000.0;
			 attometerpersquaresecond=(edtValue)*1.E+21;
			 gal=(edtValue)*100000;
			 galileo=(edtValue)*100000;
			 milepersquaresecond=(edtValue)*0.6213711922;
			 yardpersquaresecond=(edtValue)*1093.6132983;
			 footpersquaresecond=(edtValue)*3280.839895;
			 inchpersquaresecond=(edtValue)*39370.07874;
			 Accelerationofgravity=(edtValue)*101.9716213;
			break;
		case "Hectometer/square second -hec/s^2":
			 meterpersquaresecond=(edtValue)*100;
			 decimeterpersquaresecond=(edtValue)*1000;
			 kilometerpersquaresecond=(edtValue)*0.1;
			 hectometerpersquaresecond=(edtValue)*1;
			 dekameterpersquaresecond=(edtValue)*10;
			 centimeterpersquaresecond=(edtValue)*10000;
			 millimeterpersquaresecond=(edtValue)*100000;
			 micrometerpersquaresecond=(edtValue)*100000000;
			 nanometerpersquaresecond=(edtValue)*100000000000.0;
			 picometerpersquaresecond=(edtValue)*100000000000000.0;
			 femtometerpersquare=(edtValue)*100000000000000000.0;
			 attometerpersquaresecond=(edtValue)*100000000000000000000.0;
			 gal=(edtValue)*10000;
			 galileo=(edtValue)*10000;
			 milepersquaresecond=(edtValue)*0.0621371192;
			 yardpersquaresecond=(edtValue)*109.36132983;
			 footpersquaresecond=(edtValue)*328.0839895;
			 inchpersquaresecond=(edtValue)*3937.007874;
			 Accelerationofgravity=(edtValue)*10.19716213;
			break;
		case "Dekameter/square second -deka/s^2":
			 meterpersquaresecond=(edtValue)*10;
			 decimeterpersquaresecond=(edtValue)*100;
			 kilometerpersquaresecond=(edtValue)*0.01;
			 hectometerpersquaresecond=(edtValue)*0.1;
			 dekameterpersquaresecond=(edtValue)*1;
			 centimeterpersquaresecond=(edtValue)*1000;
			 millimeterpersquaresecond=(edtValue)*10000;
			 micrometerpersquaresecond=(edtValue)*10000000;
			 nanometerpersquaresecond=(edtValue)*10000000000.0;
			 picometerpersquaresecond=(edtValue)*10000000000000.0;
			 femtometerpersquare=(edtValue)*10000000000000000.0;
			 attometerpersquaresecond=(edtValue)*10000000000000000000.0;
			 gal=(edtValue)*1000;
			 galileo=(edtValue)*1000;
			 milepersquaresecond=(edtValue)*0.0062137119;
			 yardpersquaresecond=(edtValue)*10.936132983;
			 footpersquaresecond=(edtValue)*32.80839895;
			 inchpersquaresecond=(edtValue)*393.7007874;
			 Accelerationofgravity=(edtValue)*1.019716213;
			break;
		case "Centimeter/square second -cm/s^2":
			 meterpersquaresecond=(edtValue)*0.01;
			 decimeterpersquaresecond=(edtValue)*0.1;
			 kilometerpersquaresecond=(edtValue)*0.00001;
			 hectometerpersquaresecond=(edtValue)*0.0001;
			 dekameterpersquaresecond=(edtValue)*0.001;
			 centimeterpersquaresecond=(edtValue)*1;
			 millimeterpersquaresecond=(edtValue)*10;
			 micrometerpersquaresecond=(edtValue)*10000;
			 nanometerpersquaresecond=(edtValue)*10000000;
			 picometerpersquaresecond=(edtValue)*10000000000.0;
			 femtometerpersquare=(edtValue)*10000000000000.0;
			 attometerpersquaresecond=(edtValue)*10000000000000000.0;
			 gal=(edtValue)*1;
			 galileo=(edtValue)*1;
			 milepersquaresecond=(edtValue)*0.0000062137;
			 yardpersquaresecond=(edtValue)*0.010936133;
			 footpersquaresecond=(edtValue)*0.032808399;
			 inchpersquaresecond=(edtValue)*0.3937007874;
			 Accelerationofgravity=(edtValue)*0.0010197162;
			break;
		case "Millimeter/square second -mm/s^2":
			 meterpersquaresecond=(edtValue)*0.001;
			 decimeterpersquaresecond=(edtValue)*0.01;
			 kilometerpersquaresecond=(edtValue)*0.000001;
			 hectometerpersquaresecond=(edtValue)*0.00001;
			 dekameterpersquaresecond=(edtValue)*0.0001;
			 centimeterpersquaresecond=(edtValue)*0.1;
			 millimeterpersquaresecond=(edtValue)*1;
			 micrometerpersquaresecond=(edtValue)*1000;
			 nanometerpersquaresecond=(edtValue)*1000000;
			 picometerpersquaresecond=(edtValue)*1000000000;
			 femtometerpersquare=(edtValue)*1000000000000.0;
			 attometerpersquaresecond=(edtValue)*1000000000000000.0;
			 gal=(edtValue)*0.1;
			 galileo=(edtValue)*0.1;
			 milepersquaresecond=(edtValue)*6.213711922E-7;
			 yardpersquaresecond=(edtValue)*0.0010936133;
			 footpersquaresecond=(edtValue)*0.0032808399;
			 inchpersquaresecond=(edtValue)*0.0393700787;
			 Accelerationofgravity=(edtValue)*0.0001019716;
			break;
		case "Micrometer/square second -μm/s^2":
			 meterpersquaresecond=(edtValue)*0.000001;
			 decimeterpersquaresecond=(edtValue)*0.00001;
			 kilometerpersquaresecond=(edtValue)*1.E-9;
			 hectometerpersquaresecond=(edtValue)*1.E-8;
			 dekameterpersquaresecond=(edtValue)*1.E-7;
			 centimeterpersquaresecond=(edtValue)*0.0001;
			 millimeterpersquaresecond=(edtValue)*0.001;
			 micrometerpersquaresecond=(edtValue)*1;
			 nanometerpersquaresecond=(edtValue)*1000;
			 picometerpersquaresecond=(edtValue)*1000000;
			 femtometerpersquare=(edtValue)*1000000000;
			 attometerpersquaresecond=(edtValue)*1000000000000.0;
			 gal=(edtValue)*0.0001;
			 galileo=(edtValue)*0.0001;
			 milepersquaresecond=(edtValue)*6.213711922E-10;
			 yardpersquaresecond=(edtValue)*0.0000010936;
			 footpersquaresecond=(edtValue)*0.0000032808;
			 inchpersquaresecond=(edtValue)*0.0000393701;
			 Accelerationofgravity=(edtValue)*1.019716212E-7;
			break;
		case "Nanometer/square second -nano/s^2":
			 meterpersquaresecond=(edtValue)*1.E-9;
			 decimeterpersquaresecond=(edtValue)*1.E-8;
			 kilometerpersquaresecond=(edtValue)*1.E-12;
			 hectometerpersquaresecond=(edtValue)*1.E-11;
			 dekameterpersquaresecond=(edtValue)*1.E-10;
			 centimeterpersquaresecond=(edtValue)*1.E-7;
			 millimeterpersquaresecond=(edtValue)*0.000001;
			 micrometerpersquaresecond=(edtValue)*0.001;
			 nanometerpersquaresecond=(edtValue)*1;
			 picometerpersquaresecond=(edtValue)*1000;
			 femtometerpersquare=(edtValue)*1000000;
			 attometerpersquaresecond=(edtValue)*1000000000;
			 gal=(edtValue)*1.E-7;
			 galileo=(edtValue)*1.E-7;
			 milepersquaresecond=(edtValue)*6.213711922E-13;
			 yardpersquaresecond=(edtValue)*1.093613298E-9;
			 footpersquaresecond=(edtValue)*3.280839895E-9;
			 inchpersquaresecond=(edtValue)*3.937007874E-8;
			 Accelerationofgravity=(edtValue)*1.019716212E-10;
			break;
		case "Picometer/square second -pico/s^2":
			 meterpersquaresecond=(edtValue)*1.E-12;
			 decimeterpersquaresecond=(edtValue)*1.E-11;
			 kilometerpersquaresecond=(edtValue)*1.E-15;
			 hectometerpersquaresecond=(edtValue)*1.E-14;
			 dekameterpersquaresecond=(edtValue)*1.E-13;
			 centimeterpersquaresecond=(edtValue)*1.E-10;
			 millimeterpersquaresecond=(edtValue)*1.E-9;
			 micrometerpersquaresecond=(edtValue)*0.000001;
			 nanometerpersquaresecond=(edtValue)*0.001;
			 picometerpersquaresecond=(edtValue)*1;
			 femtometerpersquare=(edtValue)*1000;
			 attometerpersquaresecond=(edtValue)*1000000;
			 gal=(edtValue)*1.E-10;
			 galileo=(edtValue)*1.E-10;
			 milepersquaresecond=(edtValue)*6.213711922E-16;
			 yardpersquaresecond=(edtValue)*1.093613298E-12;
			 footpersquaresecond=(edtValue)*3.280839895E-12;
			 inchpersquaresecond=(edtValue)*3.937007874E-11;
			 Accelerationofgravity=(edtValue)*1.019716212E-13;
			break;
		case "Femtometer/square second -fem/s^2":
			 meterpersquaresecond=(edtValue)*1.E-15;
			 decimeterpersquaresecond=(edtValue)*1.E-14;
			 kilometerpersquaresecond=(edtValue)*1.E-18;
			 hectometerpersquaresecond=(edtValue)*1.E-17;
			 dekameterpersquaresecond=(edtValue)*1.E-16;
			 centimeterpersquaresecond=(edtValue)*1.E-13;
			 millimeterpersquaresecond=(edtValue)*1.E-12;
			 micrometerpersquaresecond=(edtValue)*1.E-9;
			 nanometerpersquaresecond=(edtValue)*0.000001;
			 picometerpersquaresecond=(edtValue)*0.001;
			 femtometerpersquare=(edtValue)*1;
			 attometerpersquaresecond=(edtValue)*1000;
			 gal=(edtValue)*1.E-13;
			 galileo=(edtValue)*1.E-13;
			 milepersquaresecond=(edtValue)*6.213711922E-19;
			 yardpersquaresecond=(edtValue)*1.093613298E-15;
			 footpersquaresecond=(edtValue)*3.280839895E-15;
			 inchpersquaresecond=(edtValue)*3.937007874E-14;
			 Accelerationofgravity=(edtValue)*1.019716212E-16;
			break;
		case "Attometer/square second -A/s^2":
			 meterpersquaresecond=(edtValue)*1.E-18;
			 decimeterpersquaresecond=(edtValue)*1.E-17;
			 kilometerpersquaresecond=(edtValue)*1.E-21;
			 hectometerpersquaresecond=(edtValue)*1.E-20;
			 dekameterpersquaresecond=(edtValue)*1.E-19;
			 centimeterpersquaresecond=(edtValue)*1.E-16;
			 millimeterpersquaresecond=(edtValue)*1.E-15;
			 micrometerpersquaresecond=(edtValue)*1.E-12;
			 nanometerpersquaresecond=(edtValue)*1.E-9;
			 picometerpersquaresecond=(edtValue)*0.000001;
			 femtometerpersquare=(edtValue)*0.001;
			 attometerpersquaresecond=(edtValue)*1;
			 gal=(edtValue)*1.E-16;
			 galileo=(edtValue)*1.E-16;
			 milepersquaresecond=(edtValue)*13711922E-22;
			 yardpersquaresecond=(edtValue)*1.093613298E-18;
			 footpersquaresecond=(edtValue)*3.280839895E-18;
			 inchpersquaresecond=(edtValue)*3.937007874E-17;
			 Accelerationofgravity=(edtValue)*1.019716212E-19;
			break;
		case "Gal -Gal":
			 meterpersquaresecond=(edtValue)*0.01;
			 decimeterpersquaresecond=(edtValue)*0.1;
			 kilometerpersquaresecond=(edtValue)*0.00001;
			 hectometerpersquaresecond=(edtValue)*0.0001;
			 dekameterpersquaresecond=(edtValue)*0.001;
			 centimeterpersquaresecond=(edtValue)*1;
			 millimeterpersquaresecond=(edtValue)*10;
			 micrometerpersquaresecond=(edtValue)*10000;
			 nanometerpersquaresecond=(edtValue)*10000000;
			 picometerpersquaresecond=(edtValue)*10000000000.0;
			 femtometerpersquare=(edtValue)*10000000000000.0;
			 attometerpersquaresecond=(edtValue)*10000000000000000.0;
			 gal=(edtValue)*1;
			 galileo=(edtValue)*1;
			 milepersquaresecond=(edtValue)*0.0000062137;
			 yardpersquaresecond=(edtValue)*0.010936133;
			 footpersquaresecond=(edtValue)*0.032808399;
			 inchpersquaresecond=(edtValue)*0.3937007874;
			 Accelerationofgravity=(edtValue)*0.0010197162;
			break;
		case "Galileo -Gal":
			 meterpersquaresecond=(edtValue)*0.01;
			 decimeterpersquaresecond=(edtValue)*0.1;
			 kilometerpersquaresecond=(edtValue)*0.00001;
			 hectometerpersquaresecond=(edtValue)*0.0001;
			 dekameterpersquaresecond=(edtValue)*0.001;
			 centimeterpersquaresecond=(edtValue)*1;
			 millimeterpersquaresecond=(edtValue)*10;
			 micrometerpersquaresecond=(edtValue)*10000;
			 nanometerpersquaresecond=(edtValue)*10000000;
			 picometerpersquaresecond=(edtValue)*10000000000.0;
			 femtometerpersquare=(edtValue)*10000000000000.0;
			 attometerpersquaresecond=(edtValue)*10000000000000000.0;
			 gal=(edtValue)*1;
			 galileo=(edtValue)*1;
			 milepersquaresecond=(edtValue)*0.0000062137;
			 yardpersquaresecond=(edtValue)*0.010936133;
			 footpersquaresecond=(edtValue)*0.032808399;
			 inchpersquaresecond=(edtValue)*0.3937007874;
			 Accelerationofgravity=(edtValue)*0.0010197162;
			break;
		case "Mile/square second -mi/s^2":
			 meterpersquaresecond=(edtValue)*1609.344;
			 decimeterpersquaresecond=(edtValue)*16093.44;
			 kilometerpersquaresecond=(edtValue)*1.609344;
			 hectometerpersquaresecond=(edtValue)*16.09344;
			 dekameterpersquaresecond=(edtValue)*160.9344;
			 centimeterpersquaresecond=(edtValue)*160934.4;
			 millimeterpersquaresecond=(edtValue)*1609344;
			 micrometerpersquaresecond=(edtValue)*1609344000;
			 nanometerpersquaresecond=(edtValue)*9344000000.0;
			 picometerpersquaresecond=(edtValue)*1609344000000011.0;
			 femtometerpersquare=(edtValue)*1609344000000010500.0;
			 attometerpersquaresecond=(edtValue)*1.609344E+21;
			 gal=(edtValue)*160934.4;
			 galileo=(edtValue)*160934.4;
			 milepersquaresecond=(edtValue)*1;
			 yardpersquaresecond=(edtValue)*1760;
			 footpersquaresecond=(edtValue)*5280;
			 inchpersquaresecond=(edtValue)*63360;
			 Accelerationofgravity=(edtValue)*164.10741691;
			break;
		case "Yard/square second -yd/s^2":
			 meterpersquaresecond=(edtValue)*0.9144;
			 decimeterpersquaresecond=(edtValue)*9.144;
			 kilometerpersquaresecond=(edtValue)*0.0009144;
			 hectometerpersquaresecond=(edtValue)*0.009144;
			 dekameterpersquaresecond=(edtValue)*0.09144;
			 centimeterpersquaresecond=(edtValue)*91.44;
			 millimeterpersquaresecond=(edtValue)*914.4;
			 micrometerpersquaresecond=(edtValue)*914400;
			 nanometerpersquaresecond=(edtValue)*914400000;
			 picometerpersquaresecond=(edtValue)*914400000000.0;
			 femtometerpersquare=(edtValue)*914400000000007.0;
			 attometerpersquaresecond=(edtValue)*914400000000006500.0;
			 gal=(edtValue)*91.44;
			 galileo=(edtValue)*91.44;
			 milepersquaresecond=(edtValue)*0.0005681818;
			 yardpersquaresecond=(edtValue)*1;
			 footpersquaresecond=(edtValue)*3;
			 inchpersquaresecond=(edtValue)*36;
			 Accelerationofgravity=(edtValue)*0.0932428505;
			break;
		case "Foot/square second -ft/s^2":
			 meterpersquaresecond=(edtValue)*0.3048;
			 decimeterpersquaresecond=(edtValue)*3.048;
			 kilometerpersquaresecond=(edtValue)*0.0003048;
			 hectometerpersquaresecond=(edtValue)*0.003048;
			 dekameterpersquaresecond=(edtValue)*0.03048;
			 centimeterpersquaresecond=(edtValue)*30.48;
			 millimeterpersquaresecond=(edtValue)*304.8;
			 micrometerpersquaresecond=(edtValue)*304800;
			 nanometerpersquaresecond=(edtValue)*304800000;
			 picometerpersquaresecond=(edtValue)*304800000000.0;
			 femtometerpersquare=(edtValue)*304800000000002.0;
			 attometerpersquaresecond=(edtValue)*304800000000002200.0;
			 gal=(edtValue)*30.48;
			 galileo=(edtValue)*30.48;
			 milepersquaresecond=(edtValue)*0.0001893939;
			 yardpersquaresecond=(edtValue)*0.3333333333;
			 footpersquaresecond=(edtValue)*1;
			 inchpersquaresecond=(edtValue)*12;
			 Accelerationofgravity=(edtValue)*0.0310809502;
			break;
		case "Inch/square second -in/s^2":
			 meterpersquaresecond=(edtValue)*0.0254;
			 decimeterpersquaresecond=(edtValue)*0.254;
			 kilometerpersquaresecond=(edtValue)*0.0000254;
			 hectometerpersquaresecond=(edtValue)*0.000254;
			 dekameterpersquaresecond=(edtValue)*0.00254;
			 centimeterpersquaresecond=(edtValue)*2.54;
			 millimeterpersquaresecond=(edtValue)*25.4;
			 micrometerpersquaresecond=(edtValue)*25400;
			 nanometerpersquaresecond=(edtValue)*25400000;
			 picometerpersquaresecond=(edtValue)*25400000000.0;
			 femtometerpersquare=(edtValue)*25400000000000.0;
			 attometerpersquaresecond=(edtValue)*25400000000000310.0;
			 gal=(edtValue)*2.54;
			 galileo=(edtValue)*2.54;
			 milepersquaresecond=(edtValue)*0.0000157828;
			 yardpersquaresecond=(edtValue)*0.0277777778;
			 footpersquaresecond=(edtValue)*0.0833333333;
			 inchpersquaresecond=(edtValue)*1;
			 Accelerationofgravity=(edtValue)*0.0025900792;
			break;
		case "Acceleration of gravity -g":
			 meterpersquaresecond=(edtValue)*9.80665;
			 decimeterpersquaresecond=(edtValue)*98.0665;
			 kilometerpersquaresecond=(edtValue)*0.00980665;
			 hectometerpersquaresecond=(edtValue)*0.0980665;
			 dekameterpersquaresecond=(edtValue)*0.980665;
			 centimeterpersquaresecond=(edtValue)*980.665;
			 millimeterpersquaresecond=(edtValue)*9806.65;
			 micrometerpersquaresecond=(edtValue)*9806650;
			 nanometerpersquaresecond=(edtValue)*9806650000.0;
			 picometerpersquaresecond=(edtValue)*9806650000000.0;
			 femtometerpersquare=(edtValue)*9806650000000272.0;
			 attometerpersquaresecond=(edtValue)*9806650000000272000.0;
			 gal=(edtValue)*980.665;
			 galileo=(edtValue)*980.665;
			 milepersquaresecond=(edtValue)*0.0060935698;
			 yardpersquaresecond=(edtValue)*10.724682852;
			 footpersquaresecond=(edtValue)*32.174048556;
			 inchpersquaresecond=(edtValue)*386.08858268;
			 Accelerationofgravity=(edtValue)*1;
			break;
		case "Default":
			break;
			
		}
		results.setMeterpersquaresecond(meterpersquaresecond);
		results.setDecimeterpersquaresecond(decimeterpersquaresecond);
		results.setKilometerpersquaresecond(kilometerpersquaresecond);
		results.setHectometerpersquaresecond(hectometerpersquaresecond);
		results.setDekameterpersquaresecond(dekameterpersquaresecond);
		results.setCentimeterpersquaresecond(centimeterpersquaresecond);
		results.setMillimeterpersquaresecond(millimeterpersquaresecond);
		results.setMicrometerpersquaresecond(micrometerpersquaresecond);
		results.setNanometerpersquaresecond(nanometerpersquaresecond);
		results.setPicometerpersquaresecond(picometerpersquaresecond);
		results.setFemtometerpersquare(femtometerpersquare);
		results.setAttometerpersquaresecond(attometerpersquaresecond);
		results.setGal(gal);
		results.setGalileo(galileo);
		results.setMilepersquaresecond(milepersquaresecond);
		results.setYardpersquaresecond(yardpersquaresecond);
		results.setFootpersquaresecond(footpersquaresecond);
		results.setInchpersquaresecond(inchpersquaresecond);
		results.setAccelerationofgravity(Accelerationofgravity);
		 
		 converterArray.add(results);
		return converterArray;
}

public class ConversionResults{
		private double meterpersquaresecond,decimeterpersquaresecond,kilometerpersquaresecond,hectometerpersquaresecond,dekameterpersquaresecond,centimeterpersquaresecond
		,millimeterpersquaresecond,micrometerpersquaresecond,nanometerpersquaresecond,picometerpersquaresecond,femtometerpersquare,attometerpersquaresecond,
		gal,galileo,milepersquaresecond,yardpersquaresecond,footpersquaresecond,inchpersquaresecond,Accelerationofgravity ;

		public double getMeterpersquaresecond() {
			return meterpersquaresecond;
		}

		public void setMeterpersquaresecond(double meterpersquaresecond) {
			this.meterpersquaresecond = meterpersquaresecond;
		}

		public double getDecimeterpersquaresecond() {
			return decimeterpersquaresecond;
		}

		public void setDecimeterpersquaresecond(double decimeterpersquaresecond) {
			this.decimeterpersquaresecond = decimeterpersquaresecond;
		}

		public double getKilometerpersquaresecond() {
			return kilometerpersquaresecond;
		}

		public void setKilometerpersquaresecond(double kilometerpersquaresecond) {
			this.kilometerpersquaresecond = kilometerpersquaresecond;
		}

		public double getHectometerpersquaresecond() {
			return hectometerpersquaresecond;
		}

		public void setHectometerpersquaresecond(double hectometerpersquaresecond) {
			this.hectometerpersquaresecond = hectometerpersquaresecond;
		}

		public double getDekameterpersquaresecond() {
			return dekameterpersquaresecond;
		}

		public void setDekameterpersquaresecond(double dekameterpersquaresecond) {
			this.dekameterpersquaresecond = dekameterpersquaresecond;
		}

		public double getCentimeterpersquaresecond() {
			return centimeterpersquaresecond;
		}

		public void setCentimeterpersquaresecond(double centimeterpersquaresecond) {
			this.centimeterpersquaresecond = centimeterpersquaresecond;
		}

		public double getMillimeterpersquaresecond() {
			return millimeterpersquaresecond;
		}

		public void setMillimeterpersquaresecond(double millimeterpersquaresecond) {
			this.millimeterpersquaresecond = millimeterpersquaresecond;
		}

		public double getMicrometerpersquaresecond() {
			return micrometerpersquaresecond;
		}

		public void setMicrometerpersquaresecond(double micrometerpersquaresecond) {
			this.micrometerpersquaresecond = micrometerpersquaresecond;
		}

		public double getNanometerpersquaresecond() {
			return nanometerpersquaresecond;
		}

		public void setNanometerpersquaresecond(double nanometerpersquaresecond) {
			this.nanometerpersquaresecond = nanometerpersquaresecond;
		}

		public double getPicometerpersquaresecond() {
			return picometerpersquaresecond;
		}

		public void setPicometerpersquaresecond(double picometerpersquaresecond) {
			this.picometerpersquaresecond = picometerpersquaresecond;
		}

		public double getFemtometerpersquare() {
			return femtometerpersquare;
		}

		public void setFemtometerpersquare(double femtometerpersquare) {
			this.femtometerpersquare = femtometerpersquare;
		}

		public double getAttometerpersquaresecond() {
			return attometerpersquaresecond;
		}

		public void setAttometerpersquaresecond(double attometerpersquaresecond) {
			this.attometerpersquaresecond = attometerpersquaresecond;
		}

		public double getGal() {
			return gal;
		}

		public void setGal(double gal) {
			this.gal = gal;
		}

		public double getGalileo() {
			return galileo;
		}

		public void setGalileo(double galileo) {
			this.galileo = galileo;
		}

		public double getMilepersquaresecond() {
			return milepersquaresecond;
		}

		public void setMilepersquaresecond(double milepersquaresecond) {
			this.milepersquaresecond = milepersquaresecond;
		}

		public double getYardpersquaresecond() {
			return yardpersquaresecond;
		}

		public void setYardpersquaresecond(double yardpersquaresecond) {
			this.yardpersquaresecond = yardpersquaresecond;
		}

		public double getFootpersquaresecond() {
			return footpersquaresecond;
		}

		public void setFootpersquaresecond(double footpersquaresecond) {
			this.footpersquaresecond = footpersquaresecond;
		}

		public double getInchpersquaresecond() {
			return inchpersquaresecond;
		}

		public void setInchpersquaresecond(double inchpersquaresecond) {
			this.inchpersquaresecond = inchpersquaresecond;
		}

		public double getAccelerationofgravity() {
			return Accelerationofgravity;
		}

		public void setAccelerationofgravity(double accelerationofgravity) {
			Accelerationofgravity = accelerationofgravity;
		}
		
		
	}
}

