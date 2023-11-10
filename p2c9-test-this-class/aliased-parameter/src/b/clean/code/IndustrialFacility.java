package b.clean.code;

public class IndustrialFacility {

    Permit basePermit;

    /**
     * Utilisation de subclass and override method
     */
    public IndustrialFacility(int facilityCode, String owner, OriginationPermit permit) throws PermitViolation {
        Permit assciatedPermit = Permitrepository.getInstance().findAssociatedFromOrigination(permit);

        if (assciatedPermit.isValid() && !permit.isValid()) {
            basePermit = assciatedPermit;

        } else if (!permit.isValid()) {
            permit.validate();
            basePermit = permit;

        } else {
            throw new PermitViolation(permit);
        }
    }
}

class IndustrialFacilityTest {
    public void testHasPermits() {
        Facility facility = new IndustrialFacility(Facility.HT_1, "b", new AlwaysValidPermit());
        assert facility.hasPermits() == true;
    }

    class AlwaysValidPermit extends OriginationPermit {
        public void validate() {
            //set the validation flag
            becomeValid();
        }
    }

}