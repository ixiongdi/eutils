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
    "refSource",
    "pmid",
    "note"
})
@XmlRootElement(name = "CommentsCorrections")
public class CommentsCorrections {

    @XmlAttribute(name = "RefType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refType;
    @XmlElement(name = "RefSource", required = true)
    protected String refSource;
    @XmlElement(name = "PMID")
    protected PMID pmid;
    @XmlElement(name = "Note")
    protected String note;

    /**
     * 获取refType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * 设置refType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
    }

    /**
     * 获取refSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefSource() {
        return refSource;
    }

    /**
     * 设置refSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefSource(String value) {
        this.refSource = value;
    }

    /**
     * 获取pmid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PMID }
     *     
     */
    public PMID getPMID() {
        return pmid;
    }

    /**
     * 设置pmid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PMID }
     *     
     */
    public void setPMID(PMID value) {
        this.pmid = value;
    }

    /**
     * 获取note属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置note属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
