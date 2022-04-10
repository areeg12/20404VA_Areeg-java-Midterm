package data_structures;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */


                 ArrayList<String> employeeNames = new ArrayList();

                 employeeNames.add( "Lean");
                 employeeNames.add("Alex");
                 employeeNames.add("Jefferson");
                 employeeNames.add("Henry");
                 employeeNames.add("Soma");
                 employeeNames.add("Xiomara");

                 int length = employeeNames.size();
                 System.out.println("lENGTH of ARRAYLIST:" +length );  // 6

                 String name = employeeNames.get(5);
                 employeeNames.add("Erik");
                 name = employeeNames.get(6);
                System.out.println("VALUE AT INDEX 6:" +name);

           System.out.println("lENGTH of ARRAYLIST:" +length );



               String removeElement=employeeNames.remove(3);
               System.out.println("VALUE AT INDEX 3:" + name);


            System.out.println("lENGTH of ARRAYLIST:" +length );









    }

}
