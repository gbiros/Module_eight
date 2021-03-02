import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
  protected String contactId, firstNameTest, lastNameTest, phoneNumberTest,
      addressTest;
  
  @Test
  void ContactServiceConstructorIntializeEverythingTest() {
    ContactService service = new ContactService(firstNameTest, lastNameTest,
                                                phoneNumberTest, addressTest);
    assertEquals(firstNameTest, service.getContactList().get(0).getFirstName());
    assertEquals(lastNameTest, service.getContactList().get(0).getLastName());
    assertEquals(phoneNumberTest,
                 service.getContactList().get(0).getPhoneNumber());
    assertEquals(addressTest, service.getContactList().get(0).getAddress());
  }
  
@Test
  void updateFirstNameTest() {
    ContactService service = new ContactService();
    service.updateFirstName(service.getContactList().get(0), firstNameTest);
    assertEquals(firstNameTest, service.getContactList().get(0).getFirstName());
  }

  @Test
  void updateLastNameTest() {
    ContactService service = new ContactService();
    service.updateLastName(service.getContactList().get(0), lastNameTest);
    assertEquals(lastNameTest, service.getContactList().get(0).getLastName());
  }

  @Test
  void updatePhoneNumberTest() {
    ContactService service = new ContactService();
    service.updatePhoneNumber(service.getContactList().get(0), phoneNumberTest);
    assertEquals(phoneNumberTest,
                 service.getContactList().get(0).getPhoneNumber());
    assertThrows(
        IllegalArgumentException.class,
        () -> service.getContactList().get(0).updatePhoneNumber(contactId));
  }

  @Test
  void updateAddressTest() {
    ContactService service = new ContactService();
    service.updateAddress(service.getContactList().get(0), addressTest);
    assertEquals(addressTest, service.getContactList().get(0).getAddress());
  }
  
  @Test
  void deleteContactTest() {
    @SuppressWarnings("unused")
	ContactService service = new ContactService("0123456789", "John", "Adams", "5084456478");
    
  }
}
  
  
  