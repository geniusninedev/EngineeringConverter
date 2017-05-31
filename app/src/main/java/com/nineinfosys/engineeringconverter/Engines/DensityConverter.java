package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;


public class DensityConverter {
	private double kilogrampercubicmeter,grampercubiccentimeter,kilogrampercubiccentimeter,grampercubicmeter,grampercubicmillimeter,milligrampercubicmeter,milligrampercubiccentimeter
	, milligrampercubicmillimeter,exagramperliter,petagramperliter,teragramperliter,gigagramperliter,megagramperliter,kilogramperliter,hectogramperliter,dekagramperliter
	,gramperliter,decigramperliter,centigramperliter,milligramperliter,microgramperliter,nanogramperliter,picogramperliter,femtogramperliter
	,attogramperliter,poundpercubicinch,poundpercubicfoot,poundpercubicyard,poundpergallonUS,poundpergallonUK,ouncepercubicinch,ouncecubicfoot
	,ouncepergallonUS,ouncegallonUK,grainpergallonUS,grainpergallonUK,grainpercubicfoot,tonshortpercubicyard,tonlongpercubicyard,slugpercubicfoot,psiper1000feet,Earthsdensitymean;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public DensityConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateDensityConversion()
    {
		
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Kilogram/cubic meter -kg/m^3":
			
			kilogrampercubicmeter=(edtValue)*1;
			grampercubiccentimeter=(edtValue)*0.001;
			kilogrampercubiccentimeter=(edtValue)*0.000001;
			grampercubicmeter=(edtValue)*1000;
			grampercubicmillimeter=(edtValue)*0.000001;
			milligrampercubicmeter=(edtValue)*1000000;
			milligrampercubiccentimeter=(edtValue)*1;
			milligrampercubicmillimeter=(edtValue)*0.001;
			exagramperliter=(edtValue)*9.999999999E-19;
			petagramperliter=(edtValue)*1.E-15;
			teragramperliter=(edtValue)*1.E-12;
			gigagramperliter=(edtValue)*1.E-9;
			megagramperliter=(edtValue)*0.000001;
			kilogramperliter=(edtValue)*0.001;
			hectogramperliter=(edtValue)*0.01;
			dekagramperliter=(edtValue)*0.1;
			gramperliter=(edtValue)*1;
			decigramperliter=(edtValue)*10;
			centigramperliter=(edtValue)*100;
			milligramperliter=(edtValue)*1000;
			microgramperliter=(edtValue)*1000000;
			nanogramperliter=(edtValue)*1000000000;
			picogramperliter=(edtValue)*1000000000000.0;
			femtogramperliter=(edtValue)*1000000000000000.0;
			attogramperliter=(edtValue)*999999999999999900.0;
			poundpercubicinch=(edtValue)*0.0000361273;
			poundpercubicfoot=(edtValue)*0.0624279606;
			poundpercubicyard=(edtValue)*1.6855549356;
			poundpergallonUS=(edtValue)*0.0083454045;
			poundpergallonUK=(edtValue)*0.0100224129;
			ouncepercubicinch=(edtValue)*0.0005780367;
			ouncecubicfoot=(edtValue)*0.9988473692;
			ouncepergallonUS=(edtValue)*0.1335264712;
			ouncegallonUK=(edtValue)*0.1603586057;
			grainpergallonUS=(edtValue)*58.417831164;
			grainpergallonUK=(edtValue)*70.156889985;
			grainpercubicfoot=(edtValue)*436.99572403;
			tonshortpercubicyard=(edtValue)*0.0008427775;
			tonlongpercubicyard=(edtValue)*0.0007524799;
			slugpercubicfoot=(edtValue)*0.0019403203;
			psiper1000feet=(edtValue)*0.433527504;
			Earthsdensitymean=(edtValue)*0.0001812251;
			
			
			break;
			
		case "Gram/cubic centimeter -g/cm^3,g/cc":
			
			kilogrampercubicmeter=(edtValue)*1000;
			grampercubiccentimeter=(edtValue)*1;
			kilogrampercubiccentimeter=(edtValue)*0.001;
			grampercubicmeter=(edtValue)*1000000;
			grampercubicmillimeter=(edtValue)*0.001;
			milligrampercubicmeter=(edtValue)*1000000000;
			milligrampercubiccentimeter=(edtValue)*1000;
			milligrampercubicmillimeter=(edtValue)*1;
			exagramperliter=(edtValue)*9.999999999E-16;
			petagramperliter=(edtValue)*1.E-12;
			teragramperliter=(edtValue)*1.E-9;
			gigagramperliter=(edtValue)*0.000001;
			megagramperliter=(edtValue)*0.001;
			kilogramperliter=(edtValue)*1;
			hectogramperliter=(edtValue)*10;
			dekagramperliter=(edtValue)*100;
			gramperliter=(edtValue)*1000;
			decigramperliter=(edtValue)*10000;
			centigramperliter=(edtValue)*100000;
			milligramperliter=(edtValue)*1000000;
			microgramperliter=(edtValue)*1000000000;
			nanogramperliter=(edtValue)*1000000000000.0;
			picogramperliter=(edtValue)*1000000000000000.0;
			femtogramperliter=(edtValue)*1000000000000000000.0;
			attogramperliter=(edtValue)*999999999999999900000.0;
			poundpercubicinch=(edtValue)*0.036127292;
			poundpercubicfoot=(edtValue)*62.427960576;
			poundpercubicyard=(edtValue)*1685.5549356;
			poundpergallonUS=(edtValue)*8.345404452;
			poundpergallonUK=(edtValue)*10.022412855;
			ouncepercubicinch=(edtValue)*0.578036672;
			ouncecubicfoot=(edtValue)*998.84736922;
			ouncepergallonUS=(edtValue)*133.52647123;
			ouncegallonUK=(edtValue)*160.35860568;
			grainpergallonUS=(edtValue)*58417.831164;
			grainpergallonUK=(edtValue)*70156.889985;
			grainpercubicfoot=(edtValue)*436995.72403;
			tonshortpercubicyard=(edtValue)*0.8427774678;
			tonlongpercubicyard=(edtValue)*0.7524798819;
			slugpercubicfoot=(edtValue)*1.940320332;
			psiper1000feet=(edtValue)*433.527504;
			Earthsdensitymean=(edtValue)*0.1812250816;
			
			break;
			
		case "Kilogram/cubic centimeter -kg/cm^3":
			
			kilogrampercubicmeter=(edtValue)*1000000;
			grampercubiccentimeter=(edtValue)*1000;
			kilogrampercubiccentimeter=(edtValue)*1;
			grampercubicmeter=(edtValue)*1000000000;
			grampercubicmillimeter=(edtValue)*1;
			milligrampercubicmeter=(edtValue)*1000000000000.0;
			milligrampercubiccentimeter=(edtValue)*1000000;
			milligrampercubicmillimeter=(edtValue)*1000;
			exagramperliter=(edtValue)*1.E-12;
			petagramperliter=(edtValue)*1.E-9;
			teragramperliter=(edtValue)*0.000001;
			gigagramperliter=(edtValue)*0.001;
			megagramperliter=(edtValue)*1;
			kilogramperliter=(edtValue)*1000;
			hectogramperliter=(edtValue)*10000;
			dekagramperliter=(edtValue)*100000;
			gramperliter=(edtValue)*1000000;
			decigramperliter=(edtValue)*10000000;
			centigramperliter=(edtValue)*100000000;
			milligramperliter=(edtValue)*1000000000;
			microgramperliter=(edtValue)*1000000000000.0;
			nanogramperliter=(edtValue)*1000000000000000.0;
			picogramperliter=(edtValue)*999999999999999900.0;
			femtogramperliter=(edtValue)*1.E+21;
			attogramperliter=(edtValue)*9.999999999E+23;
			poundpercubicinch=(edtValue)*36.127292;
			poundpercubicfoot=(edtValue)*62427.960576;
			poundpercubicyard=(edtValue)*1685554.9356;
			poundpergallonUS=(edtValue)*8345.404452;
			poundpergallonUK=(edtValue)*10022.412855;
			ouncepercubicinch=(edtValue)*578.036672;
			ouncecubicfoot=(edtValue)*998847.36922;
			ouncepergallonUS=(edtValue)*133526.47123;
			ouncegallonUK=(edtValue)*160358.60568;
			grainpergallonUS=(edtValue)*58417831.164;
			grainpergallonUK=(edtValue)*70156889.985;
			grainpercubicfoot=(edtValue)*436995724.03;
			tonshortpercubicyard=(edtValue)*842.77746778;
			tonlongpercubicyard=(edtValue)*752.47988194;
			slugpercubicfoot=(edtValue)*1940.320332;
			psiper1000feet=(edtValue)*433527.504;
			Earthsdensitymean=(edtValue)*181.22508155;
			
			break;	
		case "Gram/cubic meter -g/m^3":
			
			kilogrampercubicmeter=(edtValue)*0.001;
			grampercubiccentimeter=(edtValue)*0.000001;
			kilogrampercubiccentimeter=(edtValue)*1.E-9;
			grampercubicmeter=(edtValue)*1;
			grampercubicmillimeter=(edtValue)*1.E-9;
			milligrampercubicmeter=(edtValue)*1000;
			milligrampercubiccentimeter=(edtValue)*0.001;
			milligrampercubicmillimeter=(edtValue)*0.000001;
			exagramperliter=(edtValue)*1.E-21;
			petagramperliter=(edtValue)*1.E-18;
			teragramperliter=(edtValue)*1.E-15;
			gigagramperliter=(edtValue)*1.E-12;
			megagramperliter=(edtValue)*1.E-9;
			kilogramperliter=(edtValue)*0.000001;
			hectogramperliter=(edtValue)*0.00001;
			dekagramperliter=(edtValue)*0.0001;
			gramperliter=(edtValue)*0.001;
			decigramperliter=(edtValue)*0.01;
			centigramperliter=(edtValue)*0.1;
			milligramperliter=(edtValue)*1;
			microgramperliter=(edtValue)*1000;
			nanogramperliter=(edtValue)*1000000;
			picogramperliter=(edtValue)*1000000000;
			femtogramperliter=(edtValue)*1000000000000.0;
			attogramperliter=(edtValue)*1000000000000000.0;
			poundpercubicinch=(edtValue)*3.6127292E-8;
			poundpercubicfoot=(edtValue)*0.000062428;
			poundpercubicyard=(edtValue)*0.0016855549;
			poundpergallonUS=(edtValue)*0.0000083454;
			poundpergallonUK=(edtValue)*0.0000100224;
			ouncepercubicinch=(edtValue)*5.78036672E-7;
			ouncecubicfoot=(edtValue)*0.0009988474;
			ouncepergallonUS=(edtValue)*0.0001335265;
			ouncegallonUK=(edtValue)*0.0001603586;
			grainpergallonUS=(edtValue)*0.0584178312;
			grainpergallonUK=(edtValue)*0.07015689;
			grainpercubicfoot=(edtValue)*0.436995724;
			tonshortpercubicyard=(edtValue)*8.427774677E-7;
			tonlongpercubicyard=(edtValue)*7.524798819E-7;
			slugpercubicfoot=(edtValue)*0.0000019403;
			psiper1000feet=(edtValue)*0.0004335275;
			Earthsdensitymean=(edtValue)*1.812250815E-7;
			
			break;	
		case "Gram/cubic millimeter -g/mm^3":
			
			kilogrampercubicmeter=(edtValue)*1000000;
			grampercubiccentimeter=(edtValue)*1000;
			kilogrampercubiccentimeter=(edtValue)*1;
			grampercubicmeter=(edtValue)*1000000000;
			grampercubicmillimeter=(edtValue)*1;
			milligrampercubicmeter=(edtValue)*1000000000000.0;
			milligrampercubiccentimeter=(edtValue)*1000000;
			milligrampercubicmillimeter=(edtValue)*1000;
			exagramperliter=(edtValue)*1.E-12;
			petagramperliter=(edtValue)*1.E-9;
			teragramperliter=(edtValue)*0.000001;
			gigagramperliter=(edtValue)*0.001;
			megagramperliter=(edtValue)*1;
			kilogramperliter=(edtValue)*1000;
			hectogramperliter=(edtValue)*10000;
			dekagramperliter=(edtValue)*100000;
			gramperliter=(edtValue)*1000000;
			decigramperliter=(edtValue)*10000000;
			centigramperliter=(edtValue)*100000000;
			milligramperliter=(edtValue)*1000000000;
			microgramperliter=(edtValue)*1000000000000.0;
			nanogramperliter=(edtValue)*1000000000000000.0;
			picogramperliter=(edtValue)*999999999999999900.0;
			femtogramperliter=(edtValue)*1.E+21;
			attogramperliter=(edtValue)*9.999999999E+23;
			poundpercubicinch=(edtValue)*36.127292;
			poundpercubicfoot=(edtValue)*62427.960576;
			poundpercubicyard=(edtValue)*1685554.9356;
			poundpergallonUS=(edtValue)*8345.404452;
			poundpergallonUK=(edtValue)*10022.412855;
			ouncepercubicinch=(edtValue)*578.036672;
			ouncecubicfoot=(edtValue)*998847.36922;
			ouncepergallonUS=(edtValue)*133526.47123;
			ouncegallonUK=(edtValue)*160358.60568;
			grainpergallonUS=(edtValue)*58417831.164;
			grainpergallonUK=(edtValue)*70156889.985;
			grainpercubicfoot=(edtValue)*436995724.03;
			tonshortpercubicyard=(edtValue)*842.77746778;
			tonlongpercubicyard=(edtValue)*752.47988194;
			slugpercubicfoot=(edtValue)*1940.320332;
			psiper1000feet=(edtValue)*433527.504;
			Earthsdensitymean=(edtValue)*181.22508155;
			
			break;	
		case "Milligram/cubic meter -mg/m^3":
			
			kilogrampercubicmeter=(edtValue)*0.000001;
			grampercubiccentimeter=(edtValue)*1.E-9;
			kilogrampercubiccentimeter=(edtValue)*1.E-12;
			grampercubicmeter=(edtValue)*0.001;
			grampercubicmillimeter=(edtValue)*1.E-12;
			milligrampercubicmeter=(edtValue)*1;
			milligrampercubiccentimeter=(edtValue)*0.000001;
			milligrampercubicmillimeter=(edtValue)*1.E-9;
			exagramperliter=(edtValue)*1.E-24;
			petagramperliter=(edtValue)*1.E-21;
			teragramperliter=(edtValue)*1.E-18;
			gigagramperliter=(edtValue)*1.E-15;
			megagramperliter=(edtValue)*1.E-12;
			kilogramperliter=(edtValue)*1.E-9;
			hectogramperliter=(edtValue)*1.E-8;
			dekagramperliter=(edtValue)*1.E-7;
			gramperliter=(edtValue)*0.000001;
			decigramperliter=(edtValue)*0.00001;
			centigramperliter=(edtValue)*0.0001;
			milligramperliter=(edtValue)*0.001;
			microgramperliter=(edtValue)*1;
			nanogramperliter=(edtValue)*1000;
			picogramperliter=(edtValue)*1000000;
			femtogramperliter=(edtValue)*1000000000;
			attogramperliter=(edtValue)*1000000000000.0;
			poundpercubicinch=(edtValue)*3.6127292E-11;
			poundpercubicfoot=(edtValue)*6.242796057E-8;
			poundpercubicyard=(edtValue)*0.0000016856;
			poundpergallonUS=(edtValue)*8.345404452E-9;
			poundpergallonUK=(edtValue)*1.002241285E-8;
			ouncepercubicinch=(edtValue)*5.78036672E-10;
			ouncecubicfoot=(edtValue)*9.988473692E-7;
			ouncepergallonUS=(edtValue)*1.335264712E-7;
			ouncegallonUK=(edtValue)*1.603586056E-7;
			grainpergallonUS=(edtValue)*0.0000584178;
			grainpergallonUK=(edtValue)*0.0000701569;
			grainpercubicfoot=(edtValue)*0.0004369957;
			tonshortpercubicyard=(edtValue)*8.427774677E-10;
			tonlongpercubicyard=(edtValue)*7.524798819E-10;
			slugpercubicfoot=(edtValue)*1.940320331E-9;
			psiper1000feet=(edtValue)*4.33527504E-7;
			Earthsdensitymean=(edtValue)*1.812250815E-10;
			
			break;
			
		case "Milligram/cubic centimeter -mg/cm^3":
			
			kilogrampercubicmeter=(edtValue)*1;
			grampercubiccentimeter=(edtValue)*0.001;
			kilogrampercubiccentimeter=(edtValue)*0.000001;
			grampercubicmeter=(edtValue)*1000;
			grampercubicmillimeter=(edtValue)*0.000001;
			milligrampercubicmeter=(edtValue)*1000000;
			milligrampercubiccentimeter=(edtValue)*1;
			milligrampercubicmillimeter=(edtValue)*0.001;
			exagramperliter=(edtValue)*9.999999999E-19;
			petagramperliter=(edtValue)*1.E-15;
			teragramperliter=(edtValue)*1.E-12;
			gigagramperliter=(edtValue)*1.E-9;
			megagramperliter=(edtValue)*0.000001;
			kilogramperliter=(edtValue)*0.001;
			hectogramperliter=(edtValue)*0.01;
			dekagramperliter=(edtValue)*0.1;
			gramperliter=(edtValue)*1;
			decigramperliter=(edtValue)*10;
			centigramperliter=(edtValue)*100;
			milligramperliter=(edtValue)*1000;
			microgramperliter=(edtValue)*1000000;
			nanogramperliter=(edtValue)*1000000000;
			picogramperliter=(edtValue)*1000000000000.0;
			femtogramperliter=(edtValue)*1000000000000000.0;
			attogramperliter=(edtValue)*999999999999999900.0;
			poundpercubicinch=(edtValue)*0.0000361273;
			poundpercubicfoot=(edtValue)*0.0624279606;
			poundpercubicyard=(edtValue)*1.6855549356;
			poundpergallonUS=(edtValue)*0.0083454045;
			poundpergallonUK=(edtValue)*0.0100224129;
			ouncepercubicinch=(edtValue)*0.0005780367;
			ouncecubicfoot=(edtValue)*0.9988473692;
			ouncepergallonUS=(edtValue)*0.1335264712;
			ouncegallonUK=(edtValue)*0.1603586057;
			grainpergallonUS=(edtValue)*58.417831164;
			grainpergallonUK=(edtValue)*70.156889985;
			grainpercubicfoot=(edtValue)*436.99572403;
			tonshortpercubicyard=(edtValue)*0.0008427775;
			tonlongpercubicyard=(edtValue)*0.0007524799;
			slugpercubicfoot=(edtValue)*0.0019403203;
			psiper1000feet=(edtValue)*0.433527504;
			Earthsdensitymean=(edtValue)*0.0001812251;
			
			break;		
			
		case "Milligram/cubic millimeter -mg/mm^3":
			
			kilogrampercubicmeter=(edtValue)*1000;
			grampercubiccentimeter=(edtValue)*1;
			kilogrampercubiccentimeter=(edtValue)*0.001;
			grampercubicmeter=(edtValue)*1000000;
			grampercubicmillimeter=(edtValue)*0.001;
			milligrampercubicmeter=(edtValue)*1000000000;
			milligrampercubiccentimeter=(edtValue)*1000;
			milligrampercubicmillimeter=(edtValue)*1;
			exagramperliter=(edtValue)*9.999999999E-16;
			petagramperliter=(edtValue)*1.E-12;
			teragramperliter=(edtValue)*1.E-9;
			gigagramperliter=(edtValue)*0.000001;
			megagramperliter=(edtValue)*0.001;
			kilogramperliter=(edtValue)*1;
			hectogramperliter=(edtValue)*10;
			dekagramperliter=(edtValue)*100;
			gramperliter=(edtValue)*1000;
			decigramperliter=(edtValue)*10000;
			centigramperliter=(edtValue)*100000;
			milligramperliter=(edtValue)*1000000;
			microgramperliter=(edtValue)*1000000000;
			nanogramperliter=(edtValue)*1000000000000.0;
			picogramperliter=(edtValue)*1000000000000000.0;
			femtogramperliter=(edtValue)*1000000000000000000.0;
			attogramperliter=(edtValue)*999999999999999900000.0;
			poundpercubicinch=(edtValue)*0.036127292;
			poundpercubicfoot=(edtValue)*62.427960576;
			poundpercubicyard=(edtValue)*1685.5549356;
			poundpergallonUS=(edtValue)*8.345404452;
			poundpergallonUK=(edtValue)*10.022412855;
			ouncepercubicinch=(edtValue)*0.578036672;
			ouncecubicfoot=(edtValue)*998.84736922;
			ouncepergallonUS=(edtValue)*133.52647123;
			ouncegallonUK=(edtValue)*160.35860568;
			grainpergallonUS=(edtValue)*58417.831164;
			grainpergallonUK=(edtValue)*70156.889985;
			grainpercubicfoot=(edtValue)*436995.72403;
			tonshortpercubicyard=(edtValue)*0.8427774678;
			tonlongpercubicyard=(edtValue)*0.7524798819;
			slugpercubicfoot=(edtValue)*1.940320332;
			psiper1000feet=(edtValue)*433.527504;
			Earthsdensitymean=(edtValue)*0.1812250816;
			
			break;		
	case "Exagram/liter -Eg/L":
			
		kilogrampercubicmeter=(edtValue)*1000000000000000000.0;
		grampercubiccentimeter=(edtValue)*1000000000000000.0;
		kilogrampercubiccentimeter=(edtValue)*1000000000000.0;
		grampercubicmeter=(edtValue)*1.E+21;
		grampercubicmillimeter=(edtValue)*1000000000000.0;
		milligrampercubicmeter=(edtValue)*1.E+24;
		milligrampercubiccentimeter=(edtValue)*1000000000000000000.0;
		milligrampercubicmillimeter=(edtValue)*1000000000000000.0;
		exagramperliter=(edtValue)*1;
		petagramperliter=(edtValue)*1000;
		teragramperliter=(edtValue)*1000000;
		gigagramperliter=(edtValue)*1000000000;
		megagramperliter=(edtValue)*1000000000000.0;
		kilogramperliter=(edtValue)*1000000000000000.0;
		hectogramperliter=(edtValue)*10000000000000000.0;
		dekagramperliter=(edtValue)*100000000000000000.0;
		gramperliter=(edtValue)*1000000000000000000.0;
		decigramperliter=(edtValue)*10000000000000000000.0;
		centigramperliter=(edtValue)*100000000000000000000.0;
		milligramperliter=(edtValue)*1.E+21;
		microgramperliter=(edtValue)*1.E+24;
		nanogramperliter=(edtValue)*1.E+27;
		picogramperliter=(edtValue)*1.E+30;
		femtogramperliter=(edtValue)*1.E+33;
		attogramperliter=(edtValue)*9.999999999E+35;
		poundpercubicinch=(edtValue)*36127292000100.0;
		poundpercubicfoot=(edtValue)*62427960576173000.0;
		poundpercubicyard=(edtValue)*1685554935555900200.0;
		poundpergallonUS=(edtValue)*8345404452031502.0;
		poundpergallonUK=(edtValue)*10022412854961000.0;
		ouncepercubicinch=(edtValue)*578036672001600.0;
		ouncecubicfoot=(edtValue)*998847369218760100.0;
		ouncepergallonUS=(edtValue)*133526471232500000.0;
		ouncegallonUK=(edtValue)*160358605679370020.0;
		grainpergallonUS=(edtValue)*58417831164135010000.0;
		grainpergallonUK=(edtValue)*70156889984724010000.0;
		grainpercubicfoot=(edtValue)*436995724033010040000.0;
		tonshortpercubicyard=(edtValue)*842777467778330.0;
		tonlongpercubicyard=(edtValue)*752479881944600.0;
		slugpercubicfoot=(edtValue)*1940320331979700.0;
		psiper1000feet=(edtValue)*433527504001200060.0;
		Earthsdensitymean=(edtValue)*181225081551290.0;
		
			break;	
			
		case "Petagram/liter -Pg/L":
			
			kilogrampercubicmeter=(edtValue)*1000000000000000.0;
			grampercubiccentimeter=(edtValue)*1000000000000.0;
			kilogrampercubiccentimeter=(edtValue)*1000000000;
			grampercubicmeter=(edtValue)*1000000000000000000.0;
			grampercubicmillimeter=(edtValue)*1000000000;
			milligrampercubicmeter=(edtValue)*1.E+21;
			milligrampercubiccentimeter=(edtValue)*1000000000000000.0;
			milligrampercubicmillimeter=(edtValue)*1000000000000.0;
			exagramperliter=(edtValue)*0.001;
			petagramperliter=(edtValue)*1;
			teragramperliter=(edtValue)*1000;
			gigagramperliter=(edtValue)*1000000;
			megagramperliter=(edtValue)*1000000000;
			kilogramperliter=(edtValue)*1000000000000.0;
			hectogramperliter=(edtValue)*10000000000000.0;
			dekagramperliter=(edtValue)*100000000000000.0;
			gramperliter=(edtValue)*1000000000000000.0;
			decigramperliter=(edtValue)*10000000000000000.0;
			centigramperliter=(edtValue)*100000000000000000.0;
			milligramperliter=(edtValue)*1000000000000000000.0;
			microgramperliter=(edtValue)*1.E+21;
			nanogramperliter=(edtValue)*1.E+24;
			picogramperliter=(edtValue)*9.999999999E+26;
			femtogramperliter=(edtValue)*1.E+30;
			attogramperliter=(edtValue)*9.999999999E+32;
			poundpercubicinch=(edtValue)*36127292000.0;
			poundpercubicfoot=(edtValue)*62427960576173.0;
			poundpercubicyard=(edtValue)*1685554935555900.0;
			poundpergallonUS=(edtValue)*8345404452032.0;
			poundpergallonUK=(edtValue)*10022412854961.0;
			ouncepercubicinch=(edtValue)*578036672002.0;
			ouncecubicfoot=(edtValue)*998847369218760.0;
			ouncepergallonUS=(edtValue)*133526471232500.0;
			ouncegallonUK=(edtValue)*160358605679370.0;
			grainpergallonUS=(edtValue)*58417831164135000.0;
			grainpergallonUK=(edtValue)*70156889984724000.0;
			grainpercubicfoot=(edtValue)*436995724033010000.0;
			tonshortpercubicyard=(edtValue)*842777467778.0;
			tonlongpercubicyard=(edtValue)*752479881945.0;
			slugpercubicfoot=(edtValue)*1940320331980.0;
			psiper1000feet=(edtValue)*433527504001200.0;
			Earthsdensitymean=(edtValue)*181225081551.0;
			
			break;
			
		case "Teragram/liter -Tg/L":
			
			kilogrampercubicmeter=(edtValue)*1000000000000.0;
			grampercubiccentimeter=(edtValue)*1000000000;
			kilogrampercubiccentimeter=(edtValue)*1000000;
			grampercubicmeter=(edtValue)*1000000000000000.0;
			grampercubicmillimeter=(edtValue)*1000000;
			milligrampercubicmeter=(edtValue)*1000000000000000000.0;
			milligrampercubiccentimeter=(edtValue)*1000000000000.0;
			milligrampercubicmillimeter=(edtValue)*1000000000;
			exagramperliter=(edtValue)*0.000001;
			petagramperliter=(edtValue)*0.001;
			teragramperliter=(edtValue)*1;
			gigagramperliter=(edtValue)*1000;
			megagramperliter=(edtValue)*1000000;
			kilogramperliter=(edtValue)*1000000000;
			hectogramperliter=(edtValue)*10000000000.0;
			dekagramperliter=(edtValue)*100000000000.0;
			gramperliter=(edtValue)*1000000000000.0;
			decigramperliter=(edtValue)*10000000000000.0;
			centigramperliter=(edtValue)*100000000000000.0;
			milligramperliter=(edtValue)*1000000000000000.0;
			microgramperliter=(edtValue)*1000000000000000000.0;
			nanogramperliter=(edtValue)*1.E+21;
			picogramperliter=(edtValue)*9.999999999E+23;
			femtogramperliter=(edtValue)*1.E+27;
			attogramperliter=(edtValue)*9.999999999E+29;
			poundpercubicinch=(edtValue)*36127292;
			poundpercubicfoot=(edtValue)*62427960576.0;
			poundpercubicyard=(edtValue)*1685554935556.0;
			poundpergallonUS=(edtValue)*8345404452.0;
			poundpergallonUK=(edtValue)*10022412855.0;
			ouncepercubicinch=(edtValue)*578036672;
			ouncecubicfoot=(edtValue)*998847369219.0;
			ouncepergallonUS=(edtValue)*133526471233.0;
			ouncegallonUK=(edtValue)*160358605679.0;
			grainpergallonUS=(edtValue)*58417831164135.0;
			grainpergallonUK=(edtValue)*70156889984724.0;
			grainpercubicfoot=(edtValue)*436995724033010.0;
			tonshortpercubicyard=(edtValue)*842777467.78;
			tonlongpercubicyard=(edtValue)*752479881.94;
			slugpercubicfoot=(edtValue)*1940320332;
			psiper1000feet=(edtValue)*433527504001.0;
			Earthsdensitymean=(edtValue)*181225081.55;
			
			break;		
			
		case "Gigagram/liter -Gg/L":
			
			kilogrampercubicmeter=(edtValue)*1000000000;
			grampercubiccentimeter=(edtValue)*1000000;
			kilogrampercubiccentimeter=(edtValue)*1000;
			grampercubicmeter=(edtValue)*1000000000000.0;
			grampercubicmillimeter=(edtValue)*1000;
			milligrampercubicmeter=(edtValue)*1000000000000000.0;
			milligrampercubiccentimeter=(edtValue)*1000000000;
			milligrampercubicmillimeter=(edtValue)*1000000;
			exagramperliter=(edtValue)*9.999999999E-10;
			petagramperliter=(edtValue)*0.000001;
			teragramperliter=(edtValue)*0.001;
			gigagramperliter=(edtValue)*1;
			megagramperliter=(edtValue)*1000;
			kilogramperliter=(edtValue)*1000000;
			hectogramperliter=(edtValue)*10000000;
			dekagramperliter=(edtValue)*100000000;
			gramperliter=(edtValue)*1000000000;
			decigramperliter=(edtValue)*10000000000.0;
			centigramperliter=(edtValue)*100000000000.0;
			milligramperliter=(edtValue)*1000000000000.0;
			microgramperliter=(edtValue)*1000000000000000.0;
			nanogramperliter=(edtValue)*1000000000000000000.0;
			picogramperliter=(edtValue)*999999999999999900000.0;
			femtogramperliter=(edtValue)*1.E+24;
			attogramperliter=(edtValue)*9.999999999E+26;
			poundpercubicinch=(edtValue)*36127.292;
			poundpercubicfoot=(edtValue)*62427960.576;
			poundpercubicyard=(edtValue)*1685554935.6;
			poundpergallonUS=(edtValue)*8345404.452;
			poundpergallonUK=(edtValue)*10022412.855;
			ouncepercubicinch=(edtValue)*578036.672;
			ouncecubicfoot=(edtValue)*998847369.22;
			ouncepergallonUS=(edtValue)*133526471.23;
			ouncegallonUK=(edtValue)*160358605.68;
			grainpergallonUS=(edtValue)*58417831164.0;
			grainpergallonUK=(edtValue)*70156889985.0;
			grainpercubicfoot=(edtValue)*436995724033.0;
			tonshortpercubicyard=(edtValue)*842777.46778;
			tonlongpercubicyard=(edtValue)*752479.88194;
			slugpercubicfoot=(edtValue)*1940320.332;
			psiper1000feet=(edtValue)*433527504;
			Earthsdensitymean=(edtValue)*181225.08155;
			
			break;		
			
			
case "Megagram/liter -Mg/L":
			
	kilogrampercubicmeter=(edtValue)*1000000;
	grampercubiccentimeter=(edtValue)*1000;
	kilogrampercubiccentimeter=(edtValue)*1;
	grampercubicmeter=(edtValue)*1000000000;
	grampercubicmillimeter=(edtValue)*1;
	milligrampercubicmeter=(edtValue)*1000000000000.0;
	milligrampercubiccentimeter=(edtValue)*1000000;
	milligrampercubicmillimeter=(edtValue)*1000;
	exagramperliter=(edtValue)*1.E-12;
	petagramperliter=(edtValue)*1.E-9;
	teragramperliter=(edtValue)*0.000001;
	gigagramperliter=(edtValue)*0.001;
	megagramperliter=(edtValue)*1;
	kilogramperliter=(edtValue)*1000;
	hectogramperliter=(edtValue)*10000;
	dekagramperliter=(edtValue)*100000;
	gramperliter=(edtValue)*1000000;
	decigramperliter=(edtValue)*10000000;
	centigramperliter=(edtValue)*100000000;
	milligramperliter=(edtValue)*1000000000;
	microgramperliter=(edtValue)*1000000000000.0;
	nanogramperliter=(edtValue)*1000000000000000.0;
	picogramperliter=(edtValue)*999999999999999900.0;
	femtogramperliter=(edtValue)*1.E+21;
	attogramperliter=(edtValue)*9.999999999E+23;
	poundpercubicinch=(edtValue)*36.127292;
	poundpercubicfoot=(edtValue)*62427.960576;
	poundpercubicyard=(edtValue)*1685554.9356;
	poundpergallonUS=(edtValue)*8345.404452;
	poundpergallonUK=(edtValue)*10022.412855;
	ouncepercubicinch=(edtValue)*578.036672;
	ouncecubicfoot=(edtValue)*998847.36922;
	ouncepergallonUS=(edtValue)*133526.47123;
	ouncegallonUK=(edtValue)*160358.60568;
	grainpergallonUS=(edtValue)*58417831.164;
	grainpergallonUK=(edtValue)*70156889.985;
	grainpercubicfoot=(edtValue)*436995724.03;
	tonshortpercubicyard=(edtValue)*842.77746778;
	tonlongpercubicyard=(edtValue)*752.47988194;
	slugpercubicfoot=(edtValue)*1940.320332;
	psiper1000feet=(edtValue)*433527.504;
	Earthsdensitymean=(edtValue)*181.22508155;
			
			break;	
		case "Kilogram/liter -kg/L":
			
			kilogrampercubicmeter=(edtValue)*1000;
			grampercubiccentimeter=(edtValue)*1;
			kilogrampercubiccentimeter=(edtValue)*0.001;
			grampercubicmeter=(edtValue)*1000000;
			grampercubicmillimeter=(edtValue)*0.001;
			milligrampercubicmeter=(edtValue)*1000000000;
			milligrampercubiccentimeter=(edtValue)*1000;
			milligrampercubicmillimeter=(edtValue)*1;
			exagramperliter=(edtValue)*9.999999999E-16;
			petagramperliter=(edtValue)*1.E-12;
			teragramperliter=(edtValue)*1.E-9;
			gigagramperliter=(edtValue)*0.000001;
			megagramperliter=(edtValue)*0.001;
			kilogramperliter=(edtValue)*1;
			hectogramperliter=(edtValue)*10;
			dekagramperliter=(edtValue)*100;
			gramperliter=(edtValue)*1000;
			decigramperliter=(edtValue)*10000;
			centigramperliter=(edtValue)*100000;
			milligramperliter=(edtValue)*1000000;
			microgramperliter=(edtValue)*1000000000;
			nanogramperliter=(edtValue)*1000000000000.0;
			picogramperliter=(edtValue)*1000000000000000.0;
			femtogramperliter=(edtValue)*1000000000000000000.0;
			attogramperliter=(edtValue)*999999999999999900000.0;
			poundpercubicinch=(edtValue)*0.036127292;
			poundpercubicfoot=(edtValue)*62.427960576;
			poundpercubicyard=(edtValue)*1685.5549356;
			poundpergallonUS=(edtValue)*8.345404452;
			poundpergallonUK=(edtValue)*10.022412855;
			ouncepercubicinch=(edtValue)*0.578036672;
			ouncecubicfoot=(edtValue)*998.84736922;
			ouncepergallonUS=(edtValue)*133.52647123;
			ouncegallonUK=(edtValue)*160.35860568;
			grainpergallonUS=(edtValue)*58417.831164;
			grainpergallonUK=(edtValue)*70156.889985;
			grainpercubicfoot=(edtValue)*436995.72403;
			tonshortpercubicyard=(edtValue)*0.8427774678;
			tonlongpercubicyard=(edtValue)*0.7524798819;
			slugpercubicfoot=(edtValue)*1.940320332;
			psiper1000feet=(edtValue)*433.527504;
			Earthsdensitymean=(edtValue)*0.1812250816;
			
			break;	
		case "Hectogram/liter -hg/L":
			
			kilogrampercubicmeter=(edtValue)*100;
			grampercubiccentimeter=(edtValue)*0.1;
			kilogrampercubiccentimeter=(edtValue)*0.0001;
			grampercubicmeter=(edtValue)*100000;
			grampercubicmillimeter=(edtValue)*0.0001;
			milligrampercubicmeter=(edtValue)*100000000;
			milligrampercubiccentimeter=(edtValue)*100;
			milligrampercubicmillimeter=(edtValue)*0.1;
			exagramperliter=(edtValue)*1.E-16;
			petagramperliter=(edtValue)*1.E-13;
			teragramperliter=(edtValue)*1.E-10;
			gigagramperliter=(edtValue)*1.E-7;
			megagramperliter=(edtValue)*0.0001;
			kilogramperliter=(edtValue)*0.1;
			hectogramperliter=(edtValue)*1;
			dekagramperliter=(edtValue)*10;
			gramperliter=(edtValue)*100;
			decigramperliter=(edtValue)*1000;
			centigramperliter=(edtValue)*10000;
			milligramperliter=(edtValue)*100000;
			microgramperliter=(edtValue)*100000000;
			nanogramperliter=(edtValue)*100000000000.0;
			picogramperliter=(edtValue)*100000000000000.0;
			femtogramperliter=(edtValue)*100000000000000000.0;
			attogramperliter=(edtValue)*99999999999999980000.0;
			poundpercubicinch=(edtValue)*0.0036127292;
			poundpercubicfoot=(edtValue)*6.2427960576;
			poundpercubicyard=(edtValue)*168.55549356;
			poundpergallonUS=(edtValue)*0.8345404452;
			poundpergallonUK=(edtValue)*1.0022412855;
			ouncepercubicinch=(edtValue)*0.0578036672;
			ouncecubicfoot=(edtValue)*99.884736922;
			ouncepergallonUS=(edtValue)*13.352647123;
			ouncegallonUK=(edtValue)*16.035860568;
			grainpergallonUS=(edtValue)*5841.7831164;
			grainpergallonUK=(edtValue)*7015.6889985;
			grainpercubicfoot=(edtValue)*43699.572403;
			tonshortpercubicyard=(edtValue)*0.0842777468;
			tonlongpercubicyard=(edtValue)*0.0752479882;
			slugpercubicfoot=(edtValue)*0.1940320332;
			psiper1000feet=(edtValue)*43.3527504;
			Earthsdensitymean=(edtValue)*0.0181225082;
			
			break;	
		case "Dekagram/liter -dag/L":
			
			kilogrampercubicmeter=(edtValue)*10;
			grampercubiccentimeter=(edtValue)*0.01;
			kilogrampercubiccentimeter=(edtValue)*0.00001;
			grampercubicmeter=(edtValue)*10000;
			grampercubicmillimeter=(edtValue)*0.00001;
			milligrampercubicmeter=(edtValue)*10000000;
			milligrampercubiccentimeter=(edtValue)*10;
			milligrampercubicmillimeter=(edtValue)*0.01;
			exagramperliter=(edtValue)*9.999999999E-18;
			petagramperliter=(edtValue)*1.E-14;
			teragramperliter=(edtValue)*1.E-11;
			gigagramperliter=(edtValue)*1.E-8;
			megagramperliter=(edtValue)*0.00001;
			kilogramperliter=(edtValue)*0.01;
			hectogramperliter=(edtValue)*0.1;
			dekagramperliter=(edtValue)*1;
			gramperliter=(edtValue)*10;
			decigramperliter=(edtValue)*100;
			centigramperliter=(edtValue)*1000;
			milligramperliter=(edtValue)*10000;
			microgramperliter=(edtValue)*10000000;
			nanogramperliter=(edtValue)*10000000000.0;
			picogramperliter=(edtValue)*10000000000000.0;
			femtogramperliter=(edtValue)*10000000000000000.0;
			attogramperliter=(edtValue)*10000000000000000000.0;
			poundpercubicinch=(edtValue)*0.0003612729;
			poundpercubicfoot=(edtValue)*0.6242796058;
			poundpercubicyard=(edtValue)*16.855549356;
			poundpergallonUS=(edtValue)*0.0834540445;
			poundpergallonUK=(edtValue)*0.1002241285;
			ouncepercubicinch=(edtValue)*0.0057803667;
			ouncecubicfoot=(edtValue)*9.9884736922;
			ouncepergallonUS=(edtValue)*1.3352647123;
			ouncegallonUK=(edtValue)*1.6035860568;
			grainpergallonUS=(edtValue)*584.17831164;
			grainpergallonUK=(edtValue)*701.56889985;
			grainpercubicfoot=(edtValue)*4369.9572403;
			tonshortpercubicyard=(edtValue)*0.0084277747;
			tonlongpercubicyard=(edtValue)*0.0075247988;
			slugpercubicfoot=(edtValue)*0.0194032033;
			psiper1000feet=(edtValue)*4.33527504;
			Earthsdensitymean=(edtValue)*0.0018122508;
			
			break;
			
		case "Gram/liter -g/L":
			
			kilogrampercubicmeter=(edtValue)*1;
			grampercubiccentimeter=(edtValue)*0.001;
			kilogrampercubiccentimeter=(edtValue)*0.000001;
			grampercubicmeter=(edtValue)*1000;
			grampercubicmillimeter=(edtValue)*0.000001;
			milligrampercubicmeter=(edtValue)*1000000;
			milligrampercubiccentimeter=(edtValue)*1;
			milligrampercubicmillimeter=(edtValue)*0.001;
			exagramperliter=(edtValue)*9.999999999E-19;
			petagramperliter=(edtValue)*1.E-15;
			teragramperliter=(edtValue)*1.E-12;
			gigagramperliter=(edtValue)*1.E-9;
			megagramperliter=(edtValue)*0.000001;
			kilogramperliter=(edtValue)*0.001;
			hectogramperliter=(edtValue)*0.01;
			dekagramperliter=(edtValue)*0.1;
			gramperliter=(edtValue)*1;
			decigramperliter=(edtValue)*10;
			centigramperliter=(edtValue)*100;
			milligramperliter=(edtValue)*1000;
			microgramperliter=(edtValue)*1000000;
			nanogramperliter=(edtValue)*1000000000;
			picogramperliter=(edtValue)*1000000000000.0;
			femtogramperliter=(edtValue)*1000000000000000.0;
			attogramperliter=(edtValue)*999999999999999900.0;
			poundpercubicinch=(edtValue)*0.0000361273;
			poundpercubicfoot=(edtValue)*0.0624279606;
			poundpercubicyard=(edtValue)*1.6855549356;
			poundpergallonUS=(edtValue)*0.0083454045;
			poundpergallonUK=(edtValue)*0.0100224129;
			ouncepercubicinch=(edtValue)*0.0005780367;
			ouncecubicfoot=(edtValue)*0.9988473692;
			ouncepergallonUS=(edtValue)*0.1335264712;
			ouncegallonUK=(edtValue)*0.1603586057;
			grainpergallonUS=(edtValue)*58.417831164;
			grainpergallonUK=(edtValue)*70.156889985;
			grainpercubicfoot=(edtValue)*436.99572403;
			tonshortpercubicyard=(edtValue)*0.0008427775;
			tonlongpercubicyard=(edtValue)*0.0007524799;
			slugpercubicfoot=(edtValue)*0.0019403203;
			psiper1000feet=(edtValue)*0.433527504;
			Earthsdensitymean=(edtValue)*0.0001812251
					;
			
			break;		
			
		case "Decigram/liter -dg/L":
			
			kilogrampercubicmeter=(edtValue)*0.1;
			grampercubiccentimeter=(edtValue)*0.0001;
			kilogrampercubiccentimeter=(edtValue)*1.E-7;
			grampercubicmeter=(edtValue)*100;
			grampercubicmillimeter=(edtValue)*1.E-7;
			milligrampercubicmeter=(edtValue)*100000;
			milligrampercubiccentimeter=(edtValue)*0.1;
			milligrampercubicmillimeter=(edtValue)*0.0001;
			exagramperliter=(edtValue)*1.E-19;
			petagramperliter=(edtValue)*1.E-16;
			teragramperliter=(edtValue)*1.E-13;
			gigagramperliter=(edtValue)*1.E-10;
			megagramperliter=(edtValue)*1.E-7;
			kilogramperliter=(edtValue)*0.0001;
			hectogramperliter=(edtValue)*0.001;
			dekagramperliter=(edtValue)*0.01;
			gramperliter=(edtValue)*0.1;
			decigramperliter=(edtValue)*1;
			centigramperliter=(edtValue)*10;
			milligramperliter=(edtValue)*100;
			microgramperliter=(edtValue)*100000;
			nanogramperliter=(edtValue)*100000000;
			picogramperliter=(edtValue)*100000000000.0;
			femtogramperliter=(edtValue)*100000000000000.0;
			attogramperliter=(edtValue)*100000000000000.0;
			poundpercubicinch=(edtValue)*0.0000036127;
			poundpercubicfoot=(edtValue)*0.0062427961;
			poundpercubicyard=(edtValue)*0.1685554936;
			poundpergallonUS=(edtValue)*0.0008345404;
			poundpergallonUK=(edtValue)*0.0010022413;
			ouncepercubicinch=(edtValue)*0.0000578037;
			ouncecubicfoot=(edtValue)*0.0998847369;
			ouncepergallonUS=(edtValue)*0.0133526471;
			ouncegallonUK=(edtValue)*0.0160358606;
			grainpergallonUS=(edtValue)*5.8417831164;
			grainpergallonUK=(edtValue)*7.0156889985;
			grainpercubicfoot=(edtValue)*43.699572403;
			tonshortpercubicyard=(edtValue)*43.699572403;
			tonlongpercubicyard=(edtValue)*0.000075248;
			slugpercubicfoot=(edtValue)*0.000194032;
			psiper1000feet=(edtValue)*0.0433527504;
			Earthsdensitymean=(edtValue)*0.0000181225;
			
			break;		
	case "Centigram/liter -cg/L":
			
		kilogrampercubicmeter=(edtValue)*0.01;
		grampercubiccentimeter=(edtValue)*0.00001;
		kilogrampercubiccentimeter=(edtValue)*1.E-8;
		grampercubicmeter=(edtValue)*10;
		grampercubicmillimeter=(edtValue)*1.E-8;
		milligrampercubicmeter=(edtValue)*10000;
		milligrampercubiccentimeter=(edtValue)*0.01;
		milligrampercubicmillimeter=(edtValue)*0.00001;
		exagramperliter=(edtValue)*1.E-20;
		petagramperliter=(edtValue)*1.E-17;
		teragramperliter=(edtValue)*1.E-14;
		gigagramperliter=(edtValue)*1.E-11;
		megagramperliter=(edtValue)*1.E-8;
		kilogramperliter=(edtValue)*0.00001;
		hectogramperliter=(edtValue)*0.0001;
		dekagramperliter=(edtValue)*0.001;
		gramperliter=(edtValue)*0.01;
		decigramperliter=(edtValue)*0.1;
		centigramperliter=(edtValue)*1;
		milligramperliter=(edtValue)*10;
		microgramperliter=(edtValue)*10000;
		nanogramperliter=(edtValue)*10000000;
		picogramperliter=(edtValue)*10000000000.0;
		femtogramperliter=(edtValue)*10000000000000.0;
		attogramperliter=(edtValue)*10000000000000000.0;
		poundpercubicinch=(edtValue)*3.6127292E-7;
		poundpercubicfoot=(edtValue)*0.0006242796;
		poundpercubicyard=(edtValue)*0.0168555494;
		poundpergallonUS=(edtValue)*0.000083454;
		poundpergallonUK=(edtValue)*0.0001002241;
		ouncepercubicinch=(edtValue)*0.0000057804;
		ouncecubicfoot=(edtValue)*0.0099884737;
		ouncepergallonUS=(edtValue)*0.0013352647;
		ouncegallonUK=(edtValue)*0.0016035861;
		grainpergallonUS=(edtValue)*0.5841783116;
		grainpergallonUK=(edtValue)*0.7015688998;
		grainpercubicfoot=(edtValue)*4.3699572403;
		tonshortpercubicyard=(edtValue)*0.0000084278;
		tonlongpercubicyard=(edtValue)*0.0000075248;
		slugpercubicfoot=(edtValue)*0.0000194032;
		psiper1000feet=(edtValue)*0.004335275;
		Earthsdensitymean=(edtValue)*0.0000018123;
			
			break;	
		case "Milligram/liter -mg/L":
			
			kilogrampercubicmeter=(edtValue)*0.001;
			grampercubiccentimeter=(edtValue)*0.000001;
			kilogrampercubiccentimeter=(edtValue)*1.E-9;
			grampercubicmeter=(edtValue)*1;
			grampercubicmillimeter=(edtValue)*1.E-9;
			milligrampercubicmeter=(edtValue)*1000;
			milligrampercubiccentimeter=(edtValue)*0.001;
			milligrampercubicmillimeter=(edtValue)*0.000001;
			exagramperliter=(edtValue)*1.E-21;
			petagramperliter=(edtValue)*1.E-18;
			teragramperliter=(edtValue)*1.E-15;
			gigagramperliter=(edtValue)*1.E-12;
			megagramperliter=(edtValue)*1.E-9;
			kilogramperliter=(edtValue)*0.000001;
			hectogramperliter=(edtValue)*0.00001;
			dekagramperliter=(edtValue)*0.0001;
			gramperliter=(edtValue)*0.001;
			decigramperliter=(edtValue)*0.01;
			centigramperliter=(edtValue)*0.1;
			milligramperliter=(edtValue)*1;
			microgramperliter=(edtValue)*1000;
			nanogramperliter=(edtValue)*1000000;
			picogramperliter=(edtValue)*1000000000;
			femtogramperliter=(edtValue)*1000000000000.0;
			attogramperliter=(edtValue)*1000000000000000.0;
			poundpercubicinch=(edtValue)*3.6127292E-8;
			poundpercubicfoot=(edtValue)*0.000062428;
			poundpercubicyard=(edtValue)*0.0016855549;
			poundpergallonUS=(edtValue)*0.0000083454;
			poundpergallonUK=(edtValue)*0.0000100224;
			ouncepercubicinch=(edtValue)*5.78036672E-7;
			ouncecubicfoot=(edtValue)*0.0009988474;
			ouncepergallonUS=(edtValue)*0.0001335265;
			ouncegallonUK=(edtValue)*0.0001603586;
			grainpergallonUS=(edtValue)*0.0584178312;
			grainpergallonUK=(edtValue)*0.07015689;
			grainpercubicfoot=(edtValue)*0.436995724;
			tonshortpercubicyard=(edtValue)*8.427774677E-7;
			tonlongpercubicyard=(edtValue)*7.524798819E-7;
			slugpercubicfoot=(edtValue)*0.0000019403;
			psiper1000feet=(edtValue)*0.0004335275;
			Earthsdensitymean=(edtValue)*1.812250815E-7;
			
			break;
			
		case "Microgram/liter -μg/L":
			
			kilogrampercubicmeter=(edtValue)*0.000001;
			grampercubiccentimeter=(edtValue)*1.E-9;
			kilogrampercubiccentimeter=(edtValue)*1.E-12;
			grampercubicmeter=(edtValue)*0.001;
			grampercubicmillimeter=(edtValue)*1.E-12;
			milligrampercubicmeter=(edtValue)*1;
			milligrampercubiccentimeter=(edtValue)*0.000001;
			milligrampercubicmillimeter=(edtValue)*1.E-9;
			exagramperliter=(edtValue)*1.E-24;
			petagramperliter=(edtValue)*1.E-21;
			teragramperliter=(edtValue)*1.E-18;
			gigagramperliter=(edtValue)*1.E-15;
			megagramperliter=(edtValue)*1.E-12;
			kilogramperliter=(edtValue)*1.E-9;
			hectogramperliter=(edtValue)*1.E-8;
			dekagramperliter=(edtValue)*1.E-7;
			gramperliter=(edtValue)*0.000001;
			decigramperliter=(edtValue)*0.00001;
			centigramperliter=(edtValue)*0.0001;
			milligramperliter=(edtValue)*0.001;
			microgramperliter=(edtValue)*1;
			nanogramperliter=(edtValue)*1000;
			picogramperliter=(edtValue)*1000000;
			femtogramperliter=(edtValue)*1000000000;
			attogramperliter=(edtValue)*1000000000000.0;
			poundpercubicinch=(edtValue)*3.6127292E-11;
			poundpercubicfoot=(edtValue)*6.242796057E-8;
			poundpercubicyard=(edtValue)*0.0000016856;
			poundpergallonUS=(edtValue)*8.345404452E-9;
			poundpergallonUK=(edtValue)*1.002241285E-8;
			ouncepercubicinch=(edtValue)*5.78036672E-10;
			ouncecubicfoot=(edtValue)*9.988473692E-7;
			ouncepergallonUS=(edtValue)*1.335264712E-7;
			ouncegallonUK=(edtValue)*1.603586056E-7;
			grainpergallonUS=(edtValue)*0.0000584178;
			grainpergallonUK=(edtValue)*0.0000701569;
			grainpercubicfoot=(edtValue)*0.0004369957;
			tonshortpercubicyard=(edtValue)*8.427774677E-10;
			tonlongpercubicyard=(edtValue)*7.524798819E-10;
			slugpercubicfoot=(edtValue)*1.940320331E-9;
			psiper1000feet=(edtValue)*4.33527504E-7;
			Earthsdensitymean=(edtValue)*1.812250815E-10;
			
			break;		
			
		case "Nanogram/liter -ng/L":
			
			kilogrampercubicmeter=(edtValue)*1.E-9;
			grampercubiccentimeter=(edtValue)*1.E-12;
			kilogrampercubiccentimeter=(edtValue)*1.E-15;
			grampercubicmeter=(edtValue)*0.000001;
			grampercubicmillimeter=(edtValue)*1.E-15;
			milligrampercubicmeter=(edtValue)*0.001;
			milligrampercubiccentimeter=(edtValue)*1.E-9;
			milligrampercubicmillimeter=(edtValue)*1.E-12;
			exagramperliter=(edtValue)*1.E-27;
			petagramperliter=(edtValue)*1.E-24;
			teragramperliter=(edtValue)*1.E-21;
			gigagramperliter=(edtValue)*1.E-18;
			megagramperliter=(edtValue)*1.E-15;
			kilogramperliter=(edtValue)*1.E-12;
			hectogramperliter=(edtValue)*1.E-11;
			dekagramperliter=(edtValue)*1.E-10;
			gramperliter=(edtValue)*1.E-9;
			decigramperliter=(edtValue)*1.E-8;
			centigramperliter=(edtValue)*1.E-7;
			milligramperliter=(edtValue)*0.000001;
			microgramperliter=(edtValue)*0.001;
			nanogramperliter=(edtValue)*1;
			picogramperliter=(edtValue)*1000;
			femtogramperliter=(edtValue)*1000000;
			attogramperliter=(edtValue)*1000000000;
			poundpercubicinch=(edtValue)*3.6127292E-14;
			poundpercubicfoot=(edtValue)*6.242796057E-11;
			poundpercubicyard=(edtValue)*1.685554935E-9;
			poundpergallonUS=(edtValue)*8.345404452E-12;
			poundpergallonUK=(edtValue)*1.002241285E-11;
			ouncepercubicinch=(edtValue)*5.78036672E-13;
			ouncecubicfoot=(edtValue)*9.988473692E-10;
			ouncepergallonUS=(edtValue)*1.335264712E-10;
			ouncegallonUK=(edtValue)*1.603586056E-10;
			grainpergallonUS=(edtValue)*5.841783116E-8;
			grainpergallonUK=(edtValue)*7.015688998E-8;
			grainpercubicfoot=(edtValue)*4.36995724E-7;
			tonshortpercubicyard=(edtValue)*8.427774677E-13;
			tonlongpercubicyard=(edtValue)*7.524798819E-13;
			slugpercubicfoot=(edtValue)*1.940320331E-12;
			psiper1000feet=(edtValue)*4.33527504E-10;
			Earthsdensitymean=(edtValue)*1.812250815E-13;
			
			break;	
			
			
			
		case "Picogram/liter -pg/L":
			
			kilogrampercubicmeter=(edtValue)*1.E-12;
			grampercubiccentimeter=(edtValue)*1.E-15;
			kilogrampercubiccentimeter=(edtValue)*1.E-18;
			grampercubicmeter=(edtValue)*1.E-9;
			grampercubicmillimeter=(edtValue)*1.E-18;
			milligrampercubicmeter=(edtValue)*0.000001;
			milligrampercubiccentimeter=(edtValue)*1.E-12;
			milligrampercubicmillimeter=(edtValue)*1.E-15;
			exagramperliter=(edtValue)*1.E-30;
			petagramperliter=(edtValue)*1.E-27;
			teragramperliter=(edtValue)*1.E-24;
			gigagramperliter=(edtValue)*1.E-21;
			megagramperliter=(edtValue)*1.E-18;
			kilogramperliter=(edtValue)*1.E-15;
			hectogramperliter=(edtValue)*1.E-14;
			dekagramperliter=(edtValue)*1.E-13;
			gramperliter=(edtValue)*1.E-12;
			decigramperliter=(edtValue)*1.E-11;
			centigramperliter=(edtValue)*1.E-10;
			milligramperliter=(edtValue)*1.E-9;
			microgramperliter=(edtValue)*0.000001;
			nanogramperliter=(edtValue)*0.001;
			picogramperliter=(edtValue)*1;
			femtogramperliter=(edtValue)*1000;
			attogramperliter=(edtValue)*1000000;
			poundpercubicinch=(edtValue)*3.6127292E-17;
			poundpercubicfoot=(edtValue)*6.242796057E-14;
			poundpercubicyard=(edtValue)*1.685554935E-12;
			poundpergallonUS=(edtValue)*8.345404452E-15;
			poundpergallonUK=(edtValue)*1.002241285E-14;
			ouncepercubicinch=(edtValue)*5.78036672E-16;
			ouncecubicfoot=(edtValue)*9.988473692E-13;
			ouncepergallonUS=(edtValue)*1.335264712E-13;
			ouncegallonUK=(edtValue)*1.603586056E-13;
			grainpergallonUS=(edtValue)*5.841783116E-11;
			grainpergallonUK=(edtValue)*7.015688998E-11;
			grainpercubicfoot=(edtValue)*4.36995724E-10;
			tonshortpercubicyard=(edtValue)*8.427774677E-16;
			tonlongpercubicyard=(edtValue)*7.524798819E-16;
			slugpercubicfoot=(edtValue)*1.940320331E-15;
			psiper1000feet=(edtValue)*4.33527504E-13;
			Earthsdensitymean=(edtValue)*1.812250815E-16;
			
			break;
			
	
			
		case "Femtogram/liter -fg/L":
			
			kilogrampercubicmeter=(edtValue)*9.999999999E-16;
			grampercubiccentimeter=(edtValue)*9.999999999E-19;
			kilogrampercubiccentimeter=(edtValue)*1.E-21;
			grampercubicmeter=(edtValue)*1.E-12;
			grampercubicmillimeter=(edtValue)*1.E-21;
			milligrampercubicmeter=(edtValue)*9.999999999E-10;
			milligrampercubiccentimeter=(edtValue)*9.999999999E-16;
			milligrampercubicmillimeter=(edtValue)*9.999999999E-19;
			exagramperliter=(edtValue)*9.999999999E-34;
			petagramperliter=(edtValue)*1.E-30;
			teragramperliter=(edtValue)*1.E-27;
			gigagramperliter=(edtValue)*1.E-24;
			megagramperliter=(edtValue)*1.E-21;
			kilogramperliter=(edtValue)*9.999999999E-19;
			hectogramperliter=(edtValue)*9.999999999E-18;
			dekagramperliter=(edtValue)*1.E-16;
			gramperliter=(edtValue)*9.999999999E-16;
			decigramperliter=(edtValue)*1.E-14;
			centigramperliter=(edtValue)*9.999999999E-14;
			milligramperliter=(edtValue)*1.E-12;
			microgramperliter=(edtValue)*9.999999999E-10;
			nanogramperliter=(edtValue)*0.000001;
			picogramperliter=(edtValue)*0.001;
			femtogramperliter=(edtValue)*1;
			attogramperliter=(edtValue)*1000;
			poundpercubicinch=(edtValue)*3.6127292E-20;
			poundpercubicfoot=(edtValue)*6.242796057E-17;
			poundpercubicyard=(edtValue)*1.685554935E-15;
			poundpergallonUS=(edtValue)*8.345404452E-18;
			poundpergallonUK=(edtValue)*1.002241285E-17;
			ouncepercubicinch=(edtValue)*5.78036672E-19;
			ouncecubicfoot=(edtValue)*9.988473692E-16;
			ouncepergallonUS=(edtValue)*1.335264712E-16;
			ouncegallonUK=(edtValue)*1.603586056E-16;
			grainpergallonUS=(edtValue)*5.841783116E-14;
			grainpergallonUK=(edtValue)*7.015688998E-14;
			grainpercubicfoot=(edtValue)*4.36995724E-13;
			tonshortpercubicyard=(edtValue)*8.427774677E-19;
			tonlongpercubicyard=(edtValue)*7.524798819E-19;
			slugpercubicfoot=(edtValue)*1.940320331E-18;
			psiper1000feet=(edtValue)*4.33527504E-16;
			Earthsdensitymean=(edtValue)*1.812250815E-19;
			
			break;		
	case "Attogram/liter -ag/L":
			
		kilogrampercubicmeter=(edtValue)*1.E-18;
		grampercubiccentimeter=(edtValue)*1.E-21;
		kilogrampercubiccentimeter=(edtValue)*1.E-24;
		grampercubicmeter=(edtValue)*1.E-15;
		grampercubicmillimeter=(edtValue)*1.E-24;
		milligrampercubicmeter=(edtValue)*1.E-12;
		milligrampercubiccentimeter=(edtValue)*1.E-18;
		milligrampercubicmillimeter=(edtValue)*1.E-21;
		exagramperliter=(edtValue)*1.E-36;
		petagramperliter=(edtValue)*1.E-33;
		teragramperliter=(edtValue)*1.E-30;
		gigagramperliter=(edtValue)*1.E-27;
		megagramperliter=(edtValue)*1.E-24;
		kilogramperliter=(edtValue)*1.E-21;
		hectogramperliter=(edtValue)*1.E-20;
		dekagramperliter=(edtValue)*1.E-19;
		gramperliter=(edtValue)*1.E-18;
		decigramperliter=(edtValue)*1.E-17;
		centigramperliter=(edtValue)*1.E-16;
		milligramperliter=(edtValue)*1.E-15;
		microgramperliter=(edtValue)*1.E-12;
		nanogramperliter=(edtValue)*1.E-9;
		picogramperliter=(edtValue)*0.000001;
		femtogramperliter=(edtValue)*0.001;
		attogramperliter=(edtValue)*1;
		poundpercubicinch=(edtValue)*3.6127292E-23;
		poundpercubicfoot=(edtValue)*6.242796057E-20;
		poundpercubicyard=(edtValue)*1.685554935E-18;
		poundpergallonUS=(edtValue)*8.345404452E-21;
		poundpergallonUK=(edtValue)*1.002241285E-20;
		ouncepercubicinch=(edtValue)*5.78036672E-22;
		ouncecubicfoot=(edtValue)*9.988473692E-19;
		ouncepergallonUS=(edtValue)*1.335264712E-19;
		ouncegallonUK=(edtValue)*1.603586056E-19;
		grainpergallonUS=(edtValue)*5.841783116E-17;
		grainpergallonUK=(edtValue)*7.015688998E-17;
		grainpercubicfoot=(edtValue)*4.36995724E-16;
		tonshortpercubicyard=(edtValue)*8.427774677E-22;
		tonlongpercubicyard=(edtValue)*7.524798819E-22;
		slugpercubicfoot=(edtValue)*1.940320331E-21;
		psiper1000feet=(edtValue)*4.33527504E-19;
		Earthsdensitymean=(edtValue)*1.812250815E-22;
			
			break;	
		case "Pound/cubic inch -lb/in^3":
			
			kilogrampercubicmeter=(edtValue)*27679.90471;
			grampercubiccentimeter=(edtValue)*27.67990471;
			kilogrampercubiccentimeter=(edtValue)*0.0276799047;
			grampercubicmeter=(edtValue)*27679904.71;
			grampercubicmillimeter=(edtValue)*0.0276799047;
			milligrampercubicmeter=(edtValue)*27679904710.0;
			milligrampercubiccentimeter=(edtValue)*27679.90471;
			milligrampercubicmillimeter=(edtValue)*27.67990471;
			exagramperliter=(edtValue)*2.767990471E-14;
			petagramperliter=(edtValue)*2.767990471E-11;
			teragramperliter=(edtValue)*2.767990471E-8;
			gigagramperliter=(edtValue)*0.0000276799;
			megagramperliter=(edtValue)*0.0276799047;
			kilogramperliter=(edtValue)*27.67990471;
			hectogramperliter=(edtValue)*276.7990471;
			dekagramperliter=(edtValue)*2767.990471;
			gramperliter=(edtValue)*27679.90471;
			decigramperliter=(edtValue)*276799.0471;
			centigramperliter=(edtValue)*2767990.471;
			milligramperliter=(edtValue)*27679904.71;
			microgramperliter=(edtValue)*27679904710.0;
			nanogramperliter=(edtValue)*27679904710191.0;
			picogramperliter=(edtValue)*27679904710190624.0;
			femtogramperliter=(edtValue)*27679904710190625000.0;
			attogramperliter=(edtValue)*2.767990471E+22;
			poundpercubicinch=(edtValue)*1;
			poundpercubicfoot=(edtValue)*1728;
			poundpercubicyard=(edtValue)*46656;
			poundpergallonUS=(edtValue)*231;
			poundpergallonUK=(edtValue)*277.41943279;
			ouncepercubicinch=(edtValue)*16;
			ouncecubicfoot=(edtValue)*27648;
			ouncepergallonUS=(edtValue)*3696;
			ouncegallonUK=(edtValue)*4438.7109247;
			grainpergallonUS=(edtValue)*1617000;
			grainpergallonUK=(edtValue)*1941936.0295;
			grainpercubicfoot=(edtValue)*12096000;
			tonshortpercubicyard=(edtValue)*23.328;
			tonlongpercubicyard=(edtValue)*20.828571429;
			slugpercubicfoot=(edtValue)*53.707881896;
			psiper1000feet=(edtValue)*12000;
			Earthsdensitymean=(edtValue)*5.0162929884;
			
			break;
			
		case "Pound/cubic foot -lb/ft^3":
			
			kilogrampercubicmeter=(edtValue)*16.018463374;
			grampercubiccentimeter=(edtValue)*0.0160184634;
			kilogrampercubiccentimeter=(edtValue)*0.0000160185;
			grampercubicmeter=(edtValue)*16018.463374;
			grampercubicmillimeter=(edtValue)*0.0000160185;
			milligrampercubicmeter=(edtValue)*16018463.374;
			milligrampercubiccentimeter=(edtValue)*16.018463374;
			milligrampercubicmillimeter=(edtValue)*0.0160184634;
			exagramperliter=(edtValue)*1.601846337E-17;
			petagramperliter=(edtValue)*1.601846337E-14;
			teragramperliter=(edtValue)*1.601846337E-11;
			gigagramperliter=(edtValue)*1.601846337E-8;
			megagramperliter=(edtValue)*0.0000160185;
			kilogramperliter=(edtValue)*0.0160184634;
			hectogramperliter=(edtValue)*0.1601846337;
			dekagramperliter=(edtValue)*1.6018463374;
			gramperliter=(edtValue)*16.018463374;
			decigramperliter=(edtValue)*160.18463374;
			centigramperliter=(edtValue)*1601.8463374;
			milligramperliter=(edtValue)*16018.463374;
			microgramperliter=(edtValue)*16018463.374;
			nanogramperliter=(edtValue)*16018463374.0;
			picogramperliter=(edtValue)*16018463373953.0;
			femtogramperliter=(edtValue)*16018463373952856.0;
			attogramperliter=(edtValue)*16018463373952854000.0;
			poundpercubicinch=(edtValue)*0.0005787037;
			poundpercubicfoot=(edtValue)*1;
			poundpercubicyard=(edtValue)*27;
			poundpergallonUS=(edtValue)*0.1336805556;
			poundpergallonUK=(edtValue)*0.1605436532;
			ouncepercubicinch=(edtValue)*0.0092592593;
			ouncecubicfoot=(edtValue)*16;
			ouncepergallonUS=(edtValue)*2.1388888889;
			ouncegallonUK=(edtValue)*2.5686984518;
			grainpergallonUS=(edtValue)*935.76388889;
			grainpergallonUK=(edtValue)*1123.8055727;
			grainpercubicfoot=(edtValue)*7000;
			tonshortpercubicyard=(edtValue)*0.0135;
			tonlongpercubicyard=(edtValue)*0.0120535714;
			slugpercubicfoot=(edtValue)*0.0310809502;
			psiper1000feet=(edtValue)*6.9444444444;
			Earthsdensitymean=(edtValue)*0.0029029473;
			
			break;		
			
			
	case "Pound/cubic yard -lb/yd^3":
			
		kilogrampercubicmeter=(edtValue)*0.5932764213;
		grampercubiccentimeter=(edtValue)*0.0005932764;
		kilogrampercubiccentimeter=(edtValue)*5.932764212E-7;
		grampercubicmeter=(edtValue)*593.27642126;
		grampercubicmillimeter=(edtValue)*5.932764212E-7;
		milligrampercubicmeter=(edtValue)*593276.42126;
		milligrampercubiccentimeter=(edtValue)*0.5932764213;
		milligrampercubicmillimeter=(edtValue)*0.0005932764;
		exagramperliter=(edtValue)*5.932764212E-19;
		petagramperliter=(edtValue)*5.932764212E-16;
		teragramperliter=(edtValue)*5.932764212E-13;
		gigagramperliter=(edtValue)*5.932764212E-10;
		megagramperliter=(edtValue)*5.932764212E-7;
		kilogramperliter=(edtValue)*0.0005932764;
		hectogramperliter=(edtValue)*0.0059327642;
		dekagramperliter=(edtValue)*0.0593276421;
		gramperliter=(edtValue)*0.5932764213;
		decigramperliter=(edtValue)*5.9327642126;
		centigramperliter=(edtValue)*59.327642126;
		milligramperliter=(edtValue)*593.27642126;
		microgramperliter=(edtValue)*593276.42126;
		nanogramperliter=(edtValue)*593276421.26;
		picogramperliter=(edtValue)*593276421258.0;
		femtogramperliter=(edtValue)*593276421257785.0;
		attogramperliter=(edtValue)*593276421257784400.0;
		poundpercubicinch=(edtValue)*0.0000214335;
		poundpercubicfoot=(edtValue)*0.037037037;
		poundpercubicyard=(edtValue)*1;
		poundpergallonUS=(edtValue)*0.0049511317;
		poundpergallonUK=(edtValue)*0.0059460612;
		ouncepercubicinch=(edtValue)*0.0003429355;
		ouncecubicfoot=(edtValue)*0.5925925926;
		ouncepergallonUS=(edtValue)*0.079218107;
		ouncegallonUK=(edtValue)*0.0951369797;
		grainpergallonUS=(edtValue)*34.657921811;
		grainpergallonUK=(edtValue)*41.622428617;
		grainpercubicfoot=(edtValue)*259.25925926;
		tonshortpercubicyard=(edtValue)*0.0005;
		tonlongpercubicyard=(edtValue)*0.0004464286;
		slugpercubicfoot=(edtValue)*0.0011511463;
		psiper1000feet=(edtValue)*0.2572016461;
		Earthsdensitymean=(edtValue)*0.0001075166;
		
			break;
			
	case "Pound/gallon (US) -lb/gal(US)":
		
		kilogrampercubicmeter=(edtValue)*119.82642732;
		grampercubiccentimeter=(edtValue)*0.1198264273;
		kilogrampercubiccentimeter=(edtValue)*0.0001198264;
		grampercubicmeter=(edtValue)*119826.42732;
		grampercubicmillimeter=(edtValue)*0.0001198264;
		milligrampercubicmeter=(edtValue)*119826427.32;
		milligrampercubiccentimeter=(edtValue)*119.82642732;
		milligrampercubicmillimeter=(edtValue)*0.1198264273;
		exagramperliter=(edtValue)*1.198264273E-16;
		petagramperliter=(edtValue)*1.198264273E-13;
		teragramperliter=(edtValue)*1.198264273E-10;
		gigagramperliter=(edtValue)*1.198264273E-7;
		megagramperliter=(edtValue)*0.0001198264;
		kilogramperliter=(edtValue)*0.1198264273;
		hectogramperliter=(edtValue)*1.1982642732;
		dekagramperliter=(edtValue)*11.982642732;
		gramperliter=(edtValue)*119.82642732;
		decigramperliter=(edtValue)*1198.2642732;
		centigramperliter=(edtValue)*11982.642732;
		milligramperliter=(edtValue)*119826.42732;
		microgramperliter=(edtValue)*119826427.32;
		nanogramperliter=(edtValue)*119826427317.0;
		picogramperliter=(edtValue)*119826427316722.0;
		femtogramperliter=(edtValue)*119826427316721920.0;
		attogramperliter=(edtValue)*119826427316721900000.0;
		poundpercubicinch=(edtValue)*0.0043290043;
		poundpercubicfoot=(edtValue)*7.4805194805;
		poundpercubicyard=(edtValue)*201.97402597;
		poundpergallonUS=(edtValue)*1;
		poundpergallonUK=(edtValue)*1.2009499255;
		ouncepercubicinch=(edtValue)*0.0692640693;
		ouncecubicfoot=(edtValue)*119.68831169;
		ouncepergallonUS=(edtValue)*16;
		ouncegallonUK=(edtValue)*19.215198808;
		grainpergallonUS=(edtValue)*7000;
		grainpergallonUK=(edtValue)*8406.6494785;
		grainpercubicfoot=(edtValue)*52363.636364;
		tonshortpercubicyard=(edtValue)*0.100987013;
		tonlongpercubicyard=(edtValue)*0.0901669759;
		slugpercubicfoot=(edtValue)*0.2325016532;
		psiper1000feet=(edtValue)*51.948051948;
		Earthsdensitymean=(edtValue)*0.0217155541;
		
		break;
			
	case "Pound/gallon (UK) -lb/gal(UK)":
		
		kilogrampercubicmeter=(edtValue)*99.776372663;
		grampercubiccentimeter=(edtValue)*0.0997763727;
		kilogrampercubiccentimeter=(edtValue)*0.0000997764;
		grampercubicmeter=(edtValue)*99776.372663;
		grampercubicmillimeter=(edtValue)*0.0000997764;
		milligrampercubicmeter=(edtValue)*99776372.663;
		milligrampercubiccentimeter=(edtValue)*99.776372663;
		milligrampercubicmillimeter=(edtValue)*0.0997763727;
		exagramperliter=(edtValue)*9.977637266E-17;
		petagramperliter=(edtValue)*9.977637266E-14;
		teragramperliter=(edtValue)*9.977637266E-11;
		gigagramperliter=(edtValue)*9.977637266E-8;
		megagramperliter=(edtValue)*0.0000997764;
		kilogramperliter=(edtValue)*0.0997763727;
		hectogramperliter=(edtValue)*0.9977637266;
		dekagramperliter=(edtValue)*9.9776372663;
		gramperliter=(edtValue)*99.776372663;
		decigramperliter=(edtValue)*997.76372663;
		centigramperliter=(edtValue)*9977.6372663;
		milligramperliter=(edtValue)*99776.372663;
		microgramperliter=(edtValue)*99776372.663;
		nanogramperliter=(edtValue)*99776372663.0;
		picogramperliter=(edtValue)*99776372663097.0;
		femtogramperliter=(edtValue)*99776372663096740.0;
		attogramperliter=(edtValue)*99776372663096720000.0;
		poundpercubicinch=(edtValue)*0.0036046501;
		poundpercubicfoot=(edtValue)*6.228835459;
		poundpercubicyard=(edtValue)*168.17855739;
		poundpergallonUS=(edtValue)*0.8326741846;
		poundpergallonUK=(edtValue)*1;
		ouncepercubicinch=(edtValue)*0.0576744024;
		ouncecubicfoot=(edtValue)*99.661367345;
		ouncepergallonUS=(edtValue)*13.322786954;
		ouncegallonUK=(edtValue)*16;
		grainpergallonUS=(edtValue)*5828.7192924;
		grainpergallonUK=(edtValue)*7000;
		grainpercubicfoot=(edtValue)*43601.848213;
		tonshortpercubicyard=(edtValue)*0.0840892787;
		tonlongpercubicyard=(edtValue)*0.0750797131;
		slugpercubicfoot=(edtValue)*0.1935981245;
		psiper1000feet=(edtValue)*43.255801799;
		Earthsdensitymean=(edtValue)*0.0180819813;
		
		break;
		
	case "Ounce/cubic inch -oz/in^3":
		
		kilogrampercubicmeter=(edtValue)*1729.9940444;
		grampercubiccentimeter=(edtValue)*1.7299940444;
		kilogrampercubiccentimeter=(edtValue)*0.001729994;
		grampercubicmeter=(edtValue)*1729994.0444;
		grampercubicmillimeter=(edtValue)*0.001729994;
		milligrampercubicmeter=(edtValue)*1729994044.4;
		milligrampercubiccentimeter=(edtValue)*1729.9940444;
		milligrampercubicmillimeter=(edtValue)*1.7299940444;
		exagramperliter=(edtValue)*1.729994044E-15;
		petagramperliter=(edtValue)*1.729994044E-12;
		teragramperliter=(edtValue)*1.729994044E-9;
		gigagramperliter=(edtValue)*0.00000173;
		megagramperliter=(edtValue)*0.001729994;
		kilogramperliter=(edtValue)*1.7299940444;
		hectogramperliter=(edtValue)*17.299940444;
		dekagramperliter=(edtValue)*172.99940444;
		gramperliter=(edtValue)*1729.9940444;
		decigramperliter=(edtValue)*17299.940444;
		centigramperliter=(edtValue)*172999.40444;
		milligramperliter=(edtValue)*1729994.0444;
		microgramperliter=(edtValue)*1729994044.4;
		nanogramperliter=(edtValue)*1729994044387.0;
		picogramperliter=(edtValue)*1729994044386914.0;
		femtogramperliter=(edtValue)*1729994044386914000.0;
		attogramperliter=(edtValue)*1.729994044E+21;
		poundpercubicinch=(edtValue)*0.0625;
		poundpercubicfoot=(edtValue)*108;
		poundpercubicyard=(edtValue)*2916;
		poundpergallonUS=(edtValue)*14.4375;
		poundpergallonUK=(edtValue)*17.338714549;
		ouncepercubicinch=(edtValue)*1;
		ouncecubicfoot=(edtValue)*1728;
		ouncepergallonUS=(edtValue)*231;
		ouncegallonUK=(edtValue)*277.41943279;
		grainpergallonUS=(edtValue)*101062.5;
		grainpergallonUK=(edtValue)*121371.00185;
		grainpercubicfoot=(edtValue)*756000;
		tonshortpercubicyard=(edtValue)*1.458;
		tonlongpercubicyard=(edtValue)*1.3017857143;
		slugpercubicfoot=(edtValue)*3.3567426185;
		psiper1000feet=(edtValue)*750;
		Earthsdensitymean=(edtValue)*0.3135183118;
		
		break;
		
	case "Ounce/cubic foot -oz/ft^3":
		
		kilogrampercubicmeter=(edtValue)*1.0011539609;
		grampercubiccentimeter=(edtValue)*0.001001154;
		kilogrampercubiccentimeter=(edtValue)*0.0000010012;
		grampercubicmeter=(edtValue)*1001.1539609;
		grampercubicmillimeter=(edtValue)*0.0000010012;
		milligrampercubicmeter=(edtValue)*1001153.9609;
		milligrampercubiccentimeter=(edtValue)*1.0011539609;
		milligrampercubicmillimeter=(edtValue)*0.001001154;
		exagramperliter=(edtValue)*1.00115396E-18;
		petagramperliter=(edtValue)*1.00115396E-15;
		teragramperliter=(edtValue)*1.00115396E-12;
		gigagramperliter=(edtValue)*1.00115396E-9;
		megagramperliter=(edtValue)*0.0000010012;
		kilogramperliter=(edtValue)*0.001001154;
		hectogramperliter=(edtValue)*0.0100115396;
		dekagramperliter=(edtValue)*0.1001153961;
		gramperliter=(edtValue)*1.0011539609;
		decigramperliter=(edtValue)*10.011539609;
		centigramperliter=(edtValue)*100.11539609;
		milligramperliter=(edtValue)*1001.1539609;
		microgramperliter=(edtValue)*1001153.9609;
		nanogramperliter=(edtValue)*1001153960.9;
		picogramperliter=(edtValue)*1001153960872.0;
		femtogramperliter=(edtValue)*1001153960872062.0;
		attogramperliter=(edtValue)*1001153960872061300.0;
		poundpercubicinch=(edtValue)*0.000036169;
		poundpercubicfoot=(edtValue)*0.0625;
		poundpercubicyard=(edtValue)*1.6875;
		poundpergallonUS=(edtValue)*0.0083550347;
		poundpergallonUK=(edtValue)*0.0100339783;
		ouncepercubicinch=(edtValue)*0.0005787037;
		ouncecubicfoot=(edtValue)*1;
		ouncepergallonUS=(edtValue)*0.1336805556;
		ouncegallonUK=(edtValue)*0.1605436532;
		grainpergallonUS=(edtValue)*58.485243056;
		grainpergallonUK=(edtValue)*70.237848291;
		grainpercubicfoot=(edtValue)*437.5;
		tonshortpercubicyard=(edtValue)*0.00084375;
		tonlongpercubicyard=(edtValue)*0.0007533482;
		slugpercubicfoot=(edtValue)*0.0019425594;
		psiper1000feet=(edtValue)*0.4340277778;
		Earthsdensitymean=(edtValue)*0.0001814342;
		
		break;
		
	case "Ounce/gallon (US) -oz/gal(US)":
		
		kilogrampercubicmeter=(edtValue)*7.4891517073;
		grampercubiccentimeter=(edtValue)*0.0074891517;
		kilogrampercubiccentimeter=(edtValue)*0.0000074892;
		grampercubicmeter=(edtValue)*7489.1517073;
		grampercubicmillimeter=(edtValue)*0.0000074892;
		milligrampercubicmeter=(edtValue)*7489151.7073;
		milligrampercubiccentimeter=(edtValue)*7.4891517073;
		milligrampercubicmillimeter=(edtValue)*0.0074891517;
		exagramperliter=(edtValue)*7.489151707E-18;
		petagramperliter=(edtValue)*7.489151707E-15;
		teragramperliter=(edtValue)*7.489151707E-12;
		gigagramperliter=(edtValue)*7.489151707E-9;
		megagramperliter=(edtValue)*0.0000074892;
		kilogramperliter=(edtValue)*0.0074891517;
		hectogramperliter=(edtValue)*0.0748915171;
		dekagramperliter=(edtValue)*0.7489151707;
		gramperliter=(edtValue)*7.4891517073;
		decigramperliter=(edtValue)*74.891517073;
		centigramperliter=(edtValue)*748.91517073;
		milligramperliter=(edtValue)*7489.1517073;
		microgramperliter=(edtValue)*7489151.7073;
		nanogramperliter=(edtValue)*7489151707.3;
		picogramperliter=(edtValue)*7489151707295.0;
		femtogramperliter=(edtValue)*7489151707295344.0;
		attogramperliter=(edtValue)*7489151707295344000.0;
		poundpercubicinch=(edtValue)*0.0002705628;
		poundpercubicfoot=(edtValue)*0.4675324675;
		poundpercubicyard=(edtValue)*12.623376623;
		poundpergallonUS=(edtValue)*0.0625;
		poundpergallonUK=(edtValue)*0.0750593703;
		ouncepercubicinch=(edtValue)*0.0043290043;
		ouncecubicfoot=(edtValue)*7.4805194805;
		ouncepergallonUS=(edtValue)*1;
		ouncegallonUK=(edtValue)*1.2009499255;
		grainpergallonUS=(edtValue)*437.5;
		grainpergallonUK=(edtValue)*525.41559241;
		grainpercubicfoot=(edtValue)*3272.7272727;
		tonshortpercubicyard=(edtValue)*0.0063116883;
		tonlongpercubicyard=(edtValue)*0.005635436;
		slugpercubicfoot=(edtValue)*0.0145313533;
		psiper1000feet=(edtValue)*3.2467532468;
		Earthsdensitymean=(edtValue)*0.0013572221;
		
		break;
		
case "Ounce/gallon (UK) -oz/gal(UK)":
		
	kilogrampercubicmeter=(edtValue)*6.2360232914;
	grampercubiccentimeter=(edtValue)*0.0062360233;
	kilogrampercubiccentimeter=(edtValue)*0.000006236;
	grampercubicmeter=(edtValue)*6236.0232914;
	grampercubicmillimeter=(edtValue)*0.000006236;
	milligrampercubicmeter=(edtValue)*6236023.2914;
	milligrampercubiccentimeter=(edtValue)*6.2360232914;
	milligrampercubicmillimeter=(edtValue)*0.0062360233;
	exagramperliter=(edtValue)*6.236023291E-18;
	petagramperliter=(edtValue)*6.236023291E-15;
	teragramperliter=(edtValue)*6.236023291E-12;
	gigagramperliter=(edtValue)*6.236023291E-9;
	megagramperliter=(edtValue)*0.000006236;
	kilogramperliter=(edtValue)*0.0062360233;
	hectogramperliter=(edtValue)*0.0623602329;
	dekagramperliter=(edtValue)*0.6236023291;
	gramperliter=(edtValue)*6.2360232914;
	decigramperliter=(edtValue)*62.360232914;
	centigramperliter=(edtValue)*623.60232914;
	milligramperliter=(edtValue)*6236.0232914;
	microgramperliter=(edtValue)*6236023.2914;
	nanogramperliter=(edtValue)*6236023291.4;
	picogramperliter=(edtValue)*6236023291444.0;
	femtogramperliter=(edtValue)*6236023291443780.0;
	attogramperliter=(edtValue)*6236023291443779000.0;
	poundpercubicinch=(edtValue)*0.0002252906;
	poundpercubicfoot=(edtValue)*0.3893022162;
	poundpercubicyard=(edtValue)*10.511159837;
	poundpergallonUS=(edtValue)*0.0520421365;
	poundpergallonUK=(edtValue)*0.0625;
	ouncepercubicinch=(edtValue)*0.0036046501;
	ouncecubicfoot=(edtValue)*6.228835459;
	ouncepergallonUS=(edtValue)*0.8326741846;
	ouncegallonUK=(edtValue)*1;
	grainpergallonUS=(edtValue)*364.29495578;
	grainpergallonUK=(edtValue)*437.5;
	grainpercubicfoot=(edtValue)*2725.1155133;
	tonshortpercubicyard=(edtValue)*0.0052555799;
	tonlongpercubicyard=(edtValue)*0.0046924821;
	slugpercubicfoot=(edtValue)*0.0120998828;
	psiper1000feet=(edtValue)*2.7034876124;
	Earthsdensitymean=(edtValue)*0.0011301238;
	
		
		break;
case "Grain/gallon (US) -gr/gal(US)":
	
	kilogrampercubicmeter=(edtValue)*0.017118061;
	grampercubiccentimeter=(edtValue)*0.0000171181;
	kilogrampercubiccentimeter=(edtValue)*1.711806104E-8;
	grampercubicmeter=(edtValue)*17.118061045;
	grampercubicmillimeter=(edtValue)*1.711806104E-8;
	milligrampercubicmeter=(edtValue)*17118.061045;
	milligrampercubiccentimeter=(edtValue)*0.017118061;
	milligrampercubicmillimeter=(edtValue)*0.0000171181;
	exagramperliter=(edtValue)*1.711806104E-20;
	petagramperliter=(edtValue)*1.711806104E-17;
	teragramperliter=(edtValue)*1.711806104E-14;
	gigagramperliter=(edtValue)*1.711806104E-11;
	megagramperliter=(edtValue)*1.711806104E-8;
	kilogramperliter=(edtValue)*0.0000171181;
	hectogramperliter=(edtValue)*0.0001711806;
	dekagramperliter=(edtValue)*0.0017118061;
	gramperliter=(edtValue)*0.017118061;
	decigramperliter=(edtValue)*0.1711806105;
	centigramperliter=(edtValue)*1.7118061045;
	milligramperliter=(edtValue)*17.118061045;
	microgramperliter=(edtValue)*17118.061045;
	nanogramperliter=(edtValue)*17118061.045;
	picogramperliter=(edtValue)*17118061045.0;
	femtogramperliter=(edtValue)*17118061045271.0;
	attogramperliter=(edtValue)*17118061045271040.0;
	poundpercubicinch=(edtValue)*6.184291898E-7;
	poundpercubicfoot=(edtValue)*0.0010686456;
	poundpercubicyard=(edtValue)*0.0288534323;
	poundpergallonUS=(edtValue)*0.0001428571;
	poundpergallonUK=(edtValue)*0.0001715643;
	ouncepercubicinch=(edtValue)*0.0000098949;
	ouncecubicfoot=(edtValue)*0.0170983302;
	ouncepergallonUS=(edtValue)*0.0022857143;
	ouncegallonUK=(edtValue)*0.0027450284;
	grainpergallonUS=(edtValue)*1;
	grainpergallonUK=(edtValue)*1.2009499255;
	grainpercubicfoot=(edtValue)*7.4805194805;
	tonshortpercubicyard=(edtValue)*0.0000144267;
	tonlongpercubicyard=(edtValue)*0.000012881;
	slugpercubicfoot=(edtValue)*0.0000332145;
	psiper1000feet=(edtValue)*0.0074211503;
	Earthsdensitymean=(edtValue)*0.0000031022;
	
		
		break;
		
case "Grain/gallon (UK) -gr/gal(UK)":
	
	kilogrampercubicmeter=(edtValue)*0.0142537675;
	grampercubiccentimeter=(edtValue)*0.0000142538;
	kilogrampercubiccentimeter=(edtValue)*1.425376752E-8;
	grampercubicmeter=(edtValue)*14.253767523;
	grampercubicmillimeter=(edtValue)*1.425376752E-8;
	milligrampercubicmeter=(edtValue)*14253.767523;
	milligrampercubiccentimeter=(edtValue)*0.0142537675;
	milligrampercubicmillimeter=(edtValue)*0.0000142538;
	exagramperliter=(edtValue)*1.425376752E-20;
	petagramperliter=(edtValue)*1.425376752E-17;
	teragramperliter=(edtValue)*1.425376752E-14;
	gigagramperliter=(edtValue)*1.425376752E-11;
	megagramperliter=(edtValue)*1.425376752E-8;
	kilogramperliter=(edtValue)*0.0000142538;
	hectogramperliter=(edtValue)*0.0001425377;
	dekagramperliter=(edtValue)*0.0014253768;
	gramperliter=(edtValue)*0.0142537675;
	decigramperliter=(edtValue)*0.1425376752;
	centigramperliter=(edtValue)*1.4253767523;
	milligramperliter=(edtValue)*14.253767523;
	microgramperliter=(edtValue)*14253.767523;
	nanogramperliter=(edtValue)*14253767.523;
	picogramperliter=(edtValue)*14253767523.0;
	femtogramperliter=(edtValue)*14253767523300.0;
	attogramperliter=(edtValue)*14253767523300140.0;
	poundpercubicinch=(edtValue)*5.149500214E-7;
	poundpercubicfoot=(edtValue)*0.0008898336;
	poundpercubicyard=(edtValue)*0.0240255082;
	poundpergallonUS=(edtValue)*0.0001189535;
	poundpergallonUK=(edtValue)*0.0001428571;
	ouncepercubicinch=(edtValue)*0.0000082392;
	ouncecubicfoot=(edtValue)*0.0142373382;
	ouncepergallonUS=(edtValue)*0.0019032553;
	ouncegallonUK=(edtValue)*0.0022857143;
	grainpergallonUS=(edtValue)*0.8326741846;
	grainpergallonUK=(edtValue)*1;
	grainpercubicfoot=(edtValue)*6.228835459;
	tonshortpercubicyard=(edtValue)*0.0000120128;
	tonlongpercubicyard=(edtValue)*0.0000107257;
	slugpercubicfoot=(edtValue)*0.0000276569;
	psiper1000feet=(edtValue)*0.0061794003;
	Earthsdensitymean=(edtValue)*0.0000025831;
	
		
		break;
case "Grain/cubic foot -gr/ft^3":
	
	kilogrampercubicmeter=(edtValue)*0.0022883519;
	grampercubiccentimeter=(edtValue)*0.0000022884;
	kilogrampercubiccentimeter=(edtValue)*2.28835191E-9;
	grampercubicmeter=(edtValue)*2.2883519106;
	grampercubicmillimeter=(edtValue)*2.28835191E-9;
	milligrampercubicmeter=(edtValue)*2288.3519106;
	milligrampercubiccentimeter=(edtValue)*0.0022883519;
	milligrampercubicmillimeter=(edtValue)*0.0000022884;
	exagramperliter=(edtValue)*2.28835191E-21;
	petagramperliter=(edtValue)*2.28835191E-18;
	teragramperliter=(edtValue)*2.28835191E-15;
	gigagramperliter=(edtValue)*2.28835191E-12;
	megagramperliter=(edtValue)*2.28835191E-9;
	kilogramperliter=(edtValue)*0.0000022884;
	hectogramperliter=(edtValue)*0.0000228835;
	dekagramperliter=(edtValue)*0.0002288352;
	gramperliter=(edtValue)*0.0022883519;
	decigramperliter=(edtValue)*0.0228835191;
	centigramperliter=(edtValue)*0.2288351911;
	milligramperliter=(edtValue)*2.2883519106;
	microgramperliter=(edtValue)*2288.3519106;
	nanogramperliter=(edtValue)*2288351.9106;
	picogramperliter=(edtValue)*2288351910.6;
	femtogramperliter=(edtValue)*2288351910566.0;
	attogramperliter=(edtValue)*2288351910565746.0;
	poundpercubicinch=(edtValue)*8.267195767E-8;
	poundpercubicfoot=(edtValue)*0.0001428571;
	poundpercubicyard=(edtValue)*0.0038571429;
	poundpergallonUS=(edtValue)*0.0000190972;
	poundpergallonUK=(edtValue)*0.0000229348;
	ouncepercubicinch=(edtValue)*0.0000013228;
	ouncecubicfoot=(edtValue)*0.0022857143;
	ouncepergallonUS=(edtValue)*0.0003055556;
	ouncegallonUK=(edtValue)*0.0003669569;
	grainpergallonUS=(edtValue)*0.1336805556;
	grainpergallonUK=(edtValue)*0.1605436532;
	grainpercubicfoot=(edtValue)*1;
	tonshortpercubicyard=(edtValue)*0.0000019286;
	tonlongpercubicyard=(edtValue)*0.0000017219;
	slugpercubicfoot=(edtValue)*0.0000044401;
	psiper1000feet=(edtValue)*0.0009920635;
	Earthsdensitymean=(edtValue)*4.147067616E-7;
	
		
		break;
case "Ton (short)/cubic yard -ton/yd^3":
	
	kilogrampercubicmeter=(edtValue)*1186.5528425;
	grampercubiccentimeter=(edtValue)*1.1865528425;
	kilogrampercubiccentimeter=(edtValue)*0.0011865528;
	grampercubicmeter=(edtValue)*1186552.8425;
	grampercubicmillimeter=(edtValue)*0.0011865528;
	milligrampercubicmeter=(edtValue)*1186552842.5;
	milligrampercubiccentimeter=(edtValue)*1186.5528425;
	milligrampercubicmillimeter=(edtValue)*1.1865528425;
	exagramperliter=(edtValue)*1.186552842E-15;
	petagramperliter=(edtValue)*1.186552842E-12;
	teragramperliter=(edtValue)*1.186552842E-9;
	gigagramperliter=(edtValue)*0.0000011866;
	megagramperliter=(edtValue)*0.0011865528;
	kilogramperliter=(edtValue)*1.1865528425;
	hectogramperliter=(edtValue)*11.865528425;
	dekagramperliter=(edtValue)*118.65528425;
	gramperliter=(edtValue)*1186.5528425;
	decigramperliter=(edtValue)*11865.528425;
	centigramperliter=(edtValue)*118655.28425;
	milligramperliter=(edtValue)*1186552.8425;
	microgramperliter=(edtValue)*1186552842.5;
	nanogramperliter=(edtValue)*1186552842515.0;
	picogramperliter=(edtValue)*1186552842515034.0;
	femtogramperliter=(edtValue)*1186552842515034000.0;
	attogramperliter=(edtValue)*1.186552842E+21;
	poundpercubicinch=(edtValue)*0.042866941;
	poundpercubicfoot=(edtValue)*74.074074074;
	poundpercubicyard=(edtValue)*2000;
	poundpergallonUS=(edtValue)*9.9022633745;
	poundpergallonUK=(edtValue)*11.892122462;
	ouncepercubicinch=(edtValue)*0.6858710562;
	ouncecubicfoot=(edtValue)*1185.1851852;
	ouncepergallonUS=(edtValue)*158.43621399;
	ouncegallonUK=(edtValue)*190.27395939;
	grainpergallonUS=(edtValue)*69315.843621;
	grainpergallonUK=(edtValue)*83244.857233;
	grainpercubicfoot=(edtValue)*518518.51852;
	tonshortpercubicyard=(edtValue)*1;
	tonlongpercubicyard=(edtValue)*0.8928571429;
	slugpercubicfoot=(edtValue)*2.3022926053;
	psiper1000feet=(edtValue)*514.40329218;
	Earthsdensitymean=(edtValue)*0.2150331356;
	
		
		break;
case "Ton (long)/cubic yard -ton/yd^3":
	
	kilogrampercubicmeter=(edtValue)*1328.9391836;
	grampercubiccentimeter=(edtValue)*1.3289391836;
	kilogrampercubiccentimeter=(edtValue)*0.0013289392;
	grampercubicmeter=(edtValue)*1328939.1836;
	grampercubicmillimeter=(edtValue)*0.0013289392;
	milligrampercubicmeter=(edtValue)*1328939183.6;
	milligrampercubiccentimeter=(edtValue)*1328.9391836;
	milligrampercubicmillimeter=(edtValue)*1.3289391836;
	exagramperliter=(edtValue)*1.328939183E-15;
	petagramperliter=(edtValue)*1.328939183E-12;
	teragramperliter=(edtValue)*1.328939183E-9;
	gigagramperliter=(edtValue)*0.0000013289;
	megagramperliter=(edtValue)*0.0013289392;
	kilogramperliter=(edtValue)*1.3289391836;
	hectogramperliter=(edtValue)*13.289391836;
	dekagramperliter=(edtValue)*132.89391836;
	gramperliter=(edtValue)*1328.9391836;
	decigramperliter=(edtValue)*13289.391836;
	centigramperliter=(edtValue)*132893.91836;
	milligramperliter=(edtValue)*1328939.1836;
	microgramperliter=(edtValue)*1328939183.6;
	nanogramperliter=(edtValue)*1328939183617.0;
	picogramperliter=(edtValue)*1328939183617434.0;
	femtogramperliter=(edtValue)*1328939183617434000.0;
	attogramperliter=(edtValue)*1.328939183E+21;
	poundpercubicinch=(edtValue)*0.0480109739;
	poundpercubicfoot=(edtValue)*82.962962963;
	poundpercubicyard=(edtValue)*2240;
	poundpergallonUS=(edtValue)*11.090534979;
	poundpergallonUK=(edtValue)*13.319177157;
	ouncepercubicinch=(edtValue)*0.768175583;
	ouncecubicfoot=(edtValue)*1327.4074074;
	ouncepergallonUS=(edtValue)*177.44855967;
	ouncegallonUK=(edtValue)*213.10683452;
	grainpergallonUS=(edtValue)*77633.744856;
	grainpergallonUK=(edtValue)*93234.240101;
	grainpercubicfoot=(edtValue)*580740.74074;
	tonshortpercubicyard=(edtValue)*1.12;
	tonlongpercubicyard=(edtValue)*1;
	slugpercubicfoot=(edtValue)*2.5785677179;
	psiper1000feet=(edtValue)*576.13168724;
	Earthsdensitymean=(edtValue)*0.2408371119;
	
		
		break;
case "Slug/cubic foot -slug/ft^3":
	
	kilogrampercubicmeter=(edtValue)*515.37881839;
	grampercubiccentimeter=(edtValue)*0.5153788184;
	kilogrampercubiccentimeter=(edtValue)*0.0005153788;
	grampercubicmeter=(edtValue)*515378.81839;
	grampercubicmillimeter=(edtValue)*0.0005153788;
	milligrampercubicmeter=(edtValue)*515378818.39;
	milligrampercubiccentimeter=(edtValue)*515.37881839;
	milligrampercubicmillimeter=(edtValue)*0.5153788184;
	exagramperliter=(edtValue)*5.153788183E-16;
	petagramperliter=(edtValue)*5.153788183E-13;
	teragramperliter=(edtValue)*5.153788183E-10;
	gigagramperliter=(edtValue)*5.153788183E-7;
	megagramperliter=(edtValue)*0.0005153788;
	kilogramperliter=(edtValue)*0.5153788184;
	hectogramperliter=(edtValue)*5.1537881839;
	dekagramperliter=(edtValue)*51.537881839;
	gramperliter=(edtValue)*515.37881839;
	decigramperliter=(edtValue)*5153.7881839;
	centigramperliter=(edtValue)*51537.881839;
	milligramperliter=(edtValue)*515378.81839;
	microgramperliter=(edtValue)*515378818.39;
	nanogramperliter=(edtValue)*515378818393.0;
	picogramperliter=(edtValue)*515378818393200.0;
	femtogramperliter=(edtValue)*515378818393200400.0;
	attogramperliter=(edtValue)*515378818393200260000.0;
	poundpercubicinch=(edtValue)*0.0186192411;
	poundpercubicfoot=(edtValue)*32.174048556;
	poundpercubicyard=(edtValue)*868.69931102;
	poundpergallonUS=(edtValue)*4.3010446855;
	poundpergallonUK=(edtValue)*5.1653392946;
	ouncepercubicinch=(edtValue)*0.297907857;
	ouncecubicfoot=(edtValue)*514.7847769;
	ouncepergallonUS=(edtValue)*68.816714968;
	ouncegallonUK=(edtValue)*82.645428714;
	grainpergallonUS=(edtValue)*30107.312798;
	grainpergallonUK=(edtValue)*36157.375062;
	grainpercubicfoot=(edtValue)*225218.3399;
	tonshortpercubicyard=(edtValue)*0.4343496555;
	tonlongpercubicyard=(edtValue)*0.3878121924;
	slugpercubicfoot=(edtValue)*1;
	psiper1000feet=(edtValue)*223.43089275;
	Earthsdensitymean=(edtValue)*0.0933995684;
	
		
		break;
case "Psi/1000 feet -psi/ft":
	
	kilogrampercubicmeter=(edtValue)*2.3066587258;
	grampercubiccentimeter=(edtValue)*0.0023066587;
	kilogrampercubiccentimeter=(edtValue)*0.0000023067;
	grampercubicmeter=(edtValue)*2306.6587258;
	grampercubicmillimeter=(edtValue)*0.0000023067;
	milligrampercubicmeter=(edtValue)*2306658.7258;
	milligrampercubiccentimeter=(edtValue)*2.3066587258;
	milligrampercubicmillimeter=(edtValue)*0.0023066587;
	exagramperliter=(edtValue)*2.306658725E-18;
	petagramperliter=(edtValue)*2.306658725E-15;
	teragramperliter=(edtValue)*2.306658725E-12;
	gigagramperliter=(edtValue)*2.306658725E-9;
	megagramperliter=(edtValue)*0.0000023067;
	kilogramperliter=(edtValue)*0.0023066587;
	hectogramperliter=(edtValue)*0.0230665873;
	dekagramperliter=(edtValue)*0.2306658726;
	gramperliter=(edtValue)*2.3066587258;
	decigramperliter=(edtValue)*23.066587258;
	centigramperliter=(edtValue)*230.66587258;
	milligramperliter=(edtValue)*2306.6587258;
	microgramperliter=(edtValue)*2306658.7258;
	nanogramperliter=(edtValue)*2306658725.8;
	picogramperliter=(edtValue)*2306658725849.0;
	femtogramperliter=(edtValue)*2306658725849219.0;
	attogramperliter=(edtValue)*2306658725849218000.0;
	poundpercubicinch=(edtValue)*0.0000833333;
	poundpercubicfoot=(edtValue)*0.144;
	poundpercubicyard=(edtValue)*3.888;
	poundpergallonUS=(edtValue)*0.01925;
	poundpergallonUK=(edtValue)*0.0231182861;
	ouncepercubicinch=(edtValue)*0.0013333333;
	ouncecubicfoot=(edtValue)*2.304;
	ouncepergallonUS=(edtValue)*0.308;
	ouncegallonUK=(edtValue)*0.3698925771;
	grainpergallonUS=(edtValue)*134.75;
	grainpergallonUK=(edtValue)*161.82800246;
	grainpercubicfoot=(edtValue)*1008;
	tonshortpercubicyard=(edtValue)*0.001944;
	tonlongpercubicyard=(edtValue)*0.0017357143;
	slugpercubicfoot=(edtValue)*0.0044756568;
	psiper1000feet=(edtValue)*1;
	Earthsdensitymean=(edtValue)*0.0004180244;
	
		
		break;
case "Earth's density (mean) -earth":
	
	kilogrampercubicmeter=(edtValue)*5518;
	grampercubiccentimeter=(edtValue)*5.518;
	kilogrampercubiccentimeter=(edtValue)*0.005518;
	grampercubicmeter=(edtValue)*5518000;
	grampercubicmillimeter=(edtValue)*0.005518;
	milligrampercubicmeter=(edtValue)*5518000000.0;
	milligrampercubiccentimeter=(edtValue)*5518;
	milligrampercubicmillimeter=(edtValue)*5.518;
	exagramperliter=(edtValue)*5.517999999E-15;
	petagramperliter=(edtValue)*5.517999999E-12;
	teragramperliter=(edtValue)*5.517999999E-9;
	gigagramperliter=(edtValue)*0.000005518;
	megagramperliter=(edtValue)*0.005518;
	kilogramperliter=(edtValue)*5.518;
	hectogramperliter=(edtValue)*55.18;
	dekagramperliter=(edtValue)*551.8;
	gramperliter=(edtValue)*5518;
	decigramperliter=(edtValue)*55180;
	centigramperliter=(edtValue)*551800;
	milligramperliter=(edtValue)*5518000;
	microgramperliter=(edtValue)*5518000000.0;
	nanogramperliter=(edtValue)*5518000000000.0;
	picogramperliter=(edtValue)*5517999999999900.0;
	femtogramperliter=(edtValue)*5517999999999900000.0;
	attogramperliter=(edtValue)*5.517999999E+21;
	poundpercubicinch=(edtValue)*0.1993503973;
	poundpercubicfoot=(edtValue)*344.47748646;
	poundpercubicyard=(edtValue)*9300.8921344;
	poundpergallonUS=(edtValue)*46.049941766;
	poundpergallonUK=(edtValue)*55.303674134;
	ouncepercubicinch=(edtValue)*3.1896063561;
	ouncecubicfoot=(edtValue)*5511.6397833;
	ouncepergallonUS=(edtValue)*736.79906826;
	ouncegallonUK=(edtValue)*884.85878614;
	grainpergallonUS=(edtValue)*322349.59236;
	grainpergallonUK=(edtValue)*387125.71894;
	grainpercubicfoot=(edtValue)*2411342.4052;
	tonshortpercubicyard=(edtValue)*4.6504460672;
	tonlongpercubicyard=(edtValue)*4.1521839886;
	slugpercubicfoot=(edtValue)*10.706687592;
	psiper1000feet=(edtValue)*2392.2047671;
	Earthsdensitymean=(edtValue)*1;
	
		
		break;
		
		case "Default":
			break;
			
		}

		
		
