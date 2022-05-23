package com.ibm.domain;

import java.util.List;

public class Severity {
    public List<Coding> coding;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }
}
