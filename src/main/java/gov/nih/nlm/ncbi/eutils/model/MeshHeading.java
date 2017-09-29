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
    "descriptorName",
    "qualifierName"
})
@XmlRootElement(name = "MeshHeading")
public class MeshHeading {

    @XmlElement(name = "DescriptorName", required = true)
    protected DescriptorName descriptorName;
    @XmlElement(name = "QualifierName")
    protected List<QualifierName> qualifierName;

    /**
     * 获取descriptorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DescriptorName }
     *     
     */
    public DescriptorName getDescriptorName() {
        return descriptorName;
    }

    /**
     * 设置descriptorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorName }
     *     
     */
    public void setDescriptorName(DescriptorName value) {
        this.descriptorName = value;
    }

    /**
     * Gets the value of the qualifierName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifierName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifierName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifierName }
     * 
     * 
     */
    public List<QualifierName> getQualifierName() {
        if (qualifierName == null) {
            qualifierName = new ArrayList<QualifierName>();
        }
        return this.qualifierName;
    }

}
