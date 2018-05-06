
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelJobResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelJobResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobStatus" type="{http://xmlns.oracle.com/Primavera/P6/WS/Job/V1}JobStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelJobResponse", propOrder = {
    "jobStatus"
})
public class CancelJobResponse {

    @XmlElement(name = "JobStatus", required = true)
    @XmlSchemaType(name = "string")
    protected JobStatusType jobStatus;

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatusType }
     *     
     */
    public JobStatusType getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusType }
     *     
     */
    public void setJobStatus(JobStatusType value) {
        this.jobStatus = value;
    }

}
