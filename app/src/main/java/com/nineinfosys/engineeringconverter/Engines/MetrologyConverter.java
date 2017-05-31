package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;


public class MetrologyConverter {
    private double angstrom,surfaceMicroinch,microns,lightbands ,precisiontenths,closetolthousands,milimeters,usInches;

    private double edtValue;
    private String conversionFrom;

    public MetrologyConverter(String conversionFrom, int edtValue) {
        // TODO Auto-generated constructor stub
        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }
    public ArrayList<ConversionResults> calculatemetrologyConversions()
    {

        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();

        switch(conversionFrom)
        {
            case "Angstrom - angstrom" :

                angstrom=(edtValue)*1;
                surfaceMicroinch=(edtValue)*0.003937007874075748;
                microns=(edtValue)*0.1;
                lightbands=(edtValue)*3.4042553191489364E-4;
                precisiontenths=(edtValue)*3.937007874015748E-5;
                closetolthousands=(edtValue)*3.937007874015748E-6;
                milimeters=(edtValue)*1.0E-7;
                usInches=(edtValue)*3.937007874015748E-9;

                break;



            case "Surface Microinch - µin":

                angstrom=(edtValue)*254;
                surfaceMicroinch=(edtValue)*1;
                microns=(edtValue)*25.4;
                lightbands=(edtValue)*0.08646808510638297;
                precisiontenths=(edtValue)*0.01;
                closetolthousands=(edtValue)*0.001;
                milimeters=(edtValue)*2.54E-5;
                usInches=(edtValue)*1.0E-6;

                break;


            case "Surface microns - microns":

                angstrom=(edtValue)*10;
                surfaceMicroinch=(edtValue)*0.03937007874075748;
                microns=(edtValue)*1;
                lightbands=(edtValue)*0.003404255319148936;
                precisiontenths=(edtValue)*3.937007874015748E-4;
                closetolthousands=(edtValue)*3.937007874015748E-5;
                milimeters=(edtValue)*1.0E-6;
                usInches=(edtValue)*3.937007874015748E-8;

                break;


            case "Light bands - lightbands":

                angstrom=(edtValue)*2937.5;
                surfaceMicroinch=(edtValue)*11.56496062992126;
                microns=(edtValue)*293.75;
                lightbands=(edtValue)*1;
                precisiontenths=(edtValue)*0.1156496062992126;
                closetolthousands=(edtValue)*0.01156496062992126;
                milimeters=(edtValue)*2.9375E-4;
                usInches=(edtValue)*1.156496062992126E-5;

                break;

            case "Precision tenths - precision tenths":

                angstrom=(edtValue)*25400;
                surfaceMicroinch=(edtValue)*100;
                microns=(edtValue)*2540;
                lightbands=(edtValue)*8.646808510638298;
                precisiontenths=(edtValue)*1;
                closetolthousands=(edtValue)*0.1;
                milimeters=(edtValue)*0.00254;
                usInches=(edtValue)*1.0E-4;

                break;

            case "Close tol.thousands - closetolthousands":

                angstrom=(edtValue)*254000;
                surfaceMicroinch=(edtValue)*1000;
                microns=(edtValue)*25400;
                lightbands=(edtValue)*86.46808510638297;
                precisiontenths=(edtValue)*10;
                closetolthousands=(edtValue)*1;
                milimeters=(edtValue)*0.0254;
                usInches=(edtValue)*0.001;

                break;

            case "Metric millimeters - metric mm":

                angstrom=(edtValue)*1.0E7;
                surfaceMicroinch=(edtValue)*39370.07874015748;
                microns=(edtValue)*1000000;
                lightbands=(edtValue)*3404.255319148936;
                precisiontenths=(edtValue)*393.7007874015748;
                closetolthousands=(edtValue)*39.37007874015748;
                milimeters=(edtValue)*1;
                usInches=(edtValue)*0.03937007874015748;

                break;

            case "U.S.Inches - usInches":

                angstrom=(edtValue)*2.54E8;
                surfaceMicroinch=(edtValue)*1000000;
                microns=(edtValue)*2.54E7;
                lightbands=(edtValue)*86468.08510638298;
                precisiontenths=(edtValue)*10000;
                closetolthousands=(edtValue)*1000;
                milimeters=(edtValue)*25.4;
                usInches=(edtValue)*1;

                break;
        }



        results.setAngstrom(angstrom);

        results.setSurfaceMicroinch(surfaceMicroinch);
        results.setMicrons(microns);
        results.setLightbands(lightbands);
        results.setPrecisiontenths(precisiontenths);
        results.setClosetolthousands(closetolthousands);
        results.setMilimeters(milimeters);
        results.setUsInches(usInches);
        converterArray.add(results);
        return converterArray;


    }


    public class ConversionResults{
        private double angstrom,surfaceMicroinch,microns,lightbands ,precisiontenths,closetolthousands,milimeters,usInches;

        public double getAngstrom() {
            return angstrom;
        }

        public void setAngstrom(double angstrom) {
            this.angstrom = angstrom;
        }

        public double getSurfaceMicroinch() {
            return surfaceMicroinch;
        }

        public void setSurfaceMicroinch(double surfaceMicroinch) {
            this.surfaceMicroinch = surfaceMicroinch;
        }

        public double getMicrons() {
            return microns;
        }

        public void setMicrons(double microns) {
            this.microns = microns;
        }

        public double getLightbands() {
            return lightbands;
        }

        public void setLightbands(double lightbands) {
            this.lightbands = lightbands;
        }

        public double getPrecisiontenths() {
            return precisiontenths;
        }

        public void setPrecisiontenths(double precisiontenths) {
            this.precisiontenths = precisiontenths;
        }

        public double getClosetolthousands() {
            return closetolthousands;
        }

        public void setClosetolthousands(double closetolthousands) {
            this.closetolthousands = closetolthousands;
        }

        public double getMilimeters() {
            return milimeters;
        }

        public void setMilimeters(double milimeters) {
            this.milimeters = milimeters;
        }

        public double getUsInches() {
            return usInches;
        }

        public void setUsInches(double usInches) {
            this.usInches = usInches;
        }



    }

  /*  public static class MetrologyConverterMain {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Metrology iA = new Metrology("angstrom",1);

            ArrayList<Metrology.ConversionResults> results = iA.calculatemetrologyConversions();
            int length = results.size();




            for(int i = 0; i <length; i++){

                Metrology.ConversionResults item  =  results.get(i);

                System.out.println("\n angstrom - " +new DecimalFormat("##.################").format( item.getAngstrom())+
                        "\n surfaceMicroinch - " +new DecimalFormat("##.################").format( item.getSurfaceMicroinch())
                        +	"\n microns - " +new DecimalFormat("##.################").format( item.getMicrons())+
                        "\n lightbands - " +new DecimalFormat("##.################").format( item.getLightbands())
                        +
                        "\n precisiontenths - " +new DecimalFormat("##.################").format( item.getPrecisiontenths())

                        +"\n closetolthousands - " +new DecimalFormat("##.################").format( item.getClosetolthousands())

                        +"\n milimeters - " +new DecimalFormat("##.################").format( item.getMilimeters())

                        +"\n usInches - " +new DecimalFormat("##.################").format( item.getUsInches()));

            }
        }
    }

*/
}

