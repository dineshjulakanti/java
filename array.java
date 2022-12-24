// import javax.sound.midi.MidiMessage;

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner a=new Scanner(System.in);

//         // to create a list now follow the steps
//         int dinesh[]=new int[100];// the 100 is the size of the below one man
//         dinesh[1]=a.nextInt();
//         dinesh[3]=a.nextInt();
//         dinesh[2]=a.nextInt();

//         int b[]=new int[20];
//           b[1]=2;
//          System.out.println("maths"+dinesh[1]);
//          System.out.println("math"+dinesh[3]);
//          System.out.println("english"+dinesh[2]+" "+b[1]);
//          System.out.println(dinesh.length);   
//     }
// }
            // emo
// public class array{
//     public static void dinesh(int dinesh[]){
//         for(int b=0;b>=dinesh.length;b++){
//          dinesh[b]++;
            
//         }
//     }
//     public static void main(String args[]){
//         int dinesh[]={90};
        
       
//         for(int b=0;b<=dinesh.length;b++){
//             System.out.println(dinesh[b]);
//         }
//     }
    
// }
// import java.util.*;
// public class array{
//     public static void dinesh(int a[]){
//         for(int i=0;i<a.length;i++){
//             a[i]=a[i]+1;
//         }
//         // System.out.print(a);
//     }
//     public static void main(String args[]){
//         // int a[]=new int[100];
//        int a[]={1,2,3};
//         // Scanner b=new Scanner(System.in);
//         dinesh(a);
        
//         for(int i1=0;i1<a.length;i1++){
//              System.out.print(a[i1]+" ");
//         }
//         System.out.println();
        

//     }
// }
                    // know understand properly
// public class array{
//     public static void dinesh(int a[]){
//         for(int n=0;n<a.length;n++){
//             a[n]=a[n]+1;
//             System.out.println(a[n]);
//         }
//     }
//     public static void main(String args[]){
//         int a[]={1,2,3};
//         dinesh(a);

//     }
// }
            // finding the index one
// import java.util.*;
// public class array{
//     public static int dinesh(int n,int a[]){

//      for(int b=0;b<a.length;b++){
//         if(a[b]==n){
//             return b;
//         }

//     }
//     return -1;
//     }
//     public static void main(String args[]){
//         Scanner d=new Scanner(System.in);
//         int n=d.nextInt();
//         int a[]={1,2,3,4,5,6,7,8,9};
//         int f=dinesh(n,a);
//         if(f==-1){
//             System.out.println("not found");
//         }
//         else{
//             System.out.println("got you0");
//         }
        

//     }
// }
            //finding the largest number in the given array
// public class array{
//     public static int dinesh(int a[]){
//    int largest=Integer.MIN_VALUE;
//    for(int d=0;d<a.length;d++){
//     if(a[d]>largest){
//         largest=a[d];
        
//     }
    
//    }
// return largest;}

//     public static void main(String args[]){
//         int a[]={111,22,8,2344,};
//         int d=(dinesh(a));
//         System.out.println(d);

     
//     }

// }
            // finding the smallest among this
// public class array{
//     public static void dinesh(int a[]){
//         int smallest=Integer.MAX_VALUE;  
//         for(int d=0;d<a.length;d++){
//             if(a[d]<smallest){
//                 smallest=a[d];
//             }
//         }
//         System.out.print(smallest);

//     }
//     public static void main(String args[]){
//         int a[]={12,2,4,3};
//         dinesh(a);
//         // int d=dinesh(a);        
//         // System.out.print(d);

//     }
// }
// finding the given value
// public class array{
//     public static int dinesh(int list[],int n){
//         int start=0; int end=list.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(list[mid]==n){
//                 return mid;

//             }
//             if(list[mid]<n){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }


//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int a[]={1,2,3,4,5};
//         int n=3;
//         System.out.print(dinesh(a,n));
     


