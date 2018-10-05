
package exercise.metric.conversions;


public class MetricConversions {
    
    
    public MetricConversions(int ammount, String convertFromUnit, String convertToUnit){
        
        convertFromUnit=convertFromUnit.toLowerCase();
        
        switch(convertFromUnit){
            case "kilometre":
            case "mile":
            case "metre":
            case "feet":
            case "centimetre": lengthConversion(ammount, convertFromUnit,convertToUnit); break;
            case "kilogram":
            case "gram":
            case "pound":  massConversion(ammount, convertFromUnit,convertToUnit); break;
            case "litre":
            case "gallon":
            case "ounce":  volumeConversion(ammount, convertFromUnit,convertToUnit); break;
            default: System.out.println("default"); break;
        }
    }
    
    
    public void lengthConversion(int amount, String convertFromUnit, String convertToUnit){
    
        switch(convertFromUnit){
            case "kilometre": 
                switch(convertToUnit){
                    case "metre": System.out.println("There are "+(amount*1000)+" meters in "+amount+" "+convertFromUnit); break;
                    case "centimetre": System.out.println("There are "+(amount*100000)+" centimeters in "+amount+" "+convertFromUnit);break;
                    case "mile": System.out.println("There are "+(amount*0.621371)+" miles in "+amount+" "+convertFromUnit);break;
                    case "feet": System.out.println("There are "+(amount*3280.84)+" feet in "+amount+" "+convertFromUnit);break;
                    default: System.out.println("Cannot convert from kilometer into "+convertToUnit); break;} break;
            case "mile": 
                switch(convertToUnit){
                    case "metre": System.out.println("There are "+(amount*1609.344)+" meters in "+amount+" "+convertFromUnit); break;
                    case "centimetre": System.out.println("There are "+(amount*160934.4)+" centimeters in "+amount+" "+convertFromUnit);break;
                    case "kilometre": System.out.println("There are "+(amount*1.609)+" kilometers in "+amount+" "+convertFromUnit);break;
                    case "feet": System.out.println("There are "+(amount*5280)+" feet in "+amount+" "+convertFromUnit);break;
                    default: System.out.println("Cannot convert from mile into "+convertToUnit); break;}break;
            case "metre": 
                switch(convertToUnit){
                    case "mile": System.out.println("There are "+(amount/1609.344)+" miles in "+amount+" "+convertFromUnit); break;
                    case "centimetre": System.out.println("There are "+(amount*100)+" centimeters in "+amount+" "+convertFromUnit);break;
                    case "kilometre": System.out.println("There are "+(amount*1000)+" kilometers in "+amount+" "+convertFromUnit);break;
                    case "feet": System.out.println("There are "+(amount/3.281)+" feet in "+amount+" "+convertFromUnit);break;
                    default: System.out.println("Cannot convert from meter into "+convertToUnit); break;}break;
            case "feet": 
                switch(convertToUnit){
                    case "mile": System.out.println("There are "+(amount/5280)+" miles in "+amount+" "+convertFromUnit); break;
                    case "centimetre": System.out.println("There are "+(amount*30.48)+" centimeters in "+amount+" "+convertFromUnit);break;
                    case "kilometre": System.out.println("There are "+(amount/3280.84)+" kilometers in "+amount+" "+convertFromUnit);break;
                    case "metre": System.out.println("There are "+(amount/3.281)+" meters in "+amount+" "+convertFromUnit);break;
                    default: System.out.println("Cannot convert from feet into "+convertToUnit); break;}break;
            case "centimetre": 
                switch(convertToUnit){
                    case "mile": System.out.println("There are "+(amount/160934.4)+" miles in "+amount+" "+convertFromUnit); break;
                    case "feet": System.out.println("There are "+(amount/30.48)+" feet in "+amount+" "+convertFromUnit);break;
                    case "kilometre": System.out.println("There are "+(amount/100000)+" kilometers in "+amount+" "+convertFromUnit);break;
                    case "metre": System.out.println("There are "+(amount/100)+" meters in "+amount+" "+convertFromUnit);break;
                    default: System.out.println("Cannot convert from centimeters into "+convertToUnit); break;} break;
        } 
    } 
    
    public void massConversion(int amount, String convertFromUnit, String convertToUnit){
    
        switch(convertFromUnit){
            case "kilogram": 
                switch (convertToUnit){
                    case "gram":    System.out.println("There are "+(amount*1000)+" grams in "+amount+" "+convertFromUnit); break;
                    case "pound":   System.out.println("There are "+(amount/2.205)+" pounds in "+amount+" "+convertFromUnit); break;
                    default: System.out.println("Cannot convert from kilograms into "+convertToUnit); break;} break;
            case "gram": 
                switch (convertToUnit){
                    case "kilogram":    System.out.println("There are "+(amount*1000)+" kilograms in "+amount+" "+convertFromUnit); break;
                    case "pound":   System.out.println("There are "+(amount/453.592)+" pounds in "+amount+" "+convertFromUnit); break;
                    default: System.out.println("Cannot convert from grams into "+convertToUnit); break;} break;      
            case "pound": 
                switch (convertToUnit){
                    case "kilogram":    System.out.println("There are "+(amount/2.205)+" kilograms in "+amount+" "+convertFromUnit); break;
                    case "gram":   System.out.println("There are "+(amount*453.592)+" grams in "+amount+" "+convertFromUnit); break;
                    default: System.out.println("Cannot convert from grams into "+convertToUnit); break;} break;            
                }        
    } 
    
    public void volumeConversion(int amount, String convertFromUnit, String convertToUnit){
    
         switch(convertFromUnit){
            case "litre":
                switch (convertToUnit){
                    case "gallon":    System.out.println("There are "+(amount/4.546)+" liters in "+amount+" "+convertFromUnit); break;
                    case "ounce":   System.out.println("There are "+(amount*33.814)+" ounce in "+amount+" "+convertFromUnit); break;
                    default: System.out.println("Cannot convert from leters into "+convertToUnit); break;} break;    
            case "gallon":
                switch (convertToUnit){
                    case "litre":    System.out.println("There are "+(amount*4.546)+" liters in "+amount+" "+convertFromUnit); break;
                    case "ounce":   System.out.println("There are "+(amount*153.722)+" ounce in "+amount+" "+convertFromUnit); break;
                    default: System.out.println("Cannot convert from leters into "+convertToUnit); break;} break;
            case "ounce":
                switch (convertToUnit){
                    case "gallon":    System.out.println("There are "+(amount/160)+" liters in "+amount+" "+convertFromUnit); break;
                    case "litre":   System.out.println("There are "+(amount/35.195)+" ounce in "+amount+" "+convertFromUnit); break;
                    default: System.out.println("Cannot convert from leters into "+convertToUnit); break;} break;
         }
        
    } 

}
