package com.aureliusz;

import static org.junit.jupiter.api.Assertions.*;

class PESELCheckerTest {

    @org.junit.jupiter.api.Test
    void check() {
        PESELChecker check = new PESELChecker();
        assertTrue(check.check("84812382116"));
    }
}