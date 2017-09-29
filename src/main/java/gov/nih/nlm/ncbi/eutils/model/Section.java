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
    "locationLabel",
    "sectionTitle",
    "section"
})
@XmlRootElement(name = "Section")
public class Section {

    @XmlElement(name = "LocationLabel")
    protected LocationLabel locationLabel;
    @XmlElement(name = "SectionTitle", required = true)
    protected SectionTitle sectionTitle;
    @XmlElement(name = "Section")
    protected List<Section> section;

    /**
     * 获取locationLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationLabel }
     *     
     */
    public LocationLabel getLocationLabel() {
        return locationLabel;
    }

    /**
     * 设置locationLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationLabel }
     *     
     */
    public void setLocationLabel(LocationLabel value) {
        this.locationLabel = value;
    }

    /**
     * 获取sectionTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SectionTitle }
     *     
     */
    public SectionTitle getSectionTitle() {
        return sectionTitle;
    }

    /**
     * 设置sectionTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SectionTitle }
     *     
     */
    public void setSectionTitle(SectionTitle value) {
        this.sectionTitle = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section }
     * 
     * 
     */
    public List<Section> getSection() {
        if (section == null) {
            section = new ArrayList<Section>();
        }
        return this.section;
    }

}
