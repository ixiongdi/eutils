package gov.nih.nlm.ncbi.service;

import gov.nih.nlm.ncbi.eutils.model.ESearchResult;
import gov.nih.nlm.ncbi.eutils.service.ESearch;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;

public class ESearchTest {
    /**
     * Search in PubMed with the term cancer for abstracts that have an Entrez date within the last 60 days; retrieve the first 100 PMIDs and translations; post the results on the History server and return a WebEnv and query_key:
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {

        ESearch eSearch = new ESearch();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("db", "pubmed");
        map.put("term", "cancer");
        map.put("reldate", "60");
        map.put("datetype", "edat");
        map.put("retmax", "100");
        map.put("usehistory", "y");

        ESearchResult eSearchResult = eSearch.run(map);

        assertNotNull(eSearchResult);

    }
}
