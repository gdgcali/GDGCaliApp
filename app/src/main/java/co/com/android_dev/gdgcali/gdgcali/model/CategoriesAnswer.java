package co.com.android_dev.gdgcali.gdgcali.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 25/06/2015.
 */
public class CategoriesAnswer {
    @SerializedName("id")
    private Integer id;

    @SerializedName("slug")
    private String slug;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("parent")
    private Integer parent;

    @SerializedName("post_count")
    private Integer post_count;

    public CategoriesAnswer(Integer id, String slug, String title, String description, Integer parent, Integer post_count) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.parent = parent;
        this.post_count = post_count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getPost_count() {
        return post_count;
    }

    public void setPost_count(Integer post_count) {
        this.post_count = post_count;
    }
}
