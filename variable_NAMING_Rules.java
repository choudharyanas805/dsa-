package basic_cheeze_JAVA;

public class variable_NAMING_Rules {
    static void main() {
        /*
        1. variables can start from alphabets or _ or $.
        2. special characters except _ and $ are not allowed means bss special charc. mai _ or $ allow bkki nhi
        3. blanks , commas not allowed
        4. keywords not allowed likew int, double etc but INT ,... this allow becoz capital.
         */

        // 1. example below niche   and also say that ki start from any alph. yh _ yh $. if you start any number it gives you error
        int $ex123;
        int _123;
        int x12;
     //   int 12ab; // gives error

        // 2. example below  niche and like !@#%^&*()-+={}[]\|":.,<>?/ etc bss _ and $ yh except hai ..
        int x$ ;
        int x_;
       // int x#; //error
       // int g!; // etc

        //3 example below
        //int x y  ;
        //int x,y ;

        //4 example below
       // int int; // not allow
        int INT; // allow becoz it is not a keyboard.






    }
}
