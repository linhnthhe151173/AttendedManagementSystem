package model;

import java.sql.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Linh
 */
@Getter
@Setter
@ToString
@Builder
public class Student {
    private String StudentID;
    private String FullName;
    private String Image;
    private Date DOB;
    private boolean Gender;
    private String Address;
    private String PhoneNumber;
    private String Email;
}
