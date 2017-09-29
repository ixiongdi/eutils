//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.29 时间 03:05:20 PM CST 
//


package gov.nih.nlm.ncbi.eutils.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "country",
    "medlineTA",
    "nlmUniqueID",
    "issnLinking"
})
@XmlRootElement(name = "MedlineJournalInfo")
public class MedlineJournalInfo {

    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "MedlineTA", required = true)
    protected String medlineTA;
    @XmlElement(name = "NlmUniqueID")
    protected String nlmUniqueID;
    @XmlElement(name = "ISSNLinking")
    protected String issnLinking;

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * 获取medlineTA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedlineTA() {
        return medlineTA;
    }

    /**
     * 设置medlineTA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedlineTA(String value) {
        this.medlineTA = value;
    }

    /**
     * 获取nlmUniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlmUniqueID() {
        return nlmUniqueID;
    }

    /**
     * 设置nlmUniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlmUniqueID(String value) {
        this.nlmUniqueID = value;
    }

    /**
     * 获取issnLinking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSNLinking() {
        return issnLinking;
    }

    /**
     * 设置issnLinking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSNLinking(String value) {
        this.issnLinking = value;
    }

}
