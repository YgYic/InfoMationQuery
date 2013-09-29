package entity;
import java.io.Serializable;
import java.util.List;

import com.coo8.open.product.GoodsImage;

public class ItemEntity implements Serializable{
/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = 1L;
	//	权限		变量类型 变量名			说明						@GoodsPop对应的参数名
	private String outId;// 		外部商家商品ID			goods_no
	private int	   itemId;// 		商品ID					sku
	private String productId;// 	产品ID					products_id
	private String goodsName;// 	商品名称					goods_name
	private String originalPrice;// 售价						sell_price
	private String color;//			商品颜色					color
	private String status;// 		状态						status
	private String updater;//		最终更新人				modify_user
	private String updateTime;// 	最终更新时间				modify_time
	private String version;// 		版本						goods_version
	private String brandId;// 		商品品牌ID				brand_id
	private String catalogId;//		商品分类					gome_ctgy_3
	private String quantity;// 		业务可卖数				show_quantity
	private String detail;//		商品清单					packing_list
	private List<GoodsImage> goosImageList;//商品图片		imagesList
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
