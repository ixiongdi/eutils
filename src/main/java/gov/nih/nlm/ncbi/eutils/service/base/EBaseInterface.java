package gov.nih.nlm.ncbi.eutils.service.base;

import java.util.Map;

public interface EBaseInterface<T> {
    T run(Map<String, String> map) throws Exception;
}
