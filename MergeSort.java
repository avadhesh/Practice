/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		String inputStr = s.nextLine();
		String[] inpurArrStr = inputStr.split(" ");
	//	System.out.println(inputStr);
		List<Integer> arrList = new ArrayList<>(inpurArrStr.length);
		arrList = Arrays.asList(inpurArrStr).stream().map(e->Integer.parseInt(e)).collect(Collectors.toList());
		Codechef obj = new Codechef();
		List<Integer> res = obj.mergeSort(arrList);
		
		res.forEach(System.out::println);
		
	}
	public List<Integer> mergeSort(List<Integer> arr)
	{
	  //  System.out.println(arr.toString());
	    if(arr.size() <= 1)
	        return arr;
	    int mid = arr.size()/2;
	    return merge( mergeSort(arr.subList(0, mid)), mergeSort( arr.subList(mid, arr.size())));
	}
	public List<Integer> merge(List<Integer> arr1, List<Integer> arr2)
	{
	    List<Integer> merged = new ArrayList<>();
	    int p1=0,p2=0;
	 //  System.out.println(arr1.toString());
	  // System.out.println(arr2.toString());
	    while(p1 < arr1.size() && p2 < arr2.size() && arr1.size() > 0 && arr2.size()>0)
	    {
	        if(arr1.get(p1) < arr2.get(p2)){
	            merged.add(arr1.get(p1));
	            p1++;
	        }
	        else{
	            merged.add(arr2.get(p2));
	            p2++;
	        }
	    }
	    while(p1 < arr1.size())
	    {
	        merged.add(arr1.get(p1));
	        p1++;
	    }
	    while(p2 < arr2.size())
	    {
	        merged.add(arr2.get(p2));
	        p2++;
	    }
	    return merged;
	}
}