		 results.setKilogrampercubicmeter(kilogrampercubicmeter);
		 results.setGrampercubiccentimeter(grampercubiccentimeter);
		 results.setKilogrampercubiccentimeter(kilogrampercubiccentimeter);
		 results.setGrampercubicmeter(grampercubicmeter);
		 results.setGrampercubicmillimeter(grampercubicmillimeter);
		 results.setMilligrampercubicmeter(milligrampercubicmeter);
		 results.setMilligrampercubiccentimeter(milligrampercubiccentimeter);
		 results.setMilligrampercubicmillimeter(milligrampercubicmillimeter);
		 results.setExagramperliter(exagramperliter);
		 results.setPetagramperliter(petagramperliter);
		 results.setTeragramperliter(teragramperliter);
		 results.setGigagramperliter(gigagramperliter);
		 results.setMegagramperliter(megagramperliter);
		 results.setKilogramperliter(kilogramperliter);
		 results.setHectogramperliter(hectogramperliter);
		 results.setDekagramperliter(dekagramperliter);
		 results.setGramperliter(gramperliter);
		 results.setDecigramperliter(decigramperliter);
		 results.setCentigramperliter(centigramperliter);
		 results.setMilligramperliter(milligramperliter);
		 results.setMicrogramperliter(microgramperliter);
		 results.setNanogramperliter(nanogramperliter);
		 results.setPicogramperliter(picogramperliter);
		 results.setFemtogramperliter(femtogramperliter);
		 results.setAttogramperliter(attogramperliter);
		 results.setPoundpercubicinch(poundpercubicinch);
		 results.setPoundpercubicfoot(poundpercubicfoot);
		 results.setPoundpercubicyard(poundpercubicyard);
		 results.setPoundpergallonUS(poundpergallonUS);
		 results.setPoundpergallonUK(poundpergallonUK);
		 results.setOuncepercubicinch(ouncepercubicinch);
		 results.setOuncecubicfoot(ouncecubicfoot);
		 results.setOuncepergallonUS(ouncepergallonUS);
		 results.setOuncegallonUK(ouncegallonUK);
		 results.setGrainpergallonUS(grainpergallonUS);
		 results.setGrainpergallonUK(grainpergallonUK);
		 results.setGrainpercubicfoot(grainpercubicfoot);
		 results.setTonshortpercubicyard(tonshortpercubicyard);
		 results.setTonlongpercubicyard(tonlongpercubicyard);
		 results.setSlugpercubicfoot(slugpercubicfoot);
		 results.setPsiper1000feet(psiper1000feet);
		 results.setEarthsdensitymean(Earthsdensitymean);
		 
