public class Contact {

  private static final int Contact_Phonenumber_Length = 10;
  private static final byte Contact_Id_Length = 10;
  private static final byte Contact_FirstName_Length = 10;
  private static final byte Contact_LastName_Length = 10;
  private static final byte Contact_Address_Length = 30;
  private static final String Initializer = "INITIAL";
  private static final String Initializer_Num = "1235559999";
  
  /*
   * Initialize variables
   */
  
  private String contactId;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;
  
  /*
   * build object for contact
   * initialize the variables in Contact()
   */

  Contact() {
    this.contactId = Initializer;
    this.firstName = Initializer;
    this.lastName = Initializer;
    this.phoneNumber = Initializer_Num;
    this.address = Initializer;
  }

  Contact(String contactId) {
    updateContactId(contactId);
    this.firstName = Initializer;
    this.lastName = Initializer;
    this.phoneNumber = Initializer_Num;
    this.address = Initializer;
  }

  Contact(String contactId, String firstName) {
    updateContactId(contactId);
    updateFirstName(firstName);
    this.lastName = Initializer;
    this.phoneNumber = Initializer_Num;
    this.address = Initializer;
  }

  Contact(String contactId, String firstName, String lastName) {
    updateContactId(contactId);
    updateFirstName(firstName);
    updateLastName(lastName);
    this.phoneNumber = Initializer_Num;
    this.address = Initializer;
  }

  Contact(String contactId, String firstName, String lastName,
          String phoneNumber) {
    updateContactId(contactId);
    updateFirstName(firstName);
    updateLastName(lastName);
    updatePhoneNumber(phoneNumber);
    this.address = Initializer;
  }

  Contact(String contactId, String firstName, String lastName,
          String phoneNumber, String address) {
    updateContactId(contactId);
    updateFirstName(firstName);
    updateLastName(lastName);
    updatePhoneNumber(phoneNumber);
    updateAddress(address);
  }
  
  /*
   * create getter method for variables
   */

  protected final String getContactId() { return contactId; }

  protected final String getFirstName() { return firstName; }

  protected final String getLastName() { return lastName; }

  protected final String getPhoneNumber() { return phoneNumber; }

  protected final String getAddress() { return address; }
  
  /*
   * create update method for first name
   * this is so we can enter in a new entry and erase the initializer
   */

  protected void updateFirstName(String firstName) {
    if (firstName == null) {
      throw new IllegalArgumentException("First name cannot be empty");
    } else if (firstName.length() > Contact_FirstName_Length) {
      throw new IllegalArgumentException("First name cannot be longer than " +
                                         Contact_FirstName_Length + " characters");
    } else {
      this.firstName = firstName;
    }
  }
  
  /*
   * create update method for last name
   * this is so we can enter in a new entry and erase the initializer
   */

  protected void updateLastName(String lastName) {
    if (lastName == null) {
      throw new IllegalArgumentException("Last name cannot be empty");
    } else if (lastName.length() > Contact_LastName_Length) {
      throw new IllegalArgumentException("Last name cannot be longer than " +
                                         Contact_LastName_Length + " characters");
    } else {
      this.lastName = lastName;
    }
  }
  
  /*
   * create update method for Phone number
   * this is so we can enter in a new entry and erase the initializer
   */

  protected void updatePhoneNumber(String phoneNumber) {
    String regex = "[0-9]+";
    if (phoneNumber.length() != Contact_Phonenumber_Length) {
      throw new IllegalArgumentException(
          "Phone number length invalid. Ensure it is " +
          Contact_Phonenumber_Length + " digits.");
    } else if (!phoneNumber.matches(regex)) {
      throw new IllegalArgumentException(
          "Phone number cannot have anything but numbers");
    } else {
      this.phoneNumber = phoneNumber;
    }
  }
  
  /*
   * create update method for address
   * this is so we can enter in a new entry and erase the initializer
   */

  protected void updateAddress(String address) {
    if (address == null) {
      throw new IllegalArgumentException("Address cannot be empty");
    } else if (address.length() > Contact_Address_Length) {
      throw new IllegalArgumentException("Address cannot be longer than " +
                                         Contact_Address_Length +
                                         " characters");
    } else {
      this.address = address;
    }
  }
  
  /*
   * create update method for contact Id number
   * this is so we can enter in a new entry and erase the initializer
   */

  protected void updateContactId(String contactId) {
    if (contactId == null) {
      throw new IllegalArgumentException("Contact ID cannot be empty");
    } else if (contactId.length() > Contact_Id_Length) {
      throw new IllegalArgumentException("Contact ID cannot be longer than " +
                                         Contact_Id_Length + " characters");
    } else {
      this.contactId = contactId;
    }
  }
}