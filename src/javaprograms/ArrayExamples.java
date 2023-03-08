package javaprograms;

/*
 
 An array is an indexed collection of fixed number of homogenous data elements.
 
 The main advantage of arrays is we can represent huge no.of values by using single variable. So that readibility of the code will be improved. 
 
 The main disadvantage of arrays is fixed in size. That is once we creates an array there is no chance of increasing or decreasing the size based on the requirement. Hence to use arrays concept compulosory we should know the size in advance, which may not be possible always.
 
 
 Array declaration
 
 1 Dimensional array declaration. All below 3 are valid. but first one is recommended.
 
 int[] x  //Because name is clearly seperated from type
 int x[]
 int []x
 
 
 At the time of declaration we can't specify the size. Otherwise we will get compile time error.
 
 int[6] x ; //invalid
 int[] x ; // valid
 
 2 Dimensional Array Declaration. All below 6 are valid
 
 int[][] x
 int [][]x
 int x[][]
 int[] []x
 int[] x[]
 int []x[]
 
 
Which of the following are valid

a dimension b dimension
int[] a,b; // a 1 b 1
int[] a[],b ; // a 2 b 1
int[] a[],b[]; //a 2 b 2
int[]  []a,b;  //a 2 b 2
int[]  []a,b[]; //a 2 b 3
int[]  []a,[]b; //Compile Time Error
 
 If we want to specify dimension before the variable that facility is applicable only for first variable in a declaration. If we are trying to apply for remaining variable we will get compile time error.
 
 int[] []a,[]b,[]c //invalid CE
 
 
 3 Dimensional Array declaration
 
 int[][][] a
 
 int [][][]a
 int a[][][]
 int[] [][]a
 int[] a[][]
 int[] []a[][]
 
 
 Every array in java is an object
 
 Array Type  Corresponding class Name
 int[]  [I
 int[][] [[I
 float[] [F
 double[] [D
 char[]  [C
 byte[] [B
 boolean[] [Z
 
 int[] x= new int[] // Invalid . Compile Time Error
 int[] x= new int[6] //Valid
 
 int[] x= new int[0] //Valid
 int[] x= new int[-7] // Run time Exception: NegativeArraySizeException
 
 int[] x= new int[10] //valid
  int[] x= new int['a'] //valid
  
  byte b=20;
   int[] x= new int[b] //Valid
   
   short s=30
    int[] x= new int[s] //Valid
    
    int[] x = new int[10L] : CE: Possible loss of precision found: long Requried: int
    
    int[] x = new int[2147483647] // Valid . Some times we may get Run time exception java.lang.OutOfMemory error
     
    int[] x = new int[2147483648] // Invalid CE: Integer too large
 
 
 2 Dimensional array creation: 
 In Java 2D array is not implemented by using Matrix style. SUN people followed array of arrays approach for multi dimensional array creation. 
 
 The main advantage of this approach is memory utilization will be improved. 
 
 int[][] x= new int[2][]
 x[0] = new int[2]
 x[1] = new int[3] 
 
 int[][][] x = new int[2][][]
 x[0] = new int[3][]
 x[0][0] = new int[1]
 x[0][1] = new int[2]
 x[0][2] = new int[3]
 
 x[1]= new int[2][2];
 
 
 int[] a= new int[]  // Invalid
 int[] a= new int[3] // Valid
 int[][] a= new int[][] // Invalid
 int[][] a= new int[3][] // Valid
 int[][] a= new int[][4] // Invalid
 int[][] a= new int[3][4] //Valid
 int[][][] a= new int[3][4][5] // Valid
 int[][][] a= new int[3][4][] //Valid
 int[][][] a= new int[3][][5] //Invalid
 int[][][] a= new int[][4][5] //Invalid
 
 
 Once we creates an array , every array element is intialized with default value
 
 int[] x= new int[3]
 
 sop(x);   // [I@6afaaf]
 sop(x[0]); // 0
 
 Whenever we are trying to print any reference variable internally toString() method will be called which is implemented by default to return the string in the following form .
 
 classname@hexadecimalform
 
 
 int[][] x = new int[2][3]
 sop(x)   //  [[I@2e4ab
 sop(x[0]) // [I@18920f
 sop(x[0][0]) // 0
 
 
  int[][] x = new int[2][]
 sop(x)   //  [[I@2e4ab
 sop(x[0]) // null
 sop(x[0][0]) // RE: NullPointerException
 
 Note: If we are trying to perform any operation on null then we will get Run time exception saying NullPointerException
 
 
 Once we creates an array every array element by default intialized with default values. If we are not satisfied with default values then we can override these values with our customized values.
 
 int[] x = new int[4];
 x[0]=1
  x[1]=10
  x[2]=20
   x[3]=59
   x[4]=70 ; // RE: ArrayIndexOutOfBoundsException
   x[-4]=70; // RE: ArrayIndexOutOfBoundsException
   x[2.5]=56; //CE: Possible Loss of Precission found: double required:int
   
   
   Array Declaration,Creation and Initialization in a single line:
   
   We can create,declare and intialize array in single by below .
   
   int[] x = {10,20,30};
   char[] ch = {'a','e','i','o','u'};
   String[] s = {"a","aa","abdc"};
   
   
   We can use this shortcut for multi dimensional arrays also 
   
   int[][] x= {{10,20},{3,4,5}};
   
   
   If we want to use this shortcut compulsory we should perform all activites in a single line. If we are trying to divide into multiple lines then we will get compile time error.
   
   int[] x = {10,20,8};
   int[] x
   x= {10,20,8} //CE: Illegal start of expression
   
   
   
   length is a final variable applicable for arrays. length variable represents the size of the array
   
   int[] x = new int[6];
   sop(x.length()) //CE: can't find symbol method length()  location: class int[]
   sop(x.length) //6
   
   length() method is final method applicable for String objects. length() method returns no.of characters in the String.
   
   String s = "durga";
   s.length// CE: can't find symbol variable length in location java.lang.String
   s.length(); // 6
   
   
   String[] s={"A","ab","aaa"};
   s.length  // Valid 3
   s.length() //CE: can't find symbol method length() location : class String[]
   s[0].length //CE: can't find symbol variable length location: java.lang.String
   s[0].length(); //1
   
 In Multi dimensional array length variable represents only base type but not total size
 
   int[][] x = new int[6][3]
   
   x.length  //6
   x[0].length //3 
   
   There is no direct way to find the total length of multi dimensional array. But indirectly we can find as follows
   x[0].length+x[1].length+---
   
   
   Annonymous Arrays
   
   An array without name , such type of arrays are called annonymous array. The main purpose for annonymous array is just for instant use. Only one time use.
   
   We can create annonynomous array as follows
   new int[]{10,2,3,4}  // Valid
   new int[][]{{1,2},{2,3,5}} //Valid
   
   While creating these arrays we can't specify the size. If we specify we will get Compile Time error. 
   new int[3]{1,2,4}  // Invalid CE: 
   
   Based on our requirement we can give the name for anonymous array then it's no longer annonymous
   Ex: int[] x = new int[]{10,20,30}; //Valid
   
 
 //In the case of Object type arrays , as array elements we can provide either declared type objects or it's child class objects.
  
  Object[] a = new Object[10];
  a[0] = new Object();
  a[1] = new String("ram");
  a[2]= new Integer(10)
  
  Number[] n = new Number[9];
  n[0]= new Integer(10); //Valid
  n[1]= new Double(10.6); //Valid
  n[2]= new String("Ram") // Invalid CE: incompatiable types found: String Expected:Number
 
  
  For interface type arrays, as array elements it's implementation class objects are allowed.
  Runnable[] r = new Runnable[];
  r[0] = new Thread();
  r[1]= new String(); //CE: Incomptabile Types found: java.lang.String Required: Java.lang.Runnable
  
  

Element level promotions are not applicable at Array level.  Char element can be promoted to int type where char array (object) can't be promoted to int array
Ex: int[] x = {1,2,34}
char[] ch = {'a','b','c'}

int[] b = x;  //Valid
int[] c = ch;  //Invalid


//Promotions are allowed or not
char  int   //Valid
char[]   int[]  //Invalid
int double  //Valid
int[]  double[] //Invalid
float int  //Invalid
float[]  int[] // invalid
String  Object //Valid
String[]  Object[] Valid

String[] s {"a","bb","ccc"}
Object[] a = s; // Valid

 In the case of object type arrays child class type array can be promoted Parent class type array
 
 
 Whenver we are assigning one array to other array internal elements won't be copied just refrence variables will be reassigned.
 
 int[] a={1,2,3}
 int[] b={4,5}
 
 a=b //Valid
 b=a //Valid
 
 
 Whenever we are assigning one array to another array the dimensions must be matached. In the place of 1-D int array we should provide 1-D array. If we provide any other dimension then we will get compile time error.
 
 int[][] a = new int[3][]
 a[0] = new int[4][3] // Invalid . CE: incompaitable types  found: int[][] required int[]
 
 a[0]=10 ;  // Invalid . CE: incompaitable types  found: int required int[]
 
 a[0] = new int[2] //Valid
 
 whenever we are assigning one array to other array both dimensions and data type should be matched but sizes are not required to match
 
 
 class Test
 {
  main(String args[])
  {
   String[] argh={"x","y","z"};
   args= argh;
   for(String s: args)
   {sop(s)}
   
   java test A B C  // output  x,y,z
   java test A B //output x,y,z
   java test // x, y,z
 
 
 */


public class ArrayExamples {

}
