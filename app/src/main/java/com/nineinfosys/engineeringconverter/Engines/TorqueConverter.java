package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;


public class TorqueConverter {

		private double newtonmeter,newtoncentimeter,newtonmillimeter,kilonewtonmeter,dynemeter,dynecentimeter,dynemillimeter,kilogramforcemeter,kilogramforcecentimeter,kilogramforcemillimeter,gramforcemeter,gramforcecentimeter,gramforcemillimeter,ounceforcefoot,ounceforceinch,poundforcefoot,poundforceinch;
		private double edtValue;
		private String conversionFrom;
		//private String conversionTo;
		public TorqueConverter(String conversionFrom, double edtValue){
			// TODO Auto-generated constructor stub
			this.conversionFrom = conversionFrom;
			this.edtValue = edtValue;
		}
		public ArrayList<ConversionResults> calculateTorqueConversion()
	    {
			
			ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
				
			ConversionResults results= new ConversionResults();
	    		 	
			switch(conversionFrom)
			{
			case "Newton meter -N*m":
				
				newtonmeter=(edtValue)*1;
				newtoncentimeter=(edtValue)*100;
				newtonmillimeter=(edtValue)*1000;
				kilonewtonmeter=(edtValue)*0.001;
				dynemeter=(edtValue)*100000;
				dynecentimeter=(edtValue)*10000000;
				dynemillimeter=(edtValue)*100000000;
				kilogramforcemeter=(edtValue)*0.1019716213;
				kilogramforcecentimeter=(edtValue)*10.19716213;
				kilogramforcemillimeter=(edtValue)*101.9716213;
				gramforcemeter=(edtValue)*101.9716213;
				gramforcecentimeter=(edtValue)*10197.16213;
				gramforcemillimeter=(edtValue)*101971.6213;
				ounceforcefoot=(edtValue)*11.800994078;
				ounceforceinch=(edtValue)*141.61192894;
				poundforcefoot=(edtValue)*0.7375621212;
				poundforceinch=(edtValue)*8.850745454;
				
				break;
				
			case "Newton centimeter -N*cm":
				
				newtonmeter=(edtValue)*0.01;
				newtoncentimeter=(edtValue)*1;
				newtonmillimeter=(edtValue)*10;
				kilonewtonmeter=(edtValue)*0.00001;
				dynemeter=(edtValue)*1000;
				dynecentimeter=(edtValue)*100000;
				dynemillimeter=(edtValue)*1000000;
				kilogramforcemeter=(edtValue)*0.0010197162;
				kilogramforcecentimeter=(edtValue)*0.1019716213;
				kilogramforcemillimeter=(edtValue)*1.019716213;
				gramforcemeter=(edtValue)*1.019716213;
				gramforcecentimeter=(edtValue)*101.9716213;
				gramforcemillimeter=(edtValue)*1019.716213;
				ounceforcefoot=(edtValue)*0.1180099408;
				ounceforceinch=(edtValue)*1.4161192894;
				poundforcefoot=(edtValue)*0.0073756212;
				poundforceinch=(edtValue)*0.0885074545;
				
				
				break;
				
			case "Newton millimeter -N*mm":
				
				newtonmeter=(edtValue)*0.001;
				newtoncentimeter=(edtValue)*0.1;
				newtonmillimeter=(edtValue)*1;
				kilonewtonmeter=(edtValue)*0.000001;
				dynemeter=(edtValue)*100;
				dynecentimeter=(edtValue)*10000;
				dynemillimeter=(edtValue)*100000;
				kilogramforcemeter=(edtValue)*0.0001019716;
				kilogramforcecentimeter=(edtValue)*0.0101971621;
				kilogramforcemillimeter=(edtValue)*0.1019716213;
				gramforcemeter=(edtValue)*0.1019716213;
				gramforcecentimeter=(edtValue)*10.19716213;
				gramforcemillimeter=(edtValue)*101.9716213;
				ounceforcefoot=(edtValue)*0.0118009941;
				ounceforceinch=(edtValue)*0.1416119289;
				poundforcefoot=(edtValue)*0.0007375621;
				poundforceinch=(edtValue)*0.0088507455;
				
				
				break;	
			case "Kilonewton meter -kN*m":
				
				newtonmeter=(edtValue)*1000;
				newtoncentimeter=(edtValue)*100000;
				newtonmillimeter=(edtValue)*1000000;
				kilonewtonmeter=(edtValue)*1;
				dynemeter=(edtValue)*100000000;
				dynecentimeter=(edtValue)*10000000000.0000000000;
				dynemillimeter=(edtValue)*100000000000.0000000000;
				kilogramforcemeter=(edtValue)*101.9716213;
				kilogramforcecentimeter=(edtValue)*10197.16213;
				kilogramforcemillimeter=(edtValue)*101971.6213;
				gramforcemeter=(edtValue)*101971.6213;
				gramforcecentimeter=(edtValue)*10197162.13;
				gramforcemillimeter=(edtValue)*101971621.3;
				ounceforcefoot=(edtValue)*11800.994078;
				ounceforceinch=(edtValue)*141611.92894;
				poundforcefoot=(edtValue)*737.56212117;
				poundforceinch=(edtValue)*8850.745454;
				
				
				break;	
			case "Dyne meter -dyn*m":
				
				newtonmeter=(edtValue)*0.00001;
				newtoncentimeter=(edtValue)*0.001;
				newtonmillimeter=(edtValue)*0.01;
				kilonewtonmeter=(edtValue)*1.E-8;
				dynemeter=(edtValue)*1;
				dynecentimeter=(edtValue)*100;
				dynemillimeter=(edtValue)*1000;
				kilogramforcemeter=(edtValue)*0.0000010197;
				kilogramforcecentimeter=(edtValue)*0.0001019716;
				kilogramforcemillimeter=(edtValue)*0.0010197162;
				gramforcemeter=(edtValue)*0.0010197162;
				gramforcecentimeter=(edtValue)*0.1019716213;
				gramforcemillimeter=(edtValue)*1.019716213;
				ounceforcefoot=(edtValue)*0.0001180099;
				ounceforceinch=(edtValue)*0.0014161193;
				poundforcefoot=(edtValue)*0.0000073756;
				poundforceinch=(edtValue)*0.0000885075;
				
				
				break;	
			case "Dyne centimeter -dyn*cm":
				
				newtonmeter=(edtValue)*1.E-7;
				newtoncentimeter=(edtValue)*0.00001;
				newtonmillimeter=(edtValue)*0.0001;
				kilonewtonmeter=(edtValue)*1.E-10;
				dynemeter=(edtValue)*0.01;
				dynecentimeter=(edtValue)*1;
				dynemillimeter=(edtValue)*10;
				kilogramforcemeter=(edtValue)*1.019716212E-8;
				kilogramforcecentimeter=(edtValue)*0.0000010197;
				kilogramforcemillimeter=(edtValue)*0.0000101972;
				gramforcemeter=(edtValue)*0.0000101972;
				gramforcecentimeter=(edtValue)*0.0010197162;
				gramforcemillimeter=(edtValue)*0.0101971621;
				ounceforcefoot=(edtValue)*0.0000011801;
				ounceforceinch=(edtValue)*0.0000141612;
				poundforcefoot=(edtValue)*7.375621211E-8;
				poundforceinch=(edtValue)*8.850745454E-7;
				
				break;
				
			case "Dyne millimeter -dyn*mm":
				
				newtonmeter=(edtValue)*1.E-8;
				newtoncentimeter=(edtValue)*0.000001;
				newtonmillimeter=(edtValue)*0.00001;
				kilonewtonmeter=(edtValue)*1.E-11;
				dynemeter=(edtValue)*0.001;
				dynecentimeter=(edtValue)*0.1;
				dynemillimeter=(edtValue)*1;
				kilogramforcemeter=(edtValue)*1.019716212E-9;
				kilogramforcecentimeter=(edtValue)*1.019716212E-7;
				kilogramforcemillimeter=(edtValue)*0.0000010197;
				gramforcemeter=(edtValue)*0.0000010197;
				gramforcecentimeter=(edtValue)*0.0001019716;
				gramforcemillimeter=(edtValue)*0.0010197162;
				ounceforcefoot=(edtValue)*1.180099407E-7;
				ounceforceinch=(edtValue)*0.0000014161;
				poundforcefoot=(edtValue)*7.375621211E-9;
				poundforceinch=(edtValue)*8.850745454E-8;
				
				
				break;		
				
			case "Kilogram-force meter -kgf*m":
				
				newtonmeter=(edtValue)*9.80665;
				newtoncentimeter=(edtValue)*980.665;
				newtonmillimeter=(edtValue)*9806.65;
				kilonewtonmeter=(edtValue)*0.00980665;
				dynemeter=(edtValue)*980665;
				dynecentimeter=(edtValue)*98066500;
				dynemillimeter=(edtValue)*980665000;
				kilogramforcemeter=(edtValue)*1;
				kilogramforcecentimeter=(edtValue)*100;
				kilogramforcemillimeter=(edtValue)*1000;
				gramforcemeter=(edtValue)*1000;
				gramforcecentimeter=(edtValue)*100000;
				gramforcemillimeter=(edtValue)*1000000;
				ounceforcefoot=(edtValue)*115.72821857;
				ounceforceinch=(edtValue)*1388.7386229;
				poundforcefoot=(edtValue)*7.2330135756;
				poundforceinch=(edtValue)*86.796162907;
				
				
				break;		
			case "Kilogram-force centimeter -kgf*cm":
				
				newtonmeter=(edtValue)*0.0980665;
				newtoncentimeter=(edtValue)*9.80665;
				newtonmillimeter=(edtValue)*98.0665;
				kilonewtonmeter=(edtValue)*0.0000980665;
				dynemeter=(edtValue)*9806.65;
				dynecentimeter=(edtValue)*980665;
				dynemillimeter=(edtValue)*9806650;
				kilogramforcemeter=(edtValue)*0.01;
				kilogramforcecentimeter=(edtValue)*1;
				kilogramforcemillimeter=(edtValue)*10;
				gramforcemeter=(edtValue)*10;
				gramforcecentimeter=(edtValue)*1000;
				gramforcemillimeter=(edtValue)*10000;
				ounceforcefoot=(edtValue)*1.1572821857;
				ounceforceinch=(edtValue)*13.887386229;
				poundforcefoot=(edtValue)*0.0723301358;
				poundforceinch=(edtValue)*0.8679616291;
				
				
				break;		
				
			case "Kilogram-force millimeter -kgf*mm":
				
				newtonmeter=(edtValue)*0.00980665;
				newtoncentimeter=(edtValue)*0.980665;
				newtonmillimeter=(edtValue)*9.80665;
				kilonewtonmeter=(edtValue)*0.0000098066;
				dynemeter=(edtValue)*980.665;
				dynecentimeter=(edtValue)*98066.5;
				dynemillimeter=(edtValue)*980665;
				kilogramforcemeter=(edtValue)*0.001;
				kilogramforcecentimeter=(edtValue)*0.1;
				kilogramforcemillimeter=(edtValue)*1;
				gramforcemeter=(edtValue)*1;
				gramforcecentimeter=(edtValue)*100;
				gramforcemillimeter=(edtValue)*1000;
				ounceforcefoot=(edtValue)*0.1157282186;
				ounceforceinch=(edtValue)*1.3887386229;
				poundforcefoot=(edtValue)*0.0072330136;
				poundforceinch=(edtValue)*0.0867961629;
				
				
				break;	
				
	case "Gram-force meter -gf*m":
				
				newtonmeter=(edtValue)*0.00980665;
				newtoncentimeter=(edtValue)*0.980665;
				newtonmillimeter=(edtValue)*9.80665;
				kilonewtonmeter=(edtValue)*0.0000098066;
				dynemeter=(edtValue)*980.665;
				dynecentimeter=(edtValue)*98066.5;
				dynemillimeter=(edtValue)*980665;
				kilogramforcemeter=(edtValue)*0.001;
				kilogramforcecentimeter=(edtValue)*0.1;
				kilogramforcemillimeter=(edtValue)*1;
				gramforcemeter=(edtValue)*1;
				gramforcecentimeter=(edtValue)*100;
				gramforcemillimeter=(edtValue)*1000;
				ounceforcefoot=(edtValue)*0.1157282186;
				ounceforceinch=(edtValue)*1.3887386229;
				poundforcefoot=(edtValue)*0.0072330136;
				poundforceinch=(edtValue)*0.0867961629;
				
				break;
				
			case "Gram-force centimeter -gf*cm":
				
				newtonmeter=(edtValue)*0.0000980665;
				newtoncentimeter=(edtValue)*0.00980665;
				newtonmillimeter=(edtValue)*0.0980665;
				kilonewtonmeter=(edtValue)*9.806649999E-8;
				dynemeter=(edtValue)*9.80665;
				dynecentimeter=(edtValue)*980.665;
				dynemillimeter=(edtValue)*9806.65;
				kilogramforcemeter=(edtValue)*0.00001;
				kilogramforcecentimeter=(edtValue)*0.001;
				kilogramforcemillimeter=(edtValue)*0.01;
				gramforcemeter=(edtValue)*0.01;
				gramforcecentimeter=(edtValue)*1;
				gramforcemillimeter=(edtValue)*10;
				ounceforcefoot=(edtValue)*0.0011572822;
				ounceforceinch=(edtValue)*0.0138873862;
				poundforcefoot=(edtValue)*0.0000723301;
				poundforceinch=(edtValue)*0.0008679616;
				
				
				break;
				
			case "Gram-force millimeter -gf*mm":
				
				newtonmeter=(edtValue)*0.0000098066;
				newtoncentimeter=(edtValue)*0.000980665;
				newtonmillimeter=(edtValue)*0.00980665;
				kilonewtonmeter=(edtValue)*9.806649999E-9;
				dynemeter=(edtValue)*0.980665;
				dynecentimeter=(edtValue)*98.0665;
				dynemillimeter=(edtValue)*980.665;
				kilogramforcemeter=(edtValue)*0.000001;
				kilogramforcecentimeter=(edtValue)*0.0001;
				kilogramforcemillimeter=(edtValue)*0.001;
				gramforcemeter=(edtValue)*0.001;
				gramforcecentimeter=(edtValue)*0.1;
				gramforcemillimeter=(edtValue)*1;
				ounceforcefoot=(edtValue)*0.0001157282;
				ounceforceinch=(edtValue)*0.0013887386;
				poundforcefoot=(edtValue)*0.000007233;
				poundforceinch=(edtValue)*0.0000867962;
				
				
				break;	
			case "Ounce-force foot -ozf*ft":
				
				newtonmeter=(edtValue)*0.084738624;
				newtoncentimeter=(edtValue)*8.4738624;
				newtonmillimeter=(edtValue)*84.738624;
				kilonewtonmeter=(edtValue)*0.0000847386;
				dynemeter=(edtValue)*8473.8624;
				dynecentimeter=(edtValue)*847386.24;
				dynemillimeter=(edtValue)*8473862.4;
				kilogramforcemeter=(edtValue)*0.0086409349;
				kilogramforcecentimeter=(edtValue)*0.8640934876;
				kilogramforcemillimeter=(edtValue)*8.6409348758;
				gramforcemeter=(edtValue)*8.6409348758;
				gramforcecentimeter=(edtValue)*864.09348758;
				gramforcemillimeter=(edtValue)*8640.9348758;
				ounceforcefoot=(edtValue)*1;
				ounceforceinch=(edtValue)*12;
				poundforcefoot=(edtValue)*0.0624999993;
				poundforceinch=(edtValue)*0.7499999911;
				
				
				break;	
			case "Ounce-force inch -ozf*in":
				
				newtonmeter=(edtValue)*0.007061552;
				newtoncentimeter=(edtValue)*0.7061552;
				newtonmillimeter=(edtValue)*7.061552;
				kilonewtonmeter=(edtValue)*0.0000070616;
				dynemeter=(edtValue)*706.1552;
				dynecentimeter=(edtValue)*70615.52;
				dynemillimeter=(edtValue)*706155.2;
				kilogramforcemeter=(edtValue)*0.0007200779;
				kilogramforcecentimeter=(edtValue)*0.0720077906;
				kilogramforcemillimeter=(edtValue)*0.7200779063;
				gramforcemeter=(edtValue)*0.7200779063;
				gramforcecentimeter=(edtValue)*72.007790632;
				gramforcemillimeter=(edtValue)*720.07790632;
				ounceforcefoot=(edtValue)*0.0833333333;
				ounceforceinch=(edtValue)*1;
				poundforcefoot=(edtValue)*0.0052083333;
				poundforceinch=(edtValue)*0.0624999993;
				
				
				break;	
			case "Pound-force foot -lbf*ft":
				
			
				newtonmeter=(edtValue)*1.355818;
				newtoncentimeter=(edtValue)*135.5818;
				newtonmillimeter=(edtValue)*1355.818;
				kilonewtonmeter=(edtValue)*0.001355818;
				dynemeter=(edtValue)*135581.8;
				dynecentimeter=(edtValue)*13558180;
				dynemillimeter=(edtValue)*135581800;
				kilogramforcemeter=(edtValue)*0.1382549596;
				kilogramforcecentimeter=(edtValue)*13.825495964;
				kilogramforcemillimeter=(edtValue)*138.25495964;
				gramforcemeter=(edtValue)*138.25495964;
				gramforcecentimeter=(edtValue)*13825.495964;
				gramforcemillimeter=(edtValue)*138254.95964;
				ounceforcefoot=(edtValue)*16.000000189;
				ounceforceinch=(edtValue)*192.00000227;
				poundforcefoot=(edtValue)*1;
				poundforceinch=(edtValue)*12;
				
				break;
				
			case "Pound-force inch -lbf*in":
				
				newtonmeter=(edtValue)*0.1129848333;
				newtoncentimeter=(edtValue)*11.298483333;
				newtonmillimeter=(edtValue)*112.98483333;
				kilonewtonmeter=(edtValue)*0.0001129848;
				dynemeter=(edtValue)*11298.483333;
				dynecentimeter=(edtValue)*1129848.3333;
				dynemillimeter=(edtValue)*11298483.333;
				kilogramforcemeter=(edtValue)*0.0115212466;
				kilogramforcecentimeter=(edtValue)*1.1521246637;
				kilogramforcemillimeter=(edtValue)*11.521246637;
				gramforcemeter=(edtValue)*11.521246637;
				gramforcecentimeter=(edtValue)*1152.1246637;
				gramforcemillimeter=(edtValue)*11521.246637;
				ounceforcefoot=(edtValue)*1.3333333491;
				ounceforceinch=(edtValue)*16.000000189;
				poundforcefoot=(edtValue)*0.0833333333;
				poundforceinch=(edtValue)*1;
				
				
				break;		
				
			case "Default":
				break;
				
			}
			
		
			 results.setNewtonmeter(newtonmeter);
			 results.setNewtoncentimeter(newtoncentimeter);
			 results.setNewtonmillimeter(newtonmillimeter);
			 results.setKilonewtonmeter(kilonewtonmeter);
			 results.setDynemeter(dynemeter);
			 results.setDynecentimeter(dynecentimeter);
			 results.setDynemillimeter(dynemillimeter);
			 results.setKilogramforcemeter(kilogramforcemeter);
			 results.setKilogramforcecentimeter(kilogramforcecentimeter);
			 results.setKilogramforcemillimeter(kilogramforcemillimeter);
			 results.setGramforcemeter(gramforcemeter);
			 results.setGramforcecentimeter(gramforcecentimeter);
			 results.setGramforcemillimeter(gramforcemillimeter);
			 results.setOunceforcefoot(ounceforcefoot);
			 results.setOunceforceinch(ounceforceinch);
			 results.setPoundforcefoot(poundforcefoot);
			 results.setPoundforceinch(poundforceinch);
			
			 converterArray.add(results);
			return converterArray;
	}
	public class ConversionResults{
		private double newtonmeter,newtoncentimeter,newtonmillimeter,kilonewtonmeter,dynemeter,dynecentimeter,dynemillimeter,kilogramforcemeter,kilogramforcecentimeter,kilogramforcemillimeter,gramforcemeter,gramforcecentimeter,gramforcemillimeter,ounceforcefoot,ounceforceinch,poundforcefoot,poundforceinch;

