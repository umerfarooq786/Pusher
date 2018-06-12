package com.codingdemos.tablayout.Model;

public class Product {
    private String pBrand,pName,pFault,pOwnerName,getpOwnerPhone,getpOwnerLocation;

    int pImage;
    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpImage() {
        return pImage;
    }

    public void setpImage(int pImage) {
        this.pImage = pImage;
    }

    public String getpFault() {
        return pFault;
    }

    public void setpFault(String pFault) {
        this.pFault = pFault;
    }

    public String getpOwnerName() {
        return pOwnerName;
    }

    public void setpOwnerName(String pOwnerName) {
        this.pOwnerName = pOwnerName;
    }

    public String getGetpOwnerPhone() {
        return getpOwnerPhone;
    }

    public void setGetpOwnerPhone(String getpOwnerPhone) {
        this.getpOwnerPhone = getpOwnerPhone;
    }

    public String getGetpOwnerLocation() {
        return getpOwnerLocation;
    }

    public void setGetpOwnerLocation(String getpOwnerLocation) {
        this.getpOwnerLocation = getpOwnerLocation;
    }

    public Product(String pBrand, String pName, int pImage, String pFault, String pOwnerName, String getpOwnerPhone, String getpOwnerLocation) {

        this.pBrand = pBrand;
        this.pName = pName;
        this.pImage = pImage;
        this.pFault = pFault;
        this.pOwnerName = pOwnerName;
        this.getpOwnerPhone = getpOwnerPhone;
        this.getpOwnerLocation = getpOwnerLocation;
    }
}
