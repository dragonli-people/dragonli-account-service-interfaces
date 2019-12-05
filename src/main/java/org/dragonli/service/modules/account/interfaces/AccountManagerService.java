package org.dragonli.service.modules.account.interfaces;

import java.math.BigDecimal;
import java.util.Map;

public interface AccountManagerService {

	Map<String, Object> withdrawal(Long userId, String reflexId,String currency, String amountStr) throws Exception ;

	Map<String, Object> paymentStatus(String orderId) throws Exception;

	Map<String, Object> adjustmentStatus(String orderId) throws Exception ;

	String payment(Long userId, String reflexId, String target, String amountStr, String currency,
			String orderId, String remark, Boolean readOnly) throws Exception;

	Map<String, Object> accountWithdrawal(String userId, String amountStr, String currency,
			String orderId, String address, String addressExtend) throws Exception;

	Map<String, Object> getUserAccount(Long userId,String reflexId,String currency) throws Exception ;

	Map<String, Object> userAccountList(Long userId) throws Exception;

	Map<String, Object> executeWithdrawal(Long id, Boolean ok) throws Exception ;

	String accountAdjustment(String orderId,Long userId,String reflexId,String currency,String amountStr,String remark) throws Exception;

	Boolean fixBusiness(Long id) throws Exception;

	Boolean closeBusiness(Long id) throws Exception;

}
