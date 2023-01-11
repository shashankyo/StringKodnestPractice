package simpleString;

public class pROGRAM {
public static void main(String[] args) {
//string output
String str = "kodnest";
System.out.println(str);
System.out.println(str.length());

//Empty string 
String str2 = "";
System.out.println(str2);
System.out.println(str2.length());

//display double qoute using ASCII
char a = 34;
char b = 34;
System.out.println(a+""+b);

//double qoute using backslash
System.out.println("\"\" ");

//WAY OF CREATING STRING USING COMBO OF BUFFER,BUILDER

String x = "kodnest";
StringBuilder y = new StringBuilder(x);
StringBuffer z = new StringBuffer(y);
System.out.println(z);

//printing all char of string using for loop

String e = "kodnest";
char[] charArray = e.toCharArray();
for(int i=0;i<charArray.length;i++)
{
	System.out.println(e.charAt(i));
}
//printing all char of string using while loop
String u = "kodnest";
int i=0;
while(i<u.length()) {
	System.out.println(u.charAt(i++));
}

}
}
