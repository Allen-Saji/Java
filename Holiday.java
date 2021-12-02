public class Holiday {
    String name,month;
    int day;

    Holiday(String n, int d, String m){
        name = n;
        day = d;
        month = m;
    }
    boolean sameMonth(String a , String b ){

        if(a.equals(b)){
            return true;
        }else{
            return  false;
        }
    }


}

class HolidayDemo{
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Christmas" , 2 , "December");
        Holiday h2  = new Holiday("Summer" , 4 , "June");
        Holiday h3 = new Holiday("Independence Day" , 4 , "July");
         boolean output = h1.sameMonth(h1.month, h3.month);

         if(output == true){
             System.out.println("Yes, both holidays have same month.");
         }else{
             System.out.println("Nope,both holidays have different months.");
         }



    }
}

