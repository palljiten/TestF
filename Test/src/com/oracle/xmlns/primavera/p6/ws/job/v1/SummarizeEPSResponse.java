
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizeEPSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummarizeEPSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "SummarizeEPSResponse", propOrder = {
    "jobId",
    "jobStatus"
})
public class SummarizeEPSResponse {

    @XmlElement(name = "JobId", required = true)
    protected String jobId;
    @XmlElement(name = "JobStatus", required = true)
    @XmlSchemaType(name = "string")
    protected JobStatusType jobStatus;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

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
