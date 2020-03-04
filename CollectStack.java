package EPAM_Hometask6.EPAM_Hometask6;
import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;
public class CollectStack {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>(); 
		//Pushing the elements into the Stack
		st.push("Hero");
		st.push("Yamaha");
		st.push("Bajaj");
		st.push("Honda");
		st.push("Royal Enfield");
		st.push("KTM");
		st.push("Revolt");
		st.push("Harely Davidson");
		st.push("Splender");
		st.push("Jawa");
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
					System.out.println("Element at index value : "+st.get(index));
					System.out.println("Element fetched successfully!!!");
					break;
			case 2:System.out.println("Enter the element : ");
					String element = sc.next();
					st.push(element);
					System.out.println("Element added successfully!!!");
					break;
			case 3:System.out.println("Enter the element : "+st.peek());
					String element2 = sc.next();
					st.pop();
					System.out.println("Element removed successfully!!!");
					break;
			case 4:Iterator<String> i = st.iterator();
					while(i.hasNext()) {
						System.out.println(i.next());
					}
			case 5:System.exit(1);
					break;		
			}
		}
		}
	}

