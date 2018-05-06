
package com.oracle.xmlns.primavera.p6.ws.job.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApplyActuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplyActuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NewDataDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "ApplyActuals", propOrder = {
    "projectObjectId",
    "newDataDate",
    "timeout"
})
public class ApplyActuals {

    @XmlElement(name = "ProjectObjectId")
    protected int projectObjectId;
    @XmlElement(name = "NewDataDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newDataDate;
    @XmlElement(name = "Timeout")
    protected Integer timeout;

    /**
     * Gets the value of the projectObjectId property.
     * 
     */
    public int getProjectObjectId() {
        return projectObjectId;
    }

    /**
     * Sets the value of the projectObjectId property.
     * 
     */
    public void setProjectObjectId(int value) {
        this.projectObjectId = value;
    }

    /**
     * Gets the value of the newDataDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewDataDate() {
        return newDataDate;
    }

    /**
     * Sets the value of the newDataDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewDataDate(XMLGregorianCalendar value) {
        this.newDataDate = value;
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
