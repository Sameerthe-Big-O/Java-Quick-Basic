import javax.xml.namespace.QName;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        double a=23.23;
       java.util.Date date=new Date();
        LocalDate loca=LocalDate.now();
        LocalTime time=LocalTime.now();

        String name="sameer";
        String kolp=name;
        System.out.println("here before" +name.toLowerCase());
        System.out.println("here's before" +kolp);
        kolp="asda";


        System.out.println("here after =" +name);
        System.out.println("here's after =" +kolp);




        float aNumber=3_23.43F;
        Date newDate=new Date();
        int aNumber2=23232_32_32;

        int myInt = 9;
        double myDouble = myInt;
//        int num=myDouble;// Automatic casting: int to double
        

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0






        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        } ;


            //*creating the object
            Person sameer=new Person("sameer");


            Person sam=sameer;




            System.out.println("here before " +sameer.name);
            System.out.println("here's before " +sam.name);

            //*now what i'll do is like it'll update of the name of same object as well because we assigned the value
        //*they both will points to the same objecg;
            sam.name="asda";


            System.out.println("here after =" +sameer.name);
             System.out.println("here's after =" +sam.name);
    } ;







    static  class Person{
        String name;
        Person(String name) {
            this.name=name;
        }

    }
}

//**when to larger datatype to smaller we need to that shit explicity
//*java Main runs the program where  we target the actual file means we've to specify the full class name with java  every java application should have the Main
//*if we delete the file and then if again run -Javac main.java then again we'll get aumatically created of java  file we just named it
//pacakges are the ways to group the classes together in java project
//*primtive(string,numbers,char or this stuff) vs non-primitive where(objects, arrays)
//*doube is for 15 decimals and float is for the 7 digits
//*when converting smaller to larger we do automatically
//for the primitive computer stores by value means only copy value and then in different address
//for the referne it store as the reference pr points the to the same memroyb address
//*anythung that comes from the java.lang requires you to no import
//*remember when we say that



//*wht string are immutable
//*1. String s1 = "a";
  // 2. s2 = s1;
  // 3. s1 = s1 + "b";



//(line 1) Create a string "a" at memory address 0x000001.
//(line 1) Set the value of s1 to 0x000001 so that it effectively points to string "a".
//(line 2) Copy the value of s1 and set it to s2. So now both s1 and s2 have the same value of 0x000001, and so both point to string "a".
//(line 3) Find what s1 is pointing to (string "a"), and use that to create a new and distinct string of "ab" that will live at a different memory address of 0x000002. (Note that string "a" remains unchanged at memory address 0x000001).
//(line 3) Now assign value 0x000002 to variable s1 so that it now effectively points to this new string "ab".
//(line 4) Compare the values of s1 and s2, which are now at 0x000002 and 0x000001 respectively. Clearly, they don't have the same values (memory addresses) so the result is false.
//(line 4) Print false to the console.
//So you see, when changing the "a" string to a "ab" string, you were not modifying the "a" string. Rather, you were creating a 2nd distinct string with the new value of "ab", and then changing a reference variable to point to this newly created string.
//
//The exact same pattern occurs when coding with the other classes like Integer or Double, which are immutable as well. You have to understand that when you use operators like + or - on instances of these classes, you are not modifying the instance in any way. Rather, you are creating a whole new object, and getting a new reference to that new object's memory address that you can then assign to a reference variable.