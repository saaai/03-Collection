//we created a class named student.
//with in this class we are goina to store different different objects.
public class Student 
{	
	//to initialize the instance variables we can use constructor method. you can create an object and call the object.
		/*if you don't want to use constructor method to initialize these instance variables,
				we can use the method called setter method. */
		
		
		//setter method -> whatever we have written in between constructor the same thing we will be dividing into different methods
		//format: set(age)
	
	//instance variables
	private int age;
	private String address;
	private String name;
	
	//setter and getter methods  is nothing but using multiple methods to call them separately in different class file.
	public int getAge() {//all the getter methods depends on the data type(which data type they are returning)
		return age;
	}
	public void setAge(int age) {//all the setter methods are with the return type void, because we are setting here not returning anything
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()//to convert from another language(int, or any other) to string format 
	{
		return "Name: "+name+", Age: "+age+" , Address: "+address;
				//here + acts as concatentaion
	}
}








/*CollectioFrameWork:
	 * 
	 * collection is nothing but a group of elements.
	 * what are the draw back s of array?
	 * ans: arrays store single data type
	 * 		arrays size is not dynamic, means once u declare an array u can't increase the size or u can'tshrink the size.
	 *  
	 *  by considering the drawbacks of arrays they came up with collection frame work:
	 *  
	 *  collection is nothing but a group objects,
	 *   it will only store objects within the collection object,
	 *   	it can't store primitive data types(character, float, int, long) values.
	 * 
	 * collection will only store a group of objects with in the collection object .
	 * 
	 * if you go one time you have to get the data in a single chunk itself.
	 * 
	 * when in a network or any communication you have to pass some data, 
	 * 		you will grouping the data together and sending the grouped object only.
	 * 
	 * ex:
	 * obj1 
	 * obj2
	 * obj3
	 * obj4 
	 * we have 4 objects and we need to move all of them from one place to another place or from one class to another class.
	 * 	instead of sending obj1 once, obj2 next and obj3 in the third iteration, obj4 in the fourth iterations, 
	 * 		we can be wrapping everything together by using the collection object,
	 *			so in this collection object you will be adding obj1, obj2, obj3, obj4 
	 *				now by adding all these four object this will become a single collection object
	 *					you'll be moving this single collection object to another place might be a java program or network transfer
	 *					So, now whoever receives this collection object will be fetching the data from this single collection object itself.
	 *	
	 *		-this same thing can be done with arrays also, but using arrays all the objects your keep in the array
	 *			 should only be a single data type.
	 *		-but coming to collection here like, you can give a collection of data types also. 
	 *			it's not mandatory to use a single data type you can keep different data types under one single object 
	 *				and send it anywhere you want or the other party.
	 *
	 * 		-Here different data types means not only the "primitive data types, A class can also be considered as a data type 
	 * 
	 * advantages of collection frame work is:
	 * 
	 * 1) if u want to add one more element you can add one more element to the single collection object set.
	 * 		you can also remove objects if you don't want.
	 * 2) it will be supporting multiple data types.
	 * 
	 * we can group the entire collection object into four interfaces here, 
	 * 		one single interface can have multiple implementation classes,
	 * 			based on the implementation classes we will be using them or dividing them based on our requirement.
	 * 
	 * 
	 * 		interfaces 				|	implementation classes
	 * 	_______________________________________________________________________
	 * 			Set	interface has 	|			hashSet as implementation classes
	 *								|
	 * 								|
	 * 			List	||			|			LinkedList
	 *								|			ArrayList
	 * 								|
	 * 			Queue	||			|			LinkedList
	 * 								|
	 * 								|
	 * 			Map		||			|			HashMap
	 * 								|
	 * 
	 * LinkedList is a multiple inheritance because it's having List and Queue as parents classes
	 * 
	 * 
	 * set/queue/list/map the purpose is we have to use them for grouping the elements only, 
	 * 		depending on the requirements we will be using whether to go for set or map or queue or list.
	 * 
	 * Now, Set is a group of elements where it won't support duplicates means ex: 123 then size of set is three 
	 * 					then again if u r adding 3 or 2 it wont be increasing the size, 
	 * 						but instead it will be overriding with the previous value only.
	 * 
	 * Now, List is a group of elements / collection of objects but this supports duplicate elements.
	 * 	ex: if we add 123 now the size is 3 and again if we add 1 then the size will be increasing to four.
	 * 
	 * Now, Queue will be using internally first in first out(FIFO) mechanism.
	 * 
	 * Now, Map will be expecting "keys" and "values" pair where key should be unique and values can be duplicated.
	 * 			basically, key is like a identifier and value can be duplicates.
	 *				keys is like set and values are like List 
	 *
	 *	def: an object that maps keys to values. a map contains duplicate keys, each key can map to at most one value.
	 *
	 * Note: all these classes and interfaces belong java.util package.
	 * 
	 * 			we don't create any variables with any access specifiers.
	 * access specifiers : public, private, protected, default
	 * 			default is not a keyword, default is default only we don't use it as keyword.
	 * 			most of the time we will create with "private" only.
	 * 	we should mention the type of access specifiers then only it will be applicable
	 * 	ex: if u use public then only it will be public
	 * 		if u use private then only it will be private
	 * 		if u use protected then only it will be protected 
	 * 		if u don't give anything it will be default access only providing default access only.
	 * 		
	 *-the particular class with only getter and setter methods is called "bean class",
	 *		in this particular class we only write a few variables and getter and setter methods that's all.
	 *
	 *-in this bean class whenever your'e creating an instance variable we need to use private as access specifier.
	 *- if private is given this particular variable cannot be accessed outside, 
	 *			but still if u want to access the name variable outside we can make use of our public methods get"variablename" and set"variablename" methods.
	 * 
	 *- if u want to set go for calling set"variablename" methods. 
	 *- if u want to go for getting the value  go for calling get"variablename" methods.
	 *
	 *if you don't give private access specifiers for the variable then u can use the variables directly without using get and set methods.
	 *		So, to avoid calling directly we are giving private access specifier
	 *
	 *
	 *
	 * 
	 * 
	 * 
	 * 
	 * 




*/