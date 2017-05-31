package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;

public class AccelerationAngularConverter {

	private double radianpersquaresecond,radianpersquareminute,revolutionpersquaresecond,revolutionperminutepersecond,revolutionpersquareminute;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public AccelerationAngularConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateAccelerationAngularConversion()
    {
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Radian/square second -rad/s^2":
			radianpersquaresecond=(edtValue)*1;
			radianpersquareminute=(edtValue)*3600;
			revolutionpersquaresecond=(edtValue)*0.1591549431;
			revolutionperminutepersecond=(edtValue)*9.549296586;
			revolutionpersquareminute=(edtValue)*572.9577952;
			break;
		case "Radian/square minute -rad/min^2":
			radianpersquaresecond=(edtValue)*0.0002777778;
			radianpersquareminute=(edtValue)*1;
			revolutionpersquaresecond=(edtValue)*0.0000442097;
			revolutionperminutepersecond=(edtValue)*0.0026525824;
			revolutionpersquareminute=(edtValue)*0.1591549431;
			break;
		case "Revolution/square second -r/s^2":
			radianpersquaresecond=(edtValue)*6.2831853069;
			radianpersquareminute=(edtValue)*22619.467105;
			revolutionpersquaresecond=(edtValue)*1;
			revolutionperminutepersecond=(edtValue)*60;
			revolutionpersquareminute=(edtValue)*3600.0000003;
			break;
		case "Revolution/minute/second -r/min/s":
			radianpersquaresecond=(edtValue)*0.1047197551;
			radianpersquareminute=(edtValue)*376.99111841;
			revolutionpersquaresecond=(edtValue)*0.0166666667;
			revolutionperminutepersecond=(edtValue)*1;
			revolutionpersquareminute=(edtValue)*60.000000004;
			break;
		case "Revolution/square minute -r/min^2":
			radianpersquaresecond=(edtValue)*0.0017453293;
			radianpersquareminute=(edtValue)*6.2831853064;
			revolutionpersquaresecond=(edtValue)*0.0002777778;
			revolutionperminutepersecond=(edtValue)*0.0166666667;
			revolutionpersquareminute=(edtValue)*1;
			break;
		case "Default":
			break;
			
		}
		results.setRadianpersquaresecond(radianpersquaresecond);
		results.setRadianpersquareminute(radianpersquareminute);
		results.setRevolutionpersquaresecond(revolutionpersquaresecond);
		results.setRevolutionperminutepersecond(revolutionperminutepersecond);
		results.setRevolutionpersquareminute(revolutionpersquareminute);
		
	
		 
		 converterArray.add(results);
		return converterArray;
}

	public class ConversionResults{
		private double radianpersquaresecond,radianpersquareminute,revolutionpersquaresecond,revolutionperminutepersecond,revolutionpersquareminute;

		public double getRadianpersquaresecond() {
			return radianpersquaresecond;
		}

		public void setRadianpersquaresecond(double radianpersquaresecond) {
			this.radianpersquaresecond = radianpersquaresecond;
		}

		public double getRadianpersquareminute() {
			return radianpersquareminute;
		}

		public void setRadianpersquareminute(double radianpersquareminute) {
			this.radianpersquareminute = radianpersquareminute;
		}

		public double getRevolutionpersquaresecond() {
			return revolutionpersquaresecond;
		}

		public void setRevolutionpersquaresecond(double revolutionpersquaresecond) {
			this.revolutionpersquaresecond = revolutionpersquaresecond;
		}

		public double getRevolutionperminutepersecond() {
			return revolutionperminutepersecond;
		}

		public void setRevolutionperminutepersecond(double revolutionperminutepersecond) {
			this.revolutionperminutepersecond = revolutionperminutepersecond;
		}

		public double getRevolutionpersquareminute() {
			return revolutionpersquareminute;
		}

		public void setRevolutionpersquareminute(double revolutionpersquareminute) {
			this.revolutionpersquareminute = revolutionpersquareminute;
		}
	
		
	}
}