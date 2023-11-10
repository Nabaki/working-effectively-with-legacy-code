package a.legacy.code;

public class IndustrialFacility {

    Permit basePermit;

    /*
     * FIXME
     * OriginationPermit implémente FacilityPermit qui étend lui-même Permit.
     * On ne peut pas utliser "extract interface" sans devoir créer des interface pour chaque couche,
     * ce qui est très intrusif pour pas grand chose
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
