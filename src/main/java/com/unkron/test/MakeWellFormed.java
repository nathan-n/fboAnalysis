package com.unkron.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nathan on 1/3/14.
 */
public class MakeWellFormed {
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
    static final String EMPTY_STRING = "";

    static final String LINK = "LINK";
    static final String URL = "LINK";
    static final String LINK_DESC = "DESC";

    static final String EMAIL = "EMAIL";
    static final String ADDRESS = "ADDRESS";
    static final String EMAIL_DESC = "DESC";

    public static void main(String args[]) {


        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().equals(EMPTY_STRING)) {
                    continue;
                }
                String[] parts = line.split(">");
                String element = parts[0].replace("<", "</").trim();
                String test = parts[0].replace("<", EMPTY_STRING).replace("/", EMPTY_STRING).trim();
                if (test.equals(PRESOL) || test.equals(COMBINE) || test.equals(AMDCSS) || test.equals(MOD) || test.equals(AWARD) ||
                        test.equals(JA) || test.equals(ITB) || test.equals(FAIROPP) || test.equals(SRCSGT) || test.equals(FSTD) ||
                        test.equals(SNOTE) || test.equals(SSALE) || test.equals(EPSUPLOAD) || test.equals(DELETE) || test.equals(ARCHIVE) || test.equals(UNARCHIVE)) {
                    System.out.println(line.trim());
                    continue;
                } else if (test.equals(LINK)) {
                    //TODO read url and desc
                    System.out.println(line.trim() + element + ">");
                } else if (test.equals(EMAIL)) {
                    //TODO read address and desc
                    //EMAIL tag followed by EMAIL tag, not ADDRESS
                    System.out.println(line.trim() + element + ">");
                } else {
                    System.out.println(line.trim() + element + ">");
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
