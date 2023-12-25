public class Censored{
   public static void main(String[] args){
      String[] curseWords = {"Fuck","Shit","Nigger","Madafaker","Bobo"};
      for(String x:curseWords){
         System.out.println(x+" : "+censored(x));
      }
   }
   public static String censored(String input){
      input = input.toLowerCase();
      StringBuilder buffer = new StringBuilder();
      for(char x: input.toCharArray()){
         if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            buffer.append('*');
         }
         else{
            buffer.append(x);
         }
      }
      return buffer.toString();
   }
}