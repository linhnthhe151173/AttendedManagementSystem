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
public class Schedule {

    private int ScheduleID;
    private Teacher Teacher;
    private Subject Subject;
    private Class ClassS;
    private Date Date_Schedule;
    private java.util.Date TimeSlotStart;
    private java.util.Date TimeSlotEnd;

}
