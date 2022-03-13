package com.hazelcast.samples.kubernetes.benchmarking;

import org.springframework.context.annotation.Configuration;

/**
 * <p>Spring will find the file "{@code hazelcast-client.yaml}"
 * and use it to configure and build a Hazelcast client for us.
 * <p>
 * <p>If you want to amend the configuration from Java, uncomment
 * the method below and add your code between loading the file
 * and return the {@link ClientConfig} object.
 * </p>
 * <p>If you'd rather do it with XML, copy the XML file that
 * Management Center uses, and use {@link XmlClientConfigBuilder}.
 * </p>
 */
@Configuration
public class ApplicationConfig {

    /*
    @Bean
    public ClientConfig clientConfig() throws Exception {
        ClientConfig clientConfig =
            new YamlClientConfigBuilder("hazelcast-client.yaml").build();
        return clientConfig;
    }
    */

}
