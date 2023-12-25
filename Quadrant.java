public class Quadrant{
   public static void main(String[] args){
      int[] x = {1, -3 , -5 , 0 , 7};
      int[] y = {2, 4 , -6 , 0 , -8};
      String[] validate = {"Quadrant 1", "Quadrant 2", "Quadrant 3", "Origin", "Quadrant 4"};
      for(int i = 0; i < x.length;i++){
         if(quadrant(x[i],y[i]).equals(validate[i])){
            System.out.println("Correct");
         }
         else{
            System.out.println("Wrong");
         }
      }
   }
   
   public static String quadrant(int x, int y){
      return (x > 0 && y > 0)? "Quadrant 1":(x < 0 && y > 0)? "Quadrant 2":(x < 0 && y < 0)? "Quadrant 3":(x == 0 && y == 0)? "Origin":"Quadrant 4";
   }
}