class Solution {
    public String intToRoman(int num) {
        int current = 0;
        int remainder = 0;
        String roman = "";

        if (num >= 1000) {
            current = num / 1000;
            remainder = num % 1000;

            for (int i = 0; i < current; i++) {
                roman += "M";
            }
        } else {
            current = num / 1000;
            remainder = num % 1000;
        }

        current = remainder / 100;
        remainder = remainder % 100;

        switch (current) {
            case 9: 
                roman += "CM";
                break;
            case 8: 
                roman += "DCCC";
                break;
            case 7: 
                roman += "DCC";
                break;
            case 6: 
                roman += "DC";
                break;
            case 5: 
                roman += "D";
                break;
            case 4: 
                roman += "CD";
                break;
            case 3: 
                roman += "CCC";
                break;
            case 2: 
                roman += "CC";
                break;
            case 1: 
                roman += "C";
                break;
            case 0: 
                break;
        }

        current = remainder / 10;
        remainder = remainder % 10;

        switch (current) {
            case 9: 
                roman += "XC";
                break;
            case 8: 
                roman += "LXXX";
                break;
            case 7: 
                roman += "LXX";
                break;
            case 6: 
                roman += "LX";
                break;
            case 5: 
                roman += "L";
                break;
            case 4: 
                roman += "XL";
                break;
            case 3: 
                roman += "XXX";
                break;
            case 2: 
                roman += "XX";
                break;
            case 1: 
                roman += "X";
                break;
            case 0: 
                break;
        }

        switch (remainder) {
            case 9: 
                roman += "IX";
                break;
            case 8: 
                roman += "VIII";
                break;
            case 7: 
                roman += "VII";
                break;
            case 6: 
                roman += "VI";
                break;
            case 5: 
                roman += "V";
                break;
            case 4: 
                roman += "IV";
                break;
            case 3: 
                roman += "III";
                break;
            case 2: 
                roman += "II";
                break;
            case 1: 
                roman += "I";
                break;
            case 0: 
                break;
        }


        return roman;



    }
}
