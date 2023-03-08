package javaprograms;

public class DataTypes {

	/*
	  Float  size = 4 bytes range = -3.4 e 38 to 3.4 e 38  (Single precision . 4 to 5 digit accuracy - less accuracy
	  Double size = 8 bytes -1.7 e 308 to 1.7 e 308 (Double precision  - 14 to 15 digit accuracy  - more accuracy
	

	  For boolean size not applicable (Virtual machine dependent) and range not applicable but allowed values are true or false.
	  
	  	boolean b= true; //Valid
		boolean a= 0 ; //invalid  [Compile error incompatible types found: int required:boolean
		boolen c = True; //Invalid [Can't find symbol variable True
		boolean d = "True"; // incomptaible type found java.lang.String required: boolean
		
		
		int x=0;
		if(x) //
		{sop(x)}
		else
		{sop("hi")}
		
		Compile Time error : Incompatible type found: int required: boolean
		
		while(1)
		{
		sop("hello")
		}
		Compile Time error : Incompatible type found: int required: boolean
	
		*******
		
		Char  
		Size : 2 Bytes Range  0 to 65535
		Java - UniCodes
		Old languages (C,C++) are ASCII code base and no.of allowed diff ASCII characters are less than 256. To represent these 256 chars 8 bit are enough hence the size of Char in old languages is 1 byte.
		Java is unicode based and the no.of diff unicode chars are > 256 and less <=65536. To represent these many chars 8 bits are not enough ,compulsory we should go for 16 bits. Hence the size of char in Java is 2 bytes. 
		
		
		Summary of Java Primitive data types
		
		DataType 	Size	Range				Wrapperclass	Default
		byte		1 byte	-128 to 127			Byte			0
		short		2 byte -32767 8to 32767		Short			0
		int			4 byte -2 p31 to 2 p31 -1	Integer			0
		long		8 byte -2 p63 ti 2 p61 -1	Long			0
		float		4 byte -3.4e38 to 3.4e38	Float			0.0
		double		8 bytes -1.4e308 to 1.4e308	Double			0.0
		boolean		NA		NA					Boolean			false
		char		2 bytes	0 to 65535			Character		0 (represents space character)
		
		null for primitive data types not applicable. Get complile time error found: char required: character
		null is the default value for object reference and we can't apply for primitive data types. If we tried to use for primitives then we get compile time error
		char ch = null; // Incompatiable type : found: null type required: char
		
	
	Literal
	
	A constant value which can be assigned to a variable is called a literal 
	int x = 10 ; 
	int is datatype or keyword. x is name of variable or identifier and  10 is the literal 
	
	Integral Literals
	For integral data types (byte,short,int,long) we can specify the value in the following ways.
	Decimal Form (Base 10) . Allowed digits are 0 to 9
	int x = 10;
	
	Octal Form (Base 8) . Allowed digits are 0 to 7. Literal value should be prefixed with 0
	int x = 0123;
	
	HexaDecimal Form (Base 16) . Allowed digits are 0 to 9 , A to F.
	For extra digits (A to F) we can use both lower and upper case characters . This is one of very few areas where java is not case sensitive. The literal value should be prefixed with 0X or 0x
		
		int x =0x12Af;
		int y = 0X23FbCD;
		
		There are only  possible ways to specify literal value for integral data types.
		
		int x=10 //Valid
		
		int x =0786 // Invalid : integer number too large
		
		int x =0777 // valid
		
		int x = 0XFacE // valid
		
		int x = 0XBeef // valid
		
		int x = 0XBeer // Invalid
		
		
		int x =10;
		int y=010;
		int z=0X10;
		
		sop(x +"--"+y+"---"+z)
		10 --8--16
		
		By default every integral literal is off int type , but we can specify explicity as long type by suffixed with l or L
		
		int x = 10 ; // valid
		
		long l = 10l ; // valid
		
		int x = 10L ; // Invalid : Possible loss of precision Compile error found: long required: int 
		
		long l =10 // valid
		
		
		There is no direct way to specify byte and short literals explicitly but indirectly we can specify . Whenever we are assigning integral literal to the byte variable and if the value is within the range of byte then compiler treats it automatically as byte or short literal . 
		
		byte b =10 ; // valid
		byte b =127 // valid
		byte b =128 // Invalid : Possible loss of precision found:int requried: byte
		
		short s=32767 // valid
		short s =32768 //Invalid  Possible loss of precision found:int requried: short
		
		
		By default every floating point literal is of double type and hence we can't assign directly to float variable .
		But we can specify floating point literal as float type by suffixed with f or F . 
		
		float f = 123.456 // Invalid Possible loss of precision found: double required : float 
		
		float f = 123.456f // valid
		double d = 123.456 // valid
		
		double d = 123.4567D //valid
		
		float f = 123.4567d //invalid  CE: Possible loss of precision found: double required: float
		
		We can specify explicity floating point literal as double typ by suffixed with d or D . Of course this convention is not required
		
		
		
	
		double d = 123.456; // valid
		double d =0123.456; // valid - it it decimal literal not octal literal
		double d =0X123.456 // Invalid CE: malformed floating point literal 
		
	
	We can specify floating point literal only in decimal and we can't specify in octal and hexadecimal forms
	
	double d = 0786; Invalid  CE: integer number too large
	double d =0XFace;  valid
	double d =0786.0;  // valid
	double d = 0XFace.0  // Invalid

	double d = 10 ; // Valid
	double d =0777 ; // Valid
	
	We can assign integral literal to floating point variables and that integral literal can be specified either in decimal , octal or hexadecimal forms
	
	double d =10 ; // valid
	int x =10.0 // Invalid CE: possible loss of pression found:double required: int
	
	We can't assign floating point literals to integral types


	double d = 1.2e3;  //1.2 * 1000 = 1200.0  // Valid
	
	float f = 1.2e3 // Invalid CE : Possible loss of precision found: double required: float
	
	float f =1.2e3f // Valid 
	
	We can specify floating point literal even in exponential form(scientific notation)
	
	The only allowed value for boolean data types are true or false
	boolean b = true; //valid
	boolean b =0; //invalid CE : invalid comptiable Tye found: int required : boolean 
	boolean b = True ; // invalid CE: Can't find symbol for variable True 
	boolean b = "true";  //invalid CE : incompatiable types found:java.lang.String required: boolean
	
	
	CHAR Literals
	We can specify char literal as single character within single quotes. 
	char ch = 'a';  // Valid
	
	char ch = a; //Invalid  CE: can't find symbol. Variable : a
	
	char ch ="a"; // Invalid CE : Incompatiable types found: java.lang.String required:char
	
	char ch ='ab'; //Invalid CE: Unclosed char literal 
	CE: Unclosed char literal 
	CE: Not a  statement
	
	
	We can specify char literal as integral literal which represents the unicode value of the character and that integral literal can be specified in decimabl,octal or hexadecimal forms. But allowed range is 0 to 65535
	
	char ch = 97; //Valid . Prints a
	char ch = 197 // Valid prints + 
	Char ch = 1970 // Valid prints ? . The corresponding character not available in the system.
	char ch = 0XFace; //Valid
	char ch = 0777 // Valid
	char ch = 65535 // Valid
	char ch = 65536 // Invalid  CE: Possible loss of precision found: int required:char
	
	We can represent char literal in unicode representation which is nothing but /uxxxx  backslash4 digit hexa decimal number
	char ch ='\u0061';
	sop(ch) // prints equals to 97 which is a; 
	
	
	Every escape character is a valid char literal 
	char ch='\n' //Valid 
	char ch = '\t' //Valid
	char ch='\m' // Invalid
	
	Escape Character     Description
	\n - New Line
	\t - Horizontal Tab
	\r - Carriage return  Moving to the first character in nextline  
	\b - back space
	\f - Form feed
	\' - Single quote
	\" - double quote
	\\ - back slash
	
	
	char ch= 65536 // Invalid
	char ch=0XBeer // Invalid
	char ch= \face  // Invalid
	char ch ='\face'  //Valid
	char ch= '\m' // Invalid
	char ch = '\iface' // Invalid
	
	
	Any sequence of characters with in double quotes "" is treated as string literal.
	
	String name ="Ramesh";
	
	
	In 1.7 version enhancement w.r.t. literals
	
	Binary Literal
	For integral data types until 1.6 version we can specify literal value in the following ways
	decimal form
	octal form
	hexadecimal form
	
	From 1.7 onwards we can specify literal value even in binary form. Allowed digits are 0 and 1 . Literal value should be prefixed with 0B or 0b.
	Ex: int x =0b1111 // Valid 15
	
	
	Usage of _ underscore symbol in numeric lietral.
	From 1.7 version onwards we can use _ symbol between digits of numeric literal
	
	double d= 123456.789
	double d= 1_23_456.7_8_9 //valid
	double d =123_456.789 //valid
	
	
	The main advantage of this is readbility of the code will be improved.
	At the time of compilation these _ symbols will be removed automatically . Hence after compilation the above lines will become double d =123456.789
	
	
	double d=1__23_4_5___6._6_7_8
	
	We can use more than one _ symbol also between the digits
	
	We can use _symbol only b/w the digits . If you are using any where else we will get compile time error
	
	double d =_1_23_456.7_8_9  //Invalid
	double d = 1_2_3_456_.78_9  //Invalid
	
	
	byte -->short -->int-->long-->float-->double 

	char-->int 
	

8 byte long value we can assign to 4 byte float variable because both are following diff memory representations internally

float f =10L;

sop(f) //10.0

*/
	
	public static void main(String[] args) {
 
	

	}

}
