package a.legacy.code;

public class ARMDispatcher {

    //FIXME we have to mock HttpServletRequest in tests
    public void populate(HttpServletRequest request) {
        String[] values = request.getParameterValues(pageStateName);

        if (values != null && values.length > 0) {
            marketBindings.put(pageStateName + getDateStamp(), values[0]);
        }
    }
}
