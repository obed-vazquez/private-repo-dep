package com.white_sdev.templates.privatedependency;

class WhitePrivateDependencyTest {
    WhitePrivateDependency whitePrivateDependency;

    @org.junit.jupiter.api.BeforeEach
    void beforeEach() {
        whitePrivateDependency = new WhitePrivateDependency();
    }

    @org.junit.jupiter.api.Test
    void adding2Numbers() {
        String logID = "::adding2Numbers(): ";
        System.out.println(logID + "Start");
        int a = 2;
        int b = 3;
        int result = whitePrivateDependency.localAdd(a, b);
        assert (a + b == result);
        System.out.println(logID + "Finish - result:" + result);
    }
}
