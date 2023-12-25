public class Palindrome{
   public static void main(String[] args){
      String[] inputs = {"Ryan","Racecar","MadaM","abcCba","James"};
      boolean[] validate = {false,true,true,true,false};
      for(int i = 0; i < inputs.length;i++){
         if(palindrome(inputs[i])==validate[i]){
            System.out.println("Correct");
         }
         else{
            System.out.println("Wrong");
         }
      }
   }
   public static boolean palindrome(String input){
      input = input.toLowerCase();
      for(int i = 0,j = input.length()-1; i < input.length();i++,j--){
         if(input.charAt(i)!=input.charAt(j)){
            return false;      
         }
      }
      return true;
   }
}