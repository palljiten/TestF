
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrentJobsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrentJobsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobInfo" type="{http://xmlns.oracle.com/Primavera/P6/WS/Job/V1}JobInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrentJobsResponse", propOrder = {
    "jobInfo"
})
public class GetCurrentJobsResponse {

    @XmlElement(name = "JobInfo")
    protected List<JobInfoType> jobInfo;

    /**
     * Gets the value of the jobInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobInfoType }
     * 
     * 
     */
    public List<JobInfoType> getJobInfo() {
        if (jobInfo == null) {
            jobInfo = new ArrayList<JobInfoType>();
        }
        return this.jobInfo;
    }

}
