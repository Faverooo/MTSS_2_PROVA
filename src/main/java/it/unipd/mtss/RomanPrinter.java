////////////////////////////////////////////////////////////////////
// Marco Favero 2101071
// Angelica Gastaldello 2111003
////////////////////////////////////////////////////////////////////
package it.unipd.mtss; 
import java.util.HashMap;  

public class RomanPrinter{ 
    public static String print(int num){ 
        return printAsciiArt(IntegerToRoman.convert(num));
    } 
 
    private static String printAsciiArt(String romanNumber) { 
        if(romanNumber == "errore: numeri solo tra 1 e 1000"){
            System.out.println(romanNumber);
            return romanNumber;
        }
            
        HashMap<String, String[]> mappaLettere = new HashMap<String, String[]>(); 
        mappaLettere.put("I", new String[] {" _____ ","|_   _|","  | |  ","  | |  "," _| |_ ","|_____|"});
        mappaLettere.put("V", new String[] {"__      __","\\ \\    / /"," \\ \\  / / ","  \\ \\/ /  ","   \\  /   ","    \\/    "});
        mappaLettere.put("X", new String[] {"__   __","\\ \\ / /"," \\ V / ","  > <  "," / . \\ ","/_/ \\_\\"});
        mappaLettere.put("L", new String[] {" _      ","| |     ","| |     ","| |     ","| |____ ","|______|"});
        mappaLettere.put("C", new String[] {"  _____ "," / ____|","| |     ","| |     ","| |____ "," \\_____|"});
        mappaLettere.put("D", new String[] {" _____  ","|  __ \\ ","| |  | |","| |  | |","| |__| |","|_____/ "});
        mappaLettere.put("M", new String[] {" __  __ ","|  \\/  |","| \\  / |","| |\\/| |","| |  | |","|_|  |_|"});
            
        int RNLength = romanNumber.length(); 
        String ris ="";
        
        for(int i = 0; i < 6; i++){ 
            for(int j = 0; j < RNLength; j++){ 
                String tmp = mappaLettere.get(String.valueOf(romanNumber.charAt(j)))[i];                 
                System.out.print(tmp); 
                System.out.print("  "); 
                ris += tmp + "  ";
            } 
            System.out.print("\n");
            ris += "\n";
        } 
        return ris;
    } 
  
 }