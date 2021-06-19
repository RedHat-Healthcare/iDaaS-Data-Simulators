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
package com.redhat.idaas.simulators.thirdparty;

import org.springframework.boot.context.properties.ConfigurationProperties;

@SuppressWarnings("ConfigurationProperties")
@ConfigurationProperties(prefix = "idaas")
public class ConfigProperties {
    //Variables
    // Kafka
    private String kafkaBrokers;
    //Ftp Server IP-Host
    private String ftpHost;
    //Ftp Ports
    private int ftpPort;
    //Ftp Username
    private int ftpUserName;
    //Ftp Password
    private String ftpPassword;
    // Text Directories
    private String text_Directory;
    // Platform Topics
    private String ftpTopicName;

    // Getters
    // Getters: Kafka Brokers
    public String getKafkaBrokers() {
        return kafkaBrokers;
    }
    // Getters: HL7 Server Hosts
    public String getFtpost() {
        return ftpHost;
    }
    // Getters: HL7 Ports
    public int getFtpPort() {
        return ftpPort;
    }
    // Getters: FTP User Name
    public String getFtpUserName() {
        return ftpUserName;
    }
    // Getters: FTP Password
    public int getFtpPassword() {
        return ftpPassword;
    }
    // Getters: Directories
    public String getText_Directory() { return text_Directory; }
    // Getters: Platform Topics
    public String getFtpTopicName() { return ftpTopicName; }

    // Setters
    // Setters: Kafka Brokers
    public void setKafkaBrokers(String kafkaBrokers) {
        this.kafkaBrokers = kafkaBrokers;
    }
    // Setters: HL7 Hosts
    public void setFtpHost(String ftpHost) {
        this.ftpHost = ftpHost;
    }
    // Setters: HL7 Ports
    public void setFtpPort(int ftpPort) {
        this.ftpPort = ftpPort;
    }
    // Setters: HL7 Username
    public void setFtpUserName(String ftpUserName) {
        this.ftpUserName = ftpUserName;
    }
    // Setters: HL7 Password
    public void setFtpPassword(int ftpPassword) {
        this.ftpPassword = ftpPassword;
    }
    // Setters: HL7 Directories
    public void setText_Directory(String text_Directory) { this.text_Directory = text_Directory; }
    // Setters: Kafka Topics
    public void setFtpTopicName(String ftpTopicName) { this.ftpTopicName = ftpTopicName; }

}
