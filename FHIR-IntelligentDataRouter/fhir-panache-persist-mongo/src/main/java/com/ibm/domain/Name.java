package com.ibm.domain;

import java.util.List;

public class Name {
    public String use;
    public String family;
    public List<String> given;
    public Period period;
    public Family _family;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public List<String> getGiven() {
        return given;
    }

    public void setGiven(List<String> given) {
        this.given = given;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Family get_family() {
        return _family;
    }

    public void set_family(Family _family) {
        this._family = _family;
    }
}
