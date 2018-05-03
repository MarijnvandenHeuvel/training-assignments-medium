package com.netflix.simianarmy;

import java.util.Date;

public interface ResourceWithers {

    Resource withId(String id);

    Resource withResourceType(ResourceType type);

    Resource withRegion(String region);

    Resource withOwnerEmail(String ownerEmail);

    Resource withDescription(String description);

    Resource withLaunchTime(Date launchTime);

    Resource withMarkTime(Date markTime);

    Resource withExpectedTerminationTime(Date expectedTerminationTime);

    Resource withActualTerminationTime(Date actualTerminationTime);

    Resource withNnotificationTime(Date notificationTime);

    Resource withState(Resource.CleanupState state);

    Resource withTerminationReason(String terminationReason);

    Resource withOptOutOfJanitor(boolean optOutOfJanitor);
}
