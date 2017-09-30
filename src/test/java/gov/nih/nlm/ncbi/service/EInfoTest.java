package gov.nih.nlm.ncbi.service;

import gov.nih.nlm.ncbi.eutils.model.EInfoResult;
import gov.nih.nlm.ncbi.eutils.service.EInfo;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;

public class EInfoTest {

    // Return a list of all Entrez database names:
    @Test
    public void test1() throws Exception {
        EInfo eInfo = new EInfo();

        HashMap<String, String> map = new HashMap<String, String>();

        EInfoResult eInfoResult = eInfo.run(map);

        assertNotNull(eInfoResult);

    }

    // Return version 2.0 statistics for Entrez Protein:
    @Test
    public void test2() throws Exception {
        EInfo eInfo = new EInfo();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("db", "protein");
        map.put("version", "2.0");

        EInfoResult eInfoResult = eInfo.run(map);

        assertNotNull(eInfoResult);
    }

}
