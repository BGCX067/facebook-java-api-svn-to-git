//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.10 at 10:42:34 PM PST 
//


package com.facebook.api.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for page_parking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="page_parking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="valet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page_parking", propOrder = {
    "street",
    "lot",
    "valet"
})
public class PageParking {

    protected boolean street;
    protected boolean lot;
    protected boolean valet;

    /**
     * Gets the value of the street property.
     * 
     */
    public boolean isStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     */
    public void setStreet(boolean value) {
        this.street = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     */
    public boolean isLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     */
    public void setLot(boolean value) {
        this.lot = value;
    }

    /**
     * Gets the value of the valet property.
     * 
     */
    public boolean isValet() {
        return valet;
    }

    /**
     * Sets the value of the valet property.
     * 
     */
    public void setValet(boolean value) {
        this.valet = value;
    }

}
