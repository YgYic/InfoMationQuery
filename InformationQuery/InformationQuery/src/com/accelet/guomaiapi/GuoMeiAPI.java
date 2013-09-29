package com.accelet.guomaiapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import util.JsonUtil;


import com.coo8.api.Coo8Client;
import com.coo8.api.DefaultCoo8Client;
import com.coo8.api.request.attribute.ItempropsGetRequest;
import com.coo8.api.request.catalog.AuthorizeCatalogGetRequest;
import com.coo8.api.request.items.ItemGetRequest;
import com.coo8.api.request.items.ItemQuantityUpdateRequest;
import com.coo8.api.request.items.ItemUpdatePictureRequest;
import com.coo8.api.request.items.ItemUpdatePriceRequest;
import com.coo8.api.request.order.OrderGetRequest;
import com.coo8.api.request.order.OrderSendRequest;
import com.coo8.api.request.order.OrderTuoTouRequest;
import com.coo8.api.request.proudct.ProductGetRequest;
import com.coo8.api.request.proudct.ProductUpdateRequest;
import com.coo8.api.response.attribute.ItempropsGetResponse;
import com.coo8.api.response.catalog.ItemcatsAuthorizeGetResponse;
import com.coo8.api.response.items.ItemGetResponse;
import com.coo8.api.response.items.ItemQuantityUpdateResponse;
import com.coo8.api.response.items.ItemUpdatePictureResponse;
import com.coo8.api.response.items.ItemUpdatePriceResponse;
import com.coo8.api.response.order.OrderGetResponse;
import com.coo8.api.response.order.OrderSendResponse;
import com.coo8.api.response.order.OrderTuoTouResponse;
import com.coo8.api.response.product.ProductGetResponse;
import com.coo8.api.response.product.ProductUpdateResponse;
import com.coo8.open.catalog.OpenCatalog;
import com.coo8.open.catalog.SellerAuthorizeCatalog;
import com.coo8.open.order.Consignee;
import com.coo8.open.order.Order;
import com.coo8.open.order.OrderDetail;
import com.coo8.open.product.GoodsPop;

import entity.ItemPropEntity;

public class GuoMeiAPI {
	/*************************************���Ի���***************************************************/
	private static final String venderId = "80000295";
	private static final String secret = "0aa847e1e7b142e9";
//	private static final String serverUrl = "http://api.coo8.com/ApiControl";
	private static final String serverUrl1 = "http://open.coo8.com/ApiControl";
	
	private static SimpleDateFormat sdfModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Coo8Client client = new DefaultCoo8Client(serverUrl1, venderId, secret);
	
	public static void main(String args[]){
//		getsingleOrderDetail();
//		orderSend();
//		comfirmDeliverOrder();
		
//		modifyDeliverNO();
//		serchRefundOrders();
//		refundComfirm();
		
//		unListMerchs();
//		listMerchs();
		queryMerchDetail();
//		modSKU();
//		modMerch();
		
//		getAuthorize();
//		getItem();
//		getitemProps();
		
//		updateQuantity();
		
//		updatePicture(); 
//		updateSaleStatus();
//		updateOriginalPrice();
		
		
	}

