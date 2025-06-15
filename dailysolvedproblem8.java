/* 1432. Max Difference You Can Get From Changing an Integer
  
You are given an integer num. You will apply the following steps to num two separate times:
Pick a digit x (0 <= x <= 9).
Pick another digit y (0 <= y <= 9). Note y can be equal to x.
Replace all the occurrences of x in the decimal representation of num by y.
Let a and b be the two results from applying the operation to num independently.
Return the max difference between a and b.
Note that neither a nor b may have any leading zeros, and must not be 0.
  
Example 1:
Input: num = 555
Output: 888
  
Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
The second time pick x = 5 and y = 1 and store the new integer in b.
We have now a = 999 and b = 111 and max difference = 888
  
Example 2:
Input: num = 9
Output: 8
  
Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
The second time pick x = 9 and y = 1 and store the new integer in b.
We have now a = 9 and b = 1 and max difference = 8 */

//code

class Solution {
    public int maxDiff(int num) {
       String number=num+"";
       String a="";
       String b="";
       char ch=number.charAt(0);
       //finding first non digit
       for(int i=0;i<number.length();i++){
        if(number.charAt(i)!='9'){
            ch=number.charAt(i);
            break;
        }
       }
       //repalcing all first non-digit with 9
       for(int i=0;i<number.length();i++){
        if(number.charAt(i)==ch){
            a=a+9;
        }
        else{
            a=a+number.charAt(i);
        }
       }
       System.out.println(a);
       // finding the digit to replace 
        ch=number.charAt(0);
        boolean flag2=true;
        if(ch=='1'){
            flag2=false;
        }
        boolean flag=false;
        if(flag2==false){
                for(int i=0;i<number.length();i++){
                    if(number.charAt(i)!='0'&&number.charAt(i)!='1'){
                        ch=number.charAt(i);
                        flag=true;
                        break;
                    }
                }
        }
      
      System.out.println(ch);
      System.out.println(flag);
      for(int i=0;i<number.length();i++){
        if(number.charAt(i)==ch&& flag==true){
            b=b+'0';
        }
        else if(number.charAt(i)==ch&& flag==false){
            b=b+'1';
        }
        else{
            b=b+number.charAt(i);
        }
      }
    int ak=Integer.parseInt(a);
    int bk=Integer.parseInt(b);
    return ak-bk;
    }
}
