package com.unkron.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import parse.json.fbo.*;

public class SAXParserDemo {

    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler(args[0].replace("FBOFeed", ""));
        parser.parse(ClassLoader.getSystemResourceAsStream(args[0]),
                handler);

        //Printing the list of employees obtained from XML
        for (FBOEntry entry : handler.fboList) {
            System.out.println(entry);
        }
    }
}

/**
 * The Handler for SAX Events.
 */
class SAXHandler extends DefaultHandler {

    String date;

    SAXHandler(String date) {
        this.date = date;
    }

    static final String PRESOL = "PRESOL";
    static final String COMBINE = "COMBINE";
    static final String AMDCSS = "AMDCSS";
    static final String MOD = "MOD";
    static final String AWARD = "AWARD";
    static final String JA = "JA";
    static final String ITB = "ITB";
    static final String FAIROPP = "FAIROPP";
    static final String SRCSGT = "SRCSGT";
    static final String FSTD = "FSTD";
    static final String SNOTE = "SNOTE";
    static final String SSALE = "SSALE";
    static final String EPSUPLOAD = "EPSUPLOAD";
    static final String DELETE = "DELETE";
    static final String ARCHIVE = "ARCHIVE";
    static final String UNARCHIVE = "UNARCHIVE";

    List<FBOEntry> fboList = new ArrayList<FBOEntry>();
    FBOEntry fboEntry = null;
    String content = null;

    @Override
    //Triggered when the start of tag is found.
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes)
            throws SAXException {

        switch (qName) {
            //Create a new FBOEntry object when the start tag is found
            case PRESOL:
                fboEntry = new FBOPresolicitation();
                break;
            case COMBINE:
                fboEntry = new FBOCombined();
                break;
            case AMDCSS:
                fboEntry = new FBOArchive();
                break;
            case MOD:
                fboEntry = new FBOModification();
                break;
            case AWARD:
                fboEntry = new FBOArchive();
                break;
            case JA:
                fboEntry = new FBOArchive();
                break;
            case ITB:
                fboEntry = new FBOArchive();
                break;
            case FAIROPP:
                fboEntry = new FBOArchive();
                break;
            case SRCSGT:
                fboEntry = new FBOSourcesSought();
                break;
            case FSTD:
                fboEntry = new FBOArchive();
                break;
            case SNOTE:
                fboEntry = new FBOArchive();
                break;
            case SSALE:
                fboEntry = new FBOArchive();
                break;
            case EPSUPLOAD:
                fboEntry = new FBOArchive();
                break;
            case DELETE:
                fboEntry = new FBOArchive();
                break;
            case ARCHIVE:
                fboEntry = new FBOArchive();
                break;
            case UNARCHIVE:
                fboEntry = new FBOArchive();
                break;

        }
    }

    @Override
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        switch (qName) {
            //Add the entry to list once end tag is found
            case PRESOL:
            case COMBINE:
            case AMDCSS:
            case MOD:
            case AWARD:
            case JA:
            case ITB:
            case FAIROPP:
            case SRCSGT:
            case FSTD:
            case SNOTE:
            case SSALE:
            case EPSUPLOAD:
            case DELETE:
            case ARCHIVE:
            case UNARCHIVE:
                fboEntry.entryDate = date;
                fboList.add(fboEntry);
                break;
            //Add the content to the entry when end tag is found
            case FBOPresolicitation.DATE:
                ((FBOPresolicitation) fboEntry).setDate(content);
                break;
            case FBOPresolicitation.YEAR:
                ((FBOPresolicitation) fboEntry).setYear(content);
                break;
            case FBOPresolicitation.ZIP:
                ((FBOPresolicitation) fboEntry).setZip(content);
                break;
            case FBOPresolicitation.CLASSCOD:
                ((FBOPresolicitation) fboEntry).setClassCode(content);
                break;
            case FBOPresolicitation.NAICS:
                ((FBOPresolicitation) fboEntry).setNaics(content);
                break;
            case FBOPresolicitation.OFFADD:
                ((FBOPresolicitation) fboEntry).setOfficeAddress(content);
                break;
            case FBOPresolicitation.SUBJECT:
                ((FBOPresolicitation) fboEntry).setSubject(content);
                break;
            case FBOPresolicitation.SOLNBR:
                ((FBOPresolicitation) fboEntry).setSolNumber(content);
                break;
            case FBOPresolicitation.RESPDATE:
                ((FBOPresolicitation) fboEntry).setResponseDate(content);
                break;
            case FBOPresolicitation.ARCHDATE:
                ((FBOPresolicitation) fboEntry).setArchiveDate(content);
                break;
            case FBOPresolicitation.CONTACT:
                ((FBOPresolicitation) fboEntry).setContact(content);
                break;
            case FBOPresolicitation.DESC:
                ((FBOPresolicitation) fboEntry).setDescription(content);
                break;
            case FBOPresolicitation.LINK:
                ((FBOPresolicitation) fboEntry).setLink(content);
                break;
            case FBOPresolicitation.URL:
                ((FBOPresolicitation) fboEntry).setUrl(content);
                break;
            case FBOPresolicitation.EMAIL:
                ((FBOPresolicitation) fboEntry).setEmail(content);
                break;
            case FBOPresolicitation.ADDRESS:
                ((FBOPresolicitation) fboEntry).setAddress(content);
                break;
            case FBOPresolicitation.SETASIDE:
                ((FBOPresolicitation) fboEntry).setSetAside(content);
                break;
            case FBOPresolicitation.POPADDRESS:
                ((FBOPresolicitation) fboEntry).setPlaceOfPerformanceAddress(content);
                break;
            case FBOPresolicitation.POPZIP:
                ((FBOPresolicitation) fboEntry).setPlaceOfPerformanceZip(content);
                break;
            case FBOPresolicitation.POPCOUNTRY:
                ((FBOPresolicitation) fboEntry).setPlaceOfPerformanceCountry(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

}

