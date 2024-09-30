import com.lesfurets.jenkins.unit.*
import org.junit.*
import static org.junit.Assert.*;

class ToAlphanumericTest extends BasePipelineTest {
    def toAlphanumeric

    @Before
    void setUp() {
        super.setUp()
        // load toAlphanumeric
        toAlphanumeric = loadScript("vars/toAlphanumeric.groovy")
    }

    @Test
    void testCall() {
        // call toAlphanumeric and check result
        def result = toAlphanumeric(text: "a_B-c.1")
        assertEquals "result:", "abc1", result
    }
}