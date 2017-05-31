package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;

public class VelocityAngularConverter {
	private double radianpersecond,radianperday,radianperhour,radianperminute,degreeperday,degreeperhour,degreeperminute,degreepersecond
	,revolutionperday,revolutionperhour,revolutionperminute,revolutionpersecond;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public VelocityAngularConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateVelocityAngularConversion()
    {
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Radian/second -rad/s":
			radianpersecond=(edtValue)*1;
			radianperday=(edtValue)*86400;
			radianperhour=(edtValue)*3600;
			radianperminute=(edtValue)*60;
			degreeperday=(edtValue)*4950355.3499;
			degreeperhour=(edtValue)*206264.80625;
			degreeperminute=(edtValue)*3437.7467708;
			degreepersecond=(edtValue)*57.295779513;
			revolutionperday=(edtValue)*13750.987083;
			revolutionperhour=(edtValue)*572.95779513;
			revolutionperminute=(edtValue)*9.5492965855;
			revolutionpersecond=(edtValue)*0.1591549431;
			break;
		case "Radian/day -rad/d":
			radianpersecond=(edtValue)*0.0000018421;
			radianperday=(edtValue)*1;
			radianperhour=(edtValue)*0.0416666667;
			radianperminute=(edtValue)*0.0006944444;
			degreeperday=(edtValue)*57.295779513;
			degreeperhour=(edtValue)*2.3873241464;
			degreeperminute=(edtValue)*0.0397887358;
			degreepersecond=(edtValue)*0.0006631456;
			revolutionperday=(edtValue)*0.1591549431;
			revolutionperhour=(edtValue)*0.006631456;
			revolutionperminute=(edtValue)*0.0001105243;
			revolutionpersecond=(edtValue)*0.0000018421;
			break;
		case "Radian/hour -rad/h":
			radianpersecond=(edtValue)*0.0002777778;
			radianperday=(edtValue)*24;
			radianperhour=(edtValue)*1;
			radianperminute=(edtValue)*0.0166666667;
			degreeperday=(edtValue)*1375.0987083;
			degreeperhour=(edtValue)*57.295779513;
			degreeperminute=(edtValue)*0.9549296586;
			degreepersecond=(edtValue)*0.0159154943;
			revolutionperday=(edtValue)*3.8197186342;
			revolutionperhour=(edtValue)*0.1591549431;
			revolutionperminute=(edtValue)*0.0026525824;
			revolutionpersecond=(edtValue)*0.0000442097;
			break;
		case "Radian/minute -rad/min":
			radianpersecond=(edtValue)*0.0166666667;
			radianperday=(edtValue)*1440;
			radianperhour=(edtValue)*60;
			radianperminute=(edtValue)*1;
			degreeperday=(edtValue)*82505.922499;
			degreeperhour=(edtValue)*3437.7467708;
			degreeperminute=(edtValue)*57.295779513;
			degreepersecond=(edtValue)*0.9549296586;
			revolutionperday=(edtValue)*229.18311805;
			revolutionperhour=(edtValue)*9.5492965855;
			revolutionperminute=(edtValue)*0.1591549431;
			revolutionpersecond=(edtValue)*0.0026525824;
			break;
		case "Degree/day -°/d":
			radianpersecond=(edtValue)*2.020057004E-7;
			radianperday=(edtValue)*0.0174532925;
			radianperhour=(edtValue)*0.0007272205;
			radianperminute=(edtValue)*0.0000121203;
			degreeperday=(edtValue)*1;
			degreeperhour=(edtValue)*0.0416666667;
			degreeperminute=(edtValue)*0.0006944444;
			degreepersecond=(edtValue)*0.0000115741;
			revolutionperday=(edtValue)*0.0027777778;
			revolutionperhour=(edtValue)*0.0001157407;
			revolutionperminute=(edtValue)*0.000001929;
			revolutionpersecond=(edtValue)*3.215020576E-8;
			break;
		case "Degree/hour -°/h":
			radianpersecond=(edtValue)*0.0000048481;
			radianperday=(edtValue)*0.4188790205;
			radianperhour=(edtValue)*0.0174532925;
			radianperminute=(edtValue)*0.0002908882;
			degreeperday=(edtValue)*24;
			degreeperhour=(edtValue)*1;
			degreeperminute=(edtValue)*0.0166666667;
			degreepersecond=(edtValue)*0.0002777778;
			revolutionperday=(edtValue)*0.0666666667;
			revolutionperhour=(edtValue)*0.0027777778;
			revolutionperminute=(edtValue)*0.0000462963;
			revolutionpersecond=(edtValue)*7.716049382E-7;
			break;
		case "Degree/minute -°/min":
			radianpersecond=(edtValue)*0.0002908882;
			radianperday=(edtValue)*25.132741229;
			radianperhour=(edtValue)*1.0471975512;
			radianperminute=(edtValue)*0.0174532925;
			degreeperday=(edtValue)*1440;
			degreeperhour=(edtValue)*60;
			degreeperminute=(edtValue)*1;
			degreepersecond=(edtValue)*0.0166666667;
			revolutionperday=(edtValue)*4;
			revolutionperhour=(edtValue)*0.1666666667;
			revolutionperminute=(edtValue)*0.0027777778;
			revolutionpersecond=(edtValue)*0.0000462963;
			break;
		case "Degree/second -°/s":
			radianpersecond=(edtValue)*0.0174532925;
			radianperday=(edtValue)*1507.9644737;
			radianperhour=(edtValue)*62.831853072;
			radianperminute=(edtValue)*1.0471975512;
			degreeperday=(edtValue)*86400;
			degreeperhour=(edtValue)*3600;
			degreeperminute=(edtValue)*60;
			degreepersecond=(edtValue)*1;
			revolutionperday=(edtValue)*240;
			revolutionperhour=(edtValue)*10;
			revolutionperminute=(edtValue)*0.1666666667;
			revolutionpersecond=(edtValue)*0.0027777778;
			break;
		case "Revolution/day -r/d":
			radianpersecond=(edtValue)*0.0000727221;
			radianperday=(edtValue)*6.2831853072;
			radianperhour=(edtValue)*0.2617993878;
			radianperminute=(edtValue)*0.0043633231;
			degreeperday=(edtValue)*360;
			degreeperhour=(edtValue)*15;
			degreeperminute=(edtValue)*0.25;
			degreepersecond=(edtValue)*0.0041666667;
			revolutionperday=(edtValue)*1;
			revolutionperhour=(edtValue)*0.0416666667;
			revolutionperminute=(edtValue)*0.0006944444;
			revolutionpersecond=(edtValue)*0.0000115741;
			break;
		case "Revolution/hour -r/h":
			radianpersecond=(edtValue)*0.0017453293;
			radianperday=(edtValue)*150.79644737;
			radianperhour=(edtValue)*6.2831853072;
			radianperminute=(edtValue)*0.1047197551;
			degreeperday=(edtValue)*8640;
			degreeperhour=(edtValue)*360;
			degreeperminute=(edtValue)*6;
			degreepersecond=(edtValue)*0.1;
			revolutionperday=(edtValue)*24;
			revolutionperhour=(edtValue)*1;
			revolutionperminute=(edtValue)*0.0166666667;
			revolutionpersecond=(edtValue)*0.0002777778;
			break;
		case "Revolution/minute -r/min":
			radianpersecond=(edtValue)*0.1047197551;
			radianperday=(edtValue)*9047.7868423;
			radianperhour=(edtValue)*376.99111843;
			radianperminute=(edtValue)*6.2831853072;
			degreeperday=(edtValue)*518400;
			degreeperhour=(edtValue)*21600;
			degreeperminute=(edtValue)*360;
			degreepersecond=(edtValue)*6;
			revolutionperday=(edtValue)*1440;
			revolutionperhour=(edtValue)*60;
			revolutionperminute=(edtValue)*1;
			revolutionpersecond=(edtValue)*0.0166666667;
			break;
		case "Revolution/second -r/s":
			radianpersecond=(edtValue)*6.2831853072;
			radianperday=(edtValue)*542867.21054;
			radianperhour=(edtValue)*22619.467106;
			radianperminute=(edtValue)*376.99111843;
			degreeperday=(edtValue)*31104000;
			degreeperhour=(edtValue)*1296000;
			degreeperminute=(edtValue)*21600;
			degreepersecond=(edtValue)*360;
			revolutionperday=(edtValue)*86400;
			revolutionperhour=(edtValue)*3600;
			revolutionperminute=(edtValue)*60;
			revolutionpersecond=(edtValue)*1;
			break;
		case "Default":
			break;
			
		}
		results.setRadianpersecond(radianpersecond);
		results.setRadianperday(radianperday);
		results.setRadianperhour(radianperhour);
		results.setRadianperminute(radianperminute);
		results.setDegreeperday(degreeperday);
		results.setDegreeperhour(degreeperhour);
		results.setDegreeperminute(degreeperminute);
		results.setDegreepersecond(degreepersecond);
		results.setRevolutionperday(revolutionperday);
		results.setRevolutionperhour(revolutionperhour);
		results.setRevolutionperminute(revolutionperminute);
		results.setRevolutionpersecond(revolutionpersecond);
	
		 
		 converterArray.add(results);
		return converterArray;
}

