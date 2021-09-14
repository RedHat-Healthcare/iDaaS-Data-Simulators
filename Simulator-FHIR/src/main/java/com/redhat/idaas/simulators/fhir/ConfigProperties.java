/*
 * Copyright 2019 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.redhat.idaas.simulators.fhir;

import org.springframework.boot.context.properties.ConfigurationProperties;

@SuppressWarnings("ConfigurationProperties")
@ConfigurationProperties(prefix = "idaas")
public class ConfigProperties {

    //Variables
    // Kafka
    private String kafkaBrokers;
    // FHIR Directories
    public String fhirClinical_Directory;
    private String fhirBinary_Directory;
    private String fhirAdministrative_Directory;
    private String fhirFinancial_Directory;
    private String fhirReporting_Directory;
    // FHIR Port
    private int fhirPort;
    // FHIR Host
    private String fhirHost;
    // FHIR
    public String fhirBaseAPIPath;
    public String fhirResource;

    // Getters
    // Getters: Kafka Brokers
    public String getKafkaBrokers() {
        return kafkaBrokers;
    }
    // Getters: FHIR Directories
    public String fhirClinical_Directory() {
        return fhirClinical_Directory;
    }
    public String fhirBinary_Directory() {
        return fhirBinary_Directory;
    }
    public String fhirAdministrative_Directory() {
        return fhirAdministrative_Directory;
    }
    public String fhirFinancial_Directory() {
        return fhirFinancial_Directory;
    }
    public String fhirReporting_Directory() {
        return fhirReporting_Directory;
    }

    // Getters: FHIR Port
    public int getFhirPort() {
        return fhirPort;
    }
    // Getters: FHIR Host
    public String getFhirHost() { return fhirHost; }
    // Getters: FHIR Base API Path
    public String getFhirBaseAPIPath() { return fhirBaseAPIPath; }
    // Getters: FHIR Resource
    public String getFhirResource() { return fhirResource; }

    // Setters
    // Setters: Kafka Brokers
    public void setKafkaBrokers(String kafkaBrokers) {
        this.kafkaBrokers = kafkaBrokers;
    }
    // Setters: FHIR Port
    public void setFhirPort(int fhirPort) { this.fhirPort = fhirPort; }
    // Setters: FHIR Host
    public void setFhirHost(String fhirHost) { this.fhirHost = fhirHost; }
    // Setters FHIR API Path
    public void setFhirBaseAPIPath(String fhirBaseAPIPath) {
        this.fhirBaseAPIPath = fhirBaseAPIPath;
    }
    // setters: FHIR Resource

    public void setFhirResource(String fhirResource) {
        this.fhirResource = fhirResource;
    }
    // Setters: FHIR Directories
    public void setFhirClinical_Directory(String fhirClinical_Directory) {
        this.fhirClinical_Directory = fhirClinical_Directory;
    }
    public void setFhirBinary_Directory(String fhirBinary_Directory) {
        this.fhirBinary_Directory = fhirBinary_Directory;
    }
    public void setFhirAdministrative_Directory(String fhirAdministrative_Directory) {
        this.fhirAdministrative_Directory = fhirAdministrative_Directory;
    }
    public void setFhirFinancial_Directory(String fhirFinancial_Directory) {
        this.fhirFinancial_Directory = fhirFinancial_Directory;
    }
    public void setFhirReporting_Directory(String fhirReporting_Directory) {
        this.fhirReporting_Directory = fhirReporting_Directory;
    }
}
