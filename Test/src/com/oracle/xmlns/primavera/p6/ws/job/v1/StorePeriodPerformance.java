
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorePeriodPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorePeriodPerformance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FinancialPeriodObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorePeriodPerformance", propOrder = {
    "projectObjectId",
    "financialPeriodObjectId",
    "timeout"
})
public class StorePeriodPerformance {

    @XmlElement(name = "ProjectObjectId", type = Integer.class)
    protected List<Integer> projectObjectId;
    @XmlElement(name = "FinancialPeriodObjectId")
    protected int financialPeriodObjectId;
    @XmlElement(name = "Timeout")
    protected Integer timeout;

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
     * Gets the value of the financialPeriodObjectId property.
     * 
     */
    public int getFinancialPeriodObjectId() {
        return financialPeriodObjectId;
    }

    /**
     * Sets the value of the financialPeriodObjectId property.
     * 
     */
    public void setFinancialPeriodObjectId(int value) {
        this.financialPeriodObjectId = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

}
