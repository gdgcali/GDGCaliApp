package co.com.android_dev.gdgcali.gdgcali.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 25/06/2015.
 */
public class ImageAnswer {
    @SerializedName("full")
    private ImageDetailAnswer full;

    @SerializedName("thumbnail")
    private ImageDetailAnswer thumbnail;

    @SerializedName("medium")
    private ImageDetailAnswer medium;

    @SerializedName("large")
    private ImageDetailAnswer large;

    @SerializedName("post-thumbnail")
    private ImageDetailAnswer postthumbnail;

    public ImageAnswer(ImageDetailAnswer full, ImageDetailAnswer thumbnail, ImageDetailAnswer medium, ImageDetailAnswer large, ImageDetailAnswer postthumbnail) {
        this.full = full;
        this.thumbnail = thumbnail;
        this.medium = medium;
        this.large = large;
        this.postthumbnail = postthumbnail;
    }

    public ImageDetailAnswer getFull() {
        return full;
    }

    public void setFull(ImageDetailAnswer full) {
        this.full = full;
    }

    public ImageDetailAnswer getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(ImageDetailAnswer thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ImageDetailAnswer getMedium() {
        return medium;
    }

    public void setMedium(ImageDetailAnswer medium) {
        this.medium = medium;
    }

    public ImageDetailAnswer getLarge() {
        return large;
    }

    public void setLarge(ImageDetailAnswer large) {
        this.large = large;
    }

    public ImageDetailAnswer getPostthumbnail() {
        return postthumbnail;
    }

    public void setPostthumbnail(ImageDetailAnswer postthumbnail) {
        this.postthumbnail = postthumbnail;
    }
}
