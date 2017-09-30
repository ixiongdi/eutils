package gov.nih.nlm.ncbi.eutils.service;

import gov.nih.nlm.ncbi.eutils.model.PubmedArticleSet;
import gov.nih.nlm.ncbi.eutils.service.base.EBase;

import java.util.Map;

public class EFetch extends EBase<PubmedArticleSet> {
    public PubmedArticleSet run(Map<String, String> map) throws Exception {
        String baseURL = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi";
        return super.run(baseURL, map);
    }
}
