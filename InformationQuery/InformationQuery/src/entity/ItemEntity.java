package entity;
import java.io.Serializable;
import java.util.List;

import com.coo8.open.product.GoodsImage;

public class ItemEntity implements Serializable{
/** 
	 * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô) 
	 */
	private static final long serialVersionUID = 1L;
	//	Ȩ��		�������� ������			˵��						@GoodsPop��Ӧ�Ĳ�����
	private String outId;// 		�ⲿ�̼���ƷID			goods_no
	private int	   itemId;// 		��ƷID					sku
	private String productId;// 	��ƷID					products_id
	private String goodsName;// 	��Ʒ����					goods_name
	private String originalPrice;// �ۼ�						sell_price
	private String color;//			��Ʒ��ɫ					color
	private String status;// 		״̬						status
	private String updater;//		���ո�����				modify_user
	private String updateTime;// 	���ո���ʱ��				modify_time
	private String version;// 		�汾						goods_version
	private String brandId;// 		��ƷƷ��ID				brand_id
	private String catalogId;//		��Ʒ����					gome_ctgy_3
	private String quantity;// 		ҵ�������				show_quantity
	private String detail;//		��Ʒ�嵥					packing_list
	private List<GoodsImage> goosImageList;//��ƷͼƬ		imagesList
	public String getOutId() {
		return outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public List<GoodsImage> getGoosImageList() {
		return goosImageList;
	}
	public void setGoosImageList(List<GoodsImage> goosImageList) {
		this.goosImageList = goosImageList;
	}
}
