package java.time;

import java.time.zone.ZoneRules;

import static java.time.ZoneOffset.UTC;

public class ZoneRegion extends ZoneId {
    
    public final String id;
    
    public ZoneRegion(String id) {
        this.id = id;
    }

    @Override public String getId() {
        return id;
    }

    @Override public String toString() {
        return id;
    }

    @Override public ZoneRules getRules() {
        // Not implemented
        return UTC.getRules();
    }
}