		 converterArray.add(results);
		return converterArray;
}

public class ConversionResults{
		private double kilogrampercubicmeter,grampercubiccentimeter,kilogrampercubiccentimeter,grampercubicmeter,grampercubicmillimeter,milligrampercubicmeter,milligrampercubiccentimeter
		, milligrampercubicmillimeter,exagramperliter,petagramperliter,teragramperliter,gigagramperliter,megagramperliter,kilogramperliter,hectogramperliter,dekagramperliter
		,gramperliter,decigramperliter,centigramperliter,milligramperliter,microgramperliter,nanogramperliter,picogramperliter,femtogramperliter
		,attogramperliter,poundpercubicinch,poundpercubicfoot,poundpercubicyard,poundpergallonUS,poundpergallonUK,ouncepercubicinch,ouncecubicfoot
		,ouncepergallonUS,ouncegallonUK,grainpergallonUS,grainpergallonUK,grainpercubicfoot,tonshortpercubicyard,tonlongpercubicyard,slugpercubicfoot,psiper1000feet,Earthsdensitymean;

		public double getKilogrampercubicmeter() {
			return kilogrampercubicmeter;
		}

		public void setKilogrampercubicmeter(double kilogrampercubicmeter) {
			this.kilogrampercubicmeter = kilogrampercubicmeter;
		}

