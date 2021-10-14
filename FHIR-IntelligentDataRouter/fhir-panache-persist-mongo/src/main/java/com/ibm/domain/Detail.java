package com.ibm.domain;

import java.util.List;

public class Detail {
    public Code code;
    public String status;
    public StatusReason statusReason;
    public boolean doNotPerform;
    public ScheduledTiming scheduledTiming;
    public Location location;
    public List<Performer> performer;
}
