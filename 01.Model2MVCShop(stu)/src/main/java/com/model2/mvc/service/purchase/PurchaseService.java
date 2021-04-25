package com.model2.mvc.service.purchase;

import java.util.HashMap;

import com.model2.mvc.common.SearchVO;
import com.model2.mvc.service.purchase.vo.PurchaseVO;


public interface PurchaseService {


	public PurchaseVO addPurchase(PurchaseVO purchaseVO) throws Exception;
	
	public PurchaseVO getPurchase(int purchaseVO) throws Exception;
	
	public HashMap<String,Object> getPurchaseList(SearchVO searchVO,String buyerId) throws Exception;
	
	public HashMap<String, Object> getSaleList(SearchVO searchVO) throws Exception;
	
	public PurchaseVO updatePurcahse(PurchaseVO purchaseVO) throws Exception;
	
	public void updateTranCode(PurchaseVO purchaseVO) throws Exception;
	
}