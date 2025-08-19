//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 String name="mam";
 int count=0;
 int len=name.length();
 for(int i=0;i<=name.length()-1;i++) {
   char  result = name.toLowerCase().charAt(i);
    char anotherresut = name.charAt(name.toLowerCase().length()-1 - i);
     if (result == anotherresut) {
         count += 1;
     }
 }
if(count==len){
    System.out.println("This is a Palindrome ");
}else{
    System.out.println("this is not a Palindrome");
}
 }



        }
