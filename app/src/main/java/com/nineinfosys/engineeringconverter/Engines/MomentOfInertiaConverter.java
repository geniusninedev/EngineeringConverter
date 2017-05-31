package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;

;


public class MomentOfInertiaConverter {

	private double kilosqmt,kilosqcm,kilosqmm,gmsqcm,gmsqmm,kilogmforcemt,kilogramforcecm,ouncesqinch,ounceforceinch,poundsqfoot,poundforcefoot,poundsqinch,poundforceinch,slugsqfoot;
	private double edtValue;
	private String conversionFrom;
	
			
	

	public MomentOfInertiaConverter(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			

			public ArrayList<ConversionResults> calculateinertiaConversion()
			
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				
				{
				
				case "Kilogram square meter -kg*M^2":
					
					kilosqmt=(edtValue)*1;
					kilosqcm=(edtValue)*10000;
					kilosqmm=(edtValue)*1000000;
					gmsqcm=(edtValue)*10000000;
					gmsqmm=(edtValue)*1000000000;
					kilogmforcemt=(edtValue)*0.1019716213;
					kilogramforcecm=(edtValue)*10.19716213;
					ouncesqinch=(edtValue)*54674.74983;
					ounceforceinch=(edtValue)*141.6119312;
					poundsqfoot=(edtValue)*23.730360404;
					poundforcefoot=(edtValue)*0.7375621419;
					poundsqinch=(edtValue)*3417.1718982;
					poundforceinch=(edtValue)*8.850745703;
					slugsqfoot=(edtValue)*0.7375621419;
					
					
					
					 break;
                  case "Kilogram square centimeter -kg*cm^2":
					
					kilosqmt=(edtValue)*0.0001;
					kilosqcm=(edtValue)*1;
					kilosqmm=(edtValue)*100;
					gmsqcm=(edtValue)*1000;
					gmsqmm=(edtValue)*100000;
					kilogmforcemt=(edtValue)*0.0000101972;
					kilogramforcecm=(edtValue)*0.0010197162;
					ouncesqinch=(edtValue)*5.467474983;
					ounceforceinch=(edtValue)*0.0141611931;
					poundsqfoot=(edtValue)*0.002373036;
					poundforcefoot=(edtValue)*0.0000737562;
					poundsqinch=(edtValue)*0.3417171898;
					poundforceinch=(edtValue)*0.0008850746;
					slugsqfoot=(edtValue)*0.0000737562;
					
					
					
					 break;
                case "Kilogram square millimeter -kg*mm^2":
	
	kilosqmt=(edtValue)*0.000001;
	kilosqcm=(edtValue)*0.01;
	kilosqmm=(edtValue)*1;
	gmsqcm=(edtValue)*10;
	gmsqmm=(edtValue)*1000;
	kilogmforcemt=(edtValue)*1.019716213E-7;
	kilogramforcecm=(edtValue)*0.0000101972;
	ouncesqinch=(edtValue)*0.0546747498;
	ounceforceinch=(edtValue)*0.0001416119;
	poundsqfoot=(edtValue)*0.0000237304;
	poundforcefoot=(edtValue)*7.375621419E-7;
	poundsqinch=(edtValue)*0.0034171719;
	poundforceinch=(edtValue)*0.0000088507;
	slugsqfoot=(edtValue)*7.375621419E-7;
	
	
	
	 break;
case "Gram square centimeter -g*cm^2":
	
	kilosqmt=(edtValue)*1.E-7;
	kilosqcm=(edtValue)*0.001;
	kilosqmm=(edtValue)*0.1;
	gmsqcm=(edtValue)*1;
	gmsqmm=(edtValue)*100;
	kilogmforcemt=(edtValue)*1.019716213E-8;
	kilogramforcecm=(edtValue)*0.0000010197;
	ouncesqinch=(edtValue)*0.005467475;
	ounceforceinch=(edtValue)*0.0000141612;
	poundsqfoot=(edtValue)*0.000002373;
	poundforcefoot=(edtValue)*7.375621419E-8;
	poundsqinch=(edtValue)*0.0003417172;
	poundforceinch=(edtValue)*8.850745703E-7;
	slugsqfoot=(edtValue)*7.375621419E-8;
	
	
	
	 break;
case "Gram square millimeter -g*mm^2":
	
	kilosqmt=(edtValue)*1.E-9;
	kilosqcm=(edtValue)*0.00001;
	kilosqmm=(edtValue)*0.001;
	gmsqcm=(edtValue)*0.01;
	gmsqmm=(edtValue)*1;
	kilogmforcemt=(edtValue)*1.019716213E-10;
	kilogramforcecm=(edtValue)*1.019716213E-8;
	ouncesqinch=(edtValue)*0.0000546747;
	ounceforceinch=(edtValue)*1.416119312E-7;
	poundsqfoot=(edtValue)*2.37303604E-8;
	poundforcefoot=(edtValue)*7.375621419E-10;
	poundsqinch=(edtValue)*0.0000034172;
	poundforceinch=(edtValue)*8.850745703E-9;
	slugsqfoot=(edtValue)*7.375621419E-10;
	
	
	
	 break;
case "Kilogram-force meter square second -kgfM*s^2":
	
	kilosqmt=(edtValue)*9.8066499998;
	kilosqcm=(edtValue)*98066.499998;
	kilosqmm=(edtValue)*9806649.9998;
	gmsqcm=(edtValue)*98066499.998;
	gmsqmm=(edtValue)*9806649999.8;
	kilogmforcemt=(edtValue)*1;
	kilogramforcecm=(edtValue)*100;
	ouncesqinch=(edtValue)*536176.13541;
	ounceforceinch=(edtValue)*1388.7386451;
	poundsqfoot=(edtValue)*232.71533885;
	poundforcefoot=(edtValue)*7.2330137787;
	poundsqinch=(edtValue)*33511.008795;
	poundforceinch=(edtValue)*86.796165346;
	slugsqfoot=(edtValue)*7.2330137787;
	
	
	
	 break;
case "Kilogram-force centimeter square second -kgfcm*s^2":
	
	kilosqmt=(edtValue)*0.0980665;
	kilosqcm=(edtValue)*980.66499998;
	kilosqmm=(edtValue)*98066.499998;
	gmsqcm=(edtValue)*980664.99998;
	gmsqmm=(edtValue)*98066499.998;
	kilogmforcemt=(edtValue)*0.01;
	kilogramforcecm=(edtValue)*1;
	ouncesqinch=(edtValue)*5361.7613541;
	ounceforceinch=(edtValue)*13.887386451;
	poundsqfoot=(edtValue)*2.3271533885;
	poundforcefoot=(edtValue)*0.0723301378;
	poundsqinch=(edtValue)*335.11008795;
	poundforceinch=(edtValue)*0.8679616535;
	slugsqfoot=(edtValue)*0.0723301378;
	
	
	
	 break;
case "Ounce square inch -oz*in^2":
	
	kilosqmt=(edtValue)*0.00001829;
	kilosqcm=(edtValue)*0.1828997852;
	kilosqmm=(edtValue)*18.28997852;
	gmsqcm=(edtValue)*182.8997852;
	gmsqmm=(edtValue)*18289.97852;
	kilogmforcemt=(edtValue)*0.0000018651;
	kilogramforcecm=(edtValue)*0.0001865059;
	ouncesqinch=(edtValue)*1;
	ounceforceinch=(edtValue)*0.0025900792;
	poundsqfoot=(edtValue)*0.0004340278;
	poundforcefoot=(edtValue)*0.00001349;
	poundsqinch=(edtValue)*0.0625000006;
	poundforceinch=(edtValue)*0.0001618799;
	slugsqfoot=(edtValue)*0.00001349;
	
	
	
	 break;
case "Ounce-force inch sq. second -ozfin*s^2":
	
	kilosqmt=(edtValue)*0.0070615519;
	kilosqcm=(edtValue)*70.615518871;
	kilosqmm=(edtValue)*7061.5518871;
	gmsqcm=(edtValue)*70615.518871;
	gmsqmm=(edtValue)*7061551.8871;
	kilogmforcemt=(edtValue)*0.0007200779;
	kilogramforcecm=(edtValue)*0.0720077895;
	ouncesqinch=(edtValue)*386.08858284;
	ounceforceinch=(edtValue)*1;
	poundsqfoot=(edtValue)*0.1675731713;
	poundforcefoot=(edtValue)*0.0052083333;
	poundsqinch=(edtValue)*24.130536666;
	poundforceinch=(edtValue)*0.0625;
	slugsqfoot=(edtValue)*0.0052083333;
	
	
	
	 break;
case "Pound square foot -lb*ft^2":
	
	kilosqmt=(edtValue)*0.0421401101;
	kilosqcm=(edtValue)*421.40110094;
	kilosqmm=(edtValue)*42140.110094;
	gmsqcm=(edtValue)*421401.10094;
	gmsqmm=(edtValue)*42140110.094;
	kilogmforcemt=(edtValue)*0.0042970953;
	kilogramforcecm=(edtValue)*0.4297095348;
	ouncesqinch=(edtValue)*2303.9999772;
	ounceforceinch=(edtValue)*5.9675423714;
	poundsqfoot=(edtValue)*1;
	poundforcefoot=(edtValue)*0.0310809499;
	poundsqinch=(edtValue)*144;
	poundforceinch=(edtValue)*0.3729713983;
	slugsqfoot=(edtValue)*0.0310809499;
	
	
	
	 break;
case "Pound-force foot sq. second -lbfft*s^2":
	
	kilosqmt=(edtValue)*1.3558179619;
	kilosqcm=(edtValue)*13558.179619;
	kilosqmm=(edtValue)*1355817.9619;
	gmsqcm=(edtValue)*13558179.619;
	gmsqmm=(edtValue)*1355817961.9;
	kilogmforcemt=(edtValue)*0.1382549558;
	kilogramforcecm=(edtValue)*13.825495576;
	ouncesqinch=(edtValue)*74129.007881;
	ounceforceinch=(edtValue)*191.99999994;
	poundsqfoot=(edtValue)*32.174048878;
	poundforcefoot=(edtValue)*1;
	poundsqinch=(edtValue)*4633.0630385;
	poundforceinch=(edtValue)*12;
	slugsqfoot=(edtValue)*1;
	
	
	
	 break;
case "Pound square inch -lb*in^2":
	
	kilosqmt=(edtValue)*0.0002926397;
	kilosqcm=(edtValue)*2.9263965343;
	kilosqmm=(edtValue)*292.63965343;
	gmsqcm=(edtValue)*2926.3965343;
	gmsqmm=(edtValue)*292639.65343;
	kilogmforcemt=(edtValue)*0.0000298409;
	kilogramforcecm=(edtValue)*0.002984094;
	ouncesqinch=(edtValue)*15.999999842;
	ounceforceinch=(edtValue)*0.0414412665;
	poundsqfoot=(edtValue)*0.0069444444;
	poundforcefoot=(edtValue)*0.0002158399;
	poundsqinch=(edtValue)*1;
	poundforceinch=(edtValue)*0.0025900792;
	slugsqfoot=(edtValue)*0.0002158399;
	
	
	
	 break;
case "Pound-force inch sq. second -lbfin*s^2":
	
	kilosqmt=(edtValue)*0.1129848302;
	kilosqcm=(edtValue)*1129.8483016;
	kilosqmm=(edtValue)*112984.83016;
	gmsqcm=(edtValue)*1129848.3016;
	gmsqmm=(edtValue)*112984830.16;
	kilogmforcemt=(edtValue)*0.0115212463;
	kilogramforcecm=(edtValue)*1.1521246313;
	ouncesqinch=(edtValue)*6177.4173233;
	ounceforceinch=(edtValue)*15.999999995;
	poundsqfoot=(edtValue)*2.6811707398;
	poundforcefoot=(edtValue)*0.0833333333;
	poundsqinch=(edtValue)*386.08858653;
	poundforceinch=(edtValue)*1;
	slugsqfoot=(edtValue)*0.0833333333;
	
	
	
	 break;
	 
case "Slug square foot -slug*ft^2":
	
	kilosqmt=(edtValue)*1.3558179619;
	kilosqcm=(edtValue)*13558.179619;
	kilosqmm=(edtValue)*1355817.9619;
	gmsqcm=(edtValue)*13558179.619;
	gmsqmm=(edtValue)*1355817961.9;
	kilogmforcemt=(edtValue)*0.1382549558;
	kilogramforcecm=(edtValue)*13.825495576;
	ouncesqinch=(edtValue)*74129.007881;
	ounceforceinch=(edtValue)*191.99999994;
	poundsqfoot=(edtValue)*32.174048878;
	poundforcefoot=(edtValue)*1;
	poundsqinch=(edtValue)*4633.0630385;
	poundforceinch=(edtValue)*12;
	slugsqfoot=(edtValue)*1;
	
	
	
	 break;
	 
				
				}
				    results.setKilosqmt(kilosqmt);
	    	         results.setKilosqcm(kilosqcm);
	    	         results.setKilosqmm(kilosqmm); 
	    	         results.setGmsqcm(gmsqcm);
	    	         results.setGmsqmm(gmsqmm);
	    	         results.setKilogmforcemt(kilogmforcemt);
	    	         results.setKilogramforcecm(kilogramforcecm);
	    	         results.setOuncesqinch(ouncesqinch); 
	    	         results.setOunceforceinch(ounceforceinch);
	    	         results.setPoundsqfoot(poundsqfoot);
	    	         results.setPoundforcefoot(poundforcefoot);
	    	         results.setPoundsqinch(poundsqinch);
	    	         results.setPoundforceinch(poundforceinch); 
	    	         results.setSlugsqfoot(slugsqfoot);
	    	        
	    	        
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
						  
						  private double kilosqmt,kilosqcm,kilosqmm,gmsqcm,gmsqmm,kilogmforcemt,kilogramforcecm,ouncesqinch,ounceforceinch,poundsqfoot,poundforcefoot,poundsqinch,poundforceinch,slugsqfoot;

						public double getKilosqmt() {
							return kilosqmt;
						}

						public void setKilosqmt(double kilosqmt) {
							this.kilosqmt = kilosqmt;
						}

						public double getKilosqcm() {
							return kilosqcm;
						}

						public void setKilosqcm(double kilosqcm) {
							this.kilosqcm = kilosqcm;
						}

						public double getKilosqmm() {
							return kilosqmm;
						}

						public void setKilosqmm(double kilosqmm) {
							this.kilosqmm = kilosqmm;
						}

						public double getGmsqcm() {
							return gmsqcm;
						}

						public void setGmsqcm(double gmsqcm) {
							this.gmsqcm = gmsqcm;
						}

						public double getGmsqmm() {
							return gmsqmm;
						}

						public void setGmsqmm(double gmsqmm) {
							this.gmsqmm = gmsqmm;
						}

						public double getKilogmforcemt() {
							return kilogmforcemt;
						}

						public void setKilogmforcemt(double kilogmforcemt) {
							this.kilogmforcemt = kilogmforcemt;
						}

						public double getKilogramforcecm() {
							return kilogramforcecm;
						}

						public void setKilogramforcecm(double kilogramforcecm) {
							this.kilogramforcecm = kilogramforcecm;
						}

						public double getOuncesqinch() {
							return ouncesqinch;
						}

						public void setOuncesqinch(double ouncesqinch) {
							this.ouncesqinch = ouncesqinch;
						}

						public double getOunceforceinch() {
							return ounceforceinch;
						}

						public void setOunceforceinch(double ounceforceinch) {
							this.ounceforceinch = ounceforceinch;
						}

						public double getPoundsqfoot() {
							return poundsqfoot;
						}

						public void setPoundsqfoot(double poundsqfoot) {
							this.poundsqfoot = poundsqfoot;
						}

						public double getPoundforcefoot() {
							return poundforcefoot;
						}

						public void setPoundforcefoot(double poundforcefoot) {
							this.poundforcefoot = poundforcefoot;
						}

						public double getPoundsqinch() {
							return poundsqinch;
						}

						public void setPoundsqinch(double poundsqinch) {
							this.poundsqinch = poundsqinch;
						}

						public double getPoundforceinch() {
							return poundforceinch;
						}

						public void setPoundforceinch(double poundforceinch) {
							this.poundforceinch = poundforceinch;
						}

						public double getSlugsqfoot() {
							return slugsqfoot;
						}

						public void setSlugsqfoot(double slugsqfoot) {
							this.slugsqfoot = slugsqfoot;
						}
						  
						 
			   			   
				  }
          }