		public double getGrampercubiccentimeter() {
			return grampercubiccentimeter;
		}

		public void setGrampercubiccentimeter(double grampercubiccentimeter) {
			this.grampercubiccentimeter = grampercubiccentimeter;
		}

		public double getKilogrampercubiccentimeter() {
			return kilogrampercubiccentimeter;
		}

		public void setKilogrampercubiccentimeter(double kilogrampercubiccentimeter) {
			this.kilogrampercubiccentimeter = kilogrampercubiccentimeter;
		}

		public double getGrampercubicmeter() {
			return grampercubicmeter;
		}

		public void setGrampercubicmeter(double grampercubicmeter) {
			this.grampercubicmeter = grampercubicmeter;
		}

		public double getGrampercubicmillimeter() {
			return grampercubicmillimeter;
		}

		public void setGrampercubicmillimeter(double grampercubicmillimeter) {
			this.grampercubicmillimeter = grampercubicmillimeter;
		}

		public double getMilligrampercubicmeter() {
			return milligrampercubicmeter;
		}

		public void setMilligrampercubicmeter(double milligrampercubicmeter) {
			this.milligrampercubicmeter = milligrampercubicmeter;
		}

		public double getMilligrampercubiccentimeter() {
			return milligrampercubiccentimeter;
		}

