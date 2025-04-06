package Strings;

public class addBinaryString {
    public String addBinary(String s1, String s2) {
        // code here
         
     int n =s1.length();
     int m = s2.length() ;
     int i = n-1;
     int j = m-1;
     int carry =0;
     
      StringBuilder result = new StringBuilder();
   
     while(i>=0 || j>=0 || carry > 0){
        int bit1 = (i>=0) ? s1.charAt (i--) - '0': 0;
        int bit2 = (j>=0) ? s2.charAt (j--) - '0': 0;
        int sum = bit1 + bit2 + carry;
        
        result.append((char)(sum%2 + '0'));
        carry = sum/2;
         }
         
         String reversedResult =  result.reverse().toString();
         
         int firstOne = -1;
         for(int k = 0; k<reversedResult.length(); k++){
             if(reversedResult.charAt(k) == '1'){
                 firstOne = k;
                 break;
             }
         }
         
         if(firstOne ==-1){
             return "0";
             
         }else {
             return reversedResult.substring(firstOne);
         }
}
       

} 

