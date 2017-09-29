//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.29 时间 03:05:20 PM CST 
//


package gov.nih.nlm.ncbi.eutils.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volume",
    "issue",
    "pubDate"
})
@XmlRootElement(name = "JournalIssue")
public class JournalIssue {

    @XmlAttribute(name = "CitedMedium", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String citedMedium;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "Issue")
    protected String issue;
    @XmlElement(name = "PubDate", required = true)
    protected PubDate pubDate;

    /**
     * 获取citedMedium属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitedMedium() {
        return citedMedium;
    }

    /**
     * 设置citedMedium属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitedMedium(String value) {
        this.citedMedium = value;
    }

    /**
     * 获取volume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * 设置volume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * 获取issue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * 设置issue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * 获取pubDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PubDate }
     *     
     */
    public PubDate getPubDate() {
        return pubDate;
    }

    /**
     * 设置pubDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PubDate }
     *     
     */
    public void setPubDate(PubDate value) {
        this.pubDate = value;
    }

}