		public void setMilligrampercubiccentimeter(double milligrampercubiccentimeter) {
			this.milligrampercubiccentimeter = milligrampercubiccentimeter;
		}

		public double getMilligrampercubicmillimeter() {
			return milligrampercubicmillimeter;
		}

		public void setMilligrampercubicmillimeter(double milligrampercubicmillimeter) {
			this.milligrampercubicmillimeter = milligrampercubicmillimeter;
		}

		public double getExagramperliter() {
			return exagramperliter;
		}

		public void setExagramperliter(double exagramperliter) {
			this.exagramperliter = exagramperliter;
		}

		public double getPetagramperliter() {
			return petagramperliter;
		}

		public void setPetagramperliter(double petagramperliter) {
			this.petagramperliter = petagramperliter;
		}

		public double getTeragramperliter() {
			return teragramperliter;
		}

		public void setTeragramperliter(double teragramperliter) {
			this.teragramperliter = teragramperliter;
		}

		public double getGigagramperliter() {
			return gigagramperliter;
		}

		public void setGigagramperliter(double gigagramperliter) {
			this.gigagramperliter = gigagramperliter;
		}

		public double getMegagramperliter() {
			return megagramperliter;
		}

		public void setMegagramperliter(double megagramperliter) {
			this.megagramperliter = megagramperliter;
		}

