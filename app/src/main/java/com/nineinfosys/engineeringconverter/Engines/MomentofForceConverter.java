package com.nineinfosys.engineeringconverter.Engines;


import java.util.ArrayList;

public class MomentofForceConverter {

	private double newtonmeter,kilonewtonmeter,millinewtonmeter,micronewtonmeter,tonforceshortmeter,tonforcelongmeter,tonforcemetricmeter,kilogramforcemeter
	,gramforcecentimeter,poundforcefoot,poundalfoot,poundalinch;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public MomentofForceConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateMomentofForceConversion()
    {
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Newton meter -N*m":
			newtonmeter=(edtValue)*1;
			kilonewtonmeter=(edtValue)*0.001;
			millinewtonmeter=(edtValue)*1000;
			micronewtonmeter=(edtValue)*1000000;
			tonforceshortmeter=(edtValue)*0.0001124045;
			tonforcelongmeter=(edtValue)*0.0001003611;
			tonforcemetricmeter=(edtValue)*0.0001019716;
			kilogramforcemeter=(edtValue)*0.1019716213;
			gramforcecentimeter=(edtValue)*10197.16213;
			poundforcefoot=(edtValue)*0.7375610332;
			poundalfoot=(edtValue)*23.730366088;
			poundalinch=(edtValue)*284.76439306;
			break;
		case "Kilonewton meter -kN*m":
			newtonmeter=(edtValue)*1000;
			kilonewtonmeter=(edtValue)*1;
			millinewtonmeter=(edtValue)*1000000;
			micronewtonmeter=(edtValue)*1000000000;
			tonforceshortmeter=(edtValue)*0.1124045124;
			tonforcelongmeter=(edtValue)*0.1003610992;
			tonforcemetricmeter=(edtValue)*0.1019716213;
			kilogramforcemeter=(edtValue)*101.9716213;
			gramforcecentimeter=(edtValue)*10197162.13;
			poundforcefoot=(edtValue)*737.56103318;
			poundalfoot=(edtValue)*23730.366088;
			poundalinch=(edtValue)*284764.39306;
			break;
		case "Millinewton meter -mN*m":
			newtonmeter=(edtValue)*0.001;
			kilonewtonmeter=(edtValue)*0.000001;
			millinewtonmeter=(edtValue)*1;
			micronewtonmeter=(edtValue)*1000;
			tonforceshortmeter=(edtValue)*1.124045123E-7;
			tonforcelongmeter=(edtValue)*1.003610992E-7;
			tonforcemetricmeter=(edtValue)*1.019716212E-7;
			kilogramforcemeter=(edtValue)*0.0001019716;
			gramforcecentimeter=(edtValue)*10.19716213;
			poundforcefoot=(edtValue)*0.000737561;
			poundalfoot=(edtValue)*0.0237303661;
			poundalinch=(edtValue)*0.2847643931;
			break;
		case "Micronewton meter -μN*m":
			newtonmeter=(edtValue)*0.000001;
			kilonewtonmeter=(edtValue)*1.E-9;
			millinewtonmeter=(edtValue)*0.001;
			micronewtonmeter=(edtValue)*1;
			tonforceshortmeter=(edtValue)*124045123E-10;
			tonforcelongmeter=(edtValue)*1.003610992E-10;
			tonforcemetricmeter=(edtValue)*1.019716212E-10;
			kilogramforcemeter=(edtValue)*1.019716212E-7;
			gramforcecentimeter=(edtValue)*0.0101971621;
			poundforcefoot=(edtValue)*7.375610331E-7;
			poundalfoot=(edtValue)*0.0000237304;
			poundalinch=(edtValue)*0.0002847644;
			break;
		case "Ton-force (short) meter -ton*m":
			newtonmeter=(edtValue)*8896.44;
			kilonewtonmeter=(edtValue)*8.89644;
			millinewtonmeter=(edtValue)*8896440;
			micronewtonmeter=(edtValue)*8896440000.0;
			tonforceshortmeter=(edtValue)*1;
			tonforcelongmeter=(edtValue)*0.8928564977;
			tonforcemetricmeter=(edtValue)*0.9071844106;
			kilogramforcemeter=(edtValue)*907.18441058;
			gramforcecentimeter=(edtValue)*90718441.058;
			poundforcefoot=(edtValue)*6561.667478;
			poundalfoot=(edtValue)*211115.77808;
			poundalinch=(edtValue)*2533389.337;
			break;
		case "Ton-force (long) meter -ton*m":
			newtonmeter=(edtValue)*9964.02;
			kilonewtonmeter=(edtValue)*9.96402;
			millinewtonmeter=(edtValue)*9964020;
			micronewtonmeter=(edtValue)*9964020000.0;
			tonforceshortmeter=(edtValue)*1.1200008093;
			tonforcelongmeter=(edtValue)*1;
			tonforcemetricmeter=(edtValue)*1.016047274;
			kilogramforcemeter=(edtValue)*1016.047274;
			gramforcecentimeter=(edtValue)*101604727.4;
			poundforcefoot=(edtValue)*7349.0728858;
			poundalfoot=(edtValue)*236449.84231;
			poundalinch=(edtValue)*2837398.1077;
			break;
		case "Ton-force (metric) meter -ton*m":
			newtonmeter=(edtValue)*9806.65;
			kilonewtonmeter=(edtValue)*9.80665;
			millinewtonmeter=(edtValue)*9806650;
			micronewtonmeter=(edtValue)*9806650000.0;
			tonforceshortmeter=(edtValue)*1.1023117112;
			tonforcelongmeter=(edtValue)*0.9842061738;
			tonforcemetricmeter=(edtValue)*1;
			kilogramforcemeter=(edtValue)*1000;
			gramforcecentimeter=(edtValue)*100000000;
			poundforcefoot=(edtValue)*7233.002906;
			poundalfoot=(edtValue)*232715.3946;
			poundalinch=(edtValue)*2792584.7352;
			break;
		case "Kilogram-force meter -kgf*m":
			newtonmeter=(edtValue)*9.80665;
			kilonewtonmeter=(edtValue)*0.00980665;
			millinewtonmeter=(edtValue)*9806.65;
			micronewtonmeter=(edtValue)*9806650;
			tonforceshortmeter=(edtValue)*0.0011023117;
			tonforcelongmeter=(edtValue)*0.0009842062;
			tonforcemetricmeter=(edtValue)*0.001;
			kilogramforcemeter=(edtValue)*1;
			gramforcecentimeter=(edtValue)*100000;
			poundforcefoot=(edtValue)*7.233002906;
			poundalfoot=(edtValue)*232.7153946;
			poundalinch=(edtValue)*2792.5847352;
			break;
		case "Gram-force centimeter -gf*cm":
			newtonmeter=(edtValue)*0.0000980665;
			kilonewtonmeter=(edtValue)*9.806649999E-8;
			millinewtonmeter=(edtValue)*0.0980665;
			micronewtonmeter=(edtValue)*98.0665;
			tonforceshortmeter=(edtValue)*1.102311711E-8;
			tonforcelongmeter=(edtValue)*9.842061738E-9;
			tonforcemetricmeter=(edtValue)*1.E-8;
			kilogramforcemeter=(edtValue)*0.00001;
			gramforcecentimeter=(edtValue)*1;
			poundforcefoot=(edtValue)*0.00007233;
			poundalfoot=(edtValue)*0.0023271539;
			poundalinch=(edtValue)*0.0279258474;
			break;
		case "Pound-force foot -lbf*ft":
			newtonmeter=(edtValue)*1.35582;
			kilonewtonmeter=(edtValue)*0.00135582;
			millinewtonmeter=(edtValue)*1355.82;
			micronewtonmeter=(edtValue)*1355820;
			tonforceshortmeter=(edtValue)*0.0001524003;
			tonforcelongmeter=(edtValue)*0.0001360716;
			tonforcemetricmeter=(edtValue)*0001382552.0;
			kilogramforcemeter=(edtValue)*0.1382551636;
			gramforcecentimeter=(edtValue)*13825.516359;
			poundforcefoot=(edtValue)*1;
			poundalfoot=(edtValue)*32.17410495;
			poundalinch=(edtValue)*386.0892594;
			break;
		case "Poundal foot -pdl*ft":
			newtonmeter=(edtValue)*0.0421401;
			kilonewtonmeter=(edtValue)*0.0000421401;
			millinewtonmeter=(edtValue)*42.1401;
			micronewtonmeter=(edtValue)*42140.1;
			tonforceshortmeter=(edtValue)*0.0000047367;
			tonforcelongmeter=(edtValue)*0.0000042292;
			tonforcemetricmeter=(edtValue)*0.0000042971;
			kilogramforcemeter=(edtValue)*0.0042970943;
			gramforcecentimeter=(edtValue)*429.70943187;
			poundforcefoot=(edtValue)*0.0310808957;
			poundalfoot=(edtValue)*1;
			poundalinch=(edtValue)*12;
			break;
		case "Poundal inch -pdl*in":
			newtonmeter=(edtValue)*0.003511675;
			kilonewtonmeter=(edtValue)*0.0000035117;
			millinewtonmeter=(edtValue)*3.511675;
			micronewtonmeter=(edtValue)*3511.675;
			tonforceshortmeter=(edtValue)*3.947281159E-7;
			tonforcelongmeter=(edtValue)*3.524355631E-7;
			tonforcemetricmeter=(edtValue)*3.580911932E-7;
			kilogramforcemeter=(edtValue)*0.0003580912;
			gramforcecentimeter=(edtValue)*35.809119322;
			poundforcefoot=(edtValue)*0.0025900746;
			poundalfoot=(edtValue)*0.0833333333;
			poundalinch=(edtValue)*1;
			break;
		case "Default":
			break;
			
		}
		results.setNewtonmeter(newtonmeter);
		results.setKilonewtonmeter(kilonewtonmeter);
		results.setMillinewtonmeter(millinewtonmeter);
		results.setMicronewtonmeter(micronewtonmeter);
		results.setTonforceshortmeter(tonforceshortmeter);
		results.setTonforcelongmeter(tonforcelongmeter);
		results.setTonforcemetricmeter(tonforcemetricmeter);
		results.setKilogramforcemeter(kilogramforcemeter);
		results.setGramforcecentimeter(gramforcecentimeter);
		results.setPoundforcefoot(poundforcefoot);
		results.setPoundalfoot(poundalfoot);
		results.setPoundalinch(poundalinch);
		 
