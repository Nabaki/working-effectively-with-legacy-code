package a.legacy.code;

import java.util.Iterator;
import java.util.List;

public class Scheduler {
    private List<ScheduleItem> items;

    public void updateScheduleItem(ScheduleItem item) throws SchedulingException {
        try {
            validate(item);
        } catch (ConflictException e) {
            throw new SchedulingException(e);
        }
    }


    protected boolean notShared(ScheduleItem item) {
        //blabla
    }

    protected int getClockTime() {
        //blabla
    }

    protected int getStandardFinish(ScheduleItem item) {
        //blabla
    }

    //blabla

    private void validate(ScheduleItem item) throws ConflictException {
        //make call to database
    }

    //FIXME We want to change it but don't cant to initialize bdd
    public int getDeadtime() {
        int result = 0;
        for (Iterator it = items.iterator(); it.hasNext()) {
            ScheduleItem item = it.next();
            if (item.getType() != ScheduleItem.TRANSIENT && notShared(item)) {
                result += item.getSetupTime() + getClockTime();
            }
            if (item.getType() != ScheduleItem.TRANSIENT) {
                result += item.finishingTime();

            } else {
                result += getStandardFinish(item);
            }
        }
        return result;
    }
}