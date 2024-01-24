package inheritance;
public class Address {
		String addressLine,street,city,state,country;
		int pincode;
		public Address() {
			addressLine="Arkhadi Vasti";
			street="Hiwergoan Pawasa";
			city="Sangamner";
			state="Maharashtra";
			country="India";
			pincode=422605;
		}
		public Address(String addressLine, String street, String city, String state, String country, int pincode)
		{
			this.addressLine = addressLine;
			this.street = street;
			this.city = city;
			this.state = state;
			this.country = country;
			this.pincode = pincode;
		}
		public void display()
		{
			System.out.println("Address : "+addressLine+" ,"+street+" ,"+city+" ,"+state+" ,"+country+" ,"+pincode);
		}
	}
