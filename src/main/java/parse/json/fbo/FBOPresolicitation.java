package parse.json.fbo;

import java.util.List;

/**
 * Created by nathan on 1/1/14.
 */
public class FBOPresolicitation extends FBOEntry {
    public static final String DATE = "DATE";
    public static final String YEAR = "YEAR";
    public static final String ZIP = "ZIP";
    public static final String CLASSCOD = "CLASSCOD";
    public static final String NAICS = "NAICS";
    public static final String OFFADD = "OFFADD";
    public static final String SUBJECT = "SUBJECT";
    public static final String SOLNBR = "SOLNBR";
    public static final String RESPDATE = "RESPDATE";
    public static final String ARCHDATE = "ARCHDATE";
    public static final String CONTACT = "CONTACT";
    public static final String DESC = "DESC";
    public static final String LINK = "LINK";
    public static final String URL = "URL";
    public static final String EMAIL = "EMAIL";
    public static final String ADDRESS = "ADDRESS";
    public static final String SETASIDE = "SETASIDE";
    public static final String POPADDRESS = "POPADDRESS";
    public static final String POPZIP = "POPZIP";
    public static final String POPCOUNTRY = "POPCOUNTRY";

    String date;
    String year;
    String zip;
    String classCode;
    String naics;
    String officeAddress;
    String subject;
    String solNumber;
    String responseDate;
    String archiveDate;
    String contact;
    String description;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSolNumber() {
        return solNumber;
    }

    public void setSolNumber(String solNumber) {
        this.solNumber = solNumber;
    }

    public String getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }

    public String getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(String archiveDate) {
        this.archiveDate = archiveDate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descriptionList) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSetAside() {
        return setAside;
    }

    public void setSetAside(String setAside) {
        this.setAside = setAside;
    }

    public String getPlaceOfPerformanceAddress() {
        return placeOfPerformanceAddress;
    }

    public void setPlaceOfPerformanceAddress(String placeOfPerformanceAddress) {
        this.placeOfPerformanceAddress = placeOfPerformanceAddress;
    }

    public String getPlaceOfPerformanceZip() {
        return placeOfPerformanceZip;
    }

    public void setPlaceOfPerformanceZip(String placeOfPerformanceZip) {
        this.placeOfPerformanceZip = placeOfPerformanceZip;
    }

    public String getPlaceOfPerformanceCountry() {
        return placeOfPerformanceCountry;
    }

    public void setPlaceOfPerformanceCountry(String placeOfPerformanceCountry) {
        this.placeOfPerformanceCountry = placeOfPerformanceCountry;
    }

    String link;
    String url;
    String email;
    String address;
    String setAside;
    String placeOfPerformanceAddress;
    String placeOfPerformanceZip;
    String placeOfPerformanceCountry;
}
