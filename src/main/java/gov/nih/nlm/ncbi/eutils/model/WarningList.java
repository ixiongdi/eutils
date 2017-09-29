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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phraseIgnored",
    "quotedPhraseNotFound",
    "outputMessage"
})
@XmlRootElement(name = "WarningList")
public class WarningList {

    @XmlElement(name = "PhraseIgnored")
    protected List<PhraseIgnored> phraseIgnored;
    @XmlElement(name = "QuotedPhraseNotFound")
    protected List<QuotedPhraseNotFound> quotedPhraseNotFound;
    @XmlElement(name = "OutputMessage")
    protected List<OutputMessage> outputMessage;

    /**
     * Gets the value of the phraseIgnored property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phraseIgnored property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhraseIgnored().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhraseIgnored }
     * 
     * 
     */
    public List<PhraseIgnored> getPhraseIgnored() {
        if (phraseIgnored == null) {
            phraseIgnored = new ArrayList<PhraseIgnored>();
        }
        return this.phraseIgnored;
    }

    /**
     * Gets the value of the quotedPhraseNotFound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotedPhraseNotFound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotedPhraseNotFound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotedPhraseNotFound }
     * 
     * 
     */
    public List<QuotedPhraseNotFound> getQuotedPhraseNotFound() {
        if (quotedPhraseNotFound == null) {
            quotedPhraseNotFound = new ArrayList<QuotedPhraseNotFound>();
        }
        return this.quotedPhraseNotFound;
    }

    /**
     * Gets the value of the outputMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputMessage }
     * 
     * 
     */
    public List<OutputMessage> getOutputMessage() {
        if (outputMessage == null) {
            outputMessage = new ArrayList<OutputMessage>();
        }
        return this.outputMessage;
    }

}
