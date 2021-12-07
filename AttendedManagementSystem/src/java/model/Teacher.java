package model;

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
public class Teacher {
    private int TeahcerID;
    private String TeacherImage;
    private String TeacherName;
    private String TeacherEmail;
    private String TeacherAddress;
    private String TeacherPhone;
}
