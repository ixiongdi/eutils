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
    "registryNumber",
    "nameOfSubstance"
})
@XmlRootElement(name = "Chemical")
public class Chemical {

    @XmlElement(name = "RegistryNumber", required = true)
    protected String registryNumber;
    @XmlElement(name = "NameOfSubstance", required = true)
    protected NameOfSubstance nameOfSubstance;

    /**
     * 获取registryNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * 设置registryNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * 获取nameOfSubstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameOfSubstance }
     *     
     */
    public NameOfSubstance getNameOfSubstance() {
        return nameOfSubstance;
    }

    /**
     * 设置nameOfSubstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameOfSubstance }
     *     
     */
    public void setNameOfSubstance(NameOfSubstance value) {
        this.nameOfSubstance = value;
    }

}
