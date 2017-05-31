package com.nineinfosys.engineeringconverter.Engines;

import java.util.ArrayList;


public class MetricWeightConverter {
    private double microgram,milligram,centigram,decigram ,gram,dekagram,hectogram,kilogram,metricton;

    private double edtValue;
    private String conversionFrom;

    public MetricWeightConverter(String conversionFrom, int edtValue) {
        // TODO Auto-generated constructor stub
        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }

    public ArrayList<ConversionResults> calculatemetricWeightConversions()
    {

        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();

        switch(conversionFrom)
        {
            case "Microgram - µg":

                microgram=(edtValue)*1;
                milligram=(edtValue)*0.001;
                centigram=(edtValue)*1.0E-4;
                decigram=(edtValue)*1.0E-5;
                gram=(edtValue)*1.0E-6;
                dekagram=(edtValue)*1.0E-7;
                hectogram=(edtValue)*1.0E-8;
                kilogram=(edtValue)*1.0E-9;
                metricton=(edtValue)*1.0E-12;
                break;

            case "Milligram - mg":

                microgram=(edtValue)*1000;
                milligram=(edtValue)*1;
                centigram=(edtValue)*0.1;
                decigram=(edtValue)*0.01;
                gram=(edtValue)*0.001;
                dekagram=(edtValue)*1.0E-4;
                hectogram=(edtValue)*1.0E-5;
                kilogram=(edtValue)*1.0E-6;
                metricton=(edtValue)*9.999999999999999E-10;
                break;

            case "Centigram - cg":

                microgram=(edtValue)*10000;
                milligram=(edtValue)*10;
                centigram=(edtValue)*1;
                decigram=(edtValue)*0.1;
                gram=(edtValue)*0.01;
                dekagram=(edtValue)*0.001;
                hectogram=(edtValue)*1.0E-4;
                kilogram=(edtValue)*1.0E-5;
                metricton=(edtValue)*1.0E-8;
                break;
            case "Decigram - dg":

                microgram=(edtValue)*100000;
                milligram=(edtValue)*100;
                centigram=(edtValue)*10;
                decigram=(edtValue)*1;
                gram=(edtValue)*0.1;
                dekagram=(edtValue)*0.01;
                hectogram=(edtValue)*0.001;
                kilogram=(edtValue)*1.0E-4;
                metricton=(edtValue)*1.0000000000000001E-7;
                break;



            case "Gram - g":

                microgram=(edtValue)*1000000;
                milligram=(edtValue)*1000;
                centigram=(edtValue)*100;
                decigram=(edtValue)*10;
                gram=(edtValue)*1;
                dekagram=(edtValue)*0.1;
                hectogram=(edtValue)*0.01;
                kilogram=(edtValue)*0.001;
                metricton=(edtValue)*1.0E-6;
                break;


            case "Dekagram - dag":

                microgram=(edtValue)*1.0E7;
                milligram=(edtValue)*10000;
                centigram=(edtValue)*1000;
                decigram=(edtValue)*100;
                gram=(edtValue)*10;
                dekagram=(edtValue)*1;
                hectogram=(edtValue)*0.1;
                kilogram=(edtValue)*0.01;
                metricton=(edtValue)*1.0E-5;
                break;


            case "Hectogram - hg":

                microgram=(edtValue)*1.0E8;
                milligram=(edtValue)*100000;
                centigram=(edtValue)*10000;
                decigram=(edtValue)*1000;
                gram=(edtValue)*100;
                dekagram=(edtValue)*10;
                hectogram=(edtValue)*1;
                kilogram=(edtValue)*0.1;
                metricton=(edtValue)*1.0E-4;
                break;

            case "Kilogram - kg":

                microgram=(edtValue)*1.0E9;
                milligram=(edtValue)*1000000;
                centigram=(edtValue)*100000;
                decigram=(edtValue)*10000;
                gram=(edtValue)*1000;
                dekagram=(edtValue)*100;
                hectogram=(edtValue)*10;
                kilogram=(edtValue)*1;
                metricton=(edtValue)*0.001;
                break;

            case "Metricton - metricton":

                microgram=(edtValue)*1.0E12;
                milligram=(edtValue)*1.0E9;
                centigram=(edtValue)*1.0E8;
                decigram=(edtValue)*1.0E7;
                gram=(edtValue)*1000000;
                dekagram=(edtValue)*100000;
                hectogram=(edtValue)*10000;
                kilogram=(edtValue)*1000;
                metricton=(edtValue)*1;
                break;
        }



        results.setMicrogram(microgram);

        results.setMilligram(milligram);
        results.setCentigram(centigram);
        results.setDecigram(decigram);
        results.setGram(gram);
        results.setDekagram(dekagram);
        results.setHectogram(hectogram);
        results.setKilogram(kilogram);
        results.setMetricton(metricton);
        converterArray.add(results);
        return converterArray;


    }


    public class ConversionResults{
        private double microgram,milligram,centigram,decigram ,gram,dekagram,hectogram,kilogram,metricton;

        public double getMicrogram() {
            return microgram;
        }

        public void setMicrogram(double microgram) {
            this.microgram = microgram;
        }

        public double getMilligram() {
            return milligram;
        }

        public void setMilligram(double milligram) {
            this.milligram = milligram;
        }

        public double getCentigram() {
            return centigram;
        }

        public void setCentigram(double centigram) {
            this.centigram = centigram;
        }

        public double getDecigram() {
            return decigram;
        }

        public void setDecigram(double decigram) {
            this.decigram = decigram;
        }

        public double getGram() {
            return gram;
        }

        public void setGram(double gram) {
            this.gram = gram;
        }

        public double getDekagram() {
            return dekagram;
        }

        public void setDekagram(double dekagram) {
            this.dekagram = dekagram;
        }

        public double getHectogram() {
            return hectogram;
        }

        public void setHectogram(double hectogram) {
            this.hectogram = hectogram;
        }

        public double getKilogram() {
            return kilogram;
        }

        public void setKilogram(double kilogram) {
            this.kilogram = kilogram;
        }

        public double getMetricton() {
            return metricton;
        }

        public void setMetricton(double metricton) {
            this.metricton = metricton;
        }





    }

 /*   public static class MetricWeightConverterMain {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            MetricWeight iA = new MetricWeight("microgram",1);

            ArrayList<MetricWeight.ConversionResults> results = iA.calculatemetricWeightConversions();
            int length = results.size();




            for(int i = 0; i <length; i++){

                MetricWeight.ConversionResults item  =  results.get(i);

                System.out.println("\n microgram - " +new DecimalFormat("##.################").format( item.getMicrogram())
                        +"\n milligram - " +new DecimalFormat("##.################").format( item.getMilligram())
                        +"\n centigram - " +new DecimalFormat("##.################").format( item.getCentigram())
                        +"\n decigram - " +new DecimalFormat("##.################").format( item.getDecigram())
                        +"\n gram - " +new DecimalFormat("##.################").format( item.getGram())
                        +"\n dekagram - " +new DecimalFormat("##.################").format( item.getDekagram())
                        +"\n hectogram - " +new DecimalFormat("##.################").format( item.getHectogram())
                        +"\n kilogram - " +new DecimalFormat("##.################").format( item.getKilogram())

                        +"\n metricton - " +new DecimalFormat("##.################").format( item.getMetricton())
                );



            }
        }
    }

*/
}



