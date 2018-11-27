
public class Person {
	private String name;
	public String getName() {
		return name;
	}
	private Car car;
	public Car getCar() {
		return car;
	}
	public Person(String name,Car car) {
		this.name = name;
		this.car = car;
	}
		
	@Override
	public String toString() {
		return "Person name: " + "Car name ";
	}

	
	public static Car[] getCars(Person[] arr) {
		Car[] crr = new Car [arr.length];
		for(int a = 0; a<arr.length; a++) {
			crr[a] =arr[a].getCar();
		}
		return crr;
		
		
	}
	public static Car[] expensiveCars(Person[] arr,int a) {
		Car[] ccrr = new Car [arr.length];
		int count = 0;
		for(int b = 0; b<arr.length;b++) {
			if(arr[b].getCar().getPrice() >= a) {
				ccrr[b]= arr[b].getCar();
			}
			else
			{
				count++;
			}
		}
		if(count <= 0) {
			return null;
		}
		else {
			return ccrr;
		}
		}
		
		
	}
	
	
	
	
	
	
	
	
	

