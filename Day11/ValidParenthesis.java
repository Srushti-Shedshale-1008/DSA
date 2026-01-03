public class ValidParenthesis {
    public static int top=-1;
    public void push(char ch,char arr[]){
        if(top==arr.length-1){
            System.out.println("\nOverflow!");
            return;
        }
        arr[++top]=ch;
    }

    public char pop(char arr[]){
        if(top==-1){
            System.out.println("\nInvalid!");
            return 'N';
            
        }
        char ch=arr[top];
        top--;
        return ch;



    }
 public static void main(String[] args) {
    ValidParenthesis vp=new ValidParenthesis();
    String str="[()]";
    char arr[]=new char[str.length()];
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)== '(' || str.charAt(i)== '[' || str.charAt(i)== '{'){
            vp.push(str.charAt(i), arr);
        }
        else if(str.charAt(i)== ')' || str.charAt(i)== ']' || str.charAt(i)== '}'){
            char ch=vp.pop(arr);

            if(str.charAt(i)==')'){
                if(ch!='('){
                    System.out.println("\nInvalid");
                    return;
                }
            }

            else if(str.charAt(i)==']'){
                if(ch!='['){
                    System.out.println("\nInvalid");
                    return;
                }
            }

            else if(str.charAt(i)=='}'){
                if(ch!='{'){
                    System.out.println("\nInvalid");
                    return;
                }
            }
           
            
        }
    }
    if(ValidParenthesis.top==-1){
        System.out.println("\n | Finally Valid Parenthesis!");
    }
    else System.out.println("\n Still Invalid!");

 }   
}
