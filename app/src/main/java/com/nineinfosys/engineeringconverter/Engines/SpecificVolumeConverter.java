package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;


public class SpecificVolumeConverter {
	private double cubicmeterperkilogram,cubiccentimeterpergram,literperkilogram,literpergram,cubicfootperkilogram,cubicfootperpound,gallonUSperpound,gallonUKperpound;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public SpecificVolumeConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateSpecificVolumeConversion()
    {
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Cubic meter/kilogram -M^3/kg":
			cubicmeterperkilogram=(edtValue)*1;
			cubiccentimeterpergram=(edtValue)*1000;
			literperkilogram=(edtValue)*1000;
			literpergram=(edtValue)*1;
			cubicfootperkilogram=(edtValue)*35.31466672;
			cubicfootperpound=(edtValue)*16.01846353;
			gallonUSperpound=(edtValue)*119.82643593;
			gallonUKperpound=(edtValue)*99.77637365;
			break;
		case "Cubic centimeter/gram -cm^3/g":
			cubicmeterperkilogram=(edtValue)*0.001;
			cubiccentimeterpergram=(edtValue)*1;
			literperkilogram=(edtValue)*1;
			literpergram=(edtValue)*0.001;
			cubicfootperkilogram=(edtValue)*0.0353146667;
			cubicfootperpound=(edtValue)*0.0160184635;
			gallonUSperpound=(edtValue)*0.1198264359;
			gallonUKperpound=(edtValue)*0.0997763737;
			break;
		case "Liter/kilogram -L/kg":
			cubicmeterperkilogram=(edtValue)*0.001;
			cubiccentimeterpergram=(edtValue)*1;
			literperkilogram=(edtValue)*1;
			literpergram=(edtValue)*0.001;
			cubicfootperkilogram=(edtValue)*0.0353146667;
			cubicfootperpound=(edtValue)*0.0160184635;
			gallonUSperpound=(edtValue)*0.1198264359;
			gallonUKperpound=(edtValue)*0.0997763737;
			break;
		case "Liter/gram -L/g":
			cubicmeterperkilogram=(edtValue)*1;
			cubiccentimeterpergram=(edtValue)*1000;
			literperkilogram=(edtValue)*1000;
			literpergram=(edtValue)*1;
			cubicfootperkilogram=(edtValue)*35.31466672;
			cubicfootperpound=(edtValue)*16.01846353;
			gallonUSperpound=(edtValue)*119.82643593;
			gallonUKperpound=(edtValue)*99.77637365;
			break;
		case "Cubic foot/kilogram -ft^3/kg":
			cubicmeterperkilogram=(edtValue)*0.0283168466;
			cubiccentimeterpergram=(edtValue)*28.316846593;
			literperkilogram=(edtValue)*28.316846593;
			literpergram=(edtValue)*0.0283168466;
			cubicfootperkilogram=(edtValue)*1;
			cubicfootperpound=(edtValue)*0.4535923744;
			gallonUSperpound=(edtValue)*3.3931068042;
			gallonUKperpound=(edtValue)*2.8253522663;
			break;
		case "Cubic foot/pound -ft^3/lb":
			cubicmeterperkilogram=(edtValue)*0.06242796;
			cubiccentimeterpergram=(edtValue)*62.427959968;
			literperkilogram=(edtValue)*62.427959968;
			literpergram=(edtValue)*0.06242796;
			cubicfootperkilogram=(edtValue)*2.2046226003;
			cubicfootperpound=(edtValue)*1;
			gallonUSperpound=(edtValue)*7.4805199457;
			gallonUKperpound=(edtValue)*6.22883546;
			break;
		case "Gallon (US)/pound -gal(US)":
			cubicmeterperkilogram=(edtValue)*0.0083454039;
			cubiccentimeterpergram=(edtValue)*8.3454038518;
			literperkilogram=(edtValue)*8.3454038518;
			literpergram=(edtValue)*0.0083454039;
			cubicfootperkilogram=(edtValue)*0.2947151557;
			cubicfootperpound=(edtValue)*0.1336805472;
			gallonUSperpound=(edtValue)*1;
			gallonUKperpound=(edtValue)*0.832674133;
			break;
		case "Gallon (UK)/pound -gal(UK)":
			cubicmeterperkilogram=(edtValue)*0.0100224128;
			cubiccentimeterpergram=(edtValue)*10.022412756;
			literperkilogram=(edtValue)*10.022412756;
			literpergram=(edtValue)*0.0100224128;
			cubicfootperkilogram=(edtValue)*0.3539381662;
			cubicfootperpound=(edtValue)*0.1605436532;
			gallonUSperpound=(edtValue)*1.20095;
			gallonUKperpound=(edtValue)*1;
			break;
		case "Default":
			break;
			
		}
		results.setCubicmeterperkilogram(cubicmeterperkilogram);
		results.setCubiccentimeterpergram(cubiccentimeterpergram);
		results.setLiterperkilogram(literperkilogram);
		results.setLiterpergram(literpergram);
		results.setCubicfootperkilogram(cubicfootperkilogram);
		results.setCubicfootperpound(cubicfootperpound);
		results.setGallonUSperpound(gallonUSperpound);
		results.setGallonUKperpound(gallonUKperpound);
		 converterArray.add(results);
		return converterArray;
}

public 	class ConversionResults{
		private double cubicmeterperkilogram,cubiccentimeterpergram,literperkilogram,literpergram,cubicfootperkilogram,cubicfootperpound,gallonUSperpound,gallonUKperpound;

		public double getCubicmeterperkilogram() {
			return cubicmeterperkilogram;
		}

		public void setCubicmeterperkilogram(double cubicmeterperkilogram) {
			this.cubicmeterperkilogram = cubicmeterperkilogram;
		}

		public double getCubiccentimeterpergram() {
			return cubiccentimeterpergram;
		}

		public void setCubiccentimeterpergram(double cubiccentimeterpergram) {
			this.cubiccentimeterpergram = cubiccentimeterpergram;
		}

		public double getLiterperkilogram() {
			return literperkilogram;
		}

		public void setLiterperkilogram(double literperkilogram) {
			this.literperkilogram = literperkilogram;
		}

		public double getLiterpergram() {
			return literpergram;
		}

		public void setLiterpergram(double literpergram) {
			this.literpergram = literpergram;
		}

		public double getCubicfootperkilogram() {
			return cubicfootperkilogram;
		}

		public void setCubicfootperkilogram(double cubicfootperkilogram) {
			this.cubicfootperkilogram = cubicfootperkilogram;
		}

		public double getCubicfootperpound() {
			return cubicfootperpound;
		}

		public void setCubicfootperpound(double cubicfootperpound) {
			this.cubicfootperpound = cubicfootperpound;
		}

		public double getGallonUSperpound() {
			return gallonUSperpound;
		}

		public void setGallonUSperpound(double gallonUSperpound) {
			this.gallonUSperpound = gallonUSperpound;
		}

		public double getGallonUKperpound() {
			return gallonUKperpound;
		}

		public void setGallonUKperpound(double gallonUKperpound) {
			this.gallonUKperpound = gallonUKperpound;
		}
	}
}