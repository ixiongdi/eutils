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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pmid",
    "articleIdList",
    "book",
    "locationLabel",
    "articleTitle",
    "vernacularTitle",
    "pagination",
    "language",
    "authorList",
    "investigatorList",
    "publicationType",
    "_abstract",
    "sections",
    "keywordList",
    "contributionDate",
    "dateRevised",
    "citationString",
    "grantList",
    "itemList"
})
@XmlRootElement(name = "BookDocument")
public class BookDocument {

    @XmlElement(name = "PMID", required = true)
    protected PMID pmid;
    @XmlElement(name = "ArticleIdList", required = true)
    protected ArticleIdList articleIdList;
    @XmlElement(name = "Book", required = true)
    protected Book book;
    @XmlElement(name = "LocationLabel")
    protected List<LocationLabel> locationLabel;
    @XmlElement(name = "ArticleTitle")
    protected ArticleTitle articleTitle;
    @XmlElement(name = "VernacularTitle")
    protected String vernacularTitle;
    @XmlElement(name = "Pagination")
    protected Pagination pagination;
    @XmlElement(name = "Language")
    protected List<Language> language;
    @XmlElement(name = "AuthorList")
    protected List<AuthorList> authorList;
    @XmlElement(name = "InvestigatorList")
    protected InvestigatorList investigatorList;
    @XmlElement(name = "PublicationType")
    protected List<PublicationType> publicationType;
    @XmlElement(name = "Abstract")
    protected Abstract _abstract;
    @XmlElement(name = "Sections")
    protected Sections sections;
    @XmlElement(name = "KeywordList")
    protected List<KeywordList> keywordList;
    @XmlElement(name = "ContributionDate")
    protected ContributionDate contributionDate;
    @XmlElement(name = "DateRevised")
    protected DateRevised dateRevised;
    @XmlElement(name = "CitationString")
    protected String citationString;
    @XmlElement(name = "GrantList")
    protected GrantList grantList;
    @XmlElement(name = "ItemList")
    protected List<ItemList> itemList;

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
     * 获取articleIdList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArticleIdList }
     *     
     */
    public ArticleIdList getArticleIdList() {
        return articleIdList;
    }

    /**
     * 设置articleIdList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleIdList }
     *     
     */
    public void setArticleIdList(ArticleIdList value) {
        this.articleIdList = value;
    }

    /**
     * 获取book属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getBook() {
        return book;
    }

    /**
     * 设置book属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setBook(Book value) {
        this.book = value;
    }

    /**
     * Gets the value of the locationLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationLabel }
     * 
     * 
     */
    public List<LocationLabel> getLocationLabel() {
        if (locationLabel == null) {
            locationLabel = new ArrayList<LocationLabel>();
        }
        return this.locationLabel;
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
     * 获取pagination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * 设置pagination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPagination(Pagination value) {
        this.pagination = value;
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
     * Gets the value of the authorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorList }
     * 
     * 
     */
    public List<AuthorList> getAuthorList() {
        if (authorList == null) {
            authorList = new ArrayList<AuthorList>();
        }
        return this.authorList;
    }

    /**
     * 获取investigatorList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvestigatorList }
     *     
     */
    public InvestigatorList getInvestigatorList() {
        return investigatorList;
    }

    /**
     * 设置investigatorList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatorList }
     *     
     */
    public void setInvestigatorList(InvestigatorList value) {
        this.investigatorList = value;
    }

    /**
     * Gets the value of the publicationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationType }
     * 
     * 
     */
    public List<PublicationType> getPublicationType() {
        if (publicationType == null) {
            publicationType = new ArrayList<PublicationType>();
        }
        return this.publicationType;
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
     * 获取sections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sections }
     *     
     */
    public Sections getSections() {
        return sections;
    }

    /**
     * 设置sections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sections }
     *     
     */
    public void setSections(Sections value) {
        this.sections = value;
    }

    /**
     * Gets the value of the keywordList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordList }
     * 
     * 
     */
    public List<KeywordList> getKeywordList() {
        if (keywordList == null) {
            keywordList = new ArrayList<KeywordList>();
        }
        return this.keywordList;
    }

    /**
     * 获取contributionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContributionDate }
     *     
     */
    public ContributionDate getContributionDate() {
        return contributionDate;
    }

    /**
     * 设置contributionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionDate }
     *     
     */
    public void setContributionDate(ContributionDate value) {
        this.contributionDate = value;
    }

    /**
     * 获取dateRevised属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateRevised }
     *     
     */
    public DateRevised getDateRevised() {
        return dateRevised;
    }

    /**
     * 设置dateRevised属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateRevised }
     *     
     */
    public void setDateRevised(DateRevised value) {
        this.dateRevised = value;
    }

    /**
     * 获取citationString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitationString() {
        return citationString;
    }

    /**
     * 设置citationString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitationString(String value) {
        this.citationString = value;
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
     * Gets the value of the itemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemList }
     * 
     * 
     */
    public List<ItemList> getItemList() {
        if (itemList == null) {
            itemList = new ArrayList<ItemList>();
        }
        return this.itemList;
    }

}
