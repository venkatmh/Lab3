import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number to count down or up from:");
    int num = s.nextInt();

    if(num >= 0){
      for(int i = num; i >= 0; i--){ //decrement
        System.out.println(i);
      }
    }else if (num < 0){
      for(int i = num; i <= 0; i++){ //increment
        System.out.println(i);
      }
    }

    System.out.println("Blast off!");

  }
}