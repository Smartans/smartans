import java.util.*;
import java.io.*;
public class MainDriver {
public static void main(String[] args) {
// creates MyArray object with initial capacity
MyArray words = new MyArray(10);
Scanner scanner = null;
try {
scanner = new Scanner(new
File("/Volumes/BACK UP/Dhaval/Work/Eclipse Workspace/DataStructures/src/childrensbible.txt"));
while(scanner.hasNextLine()) {
String line = scanner.nextLine();
String[] wordsFromText = line.split("\\W");
/*
* when inserting, duplicates are allowed
* add method takes care of validating words
* array doubles its size when necessary
*/
for(String word:wordsFromText)
words.add(word.toLowerCase());
}
} catch(FileNotFoundException e) {
System.err.println("Cannot find the file");
} finally {
if(scanner!= null) scanner.close();
}
// find a word in the words array 
if(words.search("god"))
System.out.println("god is found"); 
else
System.out.println("not found");
// print current number of words
System.out.println("Number of words in the file is : "+words.size());
// print capacity, or the current length, of the array 
// capacity will be increased as necessary based on doubling-up resizing policy 

System.out.println("Capacity of words array is:"+words.getCapacity());
// print words in the words array 
//words.display();
/*
* remove all of the duplicates in the words array
* Think carefully about how you would perform!
*  1. You are not allowed to use Java Collections 
Framework
* 2. You are not allowed to use any other data
structures to save your memoryfd
*  3. You are not allowed to use any sorting algorithms
*/
words.removeDups();
System.out.println("Number of words w/o duplicates is : "+words.size());
//words.display();
}
}