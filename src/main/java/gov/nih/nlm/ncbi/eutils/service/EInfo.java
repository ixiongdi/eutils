package gov.nih.nlm.ncbi.eutils.service;

import gov.nih.nlm.ncbi.eutils.model.EInfoResult;
import gov.nih.nlm.ncbi.eutils.service.base.EBase;

import java.util.Map;

public class EInfo extends EBase<EInfoResult> {

    public EInfoResult run(Map<String, String> map) throws Exception {
        String baseURL = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/einfo.fcgi";
        return super.run(baseURL, map);
    }

}
