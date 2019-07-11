package info.androidhive.navigationdrawer.other;

public class NewsInfo {

    public String newsTitle;
    public String newsImageUrl;
    public String newsDescription;

    public NewsInfo(){

    }

    public NewsInfo(String newsTitle, String newsImageUrl, String newsDescription) {
        this.newsTitle = newsTitle;
        this.newsImageUrl = newsImageUrl;
        this.newsDescription = newsDescription;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsImageUrl() {
        return newsImageUrl;
    }

    public String getNewsDescription() {
        return newsDescription;
    }
}
