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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pubmedArticleOrPubmedBookArticle",
    "deleteCitation"
})
@XmlRootElement(name = "PubmedArticleSet")
public class PubmedArticleSet {

    @XmlElements({
        @XmlElement(name = "PubmedArticle", required = true, type = PubmedArticle.class),
        @XmlElement(name = "PubmedBookArticle", required = true, type = PubmedBookArticle.class)
    })
    protected List<java.lang.Object> pubmedArticleOrPubmedBookArticle;
    @XmlElement(name = "DeleteCitation")
    protected DeleteCitation deleteCitation;

    /**
     * Gets the value of the pubmedArticleOrPubmedBookArticle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubmedArticleOrPubmedBookArticle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubmedArticleOrPubmedBookArticle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubmedArticle }
     * {@link PubmedBookArticle }
     * 
     * 
     */
    public List<java.lang.Object> getPubmedArticleOrPubmedBookArticle() {
        if (pubmedArticleOrPubmedBookArticle == null) {
            pubmedArticleOrPubmedBookArticle = new ArrayList<java.lang.Object>();
        }
        return this.pubmedArticleOrPubmedBookArticle;
    }

    /**
     * 获取deleteCitation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeleteCitation }
     *     
     */
    public DeleteCitation getDeleteCitation() {
        return deleteCitation;
    }

    /**
     * 设置deleteCitation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCitation }
     *     
     */
    public void setDeleteCitation(DeleteCitation value) {
        this.deleteCitation = value;
    }

}
