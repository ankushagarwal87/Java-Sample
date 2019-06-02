package ankush.codejam;

	public class QueueDemo {
		 int size = 0;
		 int top = -1;
		 int rear = 0;
		 int arr[];
		 int capacity;
		 QueueDemo(int capacity){
			 arr = new int[capacity];
			 this.capacity=capacity;
		 }
		 

		 public void push(int pushedElement) {
		  if (top < capacity - 1) {
		   top++;
		   arr[top] = pushedElement;
		   System.out.println("Element " + pushedElement   + " is pushed to Queue !");
		//   display();
		  } else {
		   System.out.println("Overflow !");
		  }

		 }

		 public void pop() {
		  if (top >= rear) {
		   rear++;
		   
		   System.out.println("Pop operation done !");
		 //  display();
		  } else {
		   System.out.println("Underflow !");
		  }
		 }

		 public void display() {
		  if (top >= rear) {
		//   System.out.println("Elements in Queue : ");
		   for (int i = rear; i <= top; i++) {
		    System.out.println(arr[i]);
		   }
		  }
		 }
	}
		 