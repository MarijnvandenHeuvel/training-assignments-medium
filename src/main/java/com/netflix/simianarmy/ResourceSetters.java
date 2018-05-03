package com.netflix.simianarmy;

import java.util.Date;

public interface ResourceSetters {

    void setId(String id);

    void setResourceType(ResourceType type);

    void setRegion(String region);

    void setOwnerEmail(String ownerEmail);

    void setDescription(String description);

    void setLaunchTime(Date launchTime);

    void setMarkTime(Date markTime);

    void setExpectedTerminationTime(Date expectedTerminationTime);

    void setActualTerminationTime(Date actualTerminationTime);

    void setNotificationTime(Date notificationTime);

    void setState(Resource.CleanupState state);

    void setTerminationReason(String terminationReason);

    void setOptOutOfJanitor(boolean optOutOfJanitor);

    Resource setAdditionalField(String fieldName, String fieldValue);

    void setTag(String key, String value);

}
