import java.util.*;
class LoopConcept{
    
   
    public static void main(String[] args) {
        
      int i,p=20;
      ArrayList<Integer> arr=new ArrayList<Integer>();
      System.out.println("enter how many terms you want to print ");
      Scanner sc=new Scanner(System.in);
      i=sc.nextInt();
           for(int j=0;j<i;j++){
          arr.add(p);
          p=p+10;
          
      }

    int k=0;
System.out.println("while Loop:");
 while(k<arr.size())
    {
      System.out.println(arr.get(k));
      k++;
    }
System.out.println("Advanced For Loop"");
for(int k:arr)
      System.out.println(k);
System.out.println("For Loop:");
    for(k=0;k<arr.size();k++)
    {
      System.out.println(arr.get(k));
     
    }
      
    }
}