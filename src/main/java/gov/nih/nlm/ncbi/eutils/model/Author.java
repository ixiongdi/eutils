//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.29 时间 03:05:20 PM CST 
//


package gov.nih.nlm.ncbi.eutils.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName",
    "identifier",
    "affiliationInfo"
})
@XmlRootElement(name = "Author")
public class Author {

    @XmlAttribute(name = "ValidYN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String validYN;
    @XmlAttribute(name = "EqualContrib")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equalContrib;
    @XmlElements({
        @XmlElement(name = "LastName", required = true, type = LastName.class),
        @XmlElement(name = "ForeName", required = true, type = ForeName.class),
        @XmlElement(name = "Initials", required = true, type = Initials.class),
        @XmlElement(name = "Suffix", required = true, type = Suffix.class),
        @XmlElement(name = "CollectiveName", required = true, type = CollectiveName.class)
    })
    protected List<java.lang.Object> lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName;
    @XmlElement(name = "Identifier")
    protected List<Identifier> identifier;
    @XmlElement(name = "AffiliationInfo")
    protected List<AffiliationInfo> affiliationInfo;

    /**
     * 获取validYN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidYN() {
        if (validYN == null) {
            return "Y";
        } else {
            return validYN;
        }
    }

    /**
     * 设置validYN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidYN(String value) {
        this.validYN = value;
    }

    /**
     * 获取equalContrib属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualContrib() {
        return equalContrib;
    }

    /**
     * 设置equalContrib属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualContrib(String value) {
        this.equalContrib = value;
    }

    /**
     * Gets the value of the lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastNameOrForeNameOrInitialsOrSuffixOrCollectiveName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LastName }
     * {@link ForeName }
     * {@link Initials }
     * {@link Suffix }
     * {@link CollectiveName }
     * 
     * 
     */
    public List<java.lang.Object> getLastNameOrForeNameOrInitialsOrSuffixOrCollectiveName() {
        if (lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName == null) {
            lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName = new ArrayList<java.lang.Object>();
        }
        return this.lastNameOrForeNameOrInitialsOrSuffixOrCollectiveName;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the affiliationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationInfo }
     * 
     * 
     */
    public List<AffiliationInfo> getAffiliationInfo() {
        if (affiliationInfo == null) {
            affiliationInfo = new ArrayList<AffiliationInfo>();
        }
        return this.affiliationInfo;
    }

}
