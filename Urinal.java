import java.util.Scanner;
//Author=Ajinkya Abhinay Pise

public class Urinal {
    public static void main(String[] args){
        System.out.println("Enter Numbers");
        Urinal urinal= new Urinal();
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(urinal.Simple(str));


    }
    public int Simple( String str ) {

        char[] arr = str.toCharArray();

        int count = 0;
        int count1=0;
        for (int i = 1; i < str.length(); i++) {
            if (arr[i] == '1'|| arr[i] == '0' ) {
                if(arr[i-1]!=arr[i]){
                    count1++;
                    if(count1>3){
                    System.out.println("-1");
                    break;}
                }
            }

        }

        for (int j = 1; j < str.length(); j++) {

            if (arr[j] == '1' || arr[j] == '0') {
                arr[j] = str.charAt(j);
                if (arr[j] == '0'&& arr[j]!=arr[j-1]) {
                    count++;
                    if (count % 2 != 0) {
                           // System.out.println(count - 2);
                            continue;
                        }

                    }

                } else {
                    //System.out.println("-1");
                    break;
                }
            }

            return count;


        }
    }
