package ie.gmit;

public class Passenger {

	private String title;
	private String name;
	private String id;
	private String phone;
	private int age;

	public Passenger(String title, String name, String id, String phone, int age)
	{
		setTitle(title);
		setName(name);
		setId(id);
		setPhone(phone);
		setAge(age);
	}

	//Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms") )
		{
			this.title = title;
		}
		else
		{
			throw new IllegalArgumentException("Invalid Title");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() >= 3)
		{
			this.name = name;
		}
		else
		{
			throw new IllegalArgumentException("Name must have more than 3 letters");
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id.length() >= 10)
		{
			this.id = id;
		}
		else
		{
			throw new IllegalArgumentException("ID must be at least 10 digits");
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if(phone.length() >= 10)
		{
			this.phone = phone;
		}
		else
		{
			throw new IllegalArgumentException("Phone must be at least 10 digits");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 16)
		{
			this.age = age;
		}
		else
		{
			throw new IllegalArgumentException("Must be older than 16");
		}
	}
}
