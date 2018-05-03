package com.netflix.simianarmy;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public interface ResourceGetters {

    String getId();

    ResourceType getResourceType();

    String getRegion();

    String getOwnerEmail();

    String getDescription();

    Date getLaunchTime();

    Date getMarkTime();

    Date getExpectedTerminationTime();

    Date getActualTerminationTime();

    Date getNotificationTime();

    Resource.CleanupState getState();

    String getTerminationReason();

    Map<String, String> getFieldToValueMap();

    String getAdditionalField(String fieldName);

    Collection<String> getAdditionalFieldNames();

    String getTag(String key);

    Collection<String> getAllTagKeys();

    boolean isOptOutOfJanitor();
}
