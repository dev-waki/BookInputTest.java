import java.util.Scanner;

public class booktest {
      int numberofpages;
      String author;
      String title;
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
     
       System.out.println("enter the book title");
       String title=scanner.nextLine();

       System.out.println("enter the book author");
       String author=scanner.nextLine();

       System.out.println("rnter the nomber of pages:");
       int numberofpages=scanner.nextInt();

        System.out.println("the book title is:"+title);
        System.out.println("the book author is"+author);
        System.out.println("the book has:"+numberofpages +"pages");
    }
}