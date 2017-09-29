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
    "journal",
    "articleTitle",
    "paginationOrELocationID",
    "_abstract",
    "authorList",
    "language",
    "dataBankList",
    "grantList",
    "publicationTypeList",
    "vernacularTitle",
    "articleDate"
})
@XmlRootElement(name = "Article")
public class Article {

    @XmlAttribute(name = "PubModel", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pubModel;
    @XmlElement(name = "Journal", required = true)
    protected Journal journal;
    @XmlElement(name = "ArticleTitle", required = true)
    protected ArticleTitle articleTitle;
    @XmlElements({
        @XmlElement(name = "Pagination", required = true, type = Pagination.class),
        @XmlElement(name = "ELocationID", required = true, type = ELocationID.class)
    })
    protected List<java.lang.Object> paginationOrELocationID;
    @XmlElement(name = "Abstract")
    protected Abstract _abstract;
    @XmlElement(name = "AuthorList")
    protected AuthorList authorList;
    @XmlElement(name = "Language", required = true)
    protected List<Language> language;
    @XmlElement(name = "DataBankList")
    protected DataBankList dataBankList;
    @XmlElement(name = "GrantList")
    protected GrantList grantList;
    @XmlElement(name = "PublicationTypeList", required = true)
    protected PublicationTypeList publicationTypeList;
    @XmlElement(name = "VernacularTitle")
    protected String vernacularTitle;
    @XmlElement(name = "ArticleDate")
    protected List<ArticleDate> articleDate;

    /**
     * 获取pubModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubModel() {
        return pubModel;
    }

    /**
     * 设置pubModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubModel(String value) {
        this.pubModel = value;
    }

    /**
     * 获取journal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Journal }
     *     
     */
    public Journal getJournal() {
        return journal;
    }

    /**
     * 设置journal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Journal }
     *     
     */
    public void setJournal(Journal value) {
        this.journal = value;
    }

    /**
     * 获取articleTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArticleTitle }
     *     
     */
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    /**
     * 设置articleTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleTitle }
     *     
     */
    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = value;
    }

    /**
     * Gets the value of the paginationOrELocationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paginationOrELocationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaginationOrELocationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pagination }
     * {@link ELocationID }
     * 
     * 
     */
    public List<java.lang.Object> getPaginationOrELocationID() {
        if (paginationOrELocationID == null) {
            paginationOrELocationID = new ArrayList<java.lang.Object>();
        }
        return this.paginationOrELocationID;
    }

    /**
     * 获取abstract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * 设置abstract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

    /**
     * 获取authorList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorList }
     *     
     */
    public AuthorList getAuthorList() {
        return authorList;
    }

    /**
     * 设置authorList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorList }
     *     
     */
    public void setAuthorList(AuthorList value) {
        this.authorList = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * 
     * 
     */
    public List<Language> getLanguage() {
        if (language == null) {
            language = new ArrayList<Language>();
        }
        return this.language;
    }

    /**
     * 获取dataBankList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataBankList }
     *     
     */
    public DataBankList getDataBankList() {
        return dataBankList;
    }

    /**
     * 设置dataBankList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataBankList }
     *     
     */
    public void setDataBankList(DataBankList value) {
        this.dataBankList = value;
    }

    /**
     * 获取grantList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GrantList }
     *     
     */
    public GrantList getGrantList() {
        return grantList;
    }

    /**
     * 设置grantList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GrantList }
     *     
     */
    public void setGrantList(GrantList value) {
        this.grantList = value;
    }

    /**
     * 获取publicationTypeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PublicationTypeList }
     *     
     */
    public PublicationTypeList getPublicationTypeList() {
        return publicationTypeList;
    }

    /**
     * 设置publicationTypeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationTypeList }
     *     
     */
    public void setPublicationTypeList(PublicationTypeList value) {
        this.publicationTypeList = value;
    }

    /**
     * 获取vernacularTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVernacularTitle() {
        return vernacularTitle;
    }

    /**
     * 设置vernacularTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVernacularTitle(String value) {
        this.vernacularTitle = value;
    }

    /**
     * Gets the value of the articleDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleDate }
     * 
     * 
     */
    public List<ArticleDate> getArticleDate() {
        if (articleDate == null) {
            articleDate = new ArrayList<ArticleDate>();
        }
        return this.articleDate;
    }

}