public 	class ConversionResults{
		private double radianpersecond,radianperday,radianperhour,radianperminute,degreeperday,degreeperhour,degreeperminute, degreepersecond
		,revolutionperday,revolutionperhour,revolutionperminute,revolutionpersecond;

		public double getRadianpersecond() {
			return radianpersecond;
		}

		public void setRadianpersecond(double radianpersecond) {
			this.radianpersecond = radianpersecond;
		}

		public double getRadianperday() {
			return radianperday;
		}

		public void setRadianperday(double radianperday) {
			this.radianperday = radianperday;
		}

		public double getRadianperhour() {
			return radianperhour;
		}

		public void setRadianperhour(double radianperhour) {
			this.radianperhour = radianperhour;
		}

		public double getRadianperminute() {
			return radianperminute;
		}

		public void setRadianperminute(double radianperminute) {
			this.radianperminute = radianperminute;
		}

		public double getDegreeperday() {
			return degreeperday;
		}

		public void setDegreeperday(double degreeperday) {
			this.degreeperday = degreeperday;
		}

		public double getDegreeperhour() {
			return degreeperhour;
		}

		public void setDegreeperhour(double degreeperhour) {
			this.degreeperhour = degreeperhour;
		}

		public double getDegreeperminute() {
			return degreeperminute;
		}

		public void setDegreeperminute(double degreeperminute) {
			this.degreeperminute = degreeperminute;
		}

		public double getDegreepersecond() {
			return degreepersecond;
		}

		public void setDegreepersecond(double degreepersecond) {
			this.degreepersecond = degreepersecond;
		}

		public double getRevolutionperday() {
			return revolutionperday;
		}

		public void setRevolutionperday(double revolutionperday) {
			this.revolutionperday = revolutionperday;
		}

		public double getRevolutionperhour() {
			return revolutionperhour;
		}

		public void setRevolutionperhour(double revolutionperhour) {
			this.revolutionperhour = revolutionperhour;
		}

		public double getRevolutionperminute() {
			return revolutionperminute;
		}

		public void setRevolutionperminute(double revolutionperminute) {
			this.revolutionperminute = revolutionperminute;
		}

		public double getRevolutionpersecond() {
			return revolutionpersecond;
		}

		public void setRevolutionpersecond(double revolutionpersecond) {
			this.revolutionpersecond = revolutionpersecond;
		}

	
		
	}
}