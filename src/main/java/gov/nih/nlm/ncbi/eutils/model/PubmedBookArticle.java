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
    "bookDocument",
    "pubmedBookData"
})
@XmlRootElement(name = "PubmedBookArticle")
public class PubmedBookArticle {

    @XmlElement(name = "BookDocument", required = true)
    protected BookDocument bookDocument;
    @XmlElement(name = "PubmedBookData")
    protected PubmedBookData pubmedBookData;

    /**
     * 获取bookDocument属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookDocument }
     *     
     */
    public BookDocument getBookDocument() {
        return bookDocument;
    }

    /**
     * 设置bookDocument属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookDocument }
     *     
     */
    public void setBookDocument(BookDocument value) {
        this.bookDocument = value;
    }

    /**
     * 获取pubmedBookData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PubmedBookData }
     *     
     */
    public PubmedBookData getPubmedBookData() {
        return pubmedBookData;
    }

    /**
     * 设置pubmedBookData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PubmedBookData }
     *     
     */
    public void setPubmedBookData(PubmedBookData value) {
        this.pubmedBookData = value;
    }

}
