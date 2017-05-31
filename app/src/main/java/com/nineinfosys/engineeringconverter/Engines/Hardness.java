package com.nineinfosys.engineeringconverter.Engines;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Hardness {

	private double germandegrees,partspermillion,americandegrees,clarkdegrees,frenchdegrees,millieqv ,milligramspergallon;

	private double edtValue;
	private String conversionFrom;
	
	public Hardness(String conversionFrom, double edtValue) {
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	
	public ArrayList<ConversionResults> calculateHardnessConversions()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
		switch(conversionFrom)
		{
		    case "German Degrees - °g":
		    	
		    	germandegrees=(edtValue)*1;
		    	partspermillion=(edtValue)*17.857142857142858;
		    	americandegrees=(edtValue)*1.0446046171524077;
		    	clarkdegrees=(edtValue)*1.25;
		    	frenchdegrees=(edtValue)*1.7857142857142856;
		    	millieqv=(edtValue)*0.3568242640499554;
		    	milligramspergallon=(edtValue)*67.56756756756756;
		    	
		break;
            case "Parts/million - p/million":
		    	
		    	germandegrees=(edtValue)*0.056;
		    	partspermillion=(edtValue)*1;
		    	americandegrees=(edtValue)*0.058497858560534834;
		    	clarkdegrees=(edtValue)*0.06999999999999999;
		    	frenchdegrees=(edtValue)*0.09999999999999999;
		    	millieqv=(edtValue)*0.019982158786797502;
		    	milligramspergallon=(edtValue)*3.7837837837837838;
		    	
		     break;
		
  case "American Degrees - °a":
  	
  	germandegrees=(edtValue)*0.9573;
  	partspermillion=(edtValue)*17.09464285714286;
  	americandegrees=(edtValue)*1;
  	clarkdegrees=(edtValue)*1.196625;
  	frenchdegrees=(edtValue)*1.7094642857142857;
  	millieqv=(edtValue)*0.3415878679750223;
  	milligramspergallon=(edtValue)*64.68243243243244;
  	
break; 

  case "Clark Degrees - °c":
	  	
	  	germandegrees=(edtValue)*0.8;
	  	partspermillion=(edtValue)*14.285714285714286;
	  	americandegrees=(edtValue)*0.8356836937219263;
	  	clarkdegrees=(edtValue)*1;
	  	frenchdegrees=(edtValue)*1.4285714285714286;
	  	millieqv=(edtValue)*0.2854594112399643;
	  	milligramspergallon=(edtValue)*54.054054054054056;
	  	
	break; 
	
  case "French Degrees - °f":
	  	
	  	germandegrees=(edtValue)*0.56;
	  	partspermillion=(edtValue)*10;
	  	americandegrees=(edtValue)*0.5849785856053484;
	  	clarkdegrees=(edtValue)*0.70000000000000001;
	  	frenchdegrees=(edtValue)*1;
	  	millieqv=(edtValue)*0.19982158786797502;
	  	milligramspergallon=(edtValue)*37.83783783783784;
	  	
	break; 
	
  case "Millieqv - millieqv":
	  	
	  	germandegrees=(edtValue)*2.8025;
	  	partspermillion=(edtValue)*50.04464285714286;
	  	americandegrees=(edtValue)*2.927504439569623;
	  	clarkdegrees=(edtValue)*3.5031250000000000003;
	  	frenchdegrees=(edtValue)*5.004464285714286;
	  	millieqv=(edtValue)*1;
	  	milligramspergallon=(edtValue)*189.35810810810813;
	  	
	break; 
	
	
  case "Milli Grams/gallon - mgr/gal":
	  	
	  	germandegrees=(edtValue)*0.0148;
	  	partspermillion=(edtValue)*0.2642857142857143;
	  	americandegrees=(edtValue)*0.015460148333855636;
	  	clarkdegrees=(edtValue)*0.0185;
	  	frenchdegrees=(edtValue)*0.026428571428571426;
	  	millieqv=(edtValue)*0.0052809991079393395;
	  	milligramspergallon=(edtValue)*1;
	  	
	break; 
		}
		
		
		
			 results.setGermandegrees(germandegrees);

			 results.setPartspermillion(partspermillion);
			 results.setAmericandegrees(americandegrees);
			 results.setClarkdegrees(clarkdegrees);
			 results.setFrenchdegrees(frenchdegrees);
			 results.setMillieqv(millieqv);
			 results.setMilligramspergallon(milligramspergallon);
			  converterArray.add(results);
			    return converterArray;
			    
		
    } 
	
	
	public class ConversionResults{
		
		
		private double germandegrees,partspermillion,americandegrees,clarkdegrees,frenchdegrees,millieqv ,milligramspergallon;

		public double getGermandegrees() {
			return germandegrees;
		}

		public void setGermandegrees(double germandegrees) {
			this.germandegrees = germandegrees;
		}

		public double getPartspermillion() {
			return partspermillion;
		}

		public void setPartspermillion(double partspermillion) {
			this.partspermillion = partspermillion;
		}

		public double getAmericandegrees() {
			return americandegrees;
		}

		public void setAmericandegrees(double americandegrees) {
			this.americandegrees = americandegrees;
		}

		public double getClarkdegrees() {
			return clarkdegrees;
		}

		public void setClarkdegrees(double clarkdegrees) {
			this.clarkdegrees = clarkdegrees;
		}

		public double getFrenchdegrees() {
			return frenchdegrees;
		}

		public void setFrenchdegrees(double frenchdegrees) {
			this.frenchdegrees = frenchdegrees;
		}

		public double getMillieqv() {
			return millieqv;
		}

		public void setMillieqv(double millieqv) {
			this.millieqv = millieqv;
		}

		public double getMilligramspergallon() {
			return milligramspergallon;
		}

		public void setMilligramspergallon(double milligramspergallon) {
			this.milligramspergallon = milligramspergallon;
		}
		
		
	}
	
	public static class HardnessConverterMain {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Hardness iA = new Hardness("americandegrees",1);
			
			ArrayList<ConversionResults> results = iA.calculateHardnessConversions();
			int length = results.size();




			for(int i = 0; i <length; i++){

				Hardness.ConversionResults item  =  results.get(i);
				
			System.out.println("\n germandegrees - " +new DecimalFormat("##.################").format( item.getGermandegrees())
				
					+"\n partspermillion - " +new DecimalFormat("##.################").format( item.getPartspermillion())
					+"\n americandegrees - " +new DecimalFormat("##.################").format( item.getAmericandegrees())
					+"\n clarkdegrees - " +new DecimalFormat("##.################").format( item.getClarkdegrees())
					+"\n frenchdegrees - " +new DecimalFormat("##.################").format( item.getFrenchdegrees())
					+"\n millieqv - " +new DecimalFormat("##.################").format( item.getMillieqv())
					+"\n milligramspergallon - " +new DecimalFormat("##.################").format( item.getMilligramspergallon())
					
					
					);
			

	
			}
		}
		}


}




