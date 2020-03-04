package EPAM_Hometask6.EPAM_Hometask6;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class CollectLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); 
		//Adding the elements into the LinkedList
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Nine");
		list.add("Ten");
		while(true)
		{
			System.out.println("1.Fetch an element");
			System.out.println("2.Add an element");
			System.out.println("3.Remove an element");
			System.out.println("4.Elements in the list are");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the index value : ");
					int index = sc.nextInt();
					System.out.println("Element at index value : "+list.get(index));
					System.out.println("Element fetched successfully!!!");
					break;
			case 2:System.out.println("Enter the element : ");
					String element = sc.next();
					list.add(element);
					System.out.println("Element added successfully!!!");
					break;
			case 3:System.out.println("Enter the element : ");
					String element2 = sc.next();
					list.remove(element2);
					System.out.println("Element removed successfully!!!");
					break;
			case 4:Iterator<String> i = list.iterator();
					while(i.hasNext()) {
						System.out.println(i.next());
					}
			case 5:System.exit(1);
					break;		
			}
		}
		}
	}