		 converterArray.add(results);
		return converterArray;
}

public 	class ConversionResults{
		private double newtonmeter,kilonewtonmeter,millinewtonmeter,micronewtonmeter,tonforceshortmeter,tonforcelongmeter,tonforcemetricmeter,kilogramforcemeter
		,gramforcecentimeter,poundforcefoot,poundalfoot,poundalinch;

		public double getNewtonmeter() {
			return newtonmeter;
		}

		public void setNewtonmeter(double newtonmeter) {
			this.newtonmeter = newtonmeter;
		}

		public double getKilonewtonmeter() {
			return kilonewtonmeter;
		}

		public void setKilonewtonmeter(double kilonewtonmeter) {
			this.kilonewtonmeter = kilonewtonmeter;
		}

		public double getMillinewtonmeter() {
			return millinewtonmeter;
		}

		public void setMillinewtonmeter(double millinewtonmeter) {
			this.millinewtonmeter = millinewtonmeter;
		}

		public double getMicronewtonmeter() {
			return micronewtonmeter;
		}

		public void setMicronewtonmeter(double micronewtonmeter) {
			this.micronewtonmeter = micronewtonmeter;
		}

		public double getTonforceshortmeter() {
			return tonforceshortmeter;
		}

		public void setTonforceshortmeter(double tonforceshortmeter) {
			this.tonforceshortmeter = tonforceshortmeter;
		}

