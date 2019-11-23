package org.dragonli.service.modules.account.interfaces;

import java.util.Map;

/**
 * @author liwenyu
 * 
 */
public interface AccountChangeService {

	Map<String,Object> addChangeRecord(Map<String,Object> record);
}