		public double getKilogramperliter() {
			return kilogramperliter;
		}

		public void setKilogramperliter(double kilogramperliter) {
			this.kilogramperliter = kilogramperliter;
		}

		public double getHectogramperliter() {
			return hectogramperliter;
		}

		public void setHectogramperliter(double hectogramperliter) {
			this.hectogramperliter = hectogramperliter;
		}

		public double getDekagramperliter() {
			return dekagramperliter;
		}

		public void setDekagramperliter(double dekagramperliter) {
			this.dekagramperliter = dekagramperliter;
		}

		public double getGramperliter() {
			return gramperliter;
		}

		public void setGramperliter(double gramperliter) {
			this.gramperliter = gramperliter;
		}

		public double getDecigramperliter() {
			return decigramperliter;
		}

		public void setDecigramperliter(double decigramperliter) {
			this.decigramperliter = decigramperliter;
		}

		public double getCentigramperliter() {
			return centigramperliter;
		}

		public void setCentigramperliter(double centigramperliter) {
			this.centigramperliter = centigramperliter;
		}

		public double getMilligramperliter() {
			return milligramperliter;
		}

		public void setMilligramperliter(double milligramperliter) {
			this.milligramperliter = milligramperliter;
		}

		public double getMicrogramperliter() {
			return microgramperliter;
		}

