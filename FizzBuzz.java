public class FizzBuzz{
  public static void main(String[] args){
    System.out.println("初めまして！！");
    System.out.println("FizzBuzzゲームを知っていますか??");
    System.out.println("「Yes」か「No」で教えてね");
    String input = new java.util.Scanner(System.in).nextLine();
    if(input.equals("Yes")){
      for(int i=1; i<=100; i++){
        if(i%15 == 0){
          System.out.println("FizzBuzz");
        }else if(i%3 == 0){
          System.out.println("Fizz");
        }else if(i%5 == 0){
          System.out.println("Buzz");
        }else{
          System.out.println(i);
        }
      }
    }else{
      System.out.println("調べてからきてください");
    }
  }
}