import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        String newTime = null;
        Scanner input = new Scanner(System.in);
        String time = input.next();
        char a = time.charAt(8);//tells if AM or PM
        char one = time.charAt(0);//extracts first digit
        char two = time.charAt(1);//extracts second digit
        char newOne = (char) (one+1);//to convert from PM add 1
        char newTwo = (char) (two+2);//to convert from PM add 2
        String strOne = String.valueOf(newOne);//now we need strings out of chars
        String strTwo = String.valueOf(newTwo);

        switch (a) {

            case 'A' : {//the conversion from AM only needs to deal with 12:00:00AM to 00:00:00, and deleting the AM
                if(one=='1' && two=='2'){
                    newTime = "00" + time.substring(2,8);//replacing the 12 for 00 at the beginning, and cutting the AM out
                }else{
                newTime = time.substring(0,8);} //just deleting the AM
            }break;

            case 'P' : {
                if(one=='1' && two=='2'){
                    newTime = time.substring(0,8); //just deleting the PM
                }else{
                newTime = strOne + strTwo + time.substring(2,8);}//this adds 12 hours and deletes the PM
            }break;

        }System.out.print(newTime);
    }
}