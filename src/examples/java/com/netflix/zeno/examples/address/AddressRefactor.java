/*
 *
 *  Copyright 2013 Netflix, Inc.
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
package com.netflix.zeno.examples.address;

/**
 * This class is here for demonstration purposes.  It is a more efficient representation of an Address
 * object.  Follow along with:  https://github.com/Netflix/zeno/wiki/Designing-for-efficiency to see how
 * to reason about how to make Zeno more effective at deduplicating your object model.
 *
 * @author dkoszewnik
 *
 */
public class AddressRefactor {

    private final String streetAddress;
    private final City city;
    private final String postalCode;

    public AddressRefactor(String streetAddress, City city, String postalCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public City getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }


    public static class City {
        private final String city;
        private final String state;

        public City(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }
    }
}
