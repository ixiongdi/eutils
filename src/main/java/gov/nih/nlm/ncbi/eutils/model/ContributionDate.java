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
    "year",
    "monthOrDayOrSeason"
})
@XmlRootElement(name = "ContributionDate")
public class ContributionDate {

    @XmlElement(name = "Year", required = true)
    protected Year year;
    @XmlElements({
        @XmlElement(name = "Month", type = Month.class),
        @XmlElement(name = "Day", type = Day.class),
        @XmlElement(name = "Season", type = Season.class)
    })
    protected List<java.lang.Object> monthOrDayOrSeason;

    /**
     * 获取year属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the monthOrDayOrSeason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthOrDayOrSeason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthOrDayOrSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Month }
     * {@link Day }
     * {@link Season }
     * 
     * 
     */
    public List<java.lang.Object> getMonthOrDayOrSeason() {
        if (monthOrDayOrSeason == null) {
            monthOrDayOrSeason = new ArrayList<java.lang.Object>();
        }
        return this.monthOrDayOrSeason;
    }

}
