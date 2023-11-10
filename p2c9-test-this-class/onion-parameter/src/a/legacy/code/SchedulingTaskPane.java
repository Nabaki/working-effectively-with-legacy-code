package a.legacy.code;

public class SchedulingTaskPane extends SchedulerPane {

    //FIXME trop compliquer d'instancier cette classe dans les tests, SchedulingTask a certainement d'autres paramètres complexes
    public SchedulingTaskPane(SchedulingTask task) {
        //blabla
    }
}

class SchedulingTask extends SerialTask {

    public SchedulingTask(Scheduler scheduler, MeetingResolver resolver) {
        //blabla
    }
}
