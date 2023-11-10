package b.clean.code;

public class SchedulingTaskPane extends SchedulerPane {

    //FIXME trop compliquer d'instancier cette classe dans les tests, SchedulingTask a certainement d'autres paramètres complexes
    public SchedulingTaskPane(ISchedulingTask task) {
        //blabla
    }
}

class SchedulingTask extends SerialTask implements ISchedulingTask {

    public SchedulingTask(Scheduler scheduler, MeetingResolver resolver) {
        //blabla
    }
}

/**
 * Permet de créer un FakeSchedulingTask (extract interface)
 */
interface ISchedulingTask {

}