//     }
// }
// to find whether it is there or not 
// public class array{
//     public static int dinesh(int array[],int n){
//         int start=0;int end=array.length-1;
//         while(start<=end){// case one;
//             int mid=(start+end)/2;
//             if(array[mid]==n){
//                 return mid;
//             }
//             if(array[mid]<n){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         // case two
//         return -1;// if the while loop doesnot exist than this exist ;ra whith out using if or else we can ues like this;
//     }
//     public static void main(String args[]){
//         int array[]={1,2,3,4,5,6,7};
//         int n=0;
//         int d=dinesh(array,n);
//         if(d==-1){
//             System.out.println(n+" not found");
//         }
//         else{
//             System.out.println(n+" i founded you");
//         }
//     }
// }
             //  reverse an array
// public class array{
//     public static void dinesh(int a[]){
//       int start=0;int end=a.length-1;
//       while(start<end){
//         int pirm=a[end];
//         a[end]=a[start];
//         a[start]=pirm;
//         start++;
//         end--;
//       }
   

//     }
//     public static void main(String args[]){
//         int a[]={1,2,3,4,5};
//         dinesh(a);
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+",");
//         }

//     }
// }
//                         // swap ki or number ki reverse lo print kavatadam ki easy one ra
// public class array{
//     public static void main(String args[]){
//         int a=1;
//         int b=2;
//         System.out.println(a+" "+b);
//         // swap
//         int temp=b;
//         b=a;
//         a=temp;
//         System.out.print(a+" "+b);



//     }
// }
            // reverseing the numbers
// public class array{
//     public static void dinesh(int a[]){
//         int start=0;int end=a.length-1;
//         while(start<end){
//             int temp=a[end];
//             a[end]=a[start];
//             a[start]=temp;
//             start++;
//             end--;
//         }
        

//     }
//     public static void main(String args[]){
//         int a[]={1,2,3,4,4};
//             dinesh(a);
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
            
//         }
//         System.out.println();
        

//     }
// }
            //listing the array as pairs
// public class array{
//     public static void dinesh(int a[]){
//         for(int i=0;i<a.length;i++){
            