	public static void modSKU(){
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��Ʒ�ϼ�
	public static void listMerchs(){
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//��Ʒ�¼�
	public static void unListMerchs(){
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��ȡ����������ʱ��
	public static String getJingDongTime(){
		try {
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return sdfModified.format(Calendar.getInstance().getTime());
	}
	
	//�޸���Ʒ�ļ۸�
	public static void updateOriginalPrice(){
		try {
			ItemUpdatePriceRequest request = new ItemUpdatePriceRequest();
			request.setOriginalPrice(3232.00);
			request.setProductId("A0000822033");
			request.setItemId("8001000083");
			request.setOutId("21");
			ItemUpdatePriceResponse response = client.execute(request);
			System.out.println(response.getOriginalPrice());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//�޸���Ʒ���¼�״̬(Api������)
	public static void updateSaleStatus(){
		try {
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�޸���Ʒ�ض�λ�õ�ͼƬ
	public static void updatePicture(){
		try {
			ItemUpdatePictureRequest request = new ItemUpdatePictureRequest();
			request.setImgs("F:\\temp\\y1000092919.jpg");
			request.setIndex("2");
			request.setItemId("8001000083");
			request.setOutId("21");
			ItemUpdatePictureResponse response = client.execute(request);
			System.out.println(response.getMsg());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	//�޸���Ʒ�Ŀ��(��ʱ�����������޸��ڴ�ķ���)
	public static String updateQuantity(){
		try {
			ItemQuantityUpdateRequest request = new ItemQuantityUpdateRequest();
			request.setItemId("8001000083");
			request.setProductId("A0000822033");
			request.setQuantity("100");
			ItemQuantityUpdateResponse response=client.execute(request);
			System.out.println(response.getMsg());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return sdfModified.format(Calendar.getInstance().getTime());
	}
		
	//��ȡ��Ʒ��Ŀ����
	//ItempropsGetResponse���ص���List<OpenCatalog>,Ӧ���ǲ���ȷ�Ŀ�����Ҫ�������
	public static void getitemProps() {
		try {
//			String fields = "";
			ItempropsGetRequest request = new ItempropsGetRequest();
			request.setCid("cat18001266");
//			request.setAid("12742");
			ItempropsGetResponse response = client.execute(request);
			response.getCatalogs();
			Map<?,?> itemprops_get_response_map = JsonUtil.jsonToMap(response.getBody());
			Map<?,?> item_props_map = JsonUtil.jsonToMap(itemprops_get_response_map.get("itemprops_get_response").toString());
			System.out.println(item_props_map.get("item_props"));
			Map<?,?> item_map = JsonUtil.jsonToMap(item_props_map.get("item_props").toString());
			List<?> list = JsonUtil.jsonToList(item_map.get("item_prop").toString(), 
								new com.google.gson.reflect.TypeToken<List<ItemPropEntity>>() {  
            }.getType());
			for (Object object : list) {
				object.getClass();
				ItemPropEntity item = (ItemPropEntity) object;
				System.out.println(item.getCat_name());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//������������
	public static void orderSend(){
		try {
			OrderSendRequest request = new OrderSendRequest();
			request.setLogisticsNumber("adsd2121");
			request.setCarriersName("��ͨ���");
			request.setOrderid("1179793109");
			OrderSendResponse response = client.execute(request);
			System.out.println(response.getMsg() + " & " + response.getBody());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�˻�ȷ��
	public static void refundComfirm(){
//		List<Order> orders = searchOrders("RCP", null);
//		if (null == orders) {
//			System.out.println("û��");
//			return;
//		}
//		System.out.println(orders.size());
	}
	//���������˻���Ʒ
	public static void serchRefundOrders(){
//		List<Order> orders 	  = searchOrders("R2C", null);
//		List<Order> ordersTmp = searchOrders("RCP", null);
//		if (null == orders) {
//			orders = new ArrayList<Order>();
//		}
//		if (null != ordersTmp && ordersTmp.size() != 0) {
//			orders.addAll(ordersTmp);
//		}
//		System.out.println(orders.size());
	}
		
	//����������Ͷ(�����ɹ�)
	public static void comfirmDeliverOrder(){
		try {
			OrderTuoTouRequest request = new OrderTuoTouRequest();
			request.setOrderid("1179943034");
			OrderTuoTouResponse response = client.execute(request);
			System.out.println(response.getMsg());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//��ѯ��������������
	public static void getsingleOrderDetail(){
		try {
			String fields="order_id,pay_type,status,customer_remark,freight_price," +
					"order_time,order_change_time,end_order_time,discount_amount,promotion_amount," +
					"item_total_price,order_total_price,payment,part_discount_price,coupon_value," +
					"pay_type,status,pay_time,username,consignee.name,consignee.province,consignee.city," +
					"consignee.county,consignee.address,consignee.post,consignee.telephone," +
					"consignee.mobilephone,consignee.email,consignee.want_send_time,consignee.invoice," +
					"consignee.invoice_title,order_detail.main_id,order_detail.count,order_detail.point," +
					"order_detail.price,order_detail.item_id,order_detail.item_name,order_detail.item_discount," +
					"order_detail.size,order_detail.color,order_detail.user_id,order_detail.part_discount_price," +
					"order_detail.coupon_value";
			OrderGetRequest request = new OrderGetRequest();
			request.setFields(fields);
			request.setOrderId("1179793109");
			OrderGetResponse response = client.execute(request);
			Order order = response.getOrder();
			System.out.println("\\n" + order.getCustomerRemark());
			System.out.println("\\n" + order.getOrderId());
			Consignee consignee = order.getConsignee();
			List<OrderDetail> orderDetails = order.getOrderDetails();
//			System.out.println("\\n\\" + consignee.getAddress());
			System.out.println("\\n\\" + consignee.getCity());
			for (OrderDetail orderDetail : orderDetails) {
				System.out.println("\\n\\" + orderDetail.getItemName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��ȡ��Ȩ�ķ����Ʒ��
	public static void getAuthorize(){
		try {
			String fields = "cat.cat_id";
			AuthorizeCatalogGetRequest request = new AuthorizeCatalogGetRequest();
			request.setFields(fields);
			ItemcatsAuthorizeGetResponse response = client.execute(request);
			SellerAuthorizeCatalog catalog = response.getAuthorize();
			System.out.println(response.getUrl());
			List<OpenCatalog> openCatalog = catalog.getCatalogs();
			if (null == openCatalog) {
				System.out.println("null");
				return;
			}
			for (OpenCatalog openCatalog2 : openCatalog) {
				System.out.println(openCatalog2.getCatId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
	//�޸Ĳ�Ʒ������Ϣ
	public static void modMerch(){
		try {
			ProductUpdateRequest request = new ProductUpdateRequest();
			request.setProductId("A0000822061");
//			request.setDescription("�޸���Ʒ������Ϣ");
			request.setPros("yanse=123,huohao=21");
			request.setGift("������");
			ProductUpdateResponse response = client.execute(request);
			System.out.println(response.getProductId() + " $ " + response.getMsg() + " $ " + response.getSuccess());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�����Ʒ������Ϣ
	public static void getItem(){
		try {
			String fields = "color,updater,outId,status, goodsName,productId,itemId,pic.imgId,originalPrice";//
			ItemGetRequest request = new ItemGetRequest();
			request.setFields(fields);
			request.setItemId("8001000083");
			request.setProductId("A0000822033");
			ItemGetResponse response = client.execute(request);
			String list = response.getBody();
			System.out.println(response.getGood());
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//���ݵ�����Ʒid��ѯ��Ʒ��ϸ��Ϣ�����Ʒid��itemId����Ϊ�գ����ʾΪ�����ɹ�
	public static void queryMerchDetail(){
		try {
			String fields = "outId,itemId,goodsName,originalPrice,color,item.status," +
					"updater,updateTime,version,brandId,catalogId,quantity," +
					"detail, pic.imgId,pic.imgUrl,pic.index";
			ProductGetRequest request = new ProductGetRequest();
			request.setFields(fields);
			request.setProductId("A0000822033");
//			request.setTimestamp(System.currentTimeMillis());
			ProductGetResponse response = client.execute(request);
			List<GoodsPop> goods = response.getGoods();
			for (GoodsPop good : goods) {
				System.out.println(good.getGoods_name());
			}
			System.out.println("*******************************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
