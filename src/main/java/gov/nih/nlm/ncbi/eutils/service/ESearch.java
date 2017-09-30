package gov.nih.nlm.ncbi.eutils.service;

import gov.nih.nlm.ncbi.eutils.model.ESearchResult;
import gov.nih.nlm.ncbi.eutils.service.base.EBase;

import java.util.Map;

public class ESearch extends EBase<ESearchResult> {
    public ESearchResult run(Map<String, String> map) throws Exception {
        String baseURL = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi";
        return super.run(baseURL, map);
    }
}
