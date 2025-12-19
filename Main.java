import java.util.Scanner;
class Main{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter website URL:");
        String URL = sc.nextLine();
        int count = 0;
        
        if(URL.length()>75){
         count++;
        }
        if(URL.contains("@")){
            count++;
        }
        if(URL.matches("http[s]?://\\d+\\.\\d+\\.\\d+\\.\\d+.*")){
           count++;
        }
        if(URL.split("\\.").length > 3){
           count++;
        }
        
        if(count>=2){
            System.out.print("YES IT IS A PHISING WEBSITE!!!");
        }
        else{
            System.out.println("NO IT'S NOT A PHISING WEBSITE");
        }
        
}
}

