package vedulieu;

import ShowData.ReadTxt;

import java.io.IOException;

public class DuLieuDuLich {

    private int qu=0;
    private ReadTxt MoTaDuLich=new ReadTxt();
    private String[][] DataText = MoTaDuLich.GetData(qu);
    private int dem= MoTaDuLich.getDem();
    private String linkDulieu;
    private String abtractDulieu;
    private String thumnailDulieu;
    public void setQuery(int qu) throws IOException {
        this.qu=qu;
        DataText=MoTaDuLich.GetData(qu);
        dem= MoTaDuLich.getDem();
    }
    public int getDem() {
        return dem;
    }
    public DuLieuDuLich(int d,int qu) throws IOException {
        this.setQuery(qu);
        DataText=MoTaDuLich.GetData(qu);
        this.setLink(d);
        this.setAbstract(d);
        this.setThumbnail(d);
    }
    public DuLieuDuLich(String link,String astract,String thumb) throws IOException {
        this.linkDulieu=link;
        this.abtractDulieu=astract;
        this.thumnailDulieu = thumb;
    }

    public DuLieuDuLich() throws IOException {
    }
    public void setData(int d)
    {
        this.setLink(d);
        this.setThumbnail(d);
        this.setAbstract(d);
    }
    public void setLink(int d) {
        this.linkDulieu = this.DataText[d][0];
    }

    public void setAbstract(int d) {
        this.abtractDulieu = this.DataText[d][1];
    }

    public void setThumbnail(int d) {
        this.thumnailDulieu = this.DataText[d][2];
    }

    public String getLinkDulieu() {
        return linkDulieu;
    }

    public String getAbtractDulieu() {
        return abtractDulieu;
    }

    public String getThumnailDulieu() {
        return thumnailDulieu;
    }
}
