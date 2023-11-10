package a.legacy.code;

public class TestCase {

    void run() {
        result = new TestResult();

        try {
            setUp();
            runTest(result);
        } catch (Exception e) {
            result.addFailure(e);
        }

        tearDown();
    }
}
