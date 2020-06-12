package com.aureliusz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateFileTest {
    CreateFile file = new CreateFile();

    @Test
    void save() {
        file.save("Poznan","Jakub","Blaszczykowski", "84812382116");
    }
}