package model;

import java.util.Date;
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
class TimeSlot {
    private int TimeSlotID;
    private Date TimeSlotStart;
    private Date TimeSlotEnd;
}
