//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.06.20 at 06:10:07 PM HST 
//


package com.facebook.api.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for event_member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="event_member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://api.facebook.com/1.0/}uid"/>
 *         &lt;element name="oid" type="{http://api.facebook.com/1.0/}eid"/>
 *         &lt;element name="attending" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event_member", propOrder = {
    "uid",
    "oid",
    "attending"
})
public class EventMember {

    protected long uid;
    protected long oid;
    @XmlElement(required = true)
    protected String attending;

    /**
     * Gets the value of the uid property.
     * 
     */
    public synchronized long getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     */
    public synchronized void setUid(int value) {
        this.uid = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     */
    public synchronized long getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     */
    public synchronized void setOid(long value) {
        this.oid = value;
    }

    /**
     * Gets the value of the attending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public synchronized String getAttending() {
        return attending;
    }

    /**
     * Sets the value of the attending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public synchronized void setAttending(String value) {
        this.attending = value;
    }

}
