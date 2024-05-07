package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testMaximo.class, testMedia.class, testMediana.class, testMinimo.class })
public class AllTests {

}
