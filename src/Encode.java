

import java.util.Vector;

public class Encode {

    public static   String convert(int i){

        String ones = "";
        String tens = "";
        String hundreds = "";
        String thousands = "";
        String result ;

        boolean error = false;

        Vector v = new Vector();

        //assign passed integer to temporary value temp
        int temp=i;

        //flags an error if number is greater than 3999
        if (temp >=4000) {
            error = true;
        }


        while (temp/10 != 0) {
            if (temp / 10 != 0 && temp <4000) {
                v.add(temp%10);
                temp = temp / 10;
            }else {
                break;
            }
        }

        //therefore you have to add temp one last time to the vector
        v.add(temp);

        //as in the example now you have 4,5,2,3 respectively in v 0,1,2,3 indices.


        for (int j = 0; j < v.size(); j++) {

            //you see that v 0th index has number of ones. So make them roman ones here.
            if (j==0) {
                switch (v.get(0).toString()){
                    case "0" : ones = ""; break;
                    case "1" : ones = "I"; break;
                    case "2" : ones = "II"; break;
                    case "3" : ones = "III"; break;
                    case "4" : ones = "IV"; break;
                    case "5" : ones = "V"; break;
                    case "6" : ones = "VI"; break;
                    case "7" : ones = "VII"; break;
                    case "8" : ones = "VIII"; break;
                    case "9" : ones = "IX"; break;
                }


                //in the second iteration of the loop (when j==1)
                //index 1 of v is checked. Now you understand that v 1st index
                //has the tens
            } else if (j == 1) {
                switch (v.get(1).toString()){
                    case "0" : tens = ""; break;
                    case "1" : tens = "X"; break;
                    case "2" : tens = "XX"; break;
                    case "3" : tens = "XXX"; break;
                    case "4" : tens = "XL"; break;
                    case "5" : tens = "L"; break;
                    case "6" : tens = "LX"; break;
                    case "7" : tens = "LXX"; break;
                    case "8" : tens = "LXXX"; break;
                    case "9" : tens = "XC"; break;
                }
            } else if(j == 2){  //and hundreds
                switch (v.get(2).toString()){
                    case "0" : hundreds = ""; break;
                    case "1" : hundreds = "C"; break;
                    case "2" : hundreds = "CC"; break;
                    case "3" : hundreds = "CCC"; break;
                    case "4" : hundreds = "CD"; break;
                    case "5" : hundreds = "D"; break;
                    case "6" : hundreds = "DC"; break;
                    case "7" : hundreds = "DCC"; break;
                    case "8" : hundreds = "DCCC"; break;
                    case "9" : hundreds = "CM"; break;
                }
            }   else if(j == 3){ //and finally thousands.
                switch (v.get(3).toString()){
                    case "0" : thousands = ""; break;
                    case "1" : thousands = "M"; break;
                    case "2" : thousands = "MM"; break;
                    case "3" : thousands = "MMM"; break;

                }
            }
        }



        if (error) {
            result = "Error!";
        }else{
            result = thousands + hundreds + tens + ones;
        }

        return result;

    }
}
