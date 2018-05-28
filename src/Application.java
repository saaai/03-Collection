import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//now we are creating map<k,v> object
		HashMap<String,Student> map = new HashMap<String,Student>();
		/*	we are replacing v with Student here why because the type of values, 
		 * 	which i am  going to deal in my example is student class objects, 
		 * 		we just mentioned the type of object name here the type is nothing but student 
		 * we need to consider that even the class acts as a data type internally.
		 * since, we string keys we change the k as String
		 * 
		 * ctrl+shift+o is for organizing java.util packages.
		 * 
		 * 
		 * now after creating hash method object, now need to store or keep some data with in the map,
		 * 		now we need to find couple of methods to add or store the data
		 * 			the names for adding or storing the data is "put, store, add" to search them in the java api documentation.
		 *  
		 *  put(K key, V value) - to store or add 
		 *  
		 *  Now we need to create methods which gives student object (means student class object).
		 *  	ex:if it is going to give integer object we need to make the return type as integer.
		 *  		same way since, when it's returning student object we need to make the return type as student.
		 *  
		 *  key should be unique, even though if u use the same key for another value its gonna override the previous value
		 *  
		 *  Now, to call the create student method again i have to create the different different students object by passing the three parameters for the application class, 
		 *  	just to avoid that we are making the below student method as static. 	
		 *  		this is just for our convenience.
		 * 
		 *  we have created the map variable here only with in the main method so which means your'e creating the variable and 
		 *  	using it in the same method both things are happening in the static context only.
		 */  
		 
		//now, we are trying to store the createstudent parameters in the st1 variable and we are passing the three parameters we are not using object or classname as reference
		Student st1 = createStudent("name1","address1", 26);
		Student st2 = createStudent("name2","address2", 26);
		/*
		 * we r not using create student object or classname as reference, we can use this directly when this is in the same class, 
		 * 		but when it is in different class we can't call it directly and also it will be checking in the current class only, 
		 * 			so when we are calling outside this same class we need to call using "classname.createStudent".
		 * 
		 * Now, we have to add  the above two objects st1 and st2 with in the map, 
		 * 		to the add data to the map the method we have seen is "put(K key, V value)" in this we replaced k with string and v with student here.
		 * 			so now when we try to call map.put it's gonna show us string, student.
		 * 
		 * Here internally, put method is non static method, but we are still able to use it here because we are not only using put method directly, 
		 * 		for calling that method we are calling it with object(map is the object) now.
		 *  		thats why it's working now, if your'e not using object and ur trying to call it directly it's not gonna work it's gonna throw an error.
		 *  
		 * if the method is not in the static context but the method your'e trying to call is combined with the static context object it will work without errors. 
		 * ex: map.put(K Key, V value), put is a non static method but map object is a static variable sp if u combine these two it will work.
		 *  
		 *  static variables can't be created within the method, you can only create in class levels only.
		 *  
		 *  
		 */
		 //id1 and id2 are the keys and st1 and st2 are the objects
		map.put("ID1",st1);//key value as ID1 and value as st1 which we stored the parameters in the above create student
		map.put("ID2",st2);
		map.put("ID3", null);//even if the key is exsisting but the value of they key is null so it will return null point exception.
		//map doesn't support duplicate values in the key , if u give duplicate value its gonna override the old one and keep the new value.
		 /*
		 	now we need to fetch the data form the map above and  read the objects here, 
		 * 		we need to check what are all the method it supports for fetching the data.
		 * 			method: map.get()
		 * 
		 * if you want to get the individual values and you know about the key,
		 * 	 then you will be calling map.get() by passing the key and getting the value.
		 * 
		 * if your'e not sure about the key, 
		 * 		then we can go for the key set and we can fetch all the keys and 
		 * 			we can affiliate all the values here.
		 *  
		 */ 
		 
		Student a = map.get("ID1");//storing the data in a variable st and passing the key through map.get()
		//suppose if you give some other data ex:abc, other than ID1 or ID2 then its null becaouse that abc data doesn't exists
		//get method is to return the value to which the specified key is mapped.
		if(a != null)//to check if the data we r trying to retrieve is null or not if it's not null then display the values.
		//
		{
			
		System.out.println("Name:" + a.getName());//displaying the  value
		System.out.println("Address:" + a.getAddress());
		System.out.println("Age:" + a.getAge());
		
		} else {
			System.out.println("No student found with the key you entered:" + map.get(a));
		}
		
		/*
		 *  line 77 - 90 is the code for getting the result of a particular student
		 * 
		 * Now, below we will write a code to retrieve all the key values. line 95- 
		 * we are gonna use keyset() method to retrieve all the key values.
		 * as per the name key set it's going to give me the names of they set of keys.
		 * Set<E> in the place of E we give string because we our key type is string
		 *  
		 *  we are gonna use the for each loop for iterating, for each loop is used only for arrays and collections.
		 * 
		 * to iterate the data from a collection object :
		 * we have, Iteration
		 * 			Enumeration
		 * 			for each loop
		 */
		
		Set<String> keys = map.keySet();//creating set object
		 // for( String key : keys )//inside the for loop we need to write a statement which will be iterating the data from keyset() 
		/*
		 * this for loop will be iterating depends on the input that we are giving here
		 * 
		 * the keys set is having for ex: 3 elements (name, address, age)
		 * so in the 1st iteration it will be taking the first element from the keys and it will be assigning it to the variable "key".
		 *  	in the 2nd iteration it will take the second value from the keys and it will assign it to the variable "key".
		 *  	in the 3rd iteration it will be getting the 3rd value from the key and it will be assigning it to the variable "key".
		 *  
		 *  so it will be keep on iterating until the number of elements in the keyset is 0.
		 *  that means for each element of key equal to key.
		 *   
		 */
			Iterator<String> it = keys.iterator();//iterator is used for getting n no. of iterations
			//initializing iterator and assigning it to a variable, storing the data keys to iterator.
		while(it.hasNext())/*while will be expecting a condition which in turn returns a boolean value, hashnext gives boolean value this satisfies the while condition if there's any next element,
									other wise it wont satisfies the condition here it will be coming out of the loop.*/
		{
				String key = it.next();//now the key will be like this String key = it.next()
				Student st = map.get(key);//we will be getting the element here student st equals to map.get(key)
				
				System.out.println(st);//this displays the student class name and  hash code means internal memory or something else.
				//it's a alphanumeric string 
				
			
				
		}
		/*{
			Student st = map.get(key);
			System.out.println(key);
			System.out.println("Name:" + st.getName());//displaying the  value
			System.out.println("Address:" + st.getAddress());
			System.out.println("Age:" + st.getAge());
			}*/
	
	}
	
	//Student method
	static Student createStudent(String name, String address, int age)//based on the 3 values we are preparing the student object 
		//here, create student is method of this particular class only if u have to call it outside this class you need to use"MyApplication.createStudent" 
		//since create student is also static method, we are able to call it in the above static main function.
		{
			Student st = new Student();//creating student object 
			//calling all the setter methods
			st.setName(name);//passing name
			st.setAddress(address);//passing address
			st.setAge(age);//passing age
			return st;//returning the student class object here
		}
		
	}



/* Nov 30th video:
 * 
 *  
 *  
 * after one hour:
 * 
 * file system:
 * 
 * to read from the file and to write to the file.
 * 
 * fileinputstream and filereader  are both recommended for reading a file.
 * 
 * ex: to read ur resume or any other text file.
 * 
 * FileInputStream(String name) : method is the easy way to call a file .
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */





