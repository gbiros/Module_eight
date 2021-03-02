import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
@SuppressWarnings("unused")
private String id, description, tooLongDescription;
@SuppressWarnings("unused")
private Date date, pastDate;

@SuppressWarnings("deprecation")
@Test
void setUp() {
  id = "0000000001";
  description = "The appt object shall have a required description.";
  date = new Date(3021, Calendar.JANUARY, 1);
  tooLongDescription =
      "This description is too long for the appointment requirements but good for testing.";
  pastDate = new Date(0);
}

@SuppressWarnings("deprecation")
@Test
void setup1() {
	id = "0000000000001";
	description = "This is too long of an ID";
	date = new Date(2021, Calendar.FEBRUARY, 14);
}

@SuppressWarnings("deprecation")
@Test
void setup2() {
	id = "0000000002";
	description = "this date is in the past";
	date = new Date(1995, Calendar.FEBRUARY, 14);
}


}
