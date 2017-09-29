//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.29 时间 03:16:18 PM CST 
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
    "name",
    "fullName",
    "description",
    "termCount",
    "isDate",
    "isNumerical",
    "singleToken",
    "hierarchy",
    "isHidden",
    "isRangable",
    "isTruncatable"
})
@XmlRootElement(name = "Field")
public class Field {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TermCount", required = true)
    protected String termCount;
    @XmlElement(name = "IsDate", required = true)
    protected String isDate;
    @XmlElement(name = "IsNumerical", required = true)
    protected String isNumerical;
    @XmlElement(name = "SingleToken", required = true)
    protected String singleToken;
    @XmlElement(name = "Hierarchy", required = true)
    protected String hierarchy;
    @XmlElement(name = "IsHidden", required = true)
    protected String isHidden;
    @XmlElement(name = "IsRangable")
    protected String isRangable;
    @XmlElement(name = "IsTruncatable")
    protected String isTruncatable;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取fullName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置fullName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取termCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermCount() {
        return termCount;
    }

    /**
     * 设置termCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermCount(String value) {
        this.termCount = value;
    }

    /**
     * 获取isDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDate() {
        return isDate;
    }

    /**
     * 设置isDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDate(String value) {
        this.isDate = value;
    }

    /**
     * 获取isNumerical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNumerical() {
        return isNumerical;
    }

    /**
     * 设置isNumerical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNumerical(String value) {
        this.isNumerical = value;
    }

    /**
     * 获取singleToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleToken() {
        return singleToken;
    }

    /**
     * 设置singleToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleToken(String value) {
        this.singleToken = value;
    }

    /**
     * 获取hierarchy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy() {
        return hierarchy;
    }

    /**
     * 设置hierarchy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy(String value) {
        this.hierarchy = value;
    }

    /**
     * 获取isHidden属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHidden() {
        return isHidden;
    }

    /**
     * 设置isHidden属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHidden(String value) {
        this.isHidden = value;
    }

    /**
     * 获取isRangable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRangable() {
        return isRangable;
    }

    /**
     * 设置isRangable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRangable(String value) {
        this.isRangable = value;
    }

    /**
     * 获取isTruncatable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTruncatable() {
        return isTruncatable;
    }

    /**
     * 设置isTruncatable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTruncatable(String value) {
        this.isTruncatable = value;
    }

}
