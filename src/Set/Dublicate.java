package Set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dublicate {

    // This will Find the dublicate values that will be inserted as an array or arrayList
    // and find the duplicate element
    // Again adding the set values to new Arraylist

    public static void main(String[] args) {
        int size;

        System.out.println("Enter the size of a ArrayList(Integer)");
        var scanner=new Scanner(System.in);
        size=scanner.nextInt();

        ArrayList<Integer> list=new ArrayList<>();


        int i=0;
        System.out.println("Enter Integers");
        while (i<size){
            list.add(scanner.nextInt());
            i++;
        }

        System.out.println("Size of Array ");
        System.out.println(list.size());

        System.out.println("Before Sort Array Elements and Indexing");
         i=0;
        while (i<list.size()){
            System.out.println("i= "+i+" --> "+list.get(i));
            i++;
        }


        Set<Integer> set=new HashSet<>();
        for(i=0;i<list.size();i++){
            if(set.add(list.get(i))==false)
                System.out.println("The dublicate values are "+list.get(i));
            else
            {
                set.add(list.get(i));
            }
        }


        System.out.println("The Sorted Elements are ");
        System.out.println(set);

        System.out.println("Now the size of set ");
        System.out.println(set.size());

        ArrayList<Integer> list1=new ArrayList<>(set);


        i=0;
        int value;
        System.out.println("Adding Set Integers to ArrayList");
        while (i<set.size()){
            System.out.println("i= "+i+" --> "+list1.get(i));
            i++;
        }




    }

}
