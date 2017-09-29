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
    "publisher",
    "bookTitle",
    "pubDate",
    "beginningDate",
    "endingDate",
    "authorList",
    "investigatorList",
    "volume",
    "volumeTitle",
    "edition",
    "collectionTitle",
    "isbn",
    "eLocationID",
    "medium",
    "reportNumber"
})
@XmlRootElement(name = "Book")
public class Book {

    @XmlElement(name = "Publisher", required = true)
    protected Publisher publisher;
    @XmlElement(name = "BookTitle", required = true)
    protected BookTitle bookTitle;
    @XmlElement(name = "PubDate", required = true)
    protected PubDate pubDate;
    @XmlElement(name = "BeginningDate")
    protected BeginningDate beginningDate;
    @XmlElement(name = "EndingDate")
    protected EndingDate endingDate;
    @XmlElement(name = "AuthorList")
    protected List<AuthorList> authorList;
    @XmlElement(name = "InvestigatorList")
    protected InvestigatorList investigatorList;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "VolumeTitle")
    protected String volumeTitle;
    @XmlElement(name = "Edition")
    protected String edition;
    @XmlElement(name = "CollectionTitle")
    protected CollectionTitle collectionTitle;
    @XmlElement(name = "Isbn")
    protected List<Isbn> isbn;
    @XmlElement(name = "ELocationID")
    protected List<ELocationID> eLocationID;
    @XmlElement(name = "Medium")
    protected String medium;
    @XmlElement(name = "ReportNumber")
    protected String reportNumber;

    /**
     * 获取publisher属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Publisher }
     *     
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * 设置publisher属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Publisher }
     *     
     */
    public void setPublisher(Publisher value) {
        this.publisher = value;
    }

    /**
     * 获取bookTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookTitle }
     *     
     */
    public BookTitle getBookTitle() {
        return bookTitle;
    }

    /**
     * 设置bookTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookTitle }
     *     
     */
    public void setBookTitle(BookTitle value) {
        this.bookTitle = value;
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

    /**
     * 获取beginningDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BeginningDate }
     *     
     */
    public BeginningDate getBeginningDate() {
        return beginningDate;
    }

    /**
     * 设置beginningDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BeginningDate }
     *     
     */
    public void setBeginningDate(BeginningDate value) {
        this.beginningDate = value;
    }

    /**
     * 获取endingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EndingDate }
     *     
     */
    public EndingDate getEndingDate() {
        return endingDate;
    }

    /**
     * 设置endingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EndingDate }
     *     
     */
    public void setEndingDate(EndingDate value) {
        this.endingDate = value;
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
     * 获取volumeTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeTitle() {
        return volumeTitle;
    }

    /**
     * 设置volumeTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeTitle(String value) {
        this.volumeTitle = value;
    }

    /**
     * 获取edition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * 设置edition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * 获取collectionTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CollectionTitle }
     *     
     */
    public CollectionTitle getCollectionTitle() {
        return collectionTitle;
    }

    /**
     * 设置collectionTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionTitle }
     *     
     */
    public void setCollectionTitle(CollectionTitle value) {
        this.collectionTitle = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isbn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsbn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Isbn }
     * 
     * 
     */
    public List<Isbn> getIsbn() {
        if (isbn == null) {
            isbn = new ArrayList<Isbn>();
        }
        return this.isbn;
    }

    /**
     * Gets the value of the eLocationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eLocationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getELocationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ELocationID }
     * 
     * 
     */
    public List<ELocationID> getELocationID() {
        if (eLocationID == null) {
            eLocationID = new ArrayList<ELocationID>();
        }
        return this.eLocationID;
    }

    /**
     * 获取medium属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedium() {
        return medium;
    }

    /**
     * 设置medium属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * 获取reportNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /**
     * 设置reportNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNumber(String value) {
        this.reportNumber = value;
    }

}