		public void setMicrogramperliter(double microgramperliter) {
			this.microgramperliter = microgramperliter;
		}

		public double getNanogramperliter() {
			return nanogramperliter;
		}

		public void setNanogramperliter(double nanogramperliter) {
			this.nanogramperliter = nanogramperliter;
		}

		public double getPicogramperliter() {
			return picogramperliter;
		}

		public void setPicogramperliter(double picogramperliter) {
			this.picogramperliter = picogramperliter;
		}

		public double getFemtogramperliter() {
			return femtogramperliter;
		}

		public void setFemtogramperliter(double femtogramperliter) {
			this.femtogramperliter = femtogramperliter;
		}

		public double getAttogramperliter() {
			return attogramperliter;
		}

		public void setAttogramperliter(double attogramperliter) {
			this.attogramperliter = attogramperliter;
		}

		public double getPoundpercubicinch() {
			return poundpercubicinch;
		}

		public void setPoundpercubicinch(double poundpercubicinch) {
			this.poundpercubicinch = poundpercubicinch;
		}

		public double getPoundpercubicfoot() {
			return poundpercubicfoot;
		}

		public void setPoundpercubicfoot(double poundpercubicfoot) {
			this.poundpercubicfoot = poundpercubicfoot;
		}

		public double getPoundpercubicyard() {
			return poundpercubicyard;
		}

