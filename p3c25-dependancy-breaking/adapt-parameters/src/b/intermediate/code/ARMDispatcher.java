package b.intermediate.code;

public class ARMDispatcher {

    public void populate(ParameterSource source) {
        String value = source.getParameterForName(pageStateName);

        if (value != null) {
            marketBindings.put(pageStateName + getDateStamp(), value);
        }
    }
}


interface ParameterSource {
    String getParameterForName(String name);
}

class FakeParameterSource implements ParameterSource {

    public String value;

    @Override
    public String getParameterForName(String name) {
        return value;
    }
}

class ServletParameterSource implements ParameterSource {

    private final HttpServletRequest request;

    public ServletParameterSource(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String getParameterForName(String name) {
        String[] values = request.getParameterValues(name);

        if (values == null || values.length < 1) {
            return null;
        }
        return values[0];
    }
}