		public double getTonforcelongmeter() {
			return tonforcelongmeter;
		}

		public void setTonforcelongmeter(double tonforcelongmeter) {
			this.tonforcelongmeter = tonforcelongmeter;
		}

		public double getTonforcemetricmeter() {
			return tonforcemetricmeter;
		}

		public void setTonforcemetricmeter(double tonforcemetricmeter) {
			this.tonforcemetricmeter = tonforcemetricmeter;
		}

		public double getKilogramforcemeter() {
			return kilogramforcemeter;
		}

		public void setKilogramforcemeter(double kilogramforcemeter) {
			this.kilogramforcemeter = kilogramforcemeter;
		}

		public double getGramforcecentimeter() {
			return gramforcecentimeter;
		}

		public void setGramforcecentimeter(double gramforcecentimeter) {
			this.gramforcecentimeter = gramforcecentimeter;
		}

		public double getPoundforcefoot() {
			return poundforcefoot;
		}

		public void setPoundforcefoot(double poundforcefoot) {
			this.poundforcefoot = poundforcefoot;
		}

		public double getPoundalfoot() {
			return poundalfoot;
		}

		public void setPoundalfoot(double poundalfoot) {
			this.poundalfoot = poundalfoot;
		}

		public double getPoundalinch() {
			return poundalinch;
		}

		public void setPoundalinch(double poundalinch) {
			this.poundalinch = poundalinch;
		}

	
		
	}
}