import static java.lang.System.out;

public class Matrix_key   {
    public static String welcome_note ="Hello Neo ,Lets shift realities bit \n ";
    private static void flag(){
        out.println("{{{Your in!!}}}");
    }

    public static void main(String[] args) {
        out.printf(" %s ",welcome_note);
        int _aaa0001 = Integer.parseInt(args[0]);
        if( _check_sec(_aaa0001) == 0 ){
            flag();
        }
        else{
            out.println("Sorry that ain't it . try another key");
        }

    }
    private static int _check_sec(int jj){
        String a="10100111001";
        int b=Integer.parseInt(a,2);
        if( (jj / b)   == (1^5)){
            return 0;
        }
        else {
            return 1;
        }
    }


}
