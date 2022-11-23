import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int i=word.length();
        char [] array = new char[i];
        boolean result = palindrome(word,i,array);
        if(result){
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }

    }
    public static boolean palindrome(String word, int i, char[] array){

        for(int j=0;j<i;j++) {
            array[j]= word.charAt(word.length()-1);
            word=word.substring(0,word.length()-1);

        }
        if(word.length()>1) {
            palindrome(word,i,array);
        }
        String newWord = "";
        for(int k=0;k<i;k++){
            newWord=newWord+array[k];
        }
        String finalWord="";
        for(int l=newWord.length()-1;l>=0;l--){
            finalWord=finalWord+newWord.charAt(l);
        }
        return finalWord.equals(newWord);





    }
}
