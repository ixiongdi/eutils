package gov.nih.nlm.ncbi.service;

import gov.nih.nlm.ncbi.eutils.model.ESearchResult;
import gov.nih.nlm.ncbi.eutils.model.PubmedArticleSet;
import gov.nih.nlm.ncbi.eutils.service.EFetch;
import gov.nih.nlm.ncbi.eutils.service.ESearch;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;

public class EFetchTest {
    /**
     * Fetch PMIDs in XML:
     */
    @Test
    public void test1() throws Exception {

        EFetch eFetch = new EFetch();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("db", "pubmed");
        map.put("id", "11748933,11700088");
        map.put("retmode", "xml");

        PubmedArticleSet pubmedArticleSet = eFetch.run(map);

        assertNotNull(pubmedArticleSet);

    }
}
