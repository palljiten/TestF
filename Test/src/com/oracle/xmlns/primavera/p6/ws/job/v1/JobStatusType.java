
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Running"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobStatusType")
@XmlEnum
public enum JobStatusType {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    JobStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobStatusType fromValue(String v) {
        for (JobStatusType c: JobStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
