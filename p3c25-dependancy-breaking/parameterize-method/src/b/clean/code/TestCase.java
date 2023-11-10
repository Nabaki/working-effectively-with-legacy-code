package b.clean.code;

public class TestCase {

    private TestResult result;

    void run() {
        run(new TestResult());
    }

    void run(TestResult result) {
        result = result;

        try {
            setUp();
            runTest(result);
        } catch (Exception e) {
            result.addFailure(e);
        }

        tearDown();
    }
}
