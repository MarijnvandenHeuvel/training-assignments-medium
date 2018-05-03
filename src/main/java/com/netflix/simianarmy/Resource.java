/*
 *
 *  Copyright 2012 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.netflix.simianarmy;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * The interface of Resource. It defines the interfaces for getting the common properties of a resource, as well as
 * the methods to add and retrieve the additional properties of a resource. Instead of defining a new subclass of
 * the Resource interface, new resources that have additional fields other than the common ones can be represented,
 * by adding field-value pairs. This approach makes serialization and deserialization of resources much easier with
 * the cost of type safety.
 */
public interface Resource extends ResourceGetters, ResourceSetters, ResourceWithers {
    /** The enum representing the cleanup state of a resource. **/
    public enum CleanupState {
        /** The resource is marked as a cleanup candidate but has not been cleaned up yet. **/
        MARKED,
        /** The resource is terminated by janitor monkey. **/
        JANITOR_TERMINATED,
        /** The resource is terminated by user before janitor monkey performs the termination. **/
        USER_TERMINATED,
        /** The resource is unmarked and not for cleanup anymore due to some change of situations. **/
        UNMARKED
    }

    Resource cloneResource();
}