		public void setPoundpercubicyard(double poundpercubicyard) {
			this.poundpercubicyard = poundpercubicyard;
		}

		public double getPoundpergallonUS() {
			return poundpergallonUS;
		}

		public void setPoundpergallonUS(double poundpergallonUS) {
			this.poundpergallonUS = poundpergallonUS;
		}

		public double getPoundpergallonUK() {
			return poundpergallonUK;
		}

		public void setPoundpergallonUK(double poundpergallonUK) {
			this.poundpergallonUK = poundpergallonUK;
		}

		public double getOuncepercubicinch() {
			return ouncepercubicinch;
		}

		public void setOuncepercubicinch(double ouncepercubicinch) {
			this.ouncepercubicinch = ouncepercubicinch;
		}

		public double getOuncecubicfoot() {
			return ouncecubicfoot;
		}

		public void setOuncecubicfoot(double ouncecubicfoot) {
			this.ouncecubicfoot = ouncecubicfoot;
		}

		public double getOuncepergallonUS() {
			return ouncepergallonUS;
		}

		public void setOuncepergallonUS(double ouncepergallonUS) {
			this.ouncepergallonUS = ouncepergallonUS;
		}

		public double getOuncegallonUK() {
			return ouncegallonUK;
		}

		public void setOuncegallonUK(double ouncegallonUK) {
			this.ouncegallonUK = ouncegallonUK;
		}

		public double getGrainpergallonUS() {
			return grainpergallonUS;
		}

		public void setGrainpergallonUS(double grainpergallonUS) {
			this.grainpergallonUS = grainpergallonUS;
		}

		public double getGrainpergallonUK() {
			return grainpergallonUK;
		}

		public void setGrainpergallonUK(double grainpergallonUK) {
			this.grainpergallonUK = grainpergallonUK;
		}

		public double getGrainpercubicfoot() {
			return grainpercubicfoot;
		}

		public void setGrainpercubicfoot(double grainpercubicfoot) {
			this.grainpercubicfoot = grainpercubicfoot;
		}

		public double getTonshortpercubicyard() {
			return tonshortpercubicyard;
		}

		public void setTonshortpercubicyard(double tonshortpercubicyard) {
			this.tonshortpercubicyard = tonshortpercubicyard;
		}

		public double getTonlongpercubicyard() {
			return tonlongpercubicyard;
		}

		public void setTonlongpercubicyard(double tonlongpercubicyard) {
			this.tonlongpercubicyard = tonlongpercubicyard;
		}

		public double getSlugpercubicfoot() {
			return slugpercubicfoot;
		}

		public void setSlugpercubicfoot(double slugpercubicfoot) {
			this.slugpercubicfoot = slugpercubicfoot;
		}

		public double getPsiper1000feet() {
			return psiper1000feet;
		}

		public void setPsiper1000feet(double psiper1000feet) {
			this.psiper1000feet = psiper1000feet;
		}

		public double getEarthsdensitymean() {
			return Earthsdensitymean;
		}

		public void setEarthsdensitymean(double earthsdensitymean) {
			Earthsdensitymean = earthsdensitymean;
		}	
	}
}
