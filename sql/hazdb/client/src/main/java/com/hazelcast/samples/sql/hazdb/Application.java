/*
 * Copyright (c) 2008-2022, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.samples.sql.hazdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static {
        String hostIp = System.getProperty("HOST_IP", "");
        if (hostIp.length() > 0) {
            // Docker override. Default setting is for Kubernetes in application.properties
            System.setProperty("spring.datasource.url", "jdbc:hazelcast://" + hostIp + ":5701");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
