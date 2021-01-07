package step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

	public static void main(String[] args) {
	
		Person p1 = Person.builder()
				.firstName("FirstName")
				.lastName("LastName")
				.addressOne("·ê·ç¶ö¶ó ÁÖ¼Ò")
				.addressTwo("Address Two")
				.birthDate(LocalDate.of(2002, Month.AUGUST, 12))
				.sex("male")
				.driverLicense(true)
				.married(true)
				.build();
		
		System.out.println(p1.getAddressOne());
		
		
		
	}
	
//	public static Person createPersonForTesting() {
//		
//		Person person = new Person();
//		person.setFirstName("FirstName");
//		person.setLastName("LastName");
//		person.setAddressOne("Address1");
//		person.setAddressTwo("Address2");
//		person.setSex("Man");
//		person.setDriverLicense(false);
//		person.setMarried(true);		
//		return person;	
//	}

}
