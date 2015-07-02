package co.com.android_dev.gdgcali.gdgcali.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 25/06/2015.
 */
public class AttachmentsAnswer {
    @SerializedName("id")
    private Integer  id;

    @SerializedName("url")
    private String  url;

    @SerializedName("slug")
    private String  slug;

    @SerializedName("title")
    private String  title;

    @SerializedName("description")
    private String  description;

    @SerializedName("caption")
    private String  caption;

    @SerializedName("parent")
    private Integer  parent;

    @SerializedName("mime_type")
    private String  mime_type;

    @SerializedName("images")
    private ImageAnswer  images;

    public AttachmentsAnswer(Integer id, String url, String slug, String title, String description, String caption, Integer parent, String mime_type, ImageAnswer images) {
        this.id = id;
        this.url = url;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.caption = caption;
        this.parent = parent;
        this.mime_type = mime_type;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public ImageAnswer getImages() {
        return images;
    }

    public void setImages(ImageAnswer images) {
        this.images = images;
    }
}
