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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pmid",
    "dateCreated",
    "dateCompleted",
    "dateRevised",
    "article",
    "medlineJournalInfo",
    "chemicalList",
    "supplMeshList",
    "citationSubset",
    "commentsCorrectionsList",
    "geneSymbolList",
    "meshHeadingList",
    "numberOfReferences",
    "personalNameSubjectList",
    "otherID",
    "otherAbstract",
    "keywordList",
    "coiStatement",
    "spaceFlightMission",
    "investigatorList",
    "generalNote"
})
@XmlRootElement(name = "MedlineCitation")
public class MedlineCitation {

    @XmlAttribute(name = "Owner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String owner;
    @XmlAttribute(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "VersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionID;
    @XmlAttribute(name = "VersionDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionDate;
    @XmlAttribute(name = "IndexingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indexingMethod;
    @XmlElement(name = "PMID", required = true)
    protected PMID pmid;
    @XmlElement(name = "DateCreated", required = true)
    protected DateCreated dateCreated;
    @XmlElement(name = "DateCompleted")
    protected DateCompleted dateCompleted;
    @XmlElement(name = "DateRevised")
    protected DateRevised dateRevised;
    @XmlElement(name = "Article", required = true)
    protected Article article;
    @XmlElement(name = "MedlineJournalInfo", required = true)
    protected MedlineJournalInfo medlineJournalInfo;
    @XmlElement(name = "ChemicalList")
    protected ChemicalList chemicalList;
    @XmlElement(name = "SupplMeshList")
    protected SupplMeshList supplMeshList;
    @XmlElement(name = "CitationSubset")
    protected List<CitationSubset> citationSubset;
    @XmlElement(name = "CommentsCorrectionsList")
    protected CommentsCorrectionsList commentsCorrectionsList;
    @XmlElement(name = "GeneSymbolList")
    protected GeneSymbolList geneSymbolList;
    @XmlElement(name = "MeshHeadingList")
    protected MeshHeadingList meshHeadingList;
    @XmlElement(name = "NumberOfReferences")
    protected String numberOfReferences;
    @XmlElement(name = "PersonalNameSubjectList")
    protected PersonalNameSubjectList personalNameSubjectList;
    @XmlElement(name = "OtherID")
    protected List<OtherID> otherID;
    @XmlElement(name = "OtherAbstract")
    protected List<OtherAbstract> otherAbstract;
    @XmlElement(name = "KeywordList")
    protected List<KeywordList> keywordList;
    @XmlElement(name = "CoiStatement")
    protected String coiStatement;
    @XmlElement(name = "SpaceFlightMission")
    protected List<SpaceFlightMission> spaceFlightMission;
    @XmlElement(name = "InvestigatorList")
    protected InvestigatorList investigatorList;
    @XmlElement(name = "GeneralNote")
    protected List<GeneralNote> generalNote;

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        if (owner == null) {
            return "NLM";
        } else {
            return owner;
        }
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取versionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * 设置versionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }

    /**
     * 获取versionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDate() {
        return versionDate;
    }

    /**
     * 设置versionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDate(String value) {
        this.versionDate = value;
    }

    /**
     * 获取indexingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexingMethod() {
        return indexingMethod;
    }

    /**
     * 设置indexingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexingMethod(String value) {
        this.indexingMethod = value;
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
     * 获取dateCreated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCreated }
     *     
     */
    public DateCreated getDateCreated() {
        return dateCreated;
    }

    /**
     * 设置dateCreated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCreated }
     *     
     */
    public void setDateCreated(DateCreated value) {
        this.dateCreated = value;
    }

    /**
     * 获取dateCompleted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCompleted }
     *     
     */
    public DateCompleted getDateCompleted() {
        return dateCompleted;
    }

    /**
     * 设置dateCompleted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCompleted }
     *     
     */
    public void setDateCompleted(DateCompleted value) {
        this.dateCompleted = value;
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
     * 获取article属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getArticle() {
        return article;
    }

    /**
     * 设置article属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setArticle(Article value) {
        this.article = value;
    }

    /**
     * 获取medlineJournalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MedlineJournalInfo }
     *     
     */
    public MedlineJournalInfo getMedlineJournalInfo() {
        return medlineJournalInfo;
    }

    /**
     * 设置medlineJournalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MedlineJournalInfo }
     *     
     */
    public void setMedlineJournalInfo(MedlineJournalInfo value) {
        this.medlineJournalInfo = value;
    }

    /**
     * 获取chemicalList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChemicalList }
     *     
     */
    public ChemicalList getChemicalList() {
        return chemicalList;
    }

    /**
     * 设置chemicalList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalList }
     *     
     */
    public void setChemicalList(ChemicalList value) {
        this.chemicalList = value;
    }

    /**
     * 获取supplMeshList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplMeshList }
     *     
     */
    public SupplMeshList getSupplMeshList() {
        return supplMeshList;
    }

    /**
     * 设置supplMeshList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplMeshList }
     *     
     */
    public void setSupplMeshList(SupplMeshList value) {
        this.supplMeshList = value;
    }

    /**
     * Gets the value of the citationSubset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citationSubset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitationSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationSubset }
     * 
     * 
     */
    public List<CitationSubset> getCitationSubset() {
        if (citationSubset == null) {
            citationSubset = new ArrayList<CitationSubset>();
        }
        return this.citationSubset;
    }

    /**
     * 获取commentsCorrectionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommentsCorrectionsList }
     *     
     */
    public CommentsCorrectionsList getCommentsCorrectionsList() {
        return commentsCorrectionsList;
    }

    /**
     * 设置commentsCorrectionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommentsCorrectionsList }
     *     
     */
    public void setCommentsCorrectionsList(CommentsCorrectionsList value) {
        this.commentsCorrectionsList = value;
    }

    /**
     * 获取geneSymbolList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GeneSymbolList }
     *     
     */
    public GeneSymbolList getGeneSymbolList() {
        return geneSymbolList;
    }

    /**
     * 设置geneSymbolList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GeneSymbolList }
     *     
     */
    public void setGeneSymbolList(GeneSymbolList value) {
        this.geneSymbolList = value;
    }

    /**
     * 获取meshHeadingList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeshHeadingList }
     *     
     */
    public MeshHeadingList getMeshHeadingList() {
        return meshHeadingList;
    }

    /**
     * 设置meshHeadingList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeshHeadingList }
     *     
     */
    public void setMeshHeadingList(MeshHeadingList value) {
        this.meshHeadingList = value;
    }

    /**
     * 获取numberOfReferences属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfReferences() {
        return numberOfReferences;
    }

    /**
     * 设置numberOfReferences属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfReferences(String value) {
        this.numberOfReferences = value;
    }

    /**
     * 获取personalNameSubjectList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonalNameSubjectList }
     *     
     */
    public PersonalNameSubjectList getPersonalNameSubjectList() {
        return personalNameSubjectList;
    }

    /**
     * 设置personalNameSubjectList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalNameSubjectList }
     *     
     */
    public void setPersonalNameSubjectList(PersonalNameSubjectList value) {
        this.personalNameSubjectList = value;
    }

    /**
     * Gets the value of the otherID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherID }
     * 
     * 
     */
    public List<OtherID> getOtherID() {
        if (otherID == null) {
            otherID = new ArrayList<OtherID>();
        }
        return this.otherID;
    }

    /**
     * Gets the value of the otherAbstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAbstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAbstract }
     * 
     * 
     */
    public List<OtherAbstract> getOtherAbstract() {
        if (otherAbstract == null) {
            otherAbstract = new ArrayList<OtherAbstract>();
        }
        return this.otherAbstract;
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
     * 获取coiStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoiStatement() {
        return coiStatement;
    }

    /**
     * 设置coiStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoiStatement(String value) {
        this.coiStatement = value;
    }

    /**
     * Gets the value of the spaceFlightMission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaceFlightMission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpaceFlightMission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceFlightMission }
     * 
     * 
     */
    public List<SpaceFlightMission> getSpaceFlightMission() {
        if (spaceFlightMission == null) {
            spaceFlightMission = new ArrayList<SpaceFlightMission>();
        }
        return this.spaceFlightMission;
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
     * Gets the value of the generalNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralNote }
     * 
     * 
     */
    public List<GeneralNote> getGeneralNote() {
        if (generalNote == null) {
            generalNote = new ArrayList<GeneralNote>();
        }
        return this.generalNote;
    }

}
