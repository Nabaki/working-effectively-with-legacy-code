package a.legacy.code;

import java.util.HashMap;
import java.util.Map;

public class Facility {

    private Permit basePermit;

    public Facility(int facilityCode, String owner, PermitNotice notice) throws PermitViolation {
        //FIXME don't want to use it in tests
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
}
