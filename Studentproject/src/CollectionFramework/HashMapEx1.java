package CollectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
     public static void main(String[] args)
     {
    	 HashMap<String,Integer> tel_dir_map=new HashMap<String,Integer>();
    	 tel_dir_map.put("Karthika", 123333);
    	 tel_dir_map.put("Renu", 1234533);
    	 tel_dir_map.put("Merlin", 198216);
    	 tel_dir_map.put("Padhu", 9017171);
    	 System.out.println("Before remove:"+tel_dir_map);
    	 
    	 System.out.println("Enter key from:(Karthika,Renu,Merlin,Padhu)");
    	 Scanner scan=new Scanner(System.in);
    	 String Str_name=scan.nextLine();
    	 tel_dir_map.remove(Str_name);
    	 System.out.println("After removed"+tel_dir_map);
    	 
     }
}
