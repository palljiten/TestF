
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JobInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JobType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Schedule"/&gt;
 *               &lt;enumeration value="Summarize"/&gt;
 *               &lt;enumeration value="Apply Actuals"/&gt;
 *               &lt;enumeration value="Store Period Performance"/&gt;
 *               &lt;enumeration value="Sync Actual This Period"/&gt;
 *               &lt;enumeration value="Level"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JobStatus" type="{http://xmlns.oracle.com/Primavera/P6/WS/Job/V1}JobStatusType"/&gt;
 *         &lt;element name="SubmittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastRunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EPSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInfoType", propOrder = {
    "jobId",
    "jobType",
    "jobStatus",
    "submittedDate",
    "lastRunDate",
    "projectObjectId",
    "epsObjectId"
})
public class JobInfoType {

    @XmlElement(name = "JobId", required = true)
    protected String jobId;
    @XmlElement(name = "JobType", required = true)
    protected String jobType;
    @XmlElement(name = "JobStatus", required = true)
    @XmlSchemaType(name = "string")
    protected JobStatusType jobStatus;
    @XmlElement(name = "SubmittedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedDate;
    @XmlElement(name = "LastRunDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRunDate;
    @XmlElement(name = "ProjectObjectId", type = Integer.class)
    protected List<Integer> projectObjectId;
    @XmlElement(name = "EPSObjectId", type = Integer.class)
    protected List<Integer> epsObjectId;

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
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
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

    /**
     * Gets the value of the submittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedDate() {
        return submittedDate;
    }

    /**
     * Sets the value of the submittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittedDate(XMLGregorianCalendar value) {
        this.submittedDate = value;
    }

    /**
     * Gets the value of the lastRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRunDate() {
        return lastRunDate;
    }

    /**
     * Sets the value of the lastRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRunDate(XMLGregorianCalendar value) {
        this.lastRunDate = value;
    }

    /**
     * Gets the value of the projectObjectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectObjectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectObjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getProjectObjectId() {
        if (projectObjectId == null) {
            projectObjectId = new ArrayList<Integer>();
        }
        return this.projectObjectId;
    }

    /**
     * Gets the value of the epsObjectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epsObjectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEPSObjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEPSObjectId() {
        if (epsObjectId == null) {
            epsObjectId = new ArrayList<Integer>();
        }
        return this.epsObjectId;
    }

}