		public double getNewtonmeter() {
			return newtonmeter;
		}

		public void setNewtonmeter(double newtonmeter) {
			this.newtonmeter = newtonmeter;
		}

		public double getNewtoncentimeter() {
			return newtoncentimeter;
		}

		public void setNewtoncentimeter(double newtoncentimeter) {
			this.newtoncentimeter = newtoncentimeter;
		}

		public double getNewtonmillimeter() {
			return newtonmillimeter;
		}

		public void setNewtonmillimeter(double newtonmillimeter) {
			this.newtonmillimeter = newtonmillimeter;
		}

		public double getKilonewtonmeter() {
			return kilonewtonmeter;
		}

		public void setKilonewtonmeter(double kilonewtonmeter) {
			this.kilonewtonmeter = kilonewtonmeter;
		}

		public double getDynemeter() {
			return dynemeter;
		}

		public void setDynemeter(double dynemeter) {
			this.dynemeter = dynemeter;
		}

		public double getDynecentimeter() {
			return dynecentimeter;
		}

		public void setDynecentimeter(double dynecentimeter) {
			this.dynecentimeter = dynecentimeter;
		}

		public double getDynemillimeter() {
			return dynemillimeter;
		}

		public void setDynemillimeter(double dynemillimeter) {
			this.dynemillimeter = dynemillimeter;
		}

