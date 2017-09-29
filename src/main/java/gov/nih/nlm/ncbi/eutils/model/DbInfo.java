//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.29 时间 03:16:18 PM CST 
//


package gov.nih.nlm.ncbi.eutils.model;

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
    "dbName",
    "menuName",
    "description",
    "dbBuild",
    "warning",
    "count",
    "lastUpdate",
    "fieldList",
    "linkList"
})
@XmlRootElement(name = "DbInfo")
public class DbInfo {

    @XmlElement(name = "DbName", required = true)
    protected DbName dbName;
    @XmlElement(name = "MenuName", required = true)
    protected String menuName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DbBuild")
    protected String dbBuild;
    @XmlElement(name = "Warning")
    protected String warning;
    @XmlElement(name = "Count")
    protected String count;
    @XmlElement(name = "LastUpdate")
    protected String lastUpdate;
    @XmlElement(name = "FieldList")
    protected FieldList fieldList;
    @XmlElement(name = "LinkList")
    protected LinkList linkList;

    /**
     * 获取dbName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DbName }
     *     
     */
    public DbName getDbName() {
        return dbName;
    }

    /**
     * 设置dbName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DbName }
     *     
     */
    public void setDbName(DbName value) {
        this.dbName = value;
    }

    /**
     * 获取menuName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置menuName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuName(String value) {
        this.menuName = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取dbBuild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbBuild() {
        return dbBuild;
    }

    /**
     * 设置dbBuild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbBuild(String value) {
        this.dbBuild = value;
    }

    /**
     * 获取warning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * 设置warning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * 获取count属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * 获取lastUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置lastUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * 获取fieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getFieldList() {
        return fieldList;
    }

    /**
     * 设置fieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setFieldList(FieldList value) {
        this.fieldList = value;
    }

    /**
     * 获取linkList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LinkList }
     *     
     */
    public LinkList getLinkList() {
        return linkList;
    }

    /**
     * 设置linkList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LinkList }
     *     
     */
    public void setLinkList(LinkList value) {
        this.linkList = value;
    }

}
