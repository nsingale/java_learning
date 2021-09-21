public class StringsDemo {
    public String reverse_string(String str){
        char [] reverse_char_arr = new char [str.length()];
        for (int i = str.length()-1; i>=0 ; i--){
            reverse_char_arr[str.length()-(i+1)] = str.charAt(i);
        }
        String reverse = String.valueOf(reverse_char_arr);
        return reverse;
    }

    public boolean palindrome_string(String str){
        boolean bool = true;
        char [] char_arr = str.toCharArray();
        for (int i=0; i<=(str.length())/2;i++){
            if (char_arr[i] == char_arr[str.length()-(i+1)]){
                continue;
            }
            else {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void main(String [] args){
        StringsDemo obj = new StringsDemo();
        String str = "Reverse this string";
        System.out.println(str);
        System.out.println(obj.reverse_string(str));
        String str1 ="madam";
        if (obj.palindrome_string(str1)){
            System.out.println("String "+str1+" is a palindrome");
        }
        else{
            System.out.println("String "+str1+" is not a palindrome");
        }
    }
}