		public double getKilogramforcemeter() {
			return kilogramforcemeter;
		}

		public void setKilogramforcemeter(double kilogramforcemeter) {
			this.kilogramforcemeter = kilogramforcemeter;
		}

		public double getKilogramforcecentimeter() {
			return kilogramforcecentimeter;
		}

		public void setKilogramforcecentimeter(double kilogramforcecentimeter) {
			this.kilogramforcecentimeter = kilogramforcecentimeter;
		}

		public double getKilogramforcemillimeter() {
			return kilogramforcemillimeter;
		}

		public void setKilogramforcemillimeter(double kilogramforcemillimeter) {
			this.kilogramforcemillimeter = kilogramforcemillimeter;
		}

		public double getGramforcemeter() {
			return gramforcemeter;
		}

		public void setGramforcemeter(double gramforcemeter) {
			this.gramforcemeter = gramforcemeter;
		}

		public double getGramforcecentimeter() {
			return gramforcecentimeter;
		}

		public void setGramforcecentimeter(double gramforcecentimeter) {
			this.gramforcecentimeter = gramforcecentimeter;
		}

		public double getGramforcemillimeter() {
			return gramforcemillimeter;
		}

		public void setGramforcemillimeter(double gramforcemillimeter) {
			this.gramforcemillimeter = gramforcemillimeter;
		}

		public double getOunceforcefoot() {
			return ounceforcefoot;
		}

		public void setOunceforcefoot(double ounceforcefoot) {
			this.ounceforcefoot = ounceforcefoot;
		}

		public double getOunceforceinch() {
			return ounceforceinch;
		}

		public void setOunceforceinch(double ounceforceinch) {
			this.ounceforceinch = ounceforceinch;
		}

		public double getPoundforcefoot() {
			return poundforcefoot;
		}

		public void setPoundforcefoot(double poundforcefoot) {
			this.poundforcefoot = poundforcefoot;
		}

		public double getPoundforceinch() {
			return poundforceinch;
		}

		public void setPoundforceinch(double poundforceinch) {
			this.poundforceinch = poundforceinch;
		}
}
	}
