//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.29 时间 05:31:53 PM CST 
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
    "countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR",
    "errorList",
    "warningList"
})
@XmlRootElement(name = "eSearchResult")
public class ESearchResult {

    @XmlElements({
        @XmlElement(name = "Count", required = true, type = Count.class),
        @XmlElement(name = "RetMax", required = true, type = RetMax.class),
        @XmlElement(name = "RetStart", required = true, type = RetStart.class),
        @XmlElement(name = "QueryKey", required = true, type = QueryKey.class),
        @XmlElement(name = "WebEnv", required = true, type = WebEnv.class),
        @XmlElement(name = "IdList", required = true, type = IdList.class),
        @XmlElement(name = "TranslationSet", required = true, type = TranslationSet.class),
        @XmlElement(name = "TranslationStack", required = true, type = TranslationStack.class),
        @XmlElement(name = "QueryTranslation", required = true, type = QueryTranslation.class),
        @XmlElement(name = "ERROR", required = true, type = ERROR.class)
    })
    protected List<Object> countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR;
    @XmlElement(name = "ErrorList")
    protected ErrorList errorList;
    @XmlElement(name = "WarningList")
    protected WarningList warningList;

    /**
     * Gets the value of the countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Count }
     * {@link RetMax }
     * {@link RetStart }
     * {@link QueryKey }
     * {@link WebEnv }
     * {@link IdList }
     * {@link TranslationSet }
     * {@link TranslationStack }
     * {@link QueryTranslation }
     * {@link ERROR }
     * 
     * 
     */
    public List<Object> getCountOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR() {
        if (countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR == null) {
            countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR = new ArrayList<Object>();
        }
        return this.countOrRetMaxOrRetStartOrQueryKeyOrWebEnvOrIdListOrTranslationSetOrTranslationStackOrQueryTranslationOrERROR;
    }

    /**
     * 获取errorList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorList }
     *     
     */
    public ErrorList getErrorList() {
        return errorList;
    }

    /**
     * 设置errorList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorList }
     *     
     */
    public void setErrorList(ErrorList value) {
        this.errorList = value;
    }

    /**
     * 获取warningList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarningList }
     *     
     */
    public WarningList getWarningList() {
        return warningList;
    }

    /**
     * 设置warningList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarningList }
     *     
     */
    public void setWarningList(WarningList value) {
        this.warningList = value;
    }

}