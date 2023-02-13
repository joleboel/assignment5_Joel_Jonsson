package morsetolk;

import java.util.HashMap;

public class Logic {

    private String output = "";

    public String translate(String input) {
        //gör två hashmaps för att kunna översätta till och från morse kod.
        HashMap<Character, String> ordbok = new HashMap<>();
        ordbok.put('A', "*- ");
        ordbok.put('B', "-*** ");
        ordbok.put('C', "-*-* ");
        ordbok.put('D', "-** ");
        ordbok.put('E', "* ");
        ordbok.put('F', "**-* ");
        ordbok.put('G', "--* ");
        ordbok.put('H', "**** ");
        ordbok.put('I', "** ");
        ordbok.put('J', "*--- ");
        ordbok.put('K', "-*- ");
        ordbok.put('L', "*-** ");
        ordbok.put('M', "-- ");
        ordbok.put('N', "-* ");
        ordbok.put('O', "--- ");
        ordbok.put('P', "*--* ");
        ordbok.put('Q', "--*- ");
        ordbok.put('R', "*-* ");
        ordbok.put('S', "*** ");
        ordbok.put('T', "- ");
        ordbok.put('U', "**- ");
        ordbok.put('V', "***- ");
        ordbok.put('W', "*-- ");
        ordbok.put('X', "-**- ");
        ordbok.put('Y', "-*-- ");
        ordbok.put('Z', "--** ");
        HashMap<String, String> spionkod = new HashMap<>();
        spionkod.put("*-", "A");
        spionkod.put("-***", "B");
        spionkod.put("-*-*", "C");
        spionkod.put("-**", "D");
        spionkod.put("*", "E");
        spionkod.put("**-*", "F");
        spionkod.put("--*", "G");
        spionkod.put("****", "H");
        spionkod.put("**", "I");
        spionkod.put("*---", "J");
        spionkod.put("-*-", "K");
        spionkod.put("*-**", "L");
        spionkod.put("--", "M");
        spionkod.put("-*", "N");
        spionkod.put("---", "O");
        spionkod.put("*--*", "P");
        spionkod.put("--*-", "Q");
        spionkod.put("*-*", "R");
        spionkod.put("***", "S");
        spionkod.put("-", "T");
        spionkod.put("**-", "U");
        spionkod.put("***-", "V");
        spionkod.put("*--", "W");
        spionkod.put("-**-", "X");
        spionkod.put("-*--", "Y");
        spionkod.put("--**", "Z");

        //checkar ifall input stringen innehåller * eller - för att avgöra vilket håll den ska översätta åt
        //morse tecken flyttas till en array som sedan översätts i tur och ordning
        if (input.contains("-") || input.contains("*")) {
            String[] mors = input.split(" ");
            for (int i = 0; i < mors.length; i++) {
                output = output += spionkod.get(mors[i]);
            }

        }
        //bokstäver översätts direkt utan array
        else {
            input = input.toUpperCase();
            for (int i = 0; i < input.length(); i++) {
                output += ordbok.get(input.charAt(i));
            }
        }
        //om något tecken inte kunde översättas korrekt så skriver den ut ett felmeddelande
        if (output.contains("null")) {
            return "fel, använd endast engelska bokstäver eller morse tecken separerade med mellanrum";
        } else {
            return output;
        }
    }
}
