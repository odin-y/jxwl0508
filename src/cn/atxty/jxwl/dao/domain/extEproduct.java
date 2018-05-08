package cn.atxty.jxwl.dao.domain;

import java.math.BigDecimal;

public class extEproduct {
    private String extEproductId;

    private String factoryId;

    private String exportProductId;

    private String contractProductId;

    private Integer ctype;

    private String productName;

    private String productNo;

    private String productImage;

    private String productDesc;

    private String loadingRate;

    private String packingUnit;

    private Integer cnumber;

    private Integer outNumber;

    private Boolean finished;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    private BigDecimal sizeLength;

    private BigDecimal sizeWidth;

    private BigDecimal sizeHeight;

    private String productRequest;

    private String factoryName;

    private BigDecimal price;

    private BigDecimal amount;

    private String cunit;

    private Integer boxNum;

    private BigDecimal exPrice;

    private String exUnit;

    private BigDecimal noTax;

    private BigDecimal tax;

    private BigDecimal costPrice;

    private BigDecimal costTax;

    private Boolean accessories;

    private Integer orderNo;

    public String getExtEproductId() {
        return extEproductId;
    }

    public void setExtEproductId(String extEproductId) {
        this.extEproductId = extEproductId == null ? null : extEproductId.trim();
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId == null ? null : factoryId.trim();
    }

    public String getExportProductId() {
        return exportProductId;
    }

    public void setExportProductId(String exportProductId) {
        this.exportProductId = exportProductId == null ? null : exportProductId.trim();
    }

    public String getContractProductId() {
        return contractProductId;
    }

    public void setContractProductId(String contractProductId) {
        this.contractProductId = contractProductId == null ? null : contractProductId.trim();
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage == null ? null : productImage.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getLoadingRate() {
        return loadingRate;
    }

    public void setLoadingRate(String loadingRate) {
        this.loadingRate = loadingRate == null ? null : loadingRate.trim();
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit == null ? null : packingUnit.trim();
    }

    public Integer getCnumber() {
        return cnumber;
    }

    public void setCnumber(Integer cnumber) {
        this.cnumber = cnumber;
    }

    public Integer getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(Integer outNumber) {
        this.outNumber = outNumber;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public BigDecimal getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(BigDecimal sizeLength) {
        this.sizeLength = sizeLength;
    }

    public BigDecimal getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(BigDecimal sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public BigDecimal getSizeHeight() {
        return sizeHeight;
    }

    public void setSizeHeight(BigDecimal sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    public String getProductRequest() {
        return productRequest;
    }

    public void setProductRequest(String productRequest) {
        this.productRequest = productRequest == null ? null : productRequest.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCunit() {
        return cunit;
    }

    public void setCunit(String cunit) {
        this.cunit = cunit == null ? null : cunit.trim();
    }

    public Integer getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(Integer boxNum) {
        this.boxNum = boxNum;
    }

    public BigDecimal getExPrice() {
        return exPrice;
    }

    public void setExPrice(BigDecimal exPrice) {
        this.exPrice = exPrice;
    }

    public String getExUnit() {
        return exUnit;
    }

    public void setExUnit(String exUnit) {
        this.exUnit = exUnit == null ? null : exUnit.trim();
    }

    public BigDecimal getNoTax() {
        return noTax;
    }

    public void setNoTax(BigDecimal noTax) {
        this.noTax = noTax;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCostTax() {
        return costTax;
    }

    public void setCostTax(BigDecimal costTax) {
        this.costTax = costTax;
    }

    public Boolean getAccessories() {
        return accessories;
    }

    public void setAccessories(Boolean accessories) {
        this.accessories = accessories;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}