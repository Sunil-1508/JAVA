import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
//import  java.lang.*;
public class OperationMaersk {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         //String s=sc.nextLine();
         //String a[]=s.split(" ");
         //Arrays.sort(a);
        //  for(String i:a){
        //      System.out.print(i+" ");
        //  }

        //  int a[]=new int [5];
        //  for(int i=0;i<5;i++){
        //      a[i]=sc.nextInt();
        //  }
        // ArrayList<Integer> arr =new ArrayList<>();
        // for(int i=0;i<5;i++){
        //     arr.add(a[i]);
            
        // }
        // // arr.add(3,10);
        // arr.remove(5);
        // System.out.println(arr.get(0));
        // arr.set(0,100);
        // System.out.println(arr.get(0));
        // int ch=arr.lastIndexOf(5);
        
        // for(int e:arr){
        //     System.out.print(e+" ");
        // }

        // System.out.println();
        // HashMap<Integer,Integer>mp=new HashMap<>();
        // for(int e:arr){
        //     if(mp.get(e)!=null){
        //         mp.put(e,mp.get(e)+1);
        //     }
        //     else{
        //         mp.put(e,1);
        //     }
        // }
        // System.out.print(mp);
        // if(mp.get(5)==null){
        //     System.out.print("null");
        // }
        // for(Integer e:mp.keySet()){
        //     System.out.print(e+":"+mp.get(e)+"  ");
        // }
        // mp.remove(1);
        // System.out.println();
        // for(Integer e:mp.keySet()){
        //     System.out.print(e+":"+mp.get(e)+"  ");
        // }

        // HashSet<Integer> s=new HashSet<>();
        // for(int e:arr){
        //     s.add(e);
        // }
        // for(int e:s){
        //     System.out.print(e+"  ");
        // }
        // String str="sunil";
        // String str2="sunil";
        // String str3=new String("sunil");
        // String str4=new String("sunil");
        // String str3="sunil";
        // String str4="sunil";
        // if(str3==str4){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }
        // if(str4.equals(str3)){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }
        // System.out.println(str);
        // System.out.println(str2);
        // str3="changed";
        // System.out.println(str);
        // System.out.println(str4);
        // System.out.println(str3);

//         StringBuffer str2=new StringBuffer(str);
//         StringBuilder str3=new StringBuilder();
//         System.out.println(str.equalsIgnoreCase("Aaaunil"));
//         System.out.println(str.substring(1 ,3));
//         System.out.println(str.replaceAll("a", "v"));
//         System.out.println(str2.getChars(1, 2, 1, 5);
        // Stack<Integer> st=new Stack<>();
        // for(Integer i:a){
        //     st.push(i);
        // }
        
        // System.out.println("-----------------------------------");
        // System.out.println(st);
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.peek());
        // System.out.println(st.add(10));
        // System.out.println(st.peek());
        // System.out.println(st.empty());
        // System.out.println(st.toString());
        // System.out.println(st.size());
        // st.clear();
        // System.out.println(st.empty());
        // StringBuffer s1=new StringBuffer("Computer");
        // s1=s1.append("Engineering"); 
        // //concat() method appends the string at the end
        // char x[]={'a','p','p','e','l'};
        // String y=new String(x);
        // System.out.println(s1+" "+y);

        // BigInteger b1=new BigInteger("1000");
        // BigInteger b2=new BigInteger("250").add(new BigInteger("501"));
        // BigInteger b3=new BigInteger("-33400");
        // BigDecimal b4=new BigDecimal(b3,4);
        // System.out.println(b1+" "+b2+"\n"+b2.isProbablePrime(1)+" "+b4);
        // System.out.println(b1.subtract(b2));
        // System.out.println(b1.multiply(b3));
        // System.out.println(b1.bitCount());
        // System.out.println(b3.abs());
        // System.out.println(b1.sqrt());
        // System.out.println(b1.pow(10));//exponent shoud be integer
        // long l=b1.longValue();
        // String s=b2.toString();
        // int i=b2.intValue();
        // System.out.println(l+" "+i+" "+s);
        // //some more functions:- min,max,gcd,xor,rightShift,leftShift,remainder etc
        // System.out.println(b4.add(b4));
        // System.out.println(b4.toBigInteger());




        ArrayList<Integer> aa=new ArrayList<>();
        for(int i=0;i<5;i++){
                aa.add(sc.nextInt());
        }
        for(Integer i: aa){
                System.out.print(i+" ");
        }
        for(int i=0;i<5;i++){
                System.out.print(aa.get(i)+" ");
        }


        

}   
}