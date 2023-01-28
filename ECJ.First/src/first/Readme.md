#Eclipse Compiler for Java (ECJ)

## What Does the Compiler Do?

- Compiles the correct Code into Java Byte Code
- Adds some code - eg default constructor in some cases
- Flags different errors
	- return type error checking
	- flow analysis

## What is the Output of the Compiler? 
- Byte Code for "Correct Code"
- Error Message
- Intermediate Code/Abstract Syntax Tree

## What is meant by the "correct" code?
Any code that adheres to the Java Language Standards

## What is there in the Java Byte Code .class file?
- Class Description
 	- Method 1
 		- method description
 		- Stack Size
 		- No of Local Variables
 		- parameters
 		- byte code statements
 	- Method 2
 		...
 		
 	- Local Variable/Line number information
 	- Byte Code Verification Information
 	- Other details
 	
## How does the compiler know the format for generating the byte code?
Adheres to the Java Virtual Machine Specification

## What are the different types of Errors the compiler gives?
it