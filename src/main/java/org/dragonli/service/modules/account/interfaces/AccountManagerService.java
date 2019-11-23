package org.dragonli.service.modules.account.interfaces;


import java.util.Map;


public interface AccountManagerService {
	
	String withdrawal(Map<String, Object> jsonParams) throws Exception; //提现业务处理
	String payment(Map<String, Object> jsonParams) throws Exception;
	Map<String,Object> adjustment(Map<String, Object> jsonParams) throws Exception;

	Map<String,Object> getUserAccount(Map<String, Object> jsonParams) throws Exception;


	Map<String, Object> userAccountList(Map<String, Object> jsonParams) throws Exception;


	Map<String, Object> userAccountWithdrawal() throws Exception;

//	Map<String, Object> topChildAccountWithdrawalAndDepositList(Long enterpriseId, String userId, String currency,
//            Integer top) throws Exception;

//	Map<String, Object> childAccountWithdrawal(Long enterpriseId, String userId, String amountStr, String currency,
//            String orderId, String address, String addressExtend) throws Exception;


//	Map<String,Object> getUserAccountMemo(Long enterpriseId, String userId, String currency);


}
