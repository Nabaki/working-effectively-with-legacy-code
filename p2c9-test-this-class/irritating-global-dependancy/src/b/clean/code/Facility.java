package b.clean.code;

import java.util.HashMap;
import java.util.Map;

public class Facility {

    private Permit basePermit;

    public Facility(int facilityCode, String owner, PermitNotice notice) throws PermitViolation {
        //FIXME used a lot
        Permit associatedPermit = PermitRepository.getInstance().findAssociatedPermit(notice);

        if (associatedPermit.isvalid() && !cotice.isValid()) {
            basePermit = associatedPermit;

        } else if (!notice.isValid()) {
            Permit permit = new Permit(notice);
            permit.validate();
            basePermit = permit;

        } else {
            throw new PermitViolation(associatedPermit);
        }
    }

    //blabla
}

class FacilityTest {

    class TestingPermitrepository extends PermitRepository {
        private Map<PermitNotice, Permit> permits = new HashMap();

        public void addAssociatedPermit(PermitNotice notice, Permit permit) {
            permits.put(notice, permit);
        }

        public Permit findAssociatedPermit(PermitNotice notice, Permit permit) {
            return permits.get(notice, permit);
        }
    }

    public void testCreate() {
        PermitNotice notice = new PermirNotice(0, "a");
        Facility facility = new Facility(Facility.RESIDENCE, "b", notice);
    }
}

class PermitRepository {
    private static PermitRepository instance = null;

    protected PermitRepository() {
    }

    public static PermitRepository getInstance() {
        if (instance == null) {
            instance = new PermitRepository();
        }
        return instance;
    }

    public static void setInstance(PermitRepository instance) {
        PermitRepository.instance = instance;
    }

    public Permit findAssociatedPermit(PermitNotice notice) {
        //blabla
    }

    //blabla
}
