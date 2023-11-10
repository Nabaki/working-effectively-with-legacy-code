package b.clean.code;

import java.util.Iterator;
import java.util.List;

public class Scheduler extends SchedulingServices {
    private List<ScheduleItem> items;

    public void updateScheduleItem(ScheduleItem item) throws SchedulingException {
        try {
            validate(item);
        } catch (ConflictException e) {
            throw new SchedulingException(e);
        }
    }

    //blabla

    private void validate(ScheduleItem item) throws ConflictException {
        //make call to database
    }

}

abstract class SchedulingServices {
    private List<ScheduleItem> items;

    protected boolean notShared(ScheduleItem item) {
        //blabla
    }

    protected int getClockTime() {
        //blabla
    }

    protected int getStandardFinish(ScheduleItem item) {
        //blabla
    }

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

public class TestingSchedulingServices extends SchedulingServices {
    public TestingSchedulingServices() {
    }

    public void addItem(ScheduleItem item) {
        items.add(item);
    }
}

class SchedulingServicesTest extends TestCase {
    public void testGetDeadTime() {
        TestingSchedulingServices services = new TestingSchedulingServices();
        services.addItem(new SceduleItem("a", 10, 20, ScheduleItem.BASIC));
        assertEquals(2, services.getDeadtime());
    }
}