//             for(int b=i+1;b<a.length;b++){
//                 // int d=i+1;
//                 System.out.print("["+a[i]+","+a[b]+"]");
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String args[]){
//         int a[]={2,4,6,8,10};
//         dinesh(a);// to find the totall number of the pairs is === n(n-1)/2;

//     }
// }
            // printing the subsets man
// public class array{
//     public static void dinesh(int a[]){
//         for(int n=0;n<a.length;n++){
//             for(int i=1;i<a.length;i++){
//                 for(int d=n;d<=i;d++){
//                 System.out.print(a[d]+" ");
//             }
//         System.out.println(); 
//         }
//     }
//     }
//     public static void main(String args[]){
//         int a[]={2,4,6,8,10};
//         dinesh(a);
//     }
// }
        //  to find the sum of the sub array; and in that max and min value;also// public class array{
// public class array{
// public static void dinesh(int a[]){
//     for(int n=0;n<a.length;n++){
//         for(int i=1;i<a.length;i++){
//             int sum=0;
//             for(int d=n;d<=i;d++){
//             System.out.print(a[d]+" ");
//             sum=sum+a[d];

//         }
//         // System.out.println(); 
//         System.out.println(); 
//         int find=Integer.MIN_VALUE;
//         if(find>sum){
//             find=sum;

//         }
        
//         System.out.print(sum);
//         System.out.println(); 
//     }
    
// }
// }
// public static void main(String args[]){
//     int a[]={2,4,6,8,10};
//     dinesh(a);
//     }
// }
                // let us write the subrays and which of the following is the highest one;
// public class array{
//     public static void dinesh(int a[]){
//             for(int b=0;b<a.length;b++){
//                     int min=Integer.MIN_VALUE;
//                     int one=Integer.MIN_VALUE;
//                     int two=Integer.MIN_VALUE;
//                 for(int c=0;c<=a.length;c++){
//                     int dinesh=0;
//                 int dj=0;
//                 for(int d=b;d<c;d++){
//                     if(d==b){
//                         System.out.print("[");
//                     }
//                     System.out.print(a[d]);
//                     dj=dj+a[d];
//                     // dinesh=dinesh+min;
//                     int e=c-1;
//                     if(d==e){
//                         System.out.print("]");
//                         if(dj>min){
//                             min=dj;
//                         }
//                         if(min>one){
//                             one=min;
//                         }
                            
//                             System.out.println(min);
//                         }
               
//                 }
                        
                        
//                 dinesh=one;
//                 if(dinesh>two){
//                         two=dinesh;
//                 }
//                 System.out.println("it is the final value "+dinesh);
                
//                 }
//                 // dinesh=dinesh+min;
            
//             System.out.print(" it is the highest one among the following   "+one);
//             System.out.println();
//             System.out.println(two);
         
//         }
//     }
//     public static void main(String args[]){
//         int a[]={1,2,3,4};
//         dinesh(a);
//     }
// }
// lets us print the subrays it is the highest one of the following  subways 
// public class array{
//     public static void dinesh(int n[]){
//         int last=0;
//         int one=Integer.MIN_VALUE;
//         for(int a=0;a<n.length;a++){
//             int max=Integer.MIN_VALUE;
//             for(int b=0;b<n.length;b++){
//                 int count=0;
//                 for(int c=a;c<=b;c++){
//                     System.out.print(n[c]);
//                     count=count+n[c];
//                     if(count>max){
//                         max=count;
//                     }
                    
                    
//                 }
//                 System.out.println();
                
//             }
//             last=last+max;
//             if(max>one){
//                 one=max;
//             }
//             // System.out.println(max);
//         }
//         // System.out.println(last);
//         System.out.println("it is the highest subrays in the following:"   +one);

//     }
//     public static void main(String args[]){
//         int a[]={2,4,6,8,10};
//         dinesh(a);
//     }
// }
            // adding the subrays creating the new subrays
// public class array{
//     public static void dinesh(int n[]){
//         int sum=0;
//         int two[]=new int[n.length];
//         for(int a=0;a<1;a++){
//             for(int b=0;b<n.length;b++){
//                 int d=0;
//                 for(int c=a;c<=b;c++){
//                     // System.out.print(n[c]);
//                     d=d+n[c];
//                     if(b==0){
//                         System.out.print("(");
//                     }
//                 }
//                 System.out.println();
//                 two[b]=d;
//             }
//         }
//         for(int f=0;f<n.length;f++){
//         System.out.print(two[f]);
//         sum=sum+two[f];
//     }
// System.out.print("it is the sum:"+sum);}
//     public static void main(String args[]){
//         int n[]={1,2,3,4};
//         dinesh(n);
//     }
// }
                            // let us try this in another way;
// public class array{
//     public static void dinesh(int n[]){
//         int max=Integer.MIN_VALUE;
//         int news[]=new int[n.length];
//         for(int a=0;a<1;a++){
//             for(int b=1;b<n.length;b++){
//                 for(int c=a;c<=b;c++){
//                     // System.out.print(n[c]);
                  
//                         news[a]=n[a];
                    
                    
//                         news[b]=n[b]+news[b-1];
                    
//                 }
//                 // System.out.print(news);
//                 for(int f=0;f<n.length;f++){
//                 if(news[f]>max){
//                     max=news[f];
//                 }
//                 // System.out.println();
//             }
//         }System.out.print(max);
//         }

//     }
//     public static void main(String args[]){
//         int n[]={1,2,3,4};
//         dinesh(n);

//     }
// }
            // kadas alogritham means if a numbers is less than zero than it is taken as zero
// public class array{
//     public static void dinesh(int n[]){
//         int n1[]=new int[n.length];
//         int sum=0;
//         int max=Integer.MIN_VALUE;
//         for(int a=0;a<n.length;a++ ){
//             // if all numbers are negative than 
//             //
//             sum=sum+n[a];
           
//             if(sum<0){
//                 sum=0;
//             }
//             if(sum>max){
//                 max=sum;
//             }
//             // System.out.print(sum);

            

            
//         }
//         // System.out.println(max);
//     }
//     public static void main(String args[]){
//         int n[]={-2,-3,4,-1,-2,1,5,-3};
//         dinesh(n);

//     }
// }
                // traping the rain water
// public class array{
//         public static void dinesh(int n[]){
//                 int length=n.length;
//                 int maxl[]=new int [length];
//                         maxl[0]=n[0];
//                 for(int a=1;a<length;a++){
//                         maxl[a]=Math.max(n[a],maxl[a-1]);// it is the max value of the left side dhi;
//                 }
//                 // System.out.print(maxl);
//                // now lets us find the max of the right side nunchi ;
//                 int maxr[]=new int[length];
//                maxr[length-1]=n[length-1];
//                for(int b=length-2;b>=0;b--){
//                 maxr[b]=Math.max(maxr[b+1],n[b]);

//                }
//                int min=Integer.MIN_VALUE;
//                int minall[]=new int[length];


//                for(int c=0;c<length;c++){
//                 minall[c]=Math.min(maxr[c],maxr[c]);

//                }
//                int t=0;
//                int trapedwater[]=new int[length];
//                for(int d=0;d<length;d++){
//                 trapedwater[d]=minall[d]-n[d];
//                 t=t+trapedwater[d];
                
//         }
//         System.out.print(t);
        
      

//         }
//         public static void main(String args[]){
//                 int n[]={1,2,3,4,6};
//                 dinesh(n);


//         }
// }
// public class array{
//         public static void dinesh(int n[]){
// int  l=n.length;
// int maxr[]=new int[l];
// maxr[0]= n[0];

// for(int a=1;a<l;a++){
//         maxr[a]=Math.max(n[a],maxr[a-1]);     
// }
// max of the right side
// int maxl[]=new int[l];
// maxl[l-1]=n[l-1];
// for(int b=l-2;b>=0;b--){
//         maxl[b]=Math.max(n[b],maxl[b+1]);    
// }
// // min value of the them 
// int min[]=new int[l];
// int traped[]=new int[l];
// int trap=0;
// for(int c=0;c<l;c++){
//         min[c]=Math.min(maxl[c],maxr[c]);
//         // traping of the rain water;
//         traped[c]=min[c]-n[c];
//         trap=trap+traped[c];

// }
// System.out.print(trap);
// }
// public static void main(String args[]){
//         int n[]={4,2,0,6,3,2,5};
//         dinesh(n);
// }}
// public class array{
//         public static void dinesh(int a[]){
//                 int max=Integer.MAX_VALUE;
//                 int max2=Integer.MIN_VALUE;
//            for(int b=0;b<a.length;b++){
        
//                 if(a[b]<max){
//                         max=a[b];


//                 }
//            }
//            for(int c=max;c<a.length;c++){
//                 if(a[c]>max2){
//                         max2=a[c];

//                 }

               

                
//            }
//            System.out.println(max);
//            System.out.println(max2);
//            int profit=max2-max;
//            System.out.println(profit);


//         }
//         public static void main(String args[]){
//                 int a[]={7,2,3,3,6,4};
//                       dinesh(a);

//         }
// }
                                // check whether it  is present more than twice or not 
// public class array{
//         public static boolean dinesh(int a[]){
//                 boolean dineshh=false;
//                 for(int b=0;b<a.length;b++){
//                         int c=a[b];
//                         for(int d=c;d<a.length;d++){
//                                 if(c==a[d]){
//                                         dineshh=true;
//                                 }
                                
//                         }
//                 }
//                 return dineshh;
//         }
//         public static void main(String args[]){
//                 int a[]={1,2,3,4};
//                 System.out.print(dinesh(a));
//         }
// }z
// check the postion of the given number
// import java.util.*;
// public class array{
//         public static void dinesh(int a[],int key){
//              int dinesh=-1;
//                 int start=0;int end=a.length-1;
//                 while( start<=end){
//                         int mid=(start+end)/2;
//                         if(a[mid]==key){
//                                  dinesh=mid;
                               
                               
//                         }
//                         if(a[mid]<key){
//                                 start=mid+1;
                                
//                         }
//                         else {
//                                 end=mid-1;
//                         }

//                 }
//                 System.out.print(dinesh);
//                 // return mid;
                
//         }
//         public static void main(String args[]){
//                 int a[]={1};
//                 Scanner b=new Scanner(System.in);
//                 int n=b.nextInt();
//                 dinesh(a,n);

//         }
// }
                        // selling the stocks
// now lets find the index of the given number
// import java.util.*;
// public class array{
//         public static void dinesh(int a[],int n){
//                 // 
//                 int dinesh=-1;
//                 int start=0;int end=a.length-1;
//                 while(start<=end){
//                         int mid=(start+end)/2;
//                         if(a[mid]==n){
//                                 dinesh=mid;
//                         }
//                         if(a[mid]<n){
//                                 start=mid+1;
//                         }
//                         else{
//                                 end=mid-1;
//                         }
//                 }
//                 System.out.print(dinesh);
//         }
//         public static void main(String args[]){
//                 int a[]={1,2,3,4,5,6};
//                 Scanner b=new Scanner(System.in);
//                 int n=b.nextInt();
             
//                 dinesh(a,n);

//         }
// }
//  first finding the least value
// public class array{
//         public static void dinesh(int a[]){
//                 int min=Integer.MAX_VALUE;
//                 for(int i=0;i<a.length;i++){
//                         if(a[i]<min){
//                                 min=a[i];
//                         }

//                 }
//                 System.out.println(min);
//         }
// mama finding the stock value ra
// public class array{
//         public static void dinesh(int a[]){
//                 // it is the first loop // we want find the least value
//                 int min=Integer.MAX_VALUE;
//                 int index=0;
//                 for(int i=0;i<a.length;i++){
//                         if(a[i]<min){
//                                 min=a[i];
//                                 index=i;
//                         }     
//                 }
//                 System.out.println(index);
//                 int sell=0;
//                 System.out.println(min);
//                 for(int e=index;e<a.length;e++){
//                         if(a[e]>min){
//                                 sell=a[e];

//                         }
//                 }
//                 System.out.println(sell);
                
//                 // System.out.println(index);
//         }
//         public static void main(String args[]){
//                 int a[]={7,2,3,1,5,6};
//                 dinesh(a);

//         }
// }
                        // finding the traping the water
// public class array{
//         public static void dinesh(int a[]){
//                 // now lets find the max of the left to right 
//                 int max[]=new int[a.length];
//                 max[0]=a[0];
//                 for(int d=1;d<a.length;d++){
//                         max[d]=Math.max(max[d-1],a[d]);
//                 }
//                 // System.out.println(max[4]);
//                 // // now lets find the max of the right side
//                 int maxr[]=new int[a.length];
//                 maxr[a.length-1]=a[a.length-1];
//                 // int m=0;
//                 for(int e=a.length-2;e>0;e--){
//                         // m=Math.max(max,m);
//                         maxr[e]=Math.max(maxr[e+1],a[e]);
//                 }
//                 // System.out.println(maxr[0]);
//                 // now let us find the min value of the right side and the left side one 
//                int n[]=new int[a.length];
//                 // n[-]=0;
//                 for(int min=0;min<a.length;min++){
//                         n[min]=Math.min(max[min],maxr[min]);
//                 }
//                 // we find the min value now traping the rain water we should find 
//                 int trap=0;
//                 int h=0;
//                 for(int last=0;last<a.length;last++) {
//                         trap=n[last]-a[last];
//                         h=trap+h;
//                 }
//                 System.out.println(h);       
//         }
//         public static void main(String args[]){
//                 int a[]={4,2,0,6,3,2,5};
//                 dinesh(a);

//         }
// }






// 
// public class array{
//         public static void dinesh(int a[]){
//                 int somethig=0;
//                 // nested loops
//                 for(int o=0;o<a.length;o++){
//                         // it is the [a,b,c ]lo it is the a value
//                         for(int n=0;n<a.length;n++){
//                                 // it is the [a,b,c ]lo it is the value of the b one
//                                 for(int e=0;e<a.length;e++){
//                                         // it the c value it changes frequently
//                                         int d=a[o]+a[n]+a[e];
//                                         if(d==0){
//                                                 System.out.print(a[o]);
//                                                 System.out.print(" ");
//                                                 System.out.print(a[n]);
//                                                 System.out.print(" ");

//                                                 System.out.print(a[e]);
//                                                 System.out.print(" ");

    
//                                         }      
//                                 }
//                                 System.out.println(" ");
//                         }

//                 }
//         }
//         public static void main(String args[]){
//                 int a[]={-1,0,1,2,-1,4};
//                 dinesh(a);

//         }
// }