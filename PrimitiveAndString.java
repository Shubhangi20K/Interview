package com.multi;

public class PrimitiveAndString {
	
public static void main(String[] args) {
	
	byte x= 100;

String s=	Byte.toString(x);  
Byte y=Byte.parseByte(s);
int z= y.intValue();
System.out.println("PrimitiveAndString.main()" + y);
}